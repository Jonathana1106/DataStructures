package com.joty.sorter;

import java.math.BigInteger;

/**
 * 
 * @author Jonathan
 *
 */
public class GenericRadixSort {

    private int i;
    private int j;
    private int x;

    public GenericRadixSort() {
	this.i = 0;
	this.j = 0;
	this.x = 0;
    }

    // String text = "Que se yo";
    // System.out.println("Text: " + text);
    //
    // String binary = new BigInteger(text.getBytes()).toString(2);
    // System.out.println("As binary: " + binary);
    //
    // String text2 = new String(new BigInteger(binary, 2).toByteArray());
    // System.out.println("As text: " + text2);

    public void radixSort(String[] array) {
	int[] arreglo = new int[array.length];

	for (int i = 0; i < array.length; i++) {
	    String binary = new BigInteger(array[i].getBytes()).toString(10);
	    // int foo = Integer.parseInt(binary);
	    Integer foo = Integer.parseInt(binary, 10);
	    // Lo pasamos de String a Integer en binario.
	    arreglo[i] = foo;
	}
	radixSort(arreglo);
    }

    // public void convertBinary(int num) {
    // int binary[] = new int[40];
    // int index = 0;
    // while (num > 0) {
    // binary[index++] = num % 2;
    // num = num / 2;
    // }
    // for (int i = index - 1; i >= 0; i--) {
    // System.out.print(binary[i]);
    // }
    // }

    // Recibe un arreglo de enteros binarios.
    private void radixSort(int[] array) {
	/**********************************************/
	for (x = 32; x >= 0; x--) {
	    int[] aux = new int[array.length];
	    j = 0;
	    for (int i = 0; i < array.length; i++) {
		boolean move = array[i] << x >= 0;
		if (x == 0 ? !move : move) {
		    aux[j] = array[i];
		    j++;
		} else {
		    array[i - j] = array[i];
		}
	    }
	    for (i = j; i < aux.length; i++) {
		aux[i] = array[i - j];
	    }
	    array = aux;
	}
	/**********************************************/

	String[] arreglo = new String[array.length];
	// Lo pasamos de entero binario a String.

	/********************************************************/
	for (int j = 0; j < array.length; j++) {

	    // String str = String.valueOf(array[j]);
	    // String str = Integer.toString(array[j]);

	    String str = Integer.toBinaryString(array[j]);
	    // String str = Character.toString((char) array[j]);

	    // String str = new Integer(array[j]).toString();
	    arreglo[j] = str;
	}
	/********************************************************/

	String[] jkl = new String[arreglo.length];

	for (int k = 0; k < arreglo.length; k++) {
	    int charCode = Integer.parseInt(arreglo[k], 2);
	    @SuppressWarnings("deprecation")
	    String str = new Character(((char) charCode)).toString();
	    jkl[k] = str;
	}

	System.out.println("Arreglo Ordenado");
	printL(jkl);
    }

    // String binary = "1101001";
    // Integer i = Integer.parseInt(binary,2);
    // System.out.println("Integer value: "+i);

    // String text = "Que se yo";
    // System.out.println("Text: " + text);
    //
    // String binary = new BigInteger(text.getBytes()).toString(2);
    // System.out.println("As binary: " + binary);
    //
    // String text2 = new String(new BigInteger(binary, 2).toByteArray());
    // System.out.println("As text: " + text2);

    public void printL(String[] arreglo) {
	System.out.print("[");
	for (int i = 0; i < arreglo.length - 1; i++) {
	    System.out.print(arreglo[i] + ", ");
	}
	System.out.print(arreglo[arreglo.length - 1]);
	System.out.print("]");
	System.out.println(" ");
    }
}