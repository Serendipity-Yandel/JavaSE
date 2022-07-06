package Deom;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        boolean isPrime=true;//作为标记
        System.out.println("请输入一个数");
        Scanner input=new Scanner(System.in);
             int num=input.nextInt();
             int k=(int)Math.sqrt(num);//num必须是一个正数
            for(int i=2;i<=k;i++){
                if(num%i==0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println("该数据是素数");
            }
            else {
                System.out.println("该数据不是素数");
            }

    }
}
