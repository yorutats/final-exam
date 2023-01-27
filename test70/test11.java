package test70;

import java.util.Scanner;

public class test11 {
    public static void main(String[] args) {
        
            Scanner scanner = new Scanner(System.in); // 初始化 Scanner 物件
            System.out.println("輸入月及日為:");
            String md = scanner.nextLine();
            int month = Integer.parseInt(md.split(" ")[0]);
            int monthday = Integer.parseInt(md.split(" ")[1]);
            String xingzuo = "";
            switch (month) {
                case 1:
                    xingzuo = monthday<21?"摩羯座":"水瓶座";
                    break;
                case 2:
                    xingzuo = monthday<20?"水瓶座":"雙魚座";
                    break;
                case 3:
                    xingzuo = monthday<21?"雙魚座":"白羊座";
                    break;
                case 4:
                    xingzuo = monthday<21?"白羊座":"金牛座";
                    break;
                case 5:
                    xingzuo = monthday<22?"金牛座":"雙子座";
                    break;
                case 6:
                    xingzuo = monthday<22?"雙子座":"巨蟹座";
                    break;
                case 7:
                    xingzuo = monthday<23?"巨蟹座":"獅子座";
                    break;
                case 8:
                    xingzuo = monthday<24?"獅子座":"處女座";
                    break;
                case 9:
                    xingzuo = monthday<24?"處女座":"天秤座";
                    break;
                case 10:
                    xingzuo = monthday<24?"天秤座":"天蠍座";
                    break;
                case 11:
                    xingzuo = monthday<23?"天蠍座":"射手座";
                    break;
                case 12:
                    xingzuo = monthday<22?"射手座":"摩羯座";
                    break;
                default:
                    break;
            }
            System.out.println("星座為：" +xingzuo);
            
    }
}
