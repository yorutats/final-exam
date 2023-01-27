package test70;

import java.util.Scanner;

public class test41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 初始化Scanner
        int a, b, c,k; 
        Float x1, x2;
        
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        k=(int) (Math.pow(b, 2) - 4 * a * c) ;
        if (k> 0) {
            x1 = (float) (-1*b + Math.pow(Math.pow(b, 2) - 4 * a * c, 0.5)) / 2 * a;
            x2 = (float) (-1*b - Math.pow(Math.pow(b, 2) - 4 * a * c, 0.5)) / 2 * a;
            System.out.println(x1);
            System.out.println(x2);
        } else if (k ==0) {
            x1=(float) (-1*b);
            x2=(float) (2*a);
            System.out.println((float) x1/x2);
        } else {
            System.out.println("無解");
        } {

        }

    }
}
