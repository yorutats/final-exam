package test70;

import java.util.HashMap;
import java.util.Scanner;

public class test56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 初始化 Scanner 物件
        System.out.print("請選擇主餐及升級的套餐:");
        String n,mainmeal,upgrade,drink,fries;
        n = scanner.nextLine();
        mainmeal=n.split("")[0];
        upgrade=n.split("")[1];    
        System.out.print("是否升級成大杯飲料:");
        drink = scanner.nextLine();
        System.out.print("是否換成大薯:");
        fries = scanner.nextLine();
        
        HashMap<String, Integer> meals = new HashMap<String, Integer>();
        meals.put("1", 72);
        meals.put("2", 62);
        meals.put("3", 82);
        meals.put("4", 44);
        meals.put("5", 60);
        meals.put("A", 55);
        meals.put("B", 68);

        int sum=meals.get(mainmeal)+meals.get(upgrade);
        if (drink.equals("是")) {
            sum+=7;
        }
        if (fries.equals("是")) {
            sum+=13;
        }
        
        System.out.println("總共為"+sum+"元");

    }
}
