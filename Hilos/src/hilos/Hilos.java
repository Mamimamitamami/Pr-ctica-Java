/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hilos;

/**
 *
 * @author Mario
 */
public class Hilos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        // TODO code application logic here

       Proceso1 hilo1 = new Proceso1();
       Thread hilo2 = new Thread(new Proceso2());

       
       hilo1.start();
       hilo2.start();
    }

}
