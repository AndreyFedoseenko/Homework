/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zadacha2;

import java.util.ArrayList;

/**
 *
 * @author АНДРЕЙ
 */
public class Zadacha2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> Fib;
        Fib = new ArrayList<Integer>();
        Fib.add(1);
        Fib.add(2);
        boolean kon = true;
        int Sum = 2;
        for (int i = 2; kon; i++) {
            int z = Fib.get(i - 1) + Fib.get(i - 2);
            Fib.add(z);
            if ((Fib.get(i) % 2) == 0) {
                Sum += Fib.get(i);
            }
            if (Fib.get(i) > 4000000) {
                kon = false;
            }
        }
        System.out.println(Sum);
    }
}
