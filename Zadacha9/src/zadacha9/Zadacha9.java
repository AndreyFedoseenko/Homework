/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zadacha9;

/**
 *
 * @author АНДРЕЙ
 */
public class Zadacha9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int mult = 0;
        for (int i = 1; i < 1000; i++) {
            for (int j = i + 1; j < 1000; j++) {
                for (int k = j + 1; k < 1000; k++) {
                    if (((i * i + j * j) == k * k) && (i + j + k == 1000)) {
                        mult = i * j * k;
                        break;
                    }
                }
                if (mult > 0) {
                    break;
                }
            }
            if (mult > 0) {
                break;
            }
        }
        System.out.println(mult);
    }
}
