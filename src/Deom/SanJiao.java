package Deom;

public class SanJiao {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){//控制行
            //先打印出前面的空格
            for(int j=1;j<=6-i;j++){
                System.out.print(" ");
            }
            //打印数字
            for(int j=1;j<=2*i-1;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
