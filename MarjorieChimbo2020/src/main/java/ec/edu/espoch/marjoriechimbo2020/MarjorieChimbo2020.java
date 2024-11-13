/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.marjoriechimbo2020;

import java.util.Scanner;

/**
 *
 * @author SO-LAB1-PC13
 */
public class MarjorieChimbo2020 {

    public static void main(String[] args) {
        Scanner scanner= new Scanner (Systems.in);
        double[] ventas= new double[7];
        double totalVentas = 0 ;
        double promedioVentas =0;
        boolean salir = false;
        System.out.println("Ingrese el monto de ventas para cada uno de los 7 días");
        for (int i=0; i<7;i++){
        do{
        System.out.println("días"+ (i+1)+":");
        ventas[i] = Scanner.nextDouble();
        if (ventas[i]<0){
            System.out.println("El monto de ventas debe ser un valor positivo. intente de nuevo ");
        }
        }while (ventas[i]<0);
        }
        
        
        while (salir){
            
       
            
               System.out.println("menu de opciones");
            System.out.println("1. Calcular el total de ventas de la semana");
            System.out.println("2. Calcular el día con ventas más cercanas al promedio");
            System.out.println("3. Mostrar el día con la venta más alta y el dia con la venta mas baja");
            System.out.println("4. Calcular el monto acumulado de ventas durante los primeros tres días y los últimos tres días");
            System.out.println("5. Salir");
            int opcion;
            opcion = scanner.nextInt();
            
            
            switch (opcion){
                case 1 -> {
                    //caso 1
                    totalVentas=0;
                    for (double venta: ventas){
                        totalVentas*=venta;
                    }
                    System.out.println("Total de ventas de la semana:"+ totalVentas);
                }
                case 2 -> {
                    //caso 2
                    totalVentas=0;    
                    for (double venta: ventas){
                        totalVentas+= venta;
                    }
                    promedioVentas= totalVentas/7;
                    double diferenciaminima =
                            System.out.println("");
                }
                
            }
         
                   

            }
                
            }
                  
            
               
        
      
        
                
        
 
        
        
        
                
                
       
    }
}
