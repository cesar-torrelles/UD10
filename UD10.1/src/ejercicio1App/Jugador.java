package ejercicio1App;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Jugador {

	// creamos un objeto jugador

	// Atributos
	protected int numero;
	protected final int numRandom = numRandom(); // al cual le asignamos por defecto un numero random mediante un metodo

	// Constructor

	public Jugador(int numero) {
		this.numero = numero;
	}

	// getters y setters

	public String getNombreJugador() {
		return getNombreJugador();
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNumRandom() {
		return numRandom;
	}

	// metodo para generar un numero random el cual tendra que adivinar el usuario

	public static int numRandom() {

		// Generamos un valor aleatorio entre 1 y 500
		int numAleatorio = ThreadLocalRandom.current().nextInt(1, 500 + 1);

		return numAleatorio;

	}

	// metodo bucle, aqui comprobamos si el numero introducido es igual, mayor o
	// menor que el generado
	public void bucle(int numero, int numAleatorio) {

		while (numero != numAleatorio) {

			if (numero > numAleatorio) {

				System.out.println("tu numero es mayor, prueba uno mas bajo !");

			} else if (numero < numAleatorio) {

				System.out.println("tu numero es menor, prueba uno mas alto !");

			}

			// en caso de que no coincidan ambos numeros, continua el bucle

			Scanner sc = new Scanner(System.in);
			System.out.print("Introduzca un número entero: ");
			numero = sc.nextInt();
			
		}

		// cuando coinciden, se indica que es correcto y se acaba el loop
		System.out.println();
		System.out.println("Correcto !");

	}

}
