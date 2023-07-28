package mx.com.bytebank.modelo;

public class AutentidficacionUtil {
	private String clave;
	
	public boolean iniciarSesion(String clave) {
		return this.clave == clave;
	}
	
	public void setClave(String clave) {
		this.clave = clave;
	}

}
