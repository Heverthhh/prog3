
package com.mycompany.matriz2;


import java.util.Scanner;

public class Implementacion {
   public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Operaciones matriciales:");
            System.out.println("1. Suma de matrices");
            System.out.println("2. Producto de matrices");
            System.out.println("3. Producto escalar de matriz");
            System.out.println("4. Transposición de matriz");
            System.out.println("5. Salir");

            System.out.print("Seleccione una operación (1-5): ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    double[][] matrizA = Captura.capturarMatriz();
                    double[][] matrizB = Captura.capturarMatriz();
                    double[][] suma = Matriz2.suma(matrizA, matrizB);
                    Captura.mostrarMatriz(suma);
                    break;
                case 2:
                    matrizA = Captura.capturarMatriz();
                    matrizB = Captura.capturarMatriz();
                    double[][] producto = Matriz2.producto(matrizA, matrizB);
                    Captura.mostrarMatriz(producto);
                    break;
                case 3:
                    double[][] matriz = Captura.capturarMatriz();
                    double escalar = Captura.capturarEscalar();
                    double[][] productoEscalar = Matriz2.productoEscalar(escalar, matriz);
                    Captura.mostrarMatriz(productoEscalar);
                    break;
                case 4:
                    matriz = Captura.capturarMatriz();
                    double[][] transpuesta = Matriz2.Trans(matriz);
                    Captura.mostrarMatriz(transpuesta);
                    break;
                case 5:
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }
}
