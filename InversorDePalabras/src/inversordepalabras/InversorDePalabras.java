/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inversordepalabras;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class InversorDePalabras {

    public static void main(String[] args) {

        String palabra = "", palabraInvertida = "";
        int longitudPalabra = 0;
        Scanner reader = new Scanner(System.in);

        System.out.println("Inserta una palabra o frase");
        palabra = reader.nextLine();

        longitudPalabra = palabra.length();

        while (longitudPalabra != 0) {
            palabraInvertida += palabra.substring(longitudPalabra - 1, longitudPalabra);
            longitudPalabra--;
        }

        System.out.println("Palabra invertida: " + palabraInvertida);
    }

}
