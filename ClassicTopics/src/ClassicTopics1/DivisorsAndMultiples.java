package ClassicTopics1;

import java.util.Scanner;

/**题目：输入两个正整数m和n，求其最大公约数和最小公倍数。
 程序分析：利用辗除法。
 *这里有一个知识点要记住的，最大公约数和最小公倍数的求法
 *1、先求最大公约数bigDivisor
 *2、就可以很方便获得最小公倍数multiple=input1*input2/bigDIvisor
 *这里最重要的就是求最大公约数：求法如下
 *(1)用大的数对小的数求余
 *(2)把小的数赋值给大的数，把求余获得的结果赋值给小的数，
 *(3)循环上一步的操作，直到求余的结果为零
 *(4)上一步被求余的数就是我们要的最大公约数，不信的话，你可以动手试试
 *
 */

public class DivisorsAndMultiples {
    public static void main(String[] args) {
        System.out.println("请输入两个数");
        Scanner input=new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 =input.nextInt();
        int number3=number1*number2;// 为计算最小公倍数做前提(最小公倍数=两数乘积/他们之间的最大公约数)
        /**1......原始法(最大公约数的性质)
         * 用for循环判断两个数的最大公约数
        int temp=1;//13 15的最大公因数为1(没有其他的公因数就为1),用于接收最大公约数

        for(int i=2;i<=number1&&i<number2;i++){
            if(number1%i==0&&number2%i==0){//两个数都能被约
                temp=i;
            }
        }
        System.out.println(number1+"和"+number2+"的最大公约数为"+temp)
         System.out.println(number1+"和"+number2+"的最最小公倍数为"+number3/temp)
         */

        /**2......辗转相除法
         *  1。如果number2=0,计算结束，number1就是最大公约数
         *  2.计算number1除以number2的余数，让number1等于number2,而number2等于那个余数
         *  3.回到第一步
         */
        int a1=number1;//在相除时值发生交换
        int a2=number2;//在相除时值发生交换
        while(number2!=0){
            int r=number1%number2;//获取余数
            number1=number2;
            number2=r;
        }
        System.out.println(a1+"和"+a2+"的最大公约数为"+number1);
        System.out.println(a1+"和"+a2+"的最小公倍数为"+number3/number1);
    }

}
