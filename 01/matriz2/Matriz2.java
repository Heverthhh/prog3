/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matriz2;

public class Matriz2 {   
  public static double[][] suma(double [][]matA, double [][] matB) {
int filasA = matA.length;
        int columnasA = matA[0].length;
        int filasB = matB.length;
        int columnasB = matB[0].length;
        
        if (filasA != filasB || columnasA != columnasB) {
            System.out.println("Las matrices deben tener las mismas dimensiones para sumarse.");
        }

        double[][] matR = new double[filasA][columnasA];
        
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasA; j++) {
                matR[i][j] = matA[i][j] + matB[i][j];
            }
        }
        
        return matR;
    }
 public static double[][] producto(double[][] matA, double[][] matB) {


        int filasA = matA.length;
        int columnasA = matA[0].length;
        int filasB = matB.length;
        int columnasB = matB[0].length;
        
        if (columnasA != filasB) {
            System.out.println("Las matrices no son compatibles para la multiplicación.");
        }
        

        double[][] matR = new double[filasA][columnasB];
        
    
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                for (int k = 0; k < columnasA; k++) {
                    matR[i][j] += matA[i][k] * matB[k][j];
                }
            }
        }
        
        return matR;
    }
    public static double[][] productoEscalar(double escalar, double[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        

        double[][] matR = new double[filas][columnas];
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matR[i][j] = escalar * matriz[i][j];
            }
        }
        return matR;
    }
public static double[][] Trans(double[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        
        double[][] matR= new double[columnas][filas];
        
        for(int i=0; i<columnas;i++){
            for(int j=0;j<filas;j++){
                matR[i][j]=matriz[j][i];
            }
        }
        return matR;
        
}
}