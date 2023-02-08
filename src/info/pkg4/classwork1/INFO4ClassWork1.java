/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package info.pkg4.classwork1;

import java.util.Random;

/**
 *
 * @author Emanuel
 */
public class INFO4ClassWork1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Tarea de suma de matrices
        sumamatrices();
    }
    public static void sumamatrices(){
        int [][] matriz = new int [3][3];//inicializar matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                int min = 1;
		int max = 10;
		Random random = new Random();
		int valor = random.nextInt(max + min) + min;
		matriz[i][j] = valor;//determinar valor random
                System.out.print(matriz[i][j]+ " ");//escribir matriz random
            }
            System.out.println();
        }
        int sumatoria =0;//declarar contador y acumulador para determinar matriz izquierda
        int fil = 0;
        int col =0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (fil == i && col == j ) {
                    sumatoria+= matriz [i][j];
                }
            }
            fil++;
            col++;
        }
        System.out.println("Izquierda: " + sumatoria);
        
        sumatoria =0;//actualizar contador y acumulador para determinar matriz derecha
        fil = 0;
        col = 2;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (fil == i && col == j ) {
                    sumatoria+= matriz [i][j];
                }
            }
            fil++;
            col --;
        }
        System.out.println("Derecha: " + sumatoria);
    }
    
}
