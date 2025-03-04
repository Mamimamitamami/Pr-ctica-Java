/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimorfismo;


/**
 *
 * @author Mario
 */
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Operaciones dato_Suma = new Suma();
        dato_Suma.TomarValor();
        dato_Suma.Operaciones();
        dato_Suma.ImprimirResultado();
        
        Operaciones dato_Resta = new Resta();
        dato_Suma.TomarValor();
        dato_Suma.Operaciones();
        dato_Suma.ImprimirResultado();
        
        
    }
    
}
