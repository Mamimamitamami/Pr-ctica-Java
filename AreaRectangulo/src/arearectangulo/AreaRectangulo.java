/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arearectangulo;
import java.util.Scanner;
/**
 *
 * @author Mario
 */
public class AreaRectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

            Scanner reader = new Scanner(System.in);
            
            System.out.println("Dame el valor de la base");
            int base = reader.nextInt();
            
            System.out.println("Dame el valor de la altura");
            int altura = reader.nextInt();
            
            Rectangulo valores = new Rectangulo(base, altura);
            
            valores.Imprimir();
    }
    
}
