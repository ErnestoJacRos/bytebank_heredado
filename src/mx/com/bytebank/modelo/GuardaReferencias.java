package mx.com.bytebank.modelo;

public class GuardaReferencias {

	Object[] referencias = new Object[10];
	int indice = 0;

	public void adicionar(Object cc) {
		
		referencias[indice] = cc;
		indice++;
	}
	
	public Object obtener(int indice) {
		
		return referencias[indice];
	}
}
