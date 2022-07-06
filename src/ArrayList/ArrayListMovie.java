package ArrayList;

import java.util.ArrayList;

public class ArrayListMovie {
    public static void main(String[] args) {
      ArrayList <Integer> scores=new ArrayList<>();
      scores.add(12);
      scores.add(35);
      scores.add(44);
      scores.add(90);
      scores.add(87);
        System.out.println(scores);//12,35,44,90,87
        //遍历集合中的每个元素

        for (int i = 0; i < scores.size(); i++) {//由于ArrayList属于泛指类，用size（）方法来查看
            int score =scores.get(i);
            if(score<50){
                scores.remove(i);
            }
        }
        System.out.println(scores);
        System.out.println("------------------------");
        //从右边开始遍历
        for (int i = scores.size()-1; i>=0; i--) {
            int score=scores.get(i);
            if(score<50){
                scores.remove(i);
            }
        }
        System.out.println(scores);
    }


}
