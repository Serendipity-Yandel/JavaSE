package ClassicTopics1;

import java.util.Scanner;

/**题目：求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。输出结果的形式如：2+22+222=246；
    程序分析：关键是计算出每一项的值。
    比如获取的数字为：a，出现的项数为：n
    总结一下，可以得到一下规律：
    1、第一项有一个a,最后一项有n个a
    2、 第1和第2项相差2*10，第2和第三项相差2*100，第k和第k+1项相差2*（10的k次方）
 */

public class Numeration {
    public static void main(String[] args) {
        System.out.println("请输入一个数");
        System.out.println("要结束的项数");
        Scanner input1=new Scanner(System.in);
        Scanner input2=new Scanner(System.in);
        int a=input1.nextInt();
        int n=input2.nextInt();
        int s=0;

    }
}
