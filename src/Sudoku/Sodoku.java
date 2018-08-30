package Sudoku;

import com.sun.java_cup.internal.runtime.Scanner;

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
	
	
	//Procedimiento de recorrer la matriz
	
	
	/*public int[][] RecorrerMatrizyAsignacion() {

		// Recorrer la Matriz

				//System.out.println(this.elements[i][j]);				
			}
		}
		
		return this.elements;
	}

	 
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method 
		
		Sodoku Ejecutar = new Sodoku(3,3);
		
		for (int i = 0; i < Ejecutar.size1; i++) {
			for(int j = 0; j < Ejecutar.size2; j++) {
			//Luego de recorrer la Matriz agregar elemento
				System.out.println("Digite el numero en la posicion: ");
				//this.elements[i][j] = element;
				
			}
		}
		int Valor = 3;
		
		//Ejecutar.RecorrerMatrizyAsignacion(Valor);
		
		//System.out.println(Ejecutar.RecorrerMatrizyAsignacion(Valor));
		
		System.out.println(Ejecutar.elements[0][0]);
		
		                                     
	
	}

		}
	}
	}
	
