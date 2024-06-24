package clasestatic;

public class Invertir {

	public static int NumerosInvertidos(int numero) {
		int numeroInvertido = 0;
		
		while (numero !=0) {
			int dig = numero%10;
			
			numeroInvertido = numeroInvertido*10+ dig;
			numero/=10;
		}
		return numeroInvertido;
	}
}