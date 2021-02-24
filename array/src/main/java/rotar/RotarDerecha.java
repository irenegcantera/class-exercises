/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rotar;
import java.util.Scanner;
/**
 * Ejercicio 11. Rotar una posición a la derecha una matriz de 10 por 5.
 * @author Irene 
 */
public class RotarDerecha {
    public static void main(String[] args) {
        
        int min; // guarda valor mínimo
        int max; // valor máximo
        
        /*Contiene una matriz bidimensional. He considerado que la matriz 
        tenga 10 filas y 5 columnas*/
        int matriz[][] = new int[10][5];
        
        /*El usuario introduce los valores mínimo y máximo para generar los 
        números aleatorios que rellenarán la matriz*/
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el valor mínimo:");
        min = teclado.nextInt();
        System.out.println("También el máximo:");
        max = teclado.nextInt();
        
        /*Bucle que rellena la matriz con los valores escogidos por el 
        usuario (se incluye el mínimo y máximo).*/
        System.out.println("\nMATRIZ ORIGINAL:\n----------------");
        for(int i = 0; i < matriz.length; i++){ 
            for(int j = 0; j < matriz[i].length; j++){ 
                matriz[i][j] = (int)(Math.random()*(max-min+1)+min); 
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // espacio entre filas
        }
        
        System.out.println("\nMATRIZ DESPLAZADA:\n------------------");              
        /*Bucle que desplaza los numeros hacia la derecha, y el último número 
        lo coloca en la pimera posición de cada fila*/
        for(int i = 0; i < matriz.length; i++){ 
            System.out.print(matriz[i][matriz[i].length-1] + " "); //imprime el número del último índice de la fila
            for(int j =0; j < matriz[i].length -1; j++){ // imprime el resto hasta el pénultimo número
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // espacio entre filas
        }     
    }
}