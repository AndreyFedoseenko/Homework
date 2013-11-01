/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zadacha10;

import java.lang.Math;

/**
 *
 * @author АНДРЕЙ
 */
public class Zadacha10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int size = 2000000;
        long sum = 0;
        boolean[] Chis = new boolean[size];
        for (int i = 2; i < size; i++) {
            Chis[i] = true;
        }
        for (int i = 2; i < Math.sqrt(size); i++) {
            if (Chis[i]) {
                for (int j = i * i; j < size; j++) {
                    if (j % i == 0) {
                        Chis[j] = false;
                    }
                }
            }
        }
        for (int i = 2; i < size; i++) {
            if (Chis[i]) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
