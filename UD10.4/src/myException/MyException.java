
package myException;

public class MyException extends Exception {
	
	
	//aqui recogemos el codigo de la excepcion
	private int codigoException;
	
	
	
	
	//Constructor de la clase
	public MyException(int codigoError) {
		super();
		this.codigoException = codigoError;
	}

	public MyException() {
		super();
	}

	//metodo para mostrar el mensaje que se ha customizado
	public String getMessage() {
		
		String mensaje= "";
		
		switch (codigoException) {
		case 1: 
			mensaje = "Exception 1: es par.";
		break;
		case 2:
			mensaje = "Exception 2: es impar.";
		break;
		case 3: 
			mensaje = "es un valor booleano";
		break;
	
		}
		return mensaje;
	}
}
