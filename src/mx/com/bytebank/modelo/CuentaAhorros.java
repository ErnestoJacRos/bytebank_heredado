package mx.com.bytebank.modelo;

public class CuentaAhorros extends Cuenta {
	public CuentaAhorros (int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void depositar(double montoDepsito) {
		 
			 if(montoDepsito > 0) {
				 this.saldo += montoDepsito;
			 }
		 
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Cuenta Ahorros: " +  super.toString();
	}
}
