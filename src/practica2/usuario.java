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
public class usuario {
    public static void main(String[] args) {
        
        
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt(); 

        if (edad >= 16) {
            System.out.println("Tienes permitido conducir");
        } else {
            System.out.println("No tienes permitido conducir le retenemos el veiculo");
        }

       
    }
    
}
