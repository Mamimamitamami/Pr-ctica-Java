/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilos;

/**
 *
 * @author Mario
 */
public class Proceso1 extends Thread{
    
    @Override
    public void run(){//El metodo run se hereda de Thread (hilos) que viene de serie en java
    for (int i = 0; i <= 5; i++) {
            System.out.println("Proceso1");
        }
    }
}
