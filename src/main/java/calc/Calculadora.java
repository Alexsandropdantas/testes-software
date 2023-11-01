package calc;


public class Calculadora {

	public int somar(int v1, int v2) {
		return v1 + v2;
	}

	public int subtrair(int v1, int v2) {
		return v1 - v2;
	}

	public int multiplicar(int numero, int multiplicador) {
		return numero * multiplicador;
	}

	public double dividir(int dividendo, int divisor) {
		if (divisor == 0)
			throw new ArithmeticException("Divisao por zero");
		return dividendo / divisor;
	}


}