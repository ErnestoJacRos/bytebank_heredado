/**
 * 
 */
package mx.com.bytebank.modelo;

public class Administrador extends Funcionario implements Autenticable {

	private AutentidficacionUtil util;
	
	//constructor
	public Administrador() {
		this.util = new AutentidficacionUtil();
	}
	@Override
	public double getBonificacion() {
		
		return super.getSalario();
	}

	@Override
	public boolean iniciarSesion(String clave) {
		
		return this.util.iniciarSesion(clave);
	}

	@Override
	public void setClave(String clave) {
		this.util.setClave(clave);;
		
	}

}
