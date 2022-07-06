package ArraysNumbers;

import java.util.Random;
import java.util.Scanner;

public class ArraysGame {
    public static void main(String[] args) {
        //需求：5个1-20之间的随记数，让用户去猜测

        int []date=new int[5];//定义一个初始化的数组     存储5个1-20之间的随机数

        Random a=new Random();//随机生成一个数
        for(int i=0;i<date.length;i++){
            //i=0.1.2.3.4
            date[i]=a.nextInt(20)+1;//动态生成5个的随机数存放到数组中
        }
        Scanner number=new Scanner(System.in);
        OUT:
        while(true){//设置死循环让用户去猜测
            System.out.println("请输入一个1-20之间的数");
            int guessNumber=number.nextInt();
            //遍历数组看是否猜中
            for(int i=0;i< date.length;i++){//改为for(int i:date)--->数组越界异常
                if(date[i]==guessNumber){
                    System.out.println("恭喜您猜中该数据，该数据的位置为第"+(i+1)+"个");
                    break OUT;
                }
            }
            System.out.println("当前猜测数据不存在，请重新猜测");
        }
        //输出数组中的原数
        for (int j:date) {//对于for(int j=0;j<date.length;j++)简写
            System.out.print(j + "\t");
        }
        System.out.println("以上的数为随机生成数");
    }
}
