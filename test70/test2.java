/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test70;

import java.util.Scanner;

/**
 *
 * @author s2000
 */
public class test2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // 初始化Scanner
        System.out.println("輸入一個正整數: ");
        int kilowatt = s.nextInt();
        float summer, nonSummer;
        if (kilowatt <= 120) {
            summer = 2.10f * (float) kilowatt;
            nonSummer = 2.10f * (float) kilowatt;
        } else if (kilowatt <= 330) {
            summer = 3.02f * (float) (kilowatt - 120) + 252;
            nonSummer = 2.68f * (float) kilowatt + 252;
        } else if (kilowatt <= 500) {
            summer = 4.39f * (float) (kilowatt - 330) + 886.2f;
            nonSummer = 3.61f * (float) (kilowatt - 330) + 814.8f;
        } else if (kilowatt <= 700) {
            summer = 4.97f * (float) (kilowatt - 500) + 1632.5f;
            nonSummer = 4.01f * (float) (kilowatt - 500) + 1428.5f;
        } else {
            summer = 5.63f * (float) (kilowatt - 700) + 2626.5f;
            nonSummer = 4.50f * (float) (kilowatt - 700) + 2230.5f;
        }

        System.out.printf("summer month: %.2f\n", summer);
        System.out.printf("non-summer month: %.2f\n", nonSummer);

        s.close();
    }

}
