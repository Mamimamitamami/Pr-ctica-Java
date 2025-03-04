/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajero.automatico;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Caja {

    protected int saldo, retiro, deposito;
    Scanner reader = new Scanner(System.in);

    public void Consulta() {
        System.out.println("Tu saldo es de: ");
        System.out.println(saldo);
    }

    public void ValordelRetiro() {
        
        System.out.println("Inserta el valor de lo que quieras retirar: ");
        retiro = reader.nextInt();

    }

    public void ValordelDeposito() {
        
        System.out.println("Inserta el valor de lo que quieras depositar: ");
        deposito = reader.nextInt();

    }
}
