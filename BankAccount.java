
package bankaccountmanagementsystem;

public class BankAccount {
   private String accountNumber, accountHolderName;
   private double balance;
   
   public BankAccount (String accountNumber,String accountHolderName,double balance){
       this.accountNumber=accountNumber;
       this.accountHolderName=accountHolderName;
       this.balance=balance;
   }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount){
        if(amount>0)
            balance+=amount;
        System.out.println(amount + "deposit successfully");
    }
    public void withdraw(double amount){
        if(amount>balance)
            System.out.println("withdraw faild");
      else if(amount>0)
           balance-=amount;
      System.out.println(amount + "withdraw successfully"); 
    }
   public void printInfo(){
       System.out.println("accountNumber:"+ accountNumber);
       System.out.println("accountHolderName:"+    accountHolderName);
       System.out.println("balance:" +   balance);
       
   }
   
}
