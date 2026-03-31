/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class RecetaDeCocina {
    public static void main(String[] args) {
       Scanner teclado=new Scanner(System.in);
        
        String Nombredelareceta ;
    String NombreIngrendinte;
    String TiempoDepreperacion;
    String Dificultsd;
        System.out.println(" que receta desea  hacer: ");
       Nombredelareceta=teclado.nextLine();
        
        System.out.println("ingrese los ingredientes de la receta: ");
        NombreIngrendinte=teclado.nextLine();
        System.out.println("el tiempo de la preparacion:");
        TiempoDepreperacion=teclado.nextLine();
        System.out.println("la dificultad de la receta fue media, facil o alta ");
        Dificultsd=teclado.nextLine();

        
        
        
        
    
  
    }
    

            
    
}
