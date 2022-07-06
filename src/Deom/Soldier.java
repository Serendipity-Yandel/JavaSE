package Deom;

public class Soldier {
    private    String name;//名字
    private  String gender;//性别
    private  int attack;//攻击力
    private  int defense;//防御力

    public Soldier() {
    }
    //构造有参构造器
    public Soldier(String name, String gender, int attack, int defense) {
        this.name = name;
        this.gender = gender;
        this.attack = attack;
        this.defense = defense;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

}
    class Soldier1 extends Soldier{
    public void Soldier(){
        System.out.println("姓名为"+ super.getName()+"性别"+super.getGender());
    }


    }
