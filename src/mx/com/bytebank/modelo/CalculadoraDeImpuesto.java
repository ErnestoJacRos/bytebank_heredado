package mx.com.bytebank.modelo;

public class CalculadoraDeImpuesto {
	private double totalImpuesto;
	
	public void registra(Tributacion tributacion) {
		double valor = tributacion.getValorImpueto();
		this.totalImpuesto += valor;
	}
	public double getTotalImpuesto() {
		return this.totalImpuesto;
	} 
}
