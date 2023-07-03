package calculadora;

public class Calculadora {

	//Métodos
	public static int suma(int a, int b){
		return a+b;
	}
	
	public static int multiplicar( int a, int b){
		return a*b;
	}
	
	public static float dividir (float a, float b) {
		return a/b;
	}
	
	//Main
	public static void main(String[] args) {
		suma(2,5);
	}

}
