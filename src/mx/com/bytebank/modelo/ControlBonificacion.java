package mx.com.bytebank.modelo;

public class ControlBonificacion {
	private double sumaBonificaciones;
	
	public double registrarSalario(Funcionario funcionario){
		this.sumaBonificaciones += funcionario.getBonificacion();
		System.out.println("Calculo actula: " + this.sumaBonificaciones);
		return this.sumaBonificaciones; 
		
	}

		 
}
