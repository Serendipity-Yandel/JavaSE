package Animal;

//定义Animal类
class Animal{//父类Animal
    String name="牧羊犬";//创建Animal的变量，也叫Animal的属性        (如还有，high,age,size.....)
    int age=10;

    void shout(){//定义动物叫的行为，也叫方法
        System.out.println("动物发出叫声");
    }
}
class Dog extends Animal{//定义dog继承父类---------->如果要加public 则“Dog”类是公共的，应在名为“Dog.java”的文件中声明
   public void  shout(){//重写父类中的shout方法，并扩大了访问权限
        super.shout();//调用父类中的方法（由于父类中有）
       System.out.println("汪汪汪汪汪");
    }
    public void printName(){//对于对象dog中创建方法
        System.out.println("名字"+super.name);//调用父类中的属性
    }
    public void printAge(){
        System.out.println("年龄"+super.age);
    }
}
//定义测试类
    public class Animals {
    public static void main(String[] args) {
    Dog dog1 =new Dog();//创建dog类对象
        dog1.shout();//调用dog重写shout的方法
        dog1.printName();//调用dog类中的printName方法
        dog1.printAge();

    }
}
