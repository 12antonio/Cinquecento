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
        Scanner leer = new Scanner(System.in);
        int casos = leer.nextInt();

        while (casos != 0) {
            int año = leer.nextInt();
            System.out.println((año / 100) + (año % 100 != 0 ? 1 : 0));
        }
    }

}
