package colecciones;

import java.util.Set; //papá
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;

import java.util.HashSet; //Hijo

public class Colecciones {
	public static void main(String[] args) {
		//Declarando mi primer arreglo de Java []
		//Primero el tipo de dato que voy a almacenar, le pongo los corchetes cuadrados, después el nombre de mi arreglo y por último instancio mi arreglo. Los datos que voy a guardar en este arreglo, van dentro de {}
		String[] listaCompras = new String[]{"leche", "pan", "frutas"};
		System.out.println(listaCompras);
		
		//forEach para imprimir cada elemento de mi lista de compras
		//para nuestros datos del tipo String, que se almacenan en una variable temporal llamada productoTemporal, que se está llenando de un arreglo llamado listaCompras, vas  a imprimir ese productoTemporal
		
		for(String productoTemporal : listaCompras){
			System.out.println(productoTemporal);
		}
		
		//Arreglo de habitaciones de un hotel
		String[] habitaciones = new String[10];
		
		habitaciones[0] = "100";
		habitaciones[1] = "101";
		habitaciones[2] = "102";
		habitaciones[3] = "103";
		habitaciones[4] = "104";
		habitaciones[5] = "105";
		habitaciones[6] = "106";
		
		/*
		 * habitaciones[10] = 111; si tratamos de acceder a un elemento más allá de los elementos declarados al principio, tendremos una excepción que solo veremos cuando se ejecute el programa
		 * */
		
		/*
		 * Cuando imprimimos un elemento que no está definido dentro del arreglo veremos null. Esto pasa porque para JAVA es preferible tener un elemento nulo a uno indefinido
		 * */
		System.out.println(habitaciones[8]);
		
		//En caso de querer usar un foreach para imprimir los elementos solo se imprimirán 7 elementos (Solo itera sobre los elementos existentes).
		
		for(String habitacionTemporal : habitaciones) {
			System.out.println("");
		}
	

//ArrayList
	
	//Uso la interface List que almacena contactos (objetos), se llama listaDeContactos e instancia un arrayList para manejar los mismos tipos de datos (Contacto)
	List<Cliente> listaDeClientes = new ArrayList<>();
	
	//Primero instancio un objeto de la clase Cliente(nombre, cuenta, saldo, nip)
	
	//Primera forma: Primero crear mis objetos y luego agregarlos
	//Segunda forma: Hacer lo mismo que la primera pero en una línea
	
Cliente Felipe = new Cliente("Felipe Maqueda", "ACB123", 156.12f, "1234");
	
	//Agrego el cliente a mi lista de clientes con el método .add
	
	listaDeClientes.add(Felipe);
	
	listaDeClientes.add(new Cliente("Naruto", "XXX1111", 100.0f, "000"));
	
	System.out.println("Lista completa");
	//Imprimo la información de mi lista (utiliza métodos)
	System.out.println(listaDeClientes);
	
	System.out.println();
	//Sacar un elemento de la lista y asignarlo a una variable
	System.out.println("Elemento en el índice 0:");
	Cliente datoDeLaLista = listaDeClientes.get(0);
	
	System.out.println();
	//Imprimir el elemento de la lista con un dato específico
	System.out.println(datoDeLaLista.getCuentaBancaria());
	System.out.println(datoDeLaLista);
	
	System.out.println();
	//Eliminar elementos de la lista
	listaDeClientes.remove(0);
	
	System.out.println();
	//Imprimo la información de mi lista (utilizar métodos)
	System.out.println(listaDeClientes);
	
	//Conjunto para servicios de un hotel
	Set<String> roomService = new HashSet<>();
	
	//Agregamos elementos a nuestro hashSet
	roomService.add("Chilaquiles");
	roomService.add("Agua mineral");
	roomService.add("Wi-Fi");
	
	//Hotel con promoción (si pidieron agua mineral aplicamos un descuento del 50%)
	if(roomService.contains("Agua mineral")) {
		System.out.println("Obtienes un descuento del 50%");
	}
	
	//Que pasa si imprimo mi roomService
	System.out.println(roomService);
	
	//Borramos toda la lita de roomService
	roomService.clear();
	
	System.out.println(roomService);
	
	
	
	//HashMap para mi sistema de reservas del hotel
	Map<String, Cliente> reservaHabitacion = new HashMap<>();
	
	reservaHabitacion.put("101", new Cliente("Jesus", "135JJJ", 1552.58f, "04254"));
	reservaHabitacion.put("102", new Cliente("Bugs Bunny", "BGSBNY111", 15254.45f, "7777"));
	
	//Impresión de una reserva
	Cliente reservaBugsBunny = reservaHabitacion.get("102");
	
	//Qué pasa si imprimo la variable resevaHabitacion
	System.out.println(reservaHabitacion);
	
	} //Cierre main
}//Cierre class
	
	
	
	
	
	
/*
 * Colecciones
 * 
 * -Arrays
 * 
 * Un array es una estructura de datos linea que contiene elementos del mismo tipo. Los elementos están almacenados de forma contigua en memoria, y se puede acceder a ellos a través de un índice. Sus principales características son:
 * 1.-Tamaño fijo
 * 2.-Acceso rápido
 * 3.-Coste elevado para insertar o eliminar elmentos. 
 * 
 * 
 * 
 * Set 
 * Es una estructura de datos que almacenan elementos unicos sin orden específico. Las principales características de un set son 
 * 
 * 1.- No hay elementos duplicados
 * 2.- No hay un orden específico
 * 3.- La búsqueda es más rápido (key-value)
 * 
 * 
 * 
 * HashMap
 * 
 * Es una implementación de la interfaz Map de Java, que permite que la información se almacene en pares clave-valor. Sus principales características son:
 * 
 * 1.- Almacenamiento K y V
 * 2.- Sin orden específico
 * 3.- Búsqueda rápida
 * 4.- Iteración rápida (for each)
 * 5.- No sincronizado (hilos)
 * 
 * */
	
