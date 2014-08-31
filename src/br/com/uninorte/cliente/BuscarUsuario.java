
package br.com.uninorte.cliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for buscarUsuario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="buscarUsuario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="buscarUsuarioCPF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="buscarUsuarioUsuario" type="{http://uninorte.com.br/}usuario" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "buscarUsuario", propOrder = {
    "buscarUsuarioCPF",
    "buscarUsuarioUsuario"
})
public class BuscarUsuario {

    protected String buscarUsuarioCPF;
    protected Usuario buscarUsuarioUsuario;

    /**
     * Gets the value of the buscarUsuarioCPF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuscarUsuarioCPF() {
        return buscarUsuarioCPF;
    }

    /**
     * Sets the value of the buscarUsuarioCPF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuscarUsuarioCPF(String value) {
        this.buscarUsuarioCPF = value;
    }

    /**
     * Gets the value of the buscarUsuarioUsuario property.
     * 
     * @return
     *     possible object is
     *     {@link Usuario }
     *     
     */
    public Usuario getBuscarUsuarioUsuario() {
        return buscarUsuarioUsuario;
    }

    /**
     * Sets the value of the buscarUsuarioUsuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link Usuario }
     *     
     */
    public void setBuscarUsuarioUsuario(Usuario value) {
        this.buscarUsuarioUsuario = value;
    }

}
