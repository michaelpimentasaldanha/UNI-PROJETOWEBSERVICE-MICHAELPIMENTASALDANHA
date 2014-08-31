
package br.com.uninorte.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "inserirusuariocontrole", namespace = "http://uninorte.com.br/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inserirusuariocontrole", namespace = "http://uninorte.com.br/")
public class Inserirusuariocontrole {

    @XmlElement(name = "inserirusuario", namespace = "")
    private br.com.uninorte.Usuario inserirusuario;

    /**
     * 
     * @return
     *     returns Usuario
     */
    public br.com.uninorte.Usuario getInserirusuario() {
        return this.inserirusuario;
    }

    /**
     * 
     * @param inserirusuario
     *     the value for the inserirusuario property
     */
    public void setInserirusuario(br.com.uninorte.Usuario inserirusuario) {
        this.inserirusuario = inserirusuario;
    }

}
