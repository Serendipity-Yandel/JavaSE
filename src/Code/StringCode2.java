package Code;

import java.util.Scanner;

public class StringCode2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入您的号码");
        String tel=sc.next();
        //截取号码的前3位，后4位18665666520
        String before =tel.substring(0,3);//0,1,2
        String after =tel.substring(7);
        System.out.println(before+"****"+after);
    }
}
