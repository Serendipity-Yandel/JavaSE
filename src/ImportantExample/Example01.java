package ImportantExample;
//定义animal类
class Animal{//创建父类
    private String name;//创建名字属性
    private int age;//创建年龄属性
    public Animal(String name,int age){//创造Animal方法
        this.name=name;//this关键字指向当前对象属性
        this.age=age;
    }
   public String getName(){
        return name;
   }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public  String info(){
        return "名称:"+this.getName()+"年龄:"+this.getAge();
    }
}
    //定义dog类继承父类
class Dog extends Animal{
    private String color;//color被私有化了
        public String getColor(){
            return color;
        }
        public void setColor(String color){
            this.color=color;
        }
        public Dog(String name, int age,String color) {//由于父类中有animal方法，子继承父类也应该要有
            super(name, age);
            this.color=color;
        }

        //重写父类的info方法
        public  String info(){
            return  super.info()+"颜色"+this.getColor();//父类中的info方法值返回到了 super.info() 中
        }
    }
public class Example01 {
    public static void main(String[] args) {
        Dog dog=new Dog("牧羊犬",3,"绿色");
        System.out.println(dog.info());
    }
}
