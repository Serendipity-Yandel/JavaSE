package ClassicTopics1;

import java.util.Scanner;

/**
 * 题目：利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
 * 程序分析：(a>b)?a:b这是条件运算符的基本例子。
 */

public class Operator {
    public static void main(String[] args) {
        System.out.println("请输入一个分数");
        Scanner input=new Scanner(System.in);
        int score=input.nextInt();
        String level=score>=90?"A":(score>=60?"B":"C");
        System.out.println(score+"属于："+level);
        input.close();

    }
}
