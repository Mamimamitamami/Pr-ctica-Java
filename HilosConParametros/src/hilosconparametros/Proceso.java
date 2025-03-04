/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilosconparametros;

/**
 *
 * @author Mario
 */
public class Proceso extends Thread{
    
    private int num;
    
    public Proceso(String nombreHilo){
    super(nombreHilo);
    }
    
    
    @Override
    public void run(){
        for (int i = 0; i <= num; i++) {
            System.out.println(i + this.getName());
        }
        System.out.println("");
    }
    
    public void ValorDeLaCondicion(int valor){
    this.num = valor;
    }
}
