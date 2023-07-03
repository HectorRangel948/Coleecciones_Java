package abstraccion;

public class Automovil extends Vehiculo{

	@Override
	public void acelerar() {
		System.out.println("El automovil está acelerando...");
		
	}

	@Override
	public void frenar() {
		System.out.println("El automovil está frenando...");
	}

}
