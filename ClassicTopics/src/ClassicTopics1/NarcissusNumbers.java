package ClassicTopics1;

public class NarcissusNumbers {
    /**题目：打印出所有的"水仙花数(1000以内的数）"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。例如：153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。
     *程序分析：利用for循环控制100-999个数，每个数分解出个位，十位，百位。
     *
     */
    public static void main(String[] args) {
        int count=0;//计数器准备
        for(int i=100;i<1000;i++){
            int j=i%10;//分离出个位
            int k=i/10%10;//分离出十位
            int l=i/100;//分离出百位
            if(j*j*j+k*k*k+l*l*l==i){
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println();//换行上面的
        System.out.println("水仙花总数为"+count);
    }
}
