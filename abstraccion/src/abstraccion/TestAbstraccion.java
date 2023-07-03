package abstraccion;

public class TestAbstraccion{

	public static void main(String[] args) {
		//Instancia de la clase automovil
		Automovil miTroquita = new Automovil();
		
		//Instancia de la clase motocicleta
		Motocicleta ninja = new Motocicleta();
		

		miTroquita.acelerar();
		miTroquita.frenar();

		ninja.acelerar();
		ninja.frenar();
		

	}

}
