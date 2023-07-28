package mx.com.bytebank.modelo;

public class CuentaCorriente extends Cuenta implements Tributacion{
	
	public CuentaCorriente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void retirar(double montoRetirar) throws SaldoInsuficienteException{
		
		double comision = 0.2;
		super.retirar(montoRetirar + comision);
	}

	@Override
	public void depositar(double montoDepsito) {
	
		 if(montoDepsito > 0) {
			 this.saldo += montoDepsito;
		 }
	 
		
	}

	@Override
	public double getValorImpueto() {
		// TODO Auto-generated method stub
		return super.saldo *0.01;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Cuenta Corriente" + super.toString();
	}

}

