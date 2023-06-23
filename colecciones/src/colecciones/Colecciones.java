package colecciones;

import java.util.Set; //papá
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
	}



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
 * */
	
}