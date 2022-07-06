package ArrayRank;

import java.util.Random;
import java.util.Scanner;

public class ArrayRanking {
    public static void main(String[] args) {

        int [] codes=new int[5];//定义一个数组，用来存放5个数
        //定义一个循环，让员工依次输入员工号码
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < codes.length; i++) {
            System.out.println("请您输入第"+(i+1)+"个员工的号码");
            int code=sc.nextInt();//将获得的数放入code中
            codes[i]=code;
        }
        //int number=sc.nextInt();//获取键盘上输入的数据
        //遍历数组中的每个元素，然后随机一个数组出来，让该元素与随机索引位置处的原数
        //codes=[12,36,28,45,99]
        Random r=new Random();
        for (int i = 0; i < codes.length; i++) {
            //当前遍历值codes[i]
            //随机一个元素的索引codes[index]
            int index = r.nextInt(codes.length);//获取5个随机数的索引
            int temp=codes[index];//引入第三变量让数组值与index交换位置
            codes[index]=codes[i];
            codes[i]=temp;
        }
        //遍历数组输出就是元素的排名
        for (int i = 0; i < codes.length; i++) {
            System.out.print(codes[i]+"\t");
        }


    }
}
