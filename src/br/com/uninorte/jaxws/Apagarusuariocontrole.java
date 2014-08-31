
package br.com.uninorte.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "apagarusuariocontrole", namespace = "http://uninorte.com.br/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "apagarusuariocontrole", namespace = "http://uninorte.com.br/")
public class Apagarusuariocontrole {

    @XmlElement(name = "apagarUsuarioCPF", namespace = "")
    private String apagarUsuarioCPF;

    /**
     * 
     * @return
     *     returns String
     */
    public String getApagarUsuarioCPF() {
        return this.apagarUsuarioCPF;
    }

    /**
     * 
     * @param apagarUsuarioCPF
     *     the value for the apagarUsuarioCPF property
     */
    public void setApagarUsuarioCPF(String apagarUsuarioCPF) {
        this.apagarUsuarioCPF = apagarUsuarioCPF;
    }

}
