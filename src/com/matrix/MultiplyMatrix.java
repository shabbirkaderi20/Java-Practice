package com.matrix;

import java.util.Scanner;

public class MultiplyMatrix {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Please enter details of matrix");
		System.out.print("Please Enter number of rows: ");
		int row1 = scnr.nextInt();
		
		System.out.print("Please Enter number of columns: ");
		int column1 = scnr.nextInt();
		System.out.println();
		
		System.out.println("Enter first matrix elements: ");
		MatrixM first = new MatrixM(row1, column1);
		first.read(scnr);
		
		System.out.println("original matrix: ");
		first.print();
		
		int[][] second= first.transpose();
		
		System.out.printf("transpose of the matrix is: \n");
		printAll(second);
		
		System.out.printf("multiplication of the matrices is: \n");
		printAll(first.multiply(second));
		
		
		scnr.close();

	}
	
	public static void printAll(int[][] data) {
		
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[0].length; j++) {
				System.out.print(data[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}

class MatrixM{
	
	private int rows;
	private int columns;
	private int[][] data;
	
	public MatrixM(int rows, int columns) {
		this.rows= rows;
		this.columns= columns;
		this.data= new int[rows][columns];
	}
	
	public int[][] multiply(int[][] second) {
		
		int[][] temp;
		
		if(second.length> second[0].length) {
			temp= new int[second.length][second.length];
		}else {
			temp= new int[second[0].length][second[0].length];			
		}
		
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length; j++) {
				temp[i][j] = 0;
				for (int k = 0; k < data.length; k++) {
					temp[i][j] += data[i][k] * second[k][j];
				} 
			}
		}
		
		return temp;
	}

	public MatrixM(int[][] data) {
		this.data= data;
		this.rows= data.length;
		this.columns= data[0].length;
	}
	
	public int getColumns() {
		return columns;
	}
	
	public void read(Scanner s) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				data[i][j] = s.nextInt();
			}
		}
	}
	
	public void print() {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(data[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public int[][] transpose() {
		int[][] temp= new int[columns][rows];
		
		for(int i= 0; i< rows; i++) {
			for(int j= 0; j<columns; j++) {
				temp[j][i]= data[i][j];
			}
		}
		return temp;
	}
}
