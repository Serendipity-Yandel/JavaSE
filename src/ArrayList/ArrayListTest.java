package ArrayList;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        //1.定义一个movie类
        //2.定义ArrayList集合储存这些影片
        ArrayList<Movie>movies=new ArrayList<>();
        //3.创建影片封装数据，把对象加入到集合中
//        Movie m1=new Movie("肖申克的救赎",9.7,"罗宾斯");
//        movies.add(m1);
        movies.add(new Movie("《肖申克的救赎》",9.7,"罗宾斯"));
        movies.add(new Movie("《霸王别姬》",9.6,"张国荣，张丰毅"));
        movies.add(new Movie("《阿甘正传》",9.5,"汤姆汉克斯"));

        //遍历输出
        for (int i = 0; i < movies.size(); i++) {
            Movie movie=movies.get(i);//用Movie影片类型   接收   get得到的地址  给movie

            System.out.println("片名"+movie.getName());//这里的movie指的是接收地址的变量（上面的）
            System.out.println("评分"+movie.getScore());
            System.out.println("演员"+movie.getActor());
        }
    }
}
