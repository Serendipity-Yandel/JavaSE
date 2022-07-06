package Deom;

import java.util.Arrays;

public class ShuZu2 {
    public static void main(String[] args) {
        //有Arrays.sort(arr)升序后：2,3,33,45,67,76 下标为（0,1,2,3,4,5)
        int arr[] ={2,3,45,76,67,33};//黄色警告为局部变量位置有问题，在C语言中习惯将方括号放在变量名后面，java中适合放在变量名前面
        //索引的元素是将升序后的元素找出
        Arrays.sort(arr);//将数组重新排序
        // 重新升序后的 2,3,33,45,46,67,76 因为原先数组中没有46，所以先返回-，然后找出其位置并返回（不是下标）
        int index=Arrays.binarySearch(arr,0,5,46);
        System.out.println("46的索引位置是："+index);
    }
}
