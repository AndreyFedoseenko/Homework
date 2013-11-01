/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zadacha4;

/**
 *
 * @author АНДРЕЙ
 */
public class Zadacha4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int pal;
        String palindr;
        int max = 0;
        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                pal = i * j;
                palindr = String.valueOf(pal);
                char[] TIT = palindr.toCharArray();
                if (TIT.length == 5) {
                    if ((TIT[0] == TIT[4]) && (TIT[1] == TIT[3])) {
                        if (pal > max) {
                            max = pal;
                        }
                    }
                } else if (TIT.length == 6) {
                    if ((TIT[0] == TIT[5]) && (TIT[1] == TIT[4]) && (TIT[2] == TIT[3])) {
                        if (pal > max) {
                            max = pal;
                        }
                    }
                }
            }
        }
        System.out.println(max);
    }
}
