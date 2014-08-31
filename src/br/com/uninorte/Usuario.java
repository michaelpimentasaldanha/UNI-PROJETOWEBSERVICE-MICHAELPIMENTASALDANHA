package br.com.uninorte;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class Usuario {
    
	String id;
    String nome;
    String cpf;
    String telefone;
    String email;
    String funcao;
    String municipio;
    String perfil;
    
    @WebMethod
    public String getPerfil() {
		return perfil;
	}
    @WebMethod
	public void setPerfil(
			@WebParam(name = "setPerfil") String perfil) {
		this.perfil = perfil;
	}
    @WebMethod    
	public String getId() {
		return id;
	}
    @WebMethod
	public void setId(
			@WebParam(name = "setId") String id) {
		this.id = id;
	}
    @WebMethod
	public String getNome() {
		return nome;
	}
    @WebMethod
	public void setNome(
			@WebParam(name = "setNome") String nome) {
		this.nome = nome;
	}
    @WebMethod
	public String getCpf() {
		return cpf;
	}
    @WebMethod
	public void setCpf(
			@WebParam(name = "setCpf") String cpf) {
		this.cpf = cpf;
	}
    @WebMethod
	public String getTelefone() {
		return telefone;
	}
    @WebMethod
	public void setTelefone(
			@WebParam(name = "setTelefone") String telefone) {
		this.telefone = telefone;
	}
    @WebMethod
	public String getEmail() {
		return email;
	}
    @WebMethod
	public void setEmail(
			@WebParam(name = "setEmail") String email) {
		this.email = email;
	}
    @WebMethod
	public String getFuncao() {
		return funcao;
	}
    @WebMethod
	public void setFuncao(
			@WebParam(name = "setFuncao") String funcao) {
		this.funcao = funcao;
	}
    @WebMethod
	public String getMunicipio() {
		return municipio;
	}
    @WebMethod
	public void setMunicipio(
			@WebParam(name = "setMunicipio") String municipio) {
		this.municipio = municipio;
	}
}
