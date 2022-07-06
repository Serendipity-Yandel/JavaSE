package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListStudent {
    public static void main(String[] args) {
        //1.定义一个学生类，后期用于创建对象封装学生数据
        //2.定义一个集合封装学生学生对象

        ArrayList<Student>students=new ArrayList<>();//ArrayList<Student>指的是集合中的类型
        //向集合中添加对象
        students.add(new Student("201802","叶孤城",23,"护理1班"));//new创建新对象
        students.add(new Student("201803","东方不败",23,"推拿2班"));
        students.add(new Student("201804","西门吹雪",23,"中药1班"));
        students.add(new Student("201806","梅超风",23,"神经科1班"));

        System.out.println("学号\t\t\t名称\t\t\t年龄\t\t班级");
        //3.遍历集合中的每个学生对象并展示其数据
        for (int i = 0; i < students.size(); i++) {
            Student s=students.get(i);//将集合中获得的数据赋值给变量s
            System.out.println(s.getStudyId()+"\t\t"+s.getName()+"\t\t"+s.getAge()+"\t\t"+s.getClassName());

        }
        //4.让用户不断输入学号，可以搜索该学生对象信息并展示出来（独立成方法）
            Scanner SC=new Scanner(System.in);
        while (true) {//ctrl+alt+t快捷键
            System.out.println("请输入你的学号");
            String id=SC.next();
            Student s=getStudentByStudyId(students,id);//将返回的值赋值给s
            //判断学号是否存在
            if(s==null){
                System.out.println("查无此人");
            }else{
                System.out.println(s.getStudyId()+"\t\t"+s.getName()+"\t\t"+s.getAge()+"\t\t"+s.getClassName());
                break;
            }
        }

    }
    /**
     * 根据学号，去集合中找出学生对象并返回
     */
    //创建找学号的方法
    public static Student getStudentByStudyId(ArrayList<Student> students,String studyId){
        for (int i = 0; i < students.size(); i++) {
            Student s=students.get(i);
            if(s.getStudyId().equals(studyId)){
                return s;
            }
        }
    return null;//查无此人时
    }

}
