package Deom;

public class SoliderTest {
    public static void main(String[] args) {
        Soldier soldier1=new Soldier("李白","男",99,80);
        System.out.println("姓名\t"+"性别\t"+"攻击力\t"+"防御力");
        System.out.println(soldier1.getName()+"\t"+soldier1.getAttack()+"\t"+soldier1.getAttack()+"\t\t"+soldier1.getDefense());
    }
}
