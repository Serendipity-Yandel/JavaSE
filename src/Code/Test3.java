package Code;

import java.util.Scanner;
        //例题：模拟评委打分
public class Test3 {
    public static void main(String[] args) {
        int []scores=new int[6];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请"+(i+1)+"位评委打分");
            int sccore = sc.nextInt();
            scores[i]=sccore; //将评分存入数组
        }
        int max=scores[0];
        int min=scores[0];
        int num=0;
        for (int i = 0; i < scores.length; i++) {
        if(scores[i]>max){
            max=scores[i];
        }
        if (scores[i]<min){
            min=scores[i];
        }
        num+=scores[i];
        }
        System.out.println("评分最高分为"+max);
        System.out.println("评分最低分为"+min);
        double result=(num-max-min)*1.0/(scores.length-2);
        System.out.println(result);
    }

}
