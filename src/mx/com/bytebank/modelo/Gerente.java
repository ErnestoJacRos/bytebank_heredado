package mx.com.bytebank.modelo;

public class Gerente extends Funcionario implements Autenticable {
	// atributos o varibles de instancia

	
	//Operaciones 
	
	//Override
	
	@Override
	public double getBonificacion() {
		System.out.println("Ejecutando desde gerente ");	
		return 2000;
	}

	@Override
	public void setClave(String clave) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean iniciarSesion(String clave) {
		// TODO Auto-generated method stub
		return false;
	}
}
