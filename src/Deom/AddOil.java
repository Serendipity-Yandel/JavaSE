package Deom;

public class AddOil {
    public AddOil(int allOil,int lastOil){
        int addOil=allOil-lastOil;
        int time=0;
        System.out.println("油箱即将加满");
        while (addOil!=0){
            System.out.println("还剩余"+addOil+"L已耗时间"+time+"秒。");
            addOil-=2;
            time+=5;
        }
        System.out.println("还剩余"+addOil+"L已耗时间"+time+"秒。");
    }

    public static void main(String[] args) {

     AddOil car= new AddOil(30,6);
    }
}
