/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;
import java.util.Scanner;
/**
 *
 * @author Mario
 */
public abstract class Operaciones {
    protected int valor1, valor2, resultado;
    Scanner reader = new Scanner(System.in);
    public void TomarValor(){
        
        System.out.println("Inserta el valor del primer numero:");
        int valor1 = reader.nextInt();
        
        System.out.println("Inserta el valor del segundo numero:");
        int valor2 = reader.nextInt();
        
    }
    
    public abstract void Operaciones();
    
    public void ImprimirResultado(){
        
        System.out.println("El resultado es: "+ resultado);
    
    }
    
}
