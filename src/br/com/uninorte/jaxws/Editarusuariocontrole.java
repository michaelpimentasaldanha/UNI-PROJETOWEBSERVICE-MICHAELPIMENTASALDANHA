
package br.com.uninorte.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "editarusuariocontrole", namespace = "http://uninorte.com.br/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "editarusuariocontrole", namespace = "http://uninorte.com.br/", propOrder = {
    "editarusuarioNome",
    "editarusuarioCPF",
    "editarusuarioTelefone",
    "editarusuarioEmail",
    "editarusuarioFuncao",
    "editarusuarioMunicipio",
    "editarusuarioPerfil"
})
public class Editarusuariocontrole {

    @XmlElement(name = "editarusuarioNome", namespace = "")
    private String editarusuarioNome;
    @XmlElement(name = "editarusuarioCPF", namespace = "")
    private String editarusuarioCPF;
    @XmlElement(name = "editarusuarioTelefone", namespace = "")
    private String editarusuarioTelefone;
    @XmlElement(name = "editarusuarioEmail", namespace = "")
    private String editarusuarioEmail;
    @XmlElement(name = "editarusuarioFuncao", namespace = "")
    private String editarusuarioFuncao;
    @XmlElement(name = "editarusuarioMunicipio", namespace = "")
    private String editarusuarioMunicipio;
    @XmlElement(name = "editarusuarioPerfil", namespace = "")
    private String editarusuarioPerfil;

    /**
     * 
     * @return
     *     returns String
     */
    public String getEditarusuarioNome() {
        return this.editarusuarioNome;
    }

    /**
     * 
     * @param editarusuarioNome
     *     the value for the editarusuarioNome property
     */
    public void setEditarusuarioNome(String editarusuarioNome) {
        this.editarusuarioNome = editarusuarioNome;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getEditarusuarioCPF() {
        return this.editarusuarioCPF;
    }

    /**
     * 
     * @param editarusuarioCPF
     *     the value for the editarusuarioCPF property
     */
    public void setEditarusuarioCPF(String editarusuarioCPF) {
        this.editarusuarioCPF = editarusuarioCPF;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getEditarusuarioTelefone() {
        return this.editarusuarioTelefone;
    }

    /**
     * 
     * @param editarusuarioTelefone
     *     the value for the editarusuarioTelefone property
     */
    public void setEditarusuarioTelefone(String editarusuarioTelefone) {
        this.editarusuarioTelefone = editarusuarioTelefone;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getEditarusuarioEmail() {
        return this.editarusuarioEmail;
    }

    /**
     * 
     * @param editarusuarioEmail
     *     the value for the editarusuarioEmail property
     */
    public void setEditarusuarioEmail(String editarusuarioEmail) {
        this.editarusuarioEmail = editarusuarioEmail;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getEditarusuarioFuncao() {
        return this.editarusuarioFuncao;
    }

    /**
     * 
     * @param editarusuarioFuncao
     *     the value for the editarusuarioFuncao property
     */
    public void setEditarusuarioFuncao(String editarusuarioFuncao) {
        this.editarusuarioFuncao = editarusuarioFuncao;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getEditarusuarioMunicipio() {
        return this.editarusuarioMunicipio;
    }

    /**
     * 
     * @param editarusuarioMunicipio
     *     the value for the editarusuarioMunicipio property
     */
    public void setEditarusuarioMunicipio(String editarusuarioMunicipio) {
        this.editarusuarioMunicipio = editarusuarioMunicipio;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getEditarusuarioPerfil() {
        return this.editarusuarioPerfil;
    }

    /**
     * 
     * @param editarusuarioPerfil
     *     the value for the editarusuarioPerfil property
     */
    public void setEditarusuarioPerfil(String editarusuarioPerfil) {
        this.editarusuarioPerfil = editarusuarioPerfil;
    }

}
