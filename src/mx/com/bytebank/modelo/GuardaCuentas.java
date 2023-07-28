package mx.com.bytebank.modelo;

public class GuardaCuentas {
	
	//Crear un objeto para guardas muchas cuentas
	//Permitor agregar cuantas con un método
	Cuenta[] cuentas = new Cuenta[10];
	
	int indice = 0;
	public void adicionar(Cuenta cc) {
		cuentas[indice] = cc;
		indice++;
	}
	
	public Cuenta obtener(int indice) {
		return cuentas[indice];
	}
}
