package test70;

import java.util.Scanner;

public class test4 {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //初始化 Scanner 物件
        
        int X, Y, root;
        System.out.print("X軸座標");
        X = scanner.nextInt();
        System.out.print("Y軸座標");
        Y = scanner.nextInt();
        
        root = X * X + Y * Y;

        if (X == 0) {
            if (Y == 0) {
                System.out.println("該點位於原點");
            } else {
                if (Y > 0) {
                    System.out.printf("該點位於上半平面Y軸上，離原點距離為根號%d", root);// 格式化輸出
                } else {
                    System.out.printf("該點位於下半平面Y軸上，離原點距離為根號%d", root);
                }
            }
        }else if(Y == 0){
            if (X > 0) {
                System.out.printf("該點位於右半平面X軸上，離原點距離為根號%d", root);
            } else {
                System.out.printf("該點位於左半平面X軸上，離原點距離為根號%d", root);
            }
        }else{
            if (X > 0 && Y > 0) {
                System.out.printf("該點位於第一象限，離原點距離為根號%d", root);
            }
            if (X > 0 && Y < 0) {
                System.out.printf("該點位於第四象限，離原點距離為根號%d", root);
            }
            if (X < 0 && Y > 0) {
                System.out.printf("該點位於第二象限，離原點距離為根號%d", root);
            }
            if (X < 0 && Y < 0) {
                System.out.printf("該點位於第三象限，離原點距離為根號%d", root);
            }
        }


    }
}
