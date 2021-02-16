

public class Metodos {
	
	
	
	
	
	//METODO SUMA
	public static double suma (double a, double b) {
		return (a + b);
	}

	//METODO RESTA
	public static double resta (double a, double b) {
		return (a - b);
	}

	//METODO MULTIPLICACION
	public static double multiplicacion (double a, double b) {
		return (a * b);
	}

	//METODO DIVISION
	public static double division (double a, double b) {
		if (b == 0) throw new ArithmeticException();
		return (a / b);
	}

	//METODO POTENCIA
	public static double potencia (double a, double b) {
		return (Math.pow(a, b));
	}

	//METODO RAIZ CUADRADA
	public static double raizCuadrada (double a) throws ExcepcionesCalculadora {
		double resultado = Math.sqrt(a);
		
		
		if (Double.isNaN(resultado)) throw new ExcepcionesCalculadora(1);	
		return resultado;
	}

	//METODO RAIZ CUBICA
	public static double raizCubica (double a) {
		return Math.cbrt(a);
	}

	//METODO MODULO
	public static double modulo (double a, double b) {
		return (a % b);
	}

}
