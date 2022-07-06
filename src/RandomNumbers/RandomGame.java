package RandomNumbers;

import java.util.Random;
import java.util.Scanner;

public class RandomGame {
    public static void main(String[] args) {
        //随机数号码1-100（0-99）+1
        Random r=new Random();
        int luckData = r.nextInt(100)+1;//设置要猜的随机数
        //2.使用一个死循环去猜测,并给出提示
        Scanner number=new Scanner(System.in);
        //让用户猜数字
        while(true){
            System.out.println("请输入一个数（0-100)");

            int guessNumber=number.nextInt();//获取被猜的数
            //判断幸运数字号码
            if(guessNumber>luckData){
                System.out.println("您猜测的数太大了");
            }else if(guessNumber<luckData){
                System.out.println("您猜测的数太小了");
                }else {
                System.out.println("恭喜您中奖了");
                break;
            }


        }

    }
}
