//Mariela Ramones Balvoa- A01411449- IMT
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.mramonesb.t01.p3;
import java.util.Scanner;
/**
 *
 * @author marielaramonesbalvoa
 */
public class SPPMRamonesBT01P3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declaro variables 
    double x1, y1, x2, y2, op;
    // pido los datos 
    Scanner kb = new Scanner (System.in);
        System.out.println("Insertar valor de x1");
        x1= kb.nextDouble();
        System.out.println("Insertar valor de x2");
        y1= kb.nextDouble();    
        System.out.println("Insertar valor de y1");
        x2= kb.nextDouble();    
        System.out.println("Insertar valor de y2");
        y2= kb.nextDouble();    
    
    //operaciones 
    op = Math.sqrt(Math.pow((x2-x1),2)+ Math.pow((y2-y1),2));
    System.out.println("La distancia es igual a " + op);
    }
 
    
    
}
