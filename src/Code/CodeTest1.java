package Code;

import java.util.Random;
        //声称随机验证码
public class CodeTest1 {

    //定义一个方法返回一个随机验证码
    public static String CreatCode(int n){

        String code=""; //定义一个字符串变量接收生成的随机验证码
        Random r=new Random();

        for (int i = 0; i < n; i++) {//定义一个循环，循环n次，生成n个随机数
            //i=0,1,2,3,4
            //生成一个随机字符:英文大写，小写，数字（0,1,2）
            int type=r.nextInt(3);//先生成一个随机数0,1,2用于判断当前位置数据类型
            switch (type){
                case 0:
                    //生成大写字母（A65  Z65+25)--------->(0-25)+65
                   char ch=(char) (r.nextInt(26)+65);//用ch接数据并转化为char型
                    code+=code+ch;
                    break;
                case 1:
                    //生成小写字母（a97  Z97+25)--------->(0-25)+97
                    char ch1=(char) (r.nextInt(26)+65);//用ch接数据并转化为char型
                    code=code+ch1;
                    break;
                case 2:
                    code=code+ r.nextInt(10);//0-9
                    break;
            }
    
        }
            return code;//返回字符串验证码
    }

    public static void main(String[] args) {
        String code= CreatCode(6);//接收return返回的验证码赋给code
        System.out.println("生成的验证码是"+code);
    }

}

