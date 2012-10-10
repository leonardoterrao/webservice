package exemplo.simples.webservice;

import java.util.Date;

public class ExemploSimplesWebService {

	public String concatena(String texto1, String texto2) {
		return texto1 + " " + texto2;
	}

	public Long soma(Long valor1, Long valor2) {
		return valor1 + valor2;
	}

	public String pegarDataAgora() {
		return new Date().toLocaleString();
	}
}