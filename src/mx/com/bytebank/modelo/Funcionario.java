package mx.com.bytebank.modelo;

/*Clase abstracta: 
 * Se definen con la palabra clave abstract 
 * no puede ser instanciada porque es una repreasentación conceptual 
 * pero no puede ser una representación física del objeto 
 * En una clase abstracta podemos tener métodos abstractos 
 * que se definen igual con la palabra abstract y deben ser implementados en la clase hija (obligatoriamnete)
 * y no necesitar definir un cuerpo 
 * Una claser abstracta puede tener variables de instancia, puede refeenciar objetos no abstractos 
 * puede tener elementos estáticos, Constructores por defecto y COnstructores personalozados 
 * Puede tener método reales (Concretos), getters and setters 
 * par apoder tener métodos abstractos, la clase debe ser abstracta */

public abstract class Funcionario {
	//Atributos 
	private String nombre;
	private String documneto;
	private double salario;
	private int tipo;
	//constructores 
	
	
	//Getters and Setters 
	public Funcionario() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDocumneto() {
		return documneto;
	}

	public void setDocumneto(String documneto) {
		this.documneto = documneto;
	}
	
	

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	
	
	
	//Operacione
	


	public abstract double getBonificacion();
	

	
	

}
