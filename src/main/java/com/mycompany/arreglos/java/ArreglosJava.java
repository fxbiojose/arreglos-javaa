/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arreglos.java;

/**
 *
 * @author Fabio Mercado
 */
public class ArreglosJava {

    public static void main(String[] args) {
       int[] numeros = {10,20,30,40,50};
       numeros[0]=202;
      
       for (int pepapig = 0;pepapig < numeros.length;pepapig++)
           System.out.println("posicion" + pepapig + ":" + numeros[pepapig]);

//numeros.length
   System.out.println("recorrido con for -each: ");
   for (int num : numeros){
      System.out.println(num); 
   }


      System.out.println(numeros.length);
      System.out.println("El arreglo inicia en:"+numeros[0]);
      System.out.println(numeros[1]);
       
       int[][]matriz ={
           {1,2,3},
           {4,5,6},
           {7,8,9}  
       };
       
       for(int fila = 0; fila< matriz.length; fila++){
         int sumaFila = 0;
         
       for(int columna = 0; columna< matriz[fila].length; columna++){
           sumaFila += matriz[fila][columna];
             
         } 
        System.out.println("SUMA FILA  "+ fila +" "+ sumaFila);
       }
       
         for(int columna = 0; columna< matriz[0].length; columna++){
         int sumaColumna = 0;
         
       for(int fila = 0; fila< matriz.length; fila++){
           sumaColumna += matriz[fila][columna];
             
         } 
        System.out.println("SUMA COLUMNA  "+ columna +" "+ sumaColumna);
       }
       
       
       
       
       
       System.out.println(matriz[1][1]);
       
       for(int i = 0; i< matriz.length; i++){
           for (int j = 0; j< matriz[i].length; j++){
           System.out.println(matriz[i][j] + " ");
           }       
       }
       
       int sumadiagonal = 0;
       
       for(int i = 0; i<matriz.length; i++){
           sumadiagonal +=matriz[i][i];
       }
    System.out.println("suma diagonal "  + sumadiagonal );
    }
}
