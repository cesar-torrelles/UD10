package mainApp;


import java.util.Scanner;

import ejercicio1App.Jugador;

public class mainApp {

	//creamos un objeto jugador
	static Jugador jugador1 = new Jugador(0);
	
	
	public static void main(String[] args) {
		
		//declaramos la variable entrada"
		int entrada = 0;
		
		//abrimos el try catch
			try {
				
		//solicitamos que el usuario ingrese un numero
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca un número entero: ");
		
		//guardamos el valor en la variable "entrada"
		 entrada = sc.nextInt();
		

				
		//ingresamos el dato dentro del objeto "jugador"
		 jugador1 = new Jugador(entrada);
		
		
		 //escribimos el catch avisando por terminal que se debe ingresar un numero entero
		} catch (java.util.InputMismatchException Excepcion) {
			System.out.println("has de escribir un numero entero!");
		}
		
		
	//creamos la variable numRandom y extraemos el valor del atributo numero Random del jugador
	 int numeroRandom = jugador1.getNumRandom() ;
	 
	 jugador1.bucle(entrada,numeroRandom);
	 
	 
	}
	}

