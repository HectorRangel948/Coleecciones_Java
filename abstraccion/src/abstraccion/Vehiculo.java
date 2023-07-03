package abstraccion;

public abstract class Vehiculo { //se tiene que indicar que es una clase abstracta
	
	//Atributos
	
	public String marca;
	public int anio;
	
	//Método concreto
	
	public void mostrarInfo() {
		System.out.println("Marca: "+ marca + "\nAño: "+anio);
	}
	
	//Método abstracto
	public abstract void acelerar();
	//Un método abstracto solo tiene la firma y no tiene el body
	
	//Método abstracto
	public abstract void frenar();

}

/*
 * Abstacción
 * 
 * En Java, una clase abstracta es una clase que no puede ser implementada directamente (que no puede instanciar), sino que se utiliza como una base para crear subclases más concretas. Se utiliza para definir una estructura común y compartit el comportamiento entre las subclases relacionadas. 
 * 
 * Una clase abstracta puede implementar métodos concretos (métodos que hemos utilizado hasta ahorita) y métodos abstractos. 
 * */
