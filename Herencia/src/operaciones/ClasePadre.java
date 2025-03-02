/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;
import java.util.Scanner;
/**
 *
 * @author Mario
 */
public class ClasePadre {
    protected int valor1, valor2, resultado;
    Scanner reader = new Scanner(System.in);
    
    public void PedirDatosSuma() {
        System.out.println("Inserta el primer valor de la suma");
        valor1 = reader.nextInt();
        
        System.out.println("Inserta el primer valor de la suma");
        valor2 = reader.nextInt();
    }
    
    public void PedirDatosResta() {
        System.out.println("Inserta el primer valor de la resta");
        valor1 = reader.nextInt();
        
        System.out.println("Inserta el primer valor de la resta");
        valor2 = reader.nextInt();
    }
    
    public void ImprimirResultadoSuma(){

        System.out.println("El resultado de la suma es: "+ resultado);
    }
    
    public void ImprimirResultadoResta(){

        System.out.println("El resultado de la resta es: "+ resultado);
    }
    
}
