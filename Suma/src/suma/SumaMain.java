/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package suma;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class SumaMain {

    public static void main(String args[]) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Inserta el primer valor de la suma");
        int num1 = reader.nextInt();

        System.out.println("Inserta el segundo valor de la suma");
        int num2 = reader.nextInt();

        Suma valores = new Suma(num1, num2);

        valores.Imprimir();
    }
}
