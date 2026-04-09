/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

/**
 *
 * @author Estudiante
 */
public class Perro {
    String nombre; 
     String raza ;

    public Perro(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }
     

    void ladra(){
        System.out.println(nombre+" guau!guau!");
    }
    
    
}
