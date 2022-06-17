/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinquecento;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Cinquecento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); //Declaramos el scanner
        int casos = leer.nextInt(); //Creamos la variable entera casos y la leemos

        while (casos != 0) { //con un while le decimos que si es distinto de 0
            int año = leer.nextInt(); //nos lee una variable nueva que es el año
            System.out.println((año / 100) + (año % 100 != 0 ? 1 : 0)); //y nos va a imprimir la solucion
        }
    }

}
