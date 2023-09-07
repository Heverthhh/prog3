
package com.mycompany.matriz2;

import java.util.Scanner;

public class Captura {
    private static final Scanner scanner = new Scanner(System.in);

    public static double[][] capturarMatriz() {
        System.out.print("Ingrese el número de filas: ");
        int filas = scanner.nextInt();
        System.out.print("Ingrese el número de columnas: ");
        int columnas = scanner.nextInt();

        double[][] matriz = new double[filas][columnas];

        System.out.println("Ingrese los elementos de la matriz:");

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Elemento en la fila " + (i + 1) + ", columna " + (j + 1) + ": ");
                matriz[i][j] = scanner.nextDouble();
            }
        }

        return matriz;
    }

    public static double capturarEscalar() {
        System.out.print("Ingrese un escalar: ");
        return scanner.nextDouble();
    }

    public static void mostrarMatriz(double[][] matriz) {
        System.out.println("Matriz resultante:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}