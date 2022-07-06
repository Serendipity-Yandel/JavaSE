package Deom;

import java.util.Arrays;

public class ArrayDeom {
    public static void main(String[] args) {
        int[] arr ={12,34,12,23,45,57,45,89};
        int [] tempArr=new int[arr.length];//是临时数组
        int t=0;
        for(int i=0;i< arr.length;i++){//遍历原数组
            boolean flag =true;//声明一个标记
            for(int j=i+1;j< arr.length;j++){//内层循环将原数组的元素逐个比较
                if(arr[i]==arr[j]){//发现重复的数据改变其标记并结束程序
                    flag =false;
                    break;
                }
            }
            if(flag){//判断标记是否被改变如果没被改变就是没有重复元素
                tempArr[t]=arr[i];//没有元素就将原数组的元素赋值给临时数组
                t++;
            }
        }
        int[] newArr=new int[t];
      /** System.arraycopy(tempArr,0,newArr,0,t);//copy粘贴到临时数组中
       for(int i=0;i< newArr.length;i++)
        System.out.println(newArr[i]);
       *循环遍历输出
       *
       *
       */
      System.arraycopy(tempArr,0,newArr,0,t);
        System.out.println(Arrays.toString(newArr));

    }
}
