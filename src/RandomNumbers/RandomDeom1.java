package RandomNumbers;

import java.util.Random;

public class RandomDeom1 {
    public static void main(String[] args) {
        //目标：学会使用java随机数
        //1,先导包
        //2,创建一个随记数对象
        Random a = new Random();
        //3,调用nextInt功能      对象名+.nextInt,可以获得一个整形的数-----> a.nextInt
        //遍历输出随机数
        for (int i = 0; i < 20; i++) {
            int date = a.nextInt(10)+1;//0-9不包含10（包前不包后）(+1后为1-10）
            System.out.println(date);

        }
    }
}
