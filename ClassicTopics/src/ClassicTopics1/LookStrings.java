package ClassicTopics1;

import java.util.Scanner;

/**题目：输入一行字符，分别统计出其英文字母、空格、数字和其它字符的个数。
 程序分析：
 1、获取一行字符串，nextLine（）
 2、把字符串的每一个字符赋值到一个数值中
 3、对比每一个数值在ASK码的范围，就可以确定它符号的类别
 4、char字符ASK码的范围
 （1）数字0到9： 48~57
 （2）字母A到Z：65到90 a到z：97到122
 （3）空格是32
 *
 */
public class LookStrings {
    public static void main(String[] args) {
        System.out.println("请输入一串字符");
        int letter=0;
        int num=0;
        int space=0;
        int others=0;
        Scanner input=new Scanner(System.in);
        String string=input.nextLine();
        //将获取到的字符串赋值给新数组
        char[]arr=string.toCharArray();
        //遍历其中的数
        for(int i=0;i< arr.length;i++){
            if(arr[i]>=48&&arr[i]<=57){
                num++;
            }
            else if(arr[i]==32){
                space++;
            }
            else if((arr[i]>=65&&arr[i]<=90)||(arr[i]>=97&&arr[i]<=122)){
                letter++;
            }
            else{
                others++;
            }

        }
        System.out.println("字母的个数为"+letter+"空格的个数为"+space+"数字的个数为"+num+"其他的字符为"+others);

    }

}
