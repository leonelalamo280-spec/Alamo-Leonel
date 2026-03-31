/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package condicionalesybucle;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Eje1 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("ingresa tu edad");
        int edad=sc.nextInt();
        if(edad>=18){
            System.out.println("acceso permitido");
        }else{
            System.out.println("acceso denegado" );
            
        }
      
    }
}
