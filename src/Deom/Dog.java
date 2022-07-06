package Deom;

import java.awt.*;

public class Dog {
    String name;//狗属性
    String color;
    String vioce;
    public Dog(String name,String color,String vioce){
        this.name=name;
        this.vioce=vioce;
        this.color=color;
    }
    public void call(){//叫
        System.out.println(vioce);
    }

    public static void main(String[] args) {
        Dog d1=new Dog("毛毛","白色","汪汪汪");//创建d1狗的对象
        System.out.println(d1.name+"的颜色是"+d1.color);
        System.out.print(",叫起来的声音:");
        d1.call();//调用call函数----->对象.函数名
        Dog d2=new Dog("灰灰","灰色","嗷呜~~~");
        System.out.println(d2.name+"的颜色市"+d2.color);
        System.out.print(",叫起来的声音是：");
        d2.call();
    }
}
