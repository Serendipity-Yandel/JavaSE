package Deom;

public class Exchange {
    public static int[] exchange(int []arr){
        int temp=arr[0];
        arr[0]=arr[1];
        arr[1]=temp;
        return  arr;
    }

    public static void main(String[] args) {
        int []arr={12,29};
        System.out.println("第一个值"+arr[0]+"第二个值为"+arr[1]);//交换前
        exchange(arr);//,调用方法，交换后
        System.out.println("第一个值为"+arr[0]+"第二个值为"+arr[1]);
    }
}
