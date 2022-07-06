package ArrayList;

public class Student {
    private String StudyId;
    private String name;
    private  int age;
    private String className;
        //无参构造器
    public Student() {
    }
        // 有参构造器
    public Student(String studyId, String name, int age, String className) {
        this.StudyId = studyId;
        this.name = name;
        this.age = age;
        this.className = className;
    }

    //方法的封装
    public String getStudyId() {
        return StudyId;
    }

    public void setStudyId(String studyId) {
        StudyId = studyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
