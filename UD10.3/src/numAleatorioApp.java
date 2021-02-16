

import java.util.concurrent.ThreadLocalRandom;

import myException.MyException;

public class numAleatorioApp {

	public static void main(String[] args) {
		
		
		//creamos un numero aleatorio
		
		int numAleatorio = ThreadLocalRandom.current().nextInt(1, 200 + 1);
		
		//usamos try catch 
		
		try {
		
			//imprimimos el numero aleatorio
			System.out.println("El numero aleatorio es el siguiente: " + numAleatorio );
			
			//añadimos un condicional para comprobar si es par
			//en caso de que sea correcto decimos que es par
			if (numAleatorio % 2 == 0) {throw new MyException(1);}
			
			//en caso incorrecto decimos que es impar
			else {throw new MyException(2);}
		}
		//ceerramos con el catch
		catch (MyException ex){
			System.out.println(ex.getMessage());
		}
	}

}
