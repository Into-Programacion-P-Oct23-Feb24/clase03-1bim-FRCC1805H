/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo08;

/**
 *
 * @author reroes
 */
public class Ejemplo10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejemplos
        int a = 10;
        int b = 1;
        int c = 20;

        boolean operando1 = a > b; // 10 > 1 // true
        boolean operando2 = c == a; // 20 == 10 // false
        boolean valorC = operando1 && operando2; // false

        System.out.println(valorC);

    }

}
