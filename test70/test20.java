package test70;

import java.util.HashMap;
import java.util.Scanner;

public class test20 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //初始化 Scanner 物件
        System.out.print("輸入查詢學號:");
        int sid = scanner.nextInt();

        HashMap<Integer, String> stud = new HashMap<Integer, String>();
        stud.put(123, "Tom DTGD");
        stud.put(456, "Cat CSIE");
        stud.put(789, "Nana ASIE");
        stud.put(321, "Lim DBA");
        stud.put(654, "Won FDD");

        System.out.println("學生資料為:"+sid+" "+stud.get(sid));

    }
}
