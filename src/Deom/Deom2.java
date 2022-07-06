package Deom;
class student{//创建学生父类
    private String name;
    private int age;
    public String getName(){//可以被删掉
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if (age<=0){
            System.out.println("您输入的年龄有误！");
        }else{
            this.age=age;
        }
    }
    //创建一个方法输出属性
    public void putout(){
        System.out.println("大家好，我是"+name+"今年"+age+"岁了");
  }
}

//实例化对象测试
public class Deom2 {
    public static void main(String[] args) {
        student stu=new student();
        stu.setName("张三");
        stu.setAge(22);
  stu.putout();

    }
}
