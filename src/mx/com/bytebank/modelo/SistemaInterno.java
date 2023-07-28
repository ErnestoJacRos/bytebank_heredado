package mx.com.bytebank.modelo;

public class SistemaInterno {
		private String  clave ="AluraCursosOnLine";
		
		public boolean autenticar(Autenticable funcionarioAutenticable) {
			boolean puedeIniciarSesion = funcionarioAutenticable.iniciarSesion(clave);
			if(puedeIniciarSesion) {
				System.out.println("Login exitoso ");
				return true;
				
			}else {
				System.out.println("Error en login");
				return false;
			}
		}
}
