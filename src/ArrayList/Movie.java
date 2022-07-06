package ArrayList;

public class Movie {
    private String name;
    private  double score;
    private String actor;

    //构造无参构造器
    public Movie() {
    }
    //构造有参构造器（用于实例化对象时对属性进行赋值)
    public Movie(String name, double score, String actor) {
        this.name = name;
        this.score = score;
        this.actor = actor;
    }
    //方法的封装
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }
}
