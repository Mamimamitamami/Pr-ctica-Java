/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cajero.automatico;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class CajeroAutomatico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);

        Transaccion movimiento = new Transaccion();

        boolean aux = true;
        do {

            System.out.println("1.) Consulta de saldo.");
            System.out.println("2.) Retiro de efectivo.");
            System.out.println("3.) Deposito de efectivo.");
            System.out.println("4.) Salir (Finalizar operacion).");

            System.out.println("Inerta el numero correspondiente a tu movimiento:");
            int decision = reader.nextInt();

            switch (decision) {
                case 1:
                    movimiento.Consulta();
                    break;
                case 2:
                    movimiento.ValordelRetiro();
                    movimiento.RetirodeEfectivo();
                    break;
                case 3:
                    movimiento.ValordelDeposito();
                    movimiento.DepositodeEfectivo();
                    break;
                case 4:
                   aux = false;
                   
            }

        }while(aux = true);
    }

}
