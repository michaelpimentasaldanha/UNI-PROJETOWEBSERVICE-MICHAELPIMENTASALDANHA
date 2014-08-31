
package br.com.uninorte.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "buscarUsuario", namespace = "http://uninorte.com.br/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "buscarUsuario", namespace = "http://uninorte.com.br/", propOrder = {
    "buscarUsuarioCPF",
    "buscarUsuarioUsuario"
})
public class BuscarUsuario {

    @XmlElement(name = "buscarUsuarioCPF", namespace = "")
    private String buscarUsuarioCPF;
    @XmlElement(name = "buscarUsuarioUsuario", namespace = "")
    private br.com.uninorte.Usuario buscarUsuarioUsuario;

    /**
     * 
     * @return
     *     returns String
     */
    public String getBuscarUsuarioCPF() {
        return this.buscarUsuarioCPF;
    }

    /**
     * 
     * @param buscarUsuarioCPF
     *     the value for the buscarUsuarioCPF property
     */
    public void setBuscarUsuarioCPF(String buscarUsuarioCPF) {
        this.buscarUsuarioCPF = buscarUsuarioCPF;
    }

    /**
     * 
     * @return
     *     returns Usuario
     */
    public br.com.uninorte.Usuario getBuscarUsuarioUsuario() {
        return this.buscarUsuarioUsuario;
    }

    /**
     * 
     * @param buscarUsuarioUsuario
     *     the value for the buscarUsuarioUsuario property
     */
    public void setBuscarUsuarioUsuario(br.com.uninorte.Usuario buscarUsuarioUsuario) {
        this.buscarUsuarioUsuario = buscarUsuarioUsuario;
    }

}
