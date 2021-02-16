

public class ExcepcionesCalculadora extends Exception {

	//Codigo de excepcion
	private int codigoEx;
	
	
	//Constructor
	public ExcepcionesCalculadora() {
		super();
	}
		
	public ExcepcionesCalculadora(int error) {
		super();
		this.codigoEx = error;
	}
	
	
	//Metodo para mostrar mensajes de error
	public String getMessage() {
		
		String mensaje = "";
		
		switch (codigoEx) {
			//Raiz de un numero negativo
			case 01:
				mensaje = "La raiz cuadrada de un numero negativo es un numero imaginario";
				break;
			//Si nos salimos del rango de Double
			case 02:
				mensaje = "Este numero es demasiado grande...";
				break;
			//Error al introducir signo aritmetico
			case 03:
				mensaje = "El signo aritmetico introducido para realizar la operacion no se reconoce.";
				break;
		}
		
		return mensaje;
		
	} 
	
}