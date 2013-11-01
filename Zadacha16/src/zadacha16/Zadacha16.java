/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zadacha16;

import java.math.BigInteger;

/**
 *
 * @author АНДРЕЙ
 */
public class Zadacha16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BigInteger TwoInThouthand, Two;
        String TwoInTh;
        int a = 2;
        int sum = 0;
        int Thouthand = 1000;
        Two = BigInteger.valueOf(a);
        TwoInThouthand = Two.pow(Thouthand);
        TwoInTh = TwoInThouthand.toString();
        char[] TIT = TwoInTh.toCharArray();
        for (int i = 0; i < TIT.length; i++) {
            sum += TIT[i] - 48;
        }
        System.out.println(sum);
    }
}
