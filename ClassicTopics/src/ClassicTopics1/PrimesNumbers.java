package ClassicTopics1;

public class PrimesNumbers {
    /**
     * 题目：判断101-200之间有多少个素数，并输出所有素数,每5行的输出。
     * 素数是：只能被1或本身整除的数，如：3,5,7,11,131...
     * 判断素数的方法：用一个数分别去除2到sqrt(这个数)，
     * 其实用这个数分别去除2到他本身少1的数也可以，但是运算时间增加了
     * 如果能被整除，则表明此数不是素数，反之是素数。
     */

    public static void main(String[] args) {
        int count=0;//sum作为计数器
        for (int i = 100; i < 200;i++) {
            if (IsRightNum(i)) { //判断这个数是不是素数（调用函数）
                System.out.print(i+"  ");
                count++;
                if (count%10==0) { //十个一行
                    System.out.println();
                }
            }
        }
        System.out.println("素数的个数为："+count);
    }
    //判断这个数是不是素数的具体代码（构造函数）
    private static boolean IsRightNum(int i) {
        int k=(int)Math.sqrt(200);
        for (int j = 2; j < k;j++) {
            if (i%j==0) { //如果能整除，就说明不是素数，可以马上中断，继续对下一个数判断
                return false;
            }
        }
        //到判断完毕后，将正确地返回到构造的函数中
        return true;
    }
}