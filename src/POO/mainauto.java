/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

import javax.swing.JOptionPane;

/**
 *
 * @author Estudiante
 */
public class mainauto {
    public static void main(String[] args) {
        
        String marca = JOptionPane.showInputDialog("Ingresa tu marca");
        String modelo = JOptionPane.showInputDialog("Ingresa el modelo: ");
        
       auto autito1 = new  auto(marca, modelo);
       
       autito1.arrancar();
  
        
    }


    
}
