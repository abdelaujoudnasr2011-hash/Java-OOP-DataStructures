
package bankaccountmanagementsystem;

public class BankAccountManagementSystem {

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("1","Abdo Nasr",100);
        BankAccount b2 = new BankAccount("2","Amr",200);
        System.out.println("Befor");
        b1.printInfo();
        b2.printInfo();
        
        System.out.println("*********************************************");
     
        b1.deposit(50);    //            عمليه ايداع    (100+50=150)
        b1.withdraw(100);    //       عمليه سحب       (150-100=50)
        
        
        
        b2.withdraw(100);  //         عملية سحب   (200-100=100)
        b2.deposit(50);  //             عملية ايداع (100+50=150)
        
       System.out.println("*********************************************");
       
       
      System.out.println("After");
      b1.printInfo();
      b2.printInfo();
    }
    
}
