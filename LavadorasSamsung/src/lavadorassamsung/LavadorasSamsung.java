/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lavadorassamsung;

import Libreria.Funciones;
import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class LavadorasSamsung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Indica si la ropa es blanca[0], o de color [1]");
        int TipoDeRopa = reader.nextInt();
        
        System.out.println("Introduce la cantidad de kilos de ropa");
        int KilosDeRopa = reader.nextInt();
        
        Funciones ropaSucia = new Funciones(KilosDeRopa, TipoDeRopa);
         ropaSucia.setTipoDeRopa(1);
         System.out.println("El tipo de ropa es: "+ ropaSucia.getTipoDeRopa());
        
        ropaSucia.CicloFinalizado();
    }

}
