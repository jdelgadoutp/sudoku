package Sudoku;

import java.util.Random;
import java.util.Scanner;



public class Sodoku {
	//Sudoku
	
	private int size1;
	private int size2;
	private int[][] elements;
	

	//Generando Getters and Setters
	
	
	public int getSize1() {
		return size1;
	}

	public void setSize1(int size1) {
		this.size1 = size1;
	}

	public int getSize2() {
		return size2;
	}

	public void setSize2(int size2) {
		this.size2 = size2;
	}

	public int[][] getElements() {
		return elements;
	}

	public void setElements(int[][] elements) {
		this.elements = elements;
	}

	// Step 1.1. Create Constructor
	
	

	public Sodoku(int newSize1, int newSize2) {
		System.out.println("Creating row in the Matriz =" + newSize1);
		System.out.println("Creating column in the Matriz=" + newSize2);
		this.size1 = newSize1;
		this.size2 = newSize2;
		this.elements = new int[newSize1][newSize2];
	}
	

	public static void main(String[] args) { 
		//Instancia de variables
		Scanner input =new Scanner(System.in);
		Sodoku Ejecutar = new Sodoku(3,3);
		Random aleatorio = new Random(System.currentTimeMillis());
		
		
		//Recorrer Matriz y asignarle un  numero en una posicion continua
		for (int i = 0; i < Ejecutar.elements.length; i++) 
		{
			for(int j = 0; j < Ejecutar.elements.length; j++) 
			{
			//Luego de recorrer la Matriz agregar elemento
				//System.out.println("el numero i es: " +i+ " Y el numero en j es: " +j+" ");
				
				// Producir nuevo int aleatorio entre 0 y 99
				Ejecutar.elements[i][j] = aleatorio.nextInt(100);
			}
		}
		
		//Mostrar la Matriz
		for (int i = 0; i < Ejecutar.elements.length; i++) 
		{
			for(int j = 0; j < Ejecutar.elements.length; j++) 
			{
			//Mostra la Matriz
				System.out.print("| "+Ejecutar.elements[i][j]+" | "+"\t");
				//if (j!=Ejecutar.elements[i].length-1) System.out.print("\t");
			}
			System.out.println("");
		}

		// Refrescar datos aleatorios 
		aleatorio.setSeed(System.currentTimeMillis());
	}
}
