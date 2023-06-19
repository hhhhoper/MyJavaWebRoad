package test;

public class BankAccount {
       private String accountNumber;
       private double balance;
       private String ownerName;
       public BankAccount(String owerName,String accountNumber){
                   this.ownerName=ownerName;
                   this.accountNumber=accountNumber;
       }
       public boolean vertifay(String password){
                   if(password==accountNumber){
                         return true;
                   }
                   return false;
       }
       public void deposit(double count){
                   if(count>0){
                       this.balance+=count;
                   }
                   else
                       System.out.println("非法");
                       System.out.println("尊敬的用户："+ownerName+"你的余额为:"+balance);

       }
       public void withdraw(double count){
                   if(count>0){
                       this.balance-=count;
                   }
                   else
                       System.out.println("非法");
                   System.out.println("尊敬的用户："+ownerName+"你的余额为:"+balance);
                   
       }
public String getAccountNumber() {
                   return accountNumber;
}
public double getBalance() {
                   return balance;
}
public String getOwnerName() {
                   return ownerName;
}                  
       

}
