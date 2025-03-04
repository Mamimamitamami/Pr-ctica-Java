/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepciones;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try {
            int valor1, valor2, resultado;
            Scanner reader = new Scanner(System.in);

            System.out.println("Inserta el primer valor");
            valor1 = reader.nextInt();

            System.out.println("Inserta el segundo valor");
            valor2 = reader.nextInt();

            resultado = valor1 / valor2;

            System.out.println("La division es igual a: " + resultado);
        } catch (Exception e) {
            System.out.println("Error, no puedes dividir por 0 " + e);
        } finally {
            System.out.println("Operacion concluida ");
        }

    }

}
