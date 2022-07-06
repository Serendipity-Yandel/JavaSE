package Deom;

public class Prime2 {
    public static void main(String[] args) {
        for (int i =100; i <=200 ; i++) {

            boolean flag=true;//假设一开始就是素数
            int k= (int) Math.sqrt(i);
            //判断是否是素数
            for(int j=2;j<=k;j++){
                if(i%j==0){
                    flag=false;
                    break;
                }
            }

            if (flag){
                System.out.println(i+"\t");
            }
        }
    }
}
