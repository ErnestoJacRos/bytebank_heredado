package mx.com.bytebank.modelo;

public interface  Autenticable {
	
/*una interfece siempre es abstracta asi podemos omitir la keyword 
 * quitamos la palabra class para poner la keyword "interface"
 * una interface no puede extender de una clase
 * una interface solo puede extender de otr interf  */
	
	public void setClave(String clave) ;
	
	public  boolean iniciarSesion(String clave);
	

}
