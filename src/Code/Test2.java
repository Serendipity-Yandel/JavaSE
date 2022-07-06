package Code;
//复制数组
public class Test2 {
    //定义复制方法
    public static void copyArray(int[] arr1,int[] arr2){
        //    正式完成数组的复制
        for (int i = 0; i <arr1.length; i++) {
            arr2[i]=arr1[i];
        }

    }
    //定义打印输出方法
    public static void printArray(int []arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i== arr.length-1?arr[i]:arr[i]+",");
        }
        System.out.println("]");

    }

    public static void main(String[] args) {
        int []arr1={12,34,56,74,24,77};
        int []arr2=new int[arr1.length];
        copyArray(arr1,arr2);
        printArray(arr1);
        printArray(arr2);
    }

}
