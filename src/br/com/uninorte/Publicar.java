package br.com.uninorte;

import javax.xml.ws.Endpoint;

public class Publicar {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:10010/controleUsuario",new ControleUsuario());
	}
}