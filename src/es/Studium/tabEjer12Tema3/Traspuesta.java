package es.Studium.tabEjer12Tema3;

import java.util.Scanner;

public class Traspuesta {

	public static void main(String[] args) 
	{
		int tabla1[][] = new int[3][3];
		int tabla2[][] = new int[3][3];
		Scanner teclado = new Scanner(System.in);
		//Metodo para introduccir datos a la matriz
		introducirDatos(tabla1, teclado);
		crearMatrizTranspuesta(tabla1, tabla2);
		imprimirMatrizTranspuesta(tabla2);
		teclado.close();
	}
	// Metodo para Imprimir la matriz Transpuesta
	private static void imprimirMatrizTranspuesta(int[][] tabla2) {
		int i, e;
		//ponemos un for para recorrer la fila del array
		for(i=0;i<3;i++)
		{
			//Ponemos un segundo for para recorrer la columna del array
			for(e=0;e<3;e++)
			{
				System.out.print(tabla2 [i][e]+" ");
			}
			//Despues de escribir las 3 columnas de cada linea imprimira sun salto de linea
			System.out.println();
		}
	}
	// Metodo para Crear la matriz Transpuesta
	private static void crearMatrizTranspuesta(int[][] tabla1, int[][] tabla2) {
		int i, e;
		//ponemos un for para recorrer la fila del array
		for(i=0;i<3;i++)
		{
			//Ponemos un segundo for para recorrer la columna del array
			for(e=0;e<3;e++)
			{
				//Asignamos los valores de la tabla [i][j] a la tabla[j][i]
				tabla2 [i][e] = tabla1 [e][i];
			}
		}
	}
	// Metodo para introducir los Datos de la matriz por el teclado
	private static void introducirDatos(int[][] tabla1, Scanner teclado) {
		int i;
		int e;
		//ponemos un for para recorrer la fila del array
		for(i=0;i<3;i++)
		{
			//Ponemos un segundo for para recorrer la columna del array
			for(e=0;e<3;e++)
			{
				//pedimos que se introduzcan los datos, y leemos por teclado
				System.out.print("Escribir valor " + i + " , " + e + " : ");
				tabla1 [i][e] = teclado.nextInt();
			}
		}
	}
}
