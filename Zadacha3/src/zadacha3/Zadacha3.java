/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zadacha3;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 *
 * @author АНДРЕЙ
 */
public class Zadacha3 {

    /**
     * @param args the command line arguments
     */
    static boolean Prime(long a) {

        for (int i = 2; i < a / 2 + 1; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    static long Third(long a) {
        long tmp;

        for (long i = 2; i < a; i++) {
            if (a % i == 0) {
                tmp = a / i;

                if (Prime(tmp)) {
                    return tmp;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        // TO DO code application logic here
        long a;             // третья
        a = 600851475143L;
        long tmp = Third(a);
        System.out.println(tmp);
    }
}
