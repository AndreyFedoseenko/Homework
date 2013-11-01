/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zadacha1;

import java.util.ArrayList;

/**
 *
 * @author АНДРЕЙ
 */
public class Zadacha1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Sum = 0;
        for (int i = 2; i < 1000; i++) {
            if ((i % 3 == 0) || (i % 5 == 0)) {
                Sum += i;
            }
        }
        double Su = 0.15 * 25 + 0.5 * 22 + 0.35 * 8;
        double[][] P1 = {{0.15, 0.45, 0.4}, {0.05, 0.45, 0.5}, {0, 0, 1}};
        double[][] P2 = {{0.35, 0.55, 0.1}, {0.15, 0.5, 0.35}, {0.09, 0.5, 0.41}};
        int[][] R1 = {{25, 24, 21}, {8, 23, 19}, {8, 8, -3}};
        int[][] R2 = {{27, 23, -3}, {25, 22, 8}, {24, 21, -4}};
        double[] V1 = new double[3];
        double[] V2 = new double[3];
        for (int i = 0; i < 3; i++) {
            V1[i] = P1[i][0] * R1[i][0] + P1[i][1] * R1[i][1] + P1[i][2] * R1[i][2];
            V2[i] = P2[i][0] * R2[i][0] + P2[i][1] * R2[i][1] + P2[i][2] * R2[i][2];
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(V1[i]);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(V2[i]);
        }
        int EEE = -3;
        double[] F1 = new double[3];
        F1[2] = 0;
        F1[1] = (V1[1] - EEE) / (1 - P1[1][1]);
        System.out.println(F1[1]);
        double F2c = (P1[1][0]) / (1 - P1[1][1]);
        F1[0] = (V1[0] - EEE + P1[0][1] * F1[1]) / ((1 - P1[0][0]) - P1[0][1] * F2c);
        System.out.println("F1=");
        System.out.println(F1[0]);
        F1[1] = F1[1] + F2c * F1[0];
        System.out.println("F2=");
        System.out.println(F1[1]);
        System.out.println("Next part,table");
        double[] max1 = new double[3];
        double[] max2 = new double[3];
        for (int i = 0; i < 3; i++) {
            max1[i] = V1[i] + P1[i][0] * F1[0] + P1[i][1] * F1[1] + P1[i][2] * F1[2];
            System.out.println("Max 1 " + i + " = " + max1[i]);
        }
        for (int i = 0; i < 3; i++) {
            max2[i] = V2[i] + P2[i][0] * F1[0] + P2[i][1] * F1[1] + P2[i][2] * F1[2];
            System.out.println("Max 2 " + i + " = " + max2[i]);
        }
    }
}
