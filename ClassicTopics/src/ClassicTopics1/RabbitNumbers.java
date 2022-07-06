package ClassicTopics1;

import java.util.Scanner;

/**古典题目：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子对数为多少？
 *程序分析：兔子的规律为数列1,1,2,3,5,8,13,21....
 *本题有：a[n]=a[n-1]+a[n-2],而第一第二项都知道了，后面的值也可以求得
 * 解法：递归思想
 * 做这种题目，最好的做法就是找出规律，跟高中的数列一样
 */
public class RabbitNumbers {

    public static int fun(int n){
        if(n==1||n==2){
            return 1;
        }
        else {
            return fun(n-1)+fun(n-2);
        }
    }
    public static void main(String[] args) {
        System.out.println("需要输出几月的兔子的数量");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();//获取输入的月份n
    System.out.println("第"+"个月的兔子总数为"+fun(n));
         //关闭入口
        input.close();
    }
}
