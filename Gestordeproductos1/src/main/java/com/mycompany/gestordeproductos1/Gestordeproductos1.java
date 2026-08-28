/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


package com.mycompany.gestordeproductos1;
import java.util.Scanner;

public class Gestordeproductos1 {
    static String[] nombres = new String [5];
    static double[] precios = new double[5];
    static int contador = 0;
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int opcion;
    
    do {
    System.out.println("\n --- Menu de la empresa productos ---");
    System.out.println("1. Agregar (create)");  
      System.out.println("2. listar");
      System.out.println("3. Buscar");
      System.out.println("4. actualizar");
      System.out.println("5. eliminar");
    
    
    System.out.println("0. Salir");    
    System.out.println("Seleccione una opcion :");
    
    opcion = sc.nextInt();
       sc.nextLine();
    
    
       switch(opcion){
           case 1 ->{
                 System.out.println("Nombre del producto :");  
                 String nombre = sc.nextLine();
                  System.out.println("precio del producto :");  
                 double precio = sc.nextDouble();
                 agregar(nombre,precio);
                 
           }
           
           case 2 -> {
               Listar();
           }
           
           case 3 -> {
               System.out.println("Nombre a buscar :");
               String nombre = sc.nextLine();
               int idx = buscar(nombre);
               System.out.println(idx == -1 ? "Producto no encontrado." : "Encontrado en la posicion " + idx);
           }
           
           case 4 -> {
               System.out.println("Nombre a actualizar :");
               String nombre = sc.nextLine();
               System.out.println("Nuevo precio :");
               double nuevoPrecio = sc.nextDouble();
               actualizar(nombre, nuevoPrecio);
           }
           
           case 5 -> {
               System.out.println("Nombre a eliminar :");
               String nombre = sc.nextLine();
               eliminar(nombre);
           }
           
           case 0 -> System.out.println("Saliendo...");
           
           default -> System.out.println("Opcion invalida.");
           
       }
       
     
               
   }while(opcion !=0);
    sc.close();
        
    }   
    
      static boolean agregar(String nombre, double precio){
           if(contador >= nombres.length){
             System.out.println("No hay espacio en el vector para almacenar mas elementos :");
             
             return false;
           }
           
         nombres[contador] = nombre;
         precios[contador] = precio;
         contador ++; 
          
         return true;
       }
      
      static void Listar() {
          if (contador == 0 ){
             System.out.println("No hay elementos Registrados");
             return;
          }
          for( int i = 0; i< contador ;i++){
              System.out.println(i + " " + nombres[i] + " - $ "+ precios[i] );
          }
      }
      
      static int buscar(String nombre) {
          for (int i = 0; i < contador; i++) {
              if (nombres[i].equalsIgnoreCase(nombre)) {
                  return i;
              }
          }
          return -1;
      }
      
      static boolean actualizar(String nombre, double nuevoPrecio) {
          int idx = buscar(nombre);
          if (idx == -1) {
              System.out.println("Producto no encontrado.");
              return false;
          }
          precios[idx] = nuevoPrecio;
          System.out.println("Precio actualizado correctamente.");
          return true;
      }
      
      static boolean eliminar(String nombre) {
          int idx = buscar(nombre);
          if (idx == -1) {
              System.out.println("Producto no encontrado.");
              return false;
          }
          for (int i = idx; i < contador - 1; i++) {
              nombres[i] = nombres[i + 1];
              precios[i] = precios[i + 1];
          }
          nombres[contador - 1] = null;
          precios[contador - 1] = 0;
          contador--;
          System.out.println("Producto eliminado correctamente.");
          return true;
      }
  
}