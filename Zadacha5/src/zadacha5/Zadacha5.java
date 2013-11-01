/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zadacha5;

/**
 *
 * @author АНДРЕЙ
 */
public class Zadacha5 {

    /**
     * @param args the command line arguments
     */
    static long Evclid(long a, long b) {
        long mult = a * b;
        while (a != 0 && b != 0) {
            if (a >= b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        long NOK = (mult / (a + b));
        return NOK; // Одно - ноль
    }

    public static void main(String[] args) {
        // TODO code application logic here
        long NOK = 2;
        for (int i = 3; i < 21; i++) {
            NOK = Evclid(NOK, i);
        }
        System.out.println(NOK);
    }
}
