package mx.com.bytebank.modelo;

/** 
 * Cuenta va a crear nuevas instancias de CuentaCorriente y CuentaAhorros
 * @version 1.0
 * @author Jacros
 * 
 * */

public abstract class Cuenta implements Comparable<Cuenta> {
	 protected double saldo;
	 private int agencia = 1;
	 private int numero;
	 
	 private Cliente titular  = new Cliente(); 
	 private static int total = 0;
	 //Construtores 
	 
	 /**
	  * Instancia una nueva cuenta sin paprametros 
	  */
	 public Cuenta () {
		 
	 }
	 /**
	  * Instancia una cuenta usando agencia y numero 
	  * @param agencia
	  * @param numero
	  */
	 
	 public Cuenta(int agencia, int numero) {
		 
		 if(agencia <= 0) {
		 System.out.println("No se permite 0");
		 this.agencia = 1; 
		 }else {
			 this.agencia = agencia;
		 }
		 this.numero = numero;
		 total++;
		 System.out.println("Se van creando: " + Cuenta.total + " Cuentas");
	 }
	 //Getters and setters
	 public double getSaldo() {
		 return this.saldo;
	 }
	 
	 public int getAgencia() {
		 return this.agencia;
	 }

	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public static int getTotal() {
		return Cuenta.total;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	//operaciones//
	
	//depositar 
	 public abstract void depositar(double montoDepsito);
	 
	 //retirar
	 /**
	  * este método retira dinero de la cuenta y si ocurre un error
	  * devuelve un error 
	  * @param montoRetirar
	  * @throws SaldoInsuficienteException
	  */
	 
	 public void retirar(double montoRetirar) throws SaldoInsuficienteException{
		if(this.saldo < montoRetirar) {
			throw new SaldoInsuficienteException("No tienes saldo");
		}
			 this.saldo -= montoRetirar;
		
		 
	 }
	 //Transferir
	 public boolean transferir(double montoTransferir, Cuenta cuentaDestino) {
		 if(this.saldo >= montoTransferir) {
			 try {
				this.retirar(montoTransferir);
			} catch (SaldoInsuficienteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 cuentaDestino.depositar(montoTransferir);	
			 return true; 
		 }
		 return false;
		 
	 }
	 
	 @Override
	public String toString() {
		String cuenta = "Numero: " +this.getNumero() + ", Agencia: " +this.getAgencia() +
				", Turlar: " + this.getTitular().getNombre(); 
		return cuenta;
	}
	 @Override
	public boolean equals(Object obj) {
		Cuenta cuenta = (Cuenta) obj;
		
		return this.getAgencia() == cuenta.getAgencia() &&
				this.getNumero() == cuenta.getNumero();
	}
	 @Override
	public int compareTo(Cuenta o) {
		//Implementando orden natural en este caso será por Numero agencia
		 
		return Integer.compare(this.getAgencia(), o.getAgencia());
	}
	 
}
