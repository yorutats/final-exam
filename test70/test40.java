package test70;

import java.util.Scanner;

public class test40 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); // 初始化Scanner
        System.out.print("搭了幾次電梯:");
        int n = scanner.nextInt();
        int[] times=new int[n];
        for (int i = 0; i < n; i++) {
            int floor = scanner.nextInt();
            times[i]=floor;
        }
        
        int sum=(times[0]-1)*20;
        for (int i = 0; i < times.length-1; i++) {
            if (times[i]<times[i+1]) {
                sum+=(times[i+1]-times[i])*20;
            }else{
                sum+=(times[i]-times[i+1])*10;
            }
        }

        System.out.println(sum);
    }
}
