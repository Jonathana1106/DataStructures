/**
 * 
 */
package com.joty.pilas;

/**
 * @author Jonathan G Araua
 *
 */
public class LauncherPilas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Pila<Object> pila = new Pila<>();

		System.out.println("Ingresando datos.");
		pila.push(1);
		System.out.println("Obteniendo el tope.");
		pila.peek();
		pila.push(2);
		pila.push(3);
		pila.push(4);
		pila.push(5);
		pila.push(6);
		pila.push(7);
		System.out.println("Obteniendo el tamano");
		pila.pilaLarge();
		System.out.println("Obteniendo el tope.");
		pila.peek();
		System.out.println("Sacando el tope.");
		pila.pop();
		System.out.println("Obteniendo el tope.");
		pila.peek();
		System.out.println("Limpiando la pila.");
		pila.clearPila();
		System.out.println("Ingresando datos.");
		pila.push(10);
		System.out.println("Obteniendo el tope.");
		pila.peek();
	}
}
