package Deom;

import java.util.Arrays;

public class ShuZu {
    public static void main(String[] args) {
        int [] arr={12,43,67,53,78,90};
        //Arrays.toString(数组）:按照一定的格式输出数组中的每个元素
        System.out.println(Arrays.toString(arr));

        //Arrays.sort(数组）:按照数字从小到大的顺序排列数组中的元素
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


        //Arrays.copyOf(原来数组，新数组长度）:实现数组的复制
        int[] copyArr =Arrays.copyOf(arr,7);
        //给最后的一个元素赋值
        copyArr[6]=10;
        System.out.println(Arrays.toString(copyArr));
        //指定复制的元素[2-6),不包括索引元素
        int[] copyArr2 =Arrays.copyOfRange(arr, 2,6 );
        System.out.println(Arrays.toString(copyArr2));
    }
}
