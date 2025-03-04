/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajero.automatico;

/**
 *
 * @author Mario
 */
public class Transaccion extends Caja {

    public void RetirodeEfectivo() {
        saldo = saldo - retiro;
    }

    public void DepositodeEfectivo() {
        saldo = saldo + deposito;
    }
}
