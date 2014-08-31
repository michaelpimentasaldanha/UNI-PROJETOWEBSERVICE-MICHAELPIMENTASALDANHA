package br.com.uninorte;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.swing.JOptionPane;


	@WebService
	public class ControleUsuario {
		
		private Connection connection = null;
		private Statement statement = null;
		private ResultSet resultset  = null;
		Usuario usuario = new Usuario();
		
		@WebMethod
		public void conectarcontrole(){
			String servidor = "jdbc:mysql://localhost/sol";
			String usuario = "root";
			String senha = "";
			String driver = "com.mysql.jdbc.Driver";
			
			try{
				Class.forName(driver);
				this.connection = DriverManager.getConnection(servidor, usuario, senha);
				this.statement = this.connection.createStatement();
			} catch (Exception e){
				System.out.println("Erro: "+ e.getMessage());
			}
		}
		@WebMethod
		public boolean estaConectadocontrole(){
			if(this.connection != null){
				return true;
			} else {
				return false;
		}
		}
		@WebMethod
		public void listarperfilcontrole(){
			try {
				String query = "SELECT * FROM tb_user_perfil ORDER BY nome_user";
				this.resultset = this.statement.executeQuery(query);
				while(this.resultset.next()){
					
					System.out.println(	"\n----- Usuario: "+ this.resultset.getInt("id") + " -------------\n"	   
										   + " \nNome: " + this.resultset.getString("nome_user")
										   + " \nCPF: "  + this.resultset.getString("cpf_user")
										   + " \nEmail: " + this.resultset.getString("email_user")
										   + " \nTelefone: " + this.resultset.getString("tel_user")
										   + " \nFuncao: " + this.resultset.getString("func_user")
										   + " \nMunicipio: " + this.resultset.getString("mun_user")
										   + " \n______________________________________________________ "    
									   );
				}
			} catch (Exception e){
				System.out.println("Erro: "+ e.getMessage());
			}
		}
		@WebMethod
		public void buscarUsuario(
				@WebParam(name = "buscarUsuarioCPF")String cpf,
				@WebParam(name = "buscarUsuarioUsuario")Usuario user){
				 
			try {
				ResultSet rs = statement.executeQuery("SELECT * FROM sol.tb_user_perfil WHERE cpf_user = "+cpf);
				while(rs.next()){
					user.setCpf(rs.getString("cpf_user"));
					user.setNome(rs.getString("nome_user"));
					user.setEmail(rs.getString("email_user"));
					user.setTelefone(rs.getString("tel_user"));
					user.setFuncao(rs.getString("func_user"));
					user.setMunicipio(rs.getString("mun_user"));
					user.setPerfil(rs.getString("perfil_user"));
				}
			} catch (Exception e){
				JOptionPane.showMessageDialog(null,"Erro: "+ e.getMessage());
			}
		}
		@WebMethod
		public void inserirusuariocontrole(
				
				@WebParam(name = "inserirusuario")Usuario usuario){
				
				String query = "INSERT INTO tb_user_perfil(nome_user,cpf_user,email_user,tel_user,func_user,mun_user,perfil_user) VALUES(?,?,?,?,?,?,?)";
				try {

			           PreparedStatement stmt = connection.prepareStatement(query);
			           stmt.setString(1, usuario.getNome());
			           stmt.setString(2, usuario.getCpf());
			           stmt.setString(3, usuario.getEmail());
			           stmt.setString(4, usuario.getTelefone());
			           stmt.setString(5, usuario.getFuncao());
			           stmt.setString(6, usuario.getMunicipio());
			           stmt.setString(7, usuario.getPerfil());
			           stmt.execute();
			           stmt.close();
			} catch (Exception e){
				JOptionPane.showMessageDialog(null,"Erro: "+ e.getMessage());
			}
		}
		@WebMethod
		public String editarusuariocontrole(
				@WebParam(name = "editarusuarioNome")String nome,
				@WebParam(name = "editarusuarioCPF")String cpf,
				@WebParam(name = "editarusuarioTelefone")String telefone,
				@WebParam(name = "editarusuarioEmail")String email,				
				@WebParam(name = "editarusuarioFuncao")String funcao,
				@WebParam(name = "editarusuarioMunicipio")String municipio,
				@WebParam(name = "editarusuarioPerfil")String perfil){
			int res;
			String retorno = "erro";
			try {
				res = statement.executeUpdate("UPDATE tb_user_perfil SET nome_user = '" + nome
						+ "', cpf_user = '" + cpf
						+ "', tel_user = '" + telefone
						+ "', email_user = '" + email
						+ "', func_user = '" + funcao
						+ "', mun_user = '" + municipio
						+ "', perfil_user = '" + perfil
						+ "' WHERE cpf_user = " + cpf);
				if(res==1)JOptionPane.showMessageDialog(null,"Os dados foram atualizados como sucesso!!!");
			} catch (Exception e){
				JOptionPane.showMessageDialog(null, "Os dados não foram atualizados!!!");
			}
			return retorno;
		}
		@WebMethod
		public void apagarusuariocontrole(
				@WebParam (name = "apagarUsuarioCPF") String cpf){
			int res;
			try {
				res = statement.executeUpdate("DELETE FROM sol.tb_user_perfil WHERE cpf_user = "+cpf);
				if(res==1)JOptionPane.showMessageDialog(null,"O usuario foi excluido como sucesso!!!");
			} catch (Exception e){
				JOptionPane.showMessageDialog(null, "Os dados não foram atualizados!!!");
			}
		}
		@WebMethod
		public void desconectarcontrole(){
			try {
				this.connection.close();
			} catch (Exception e){
				System.out.println("Erro: "+ e.getMessage());
			}
		}
	}

