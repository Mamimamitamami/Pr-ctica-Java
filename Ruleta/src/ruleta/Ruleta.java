/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ruleta;

/**
 *
 * @author Mario
 */
import java.util.Scanner;
public class Ruleta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Tratante: Inserta tu nombre.");
        String nombreUsuario = reader.nextLine();
        
        reader.nextLine();
        System.out.println("Bien, toma 500 fichas.");
        int cartera = 500;
        
        Usuario estadisticas = new Usuario(nombreUsuario, cartera);
        
        System.out.println("Me tendrás que devolver el prestamo, no todo es gratis en esta vida.");
        System.out.println("Para cuando termines me tendrás que devolver 5.000 fichas.");
        
        reader.nextLine();
        
        while (true){
            System.out.println("¿Que quieres hacer?");
            System.out.println("1.) Jugar");
            System.out.println("2.) Ver Estadisticas");
            System.out.println("3.) Pagar Deuda");
            System.out.println("4.) Banco");
            
        }
    }
    
}
