package Deom;

public class Qian {
    public static void main(String[] args) {

        int sum=0;//标记种数
        System.out.println("10元\t"+"20元\t"+"50元");
        for (int i = 0; i <=10; i++) {//单独10元最多10张
        for(int j=0;j<=5;j++){//单独20元最多5张
            for(int k=0;k<=2;k++){//单独50元最多2张
                if(10*i+20*j+50*k==100){
                    sum++;
                    System.out.println(i+"张\t\t"+j+"张\t\t"+k+"张\t\t");
                }
            }
        }
        }
        System.out.println("共有"+sum+"种方法");
    }
}
