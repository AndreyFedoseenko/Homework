/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zadacha7;

/**
 *
 * @author АНДРЕЙ
 */
public class Zadacha7 {

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

    public static void main(String[] args) {
        // TODO code application logic here
        int i = 1;
        int count = 0;
        boolean s = true;
        while (s) {
            i++;
            if (Prime(i)) {
                count++;
            }
            if (count == 10001) {
                s = false;
            }
        }
        System.out.println(i);
        /*int[] Pros = new int[10001];
         int k=0;
         boolean kon=true;
         for(int i=2;kon;i++)
         {
         boolean sign=true;
         for(int j=2;j<i;j++)
         {
         int z=i%j;
         if(z==0) 
         {
         sign = false;
         }
         }
         if(sign)
         {
         Pros[k]=i;
         k++;
         }
         if(k==10001)
         {
         kon=false;
         }
         }
         System.out.println(Pros[10000]);*/
    }
}
