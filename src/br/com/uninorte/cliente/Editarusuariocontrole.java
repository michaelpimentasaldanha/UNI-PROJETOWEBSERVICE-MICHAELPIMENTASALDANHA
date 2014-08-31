
package br.com.uninorte.cliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for editarusuariocontrole complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="editarusuariocontrole">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="editarusuarioNome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="editarusuarioCPF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="editarusuarioTelefone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="editarusuarioEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="editarusuarioFuncao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="editarusuarioMunicipio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="editarusuarioPerfil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "editarusuariocontrole", propOrder = {
    "editarusuarioNome",
    "editarusuarioCPF",
    "editarusuarioTelefone",
    "editarusuarioEmail",
    "editarusuarioFuncao",
    "editarusuarioMunicipio",
    "editarusuarioPerfil"
})
public class Editarusuariocontrole {

    protected String editarusuarioNome;
    protected String editarusuarioCPF;
    protected String editarusuarioTelefone;
    protected String editarusuarioEmail;
    protected String editarusuarioFuncao;
    protected String editarusuarioMunicipio;
    protected String editarusuarioPerfil;

    /**
     * Gets the value of the editarusuarioNome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditarusuarioNome() {
        return editarusuarioNome;
    }

    /**
     * Sets the value of the editarusuarioNome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditarusuarioNome(String value) {
        this.editarusuarioNome = value;
    }

    /**
     * Gets the value of the editarusuarioCPF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditarusuarioCPF() {
        return editarusuarioCPF;
    }

    /**
     * Sets the value of the editarusuarioCPF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditarusuarioCPF(String value) {
        this.editarusuarioCPF = value;
    }

    /**
     * Gets the value of the editarusuarioTelefone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditarusuarioTelefone() {
        return editarusuarioTelefone;
    }

    /**
     * Sets the value of the editarusuarioTelefone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditarusuarioTelefone(String value) {
        this.editarusuarioTelefone = value;
    }

    /**
     * Gets the value of the editarusuarioEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditarusuarioEmail() {
        return editarusuarioEmail;
    }

    /**
     * Sets the value of the editarusuarioEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditarusuarioEmail(String value) {
        this.editarusuarioEmail = value;
    }

    /**
     * Gets the value of the editarusuarioFuncao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditarusuarioFuncao() {
        return editarusuarioFuncao;
    }

    /**
     * Sets the value of the editarusuarioFuncao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditarusuarioFuncao(String value) {
        this.editarusuarioFuncao = value;
    }

    /**
     * Gets the value of the editarusuarioMunicipio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditarusuarioMunicipio() {
        return editarusuarioMunicipio;
    }

    /**
     * Sets the value of the editarusuarioMunicipio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditarusuarioMunicipio(String value) {
        this.editarusuarioMunicipio = value;
    }

    /**
     * Gets the value of the editarusuarioPerfil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditarusuarioPerfil() {
        return editarusuarioPerfil;
    }

    /**
     * Sets the value of the editarusuarioPerfil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditarusuarioPerfil(String value) {
        this.editarusuarioPerfil = value;
    }

}
