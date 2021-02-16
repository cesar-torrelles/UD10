

import java.util.Scanner;

public class MainPasswordApp {
	public static void main(String[] args) {
		Password contraseñas []; //Array para guardar las contraseñas
		boolean contraseñaFuerte []; //Array para guardar si son fuertes o no
		int tamaño; //Tamaño de los arrays introducido por teclado
		int longitud; //Longitud de la contraseÒa
		Scanner teclado = new Scanner (System.in);
		
		//Preguntamos cuantas contraseñas vamos a generar
		System.out.println("Cuantas contraseÒas quieres generar?");
		tamaño = teclado.nextInt();
		
		//Dimensionamos los arrays
		contraseñas = new Password [tamaño];
		contraseñaFuerte = new boolean [tamaño];
		
		//Preguntamos la longitud de las contraseñas
		System.out.println("Introduce la longitud de las contraseÒas");
		longitud = teclado.nextInt();
		
		//Metodo para crear las contraseÒas
		Metodos.crearContraseñas(longitud, tamaño, contraseñas);
		
		//Metodo para saber si una contraseña es fuerte y guardar el resultado en el array
		Metodos.contraseñasFuertes(contraseñas, contraseñaFuerte);
		
		//Metodo para mostrar el array
		Metodos.mostrarArray(contraseñas, contraseñaFuerte);
		
		//Cerramos el teclado
		teclado.close();
	}
}
