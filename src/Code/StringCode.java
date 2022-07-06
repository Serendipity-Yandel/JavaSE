package Code;

import java.util.Random;


public class StringCode {
    public static void main(String[] args) {
        //定义可能出现的信息
        String dates="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

        String code="";
        //循环遍历5次，生成验证码
        Random r=new Random();
        for (int i = 0; i < 5; i++) {
            int index=r.nextInt(dates.length());//随机一个索引
            char c=dates.charAt(index);//提取index位置上的字符赋值给c
            code+=c;//将字符累加到code中
        }
        //输出即可
        System.out.println(code);

    }
}
