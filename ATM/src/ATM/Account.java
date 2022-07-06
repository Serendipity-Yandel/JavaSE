package ATM;
/**
 *   账户类
 */

public class Account {
   private String card;//卡号
   private String userName;//用户
   private String passWord;//登入密码
   private double money;//余额
   private double quoteMoney;//当次取现额度
   //无参构造器
   public Account() {
   }
   //有参构造器

   public Account(String card, String userName, String passWord, double money, double quoteMoney) {
      this.card = card;
      this.userName = userName;
      this.passWord = passWord;
      this.money = money;
      this.quoteMoney = quoteMoney;
   }

   //方法的封装
   public String getCard() {
      return card;
   }

   public void setCard(String card) {
      this.card = card;
   }

   public String getUserName() {
      return userName;
   }

   public void setUserName(String userName) {
      this.userName = userName;
   }

   public String getPassWord() {
      return passWord;
   }

   public void setPassWord(String passWord) {
      this.passWord = passWord;
   }

   public double getMoney() {
      return money;
   }

   public void setMoney(double money) {
      this.money = money;
   }

   public double getQuoteMoney() {
      return quoteMoney;
   }

   public void setQuoteMoney(double quoteMoney) {
      this.quoteMoney = quoteMoney;
   }
}
