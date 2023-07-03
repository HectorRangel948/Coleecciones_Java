package abstraccion;

public class Motocicleta extends Vehiculo{
	
	//Las anotaciones @ son "indicaciones" que le damos a JAVA
	
	@Override
	public void acelerar() {	
		System.out.println("La motocicleta está acelerando...");
	}
	
	//La subclase es quien decide cuando y cómo se sobreescribe el método abstracto. Es decir, la subclase implementa el método

	@Override
	public void frenar() {
		System.out.println("La motocicleta está frenando...");
	}

}
