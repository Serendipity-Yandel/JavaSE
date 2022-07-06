package ArrayRank;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        //冒泡排序
        int[]arr=new int [5];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入数据");
            int number= sc.nextInt();
            arr[i]=number;//将从键盘获得的数据存放在数组中
        }
        for (int i = 0; i < arr.length-1; i++) {//作为比较的轮数
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int j : arr) {
            System.out.print(j + "\t");
        }

    }
}
