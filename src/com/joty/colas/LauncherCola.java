/**
 * 
 */
package com.joty.colas;

/**
 * @author Jonathan G Araya
 *
 */
public class LauncherCola {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Cola<Object> cola = new Cola<>();

		System.out.println("Ingresando datos.");
		cola.enqueue(1);
		System.out.println("Obteniendo el primero.");
		cola.peek();
		cola.enqueue(2);
		cola.enqueue(3);
		cola.enqueue(4);
		cola.enqueue(5);
		cola.enqueue(6);
		cola.enqueue(7);
		cola.enqueue(8);
		System.out.println("Obteniendo el tanamo.");
		cola.colaLarge();
		System.out.println("Sacando el primero.");
		cola.dequeue();
		System.out.println("Obteniendo el primero.");
		cola.peek();
		System.out.println("Sacando el primero.");
		cola.dequeue();
		System.out.println("Obteniendo el primero.");
		cola.peek();
		System.out.println("Limpiando cola.");
		cola.colaClear();
	}
}