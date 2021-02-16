
import myException.MyException;


public class ExcepcionCustomizadaApp {

	public static void main(String[] args) {
		
		
		
		
		
		try {
			System.out.println("Mensaje mostrado por pantalla");
			
			{throw new MyException(1);}
		}
		catch (MyException ex){
			System.out.println(ex.getMessage());
		}
		finally {
			System.out.println("Fin del programa.");
		}

	}

}
