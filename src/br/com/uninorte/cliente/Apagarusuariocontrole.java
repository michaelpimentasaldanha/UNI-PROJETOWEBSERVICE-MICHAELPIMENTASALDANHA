
package br.com.uninorte.cliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for apagarusuariocontrole complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="apagarusuariocontrole">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="apagarUsuarioCPF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "apagarusuariocontrole", propOrder = {
    "apagarUsuarioCPF"
})
public class Apagarusuariocontrole {

    protected String apagarUsuarioCPF;

    /**
     * Gets the value of the apagarUsuarioCPF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApagarUsuarioCPF() {
        return apagarUsuarioCPF;
    }

    /**
     * Sets the value of the apagarUsuarioCPF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApagarUsuarioCPF(String value) {
        this.apagarUsuarioCPF = value;
    }

}
