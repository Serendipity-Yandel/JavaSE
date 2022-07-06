package Code;

import java.util.Scanner;
            //例题：将一个数分解为不同的单个数后，然后每位数加上5在对10求余，最后将所有数反转，则加密成功

public class Test4 {
    public static void main(String[] args) {
        //定义一个需要加密的数组
        System.out.println("请输入一个需要加密的4位数");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();

        //分离出个十白千为数
        int a=number/1000;//千位
        int b=number%1000/100;//百位
        int c=number%100/10;//十位
        int d=number%10;//个位
        int arr[]=new int[]{a,b,c,d};


         //遍历数组中的数，然后进行修改
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(arr[i]+5)%10;
        }
        //将个位数进反转进行加密
        for (int i = 0,j=arr.length-1; i <j; i++,j--) {
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
        }
        //遍历输出加密后的数
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }


    }
}
