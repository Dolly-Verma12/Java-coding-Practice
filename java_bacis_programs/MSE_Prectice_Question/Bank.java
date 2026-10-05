
import java.util.Scanner; 
  
class BankAccount1 {     
    private double balance; 
  
    BankAccount1(double balance) {    
             this.balance = balance; 
    } 
  
    void deposit(double amount) {    
         balance = balance + amount;     } 
  
    void withdraw(double amount) {     
            if (amount > balance) { 
            System.out.println("Insufficient Balance"); 
        } else { 
            balance = balance - amount; 
        } 
    } 
  
    double getBalance() {   
              return balance; 
    } 
} 
  
class Bank {    
     public static void main(String[] args) {     
            Scanner sc = new Scanner(System.in);    
                 double balance = sc.nextDouble(); 
        int n = sc.nextInt(); 
        BankAccount1 account = new BankAccount1(balance); 
  
        for (int i = 1; i <= n; i++) {     
                    char operation = sc.next().charAt(0);         
                        double amount = sc.nextDouble(); 
  
            if (operation == 'D') {        
                         account.deposit(amount);     }      
                         else if (operation == 'W') {          
                           account.withdraw(amount); 
            } else{
                System.out.println("invalid input");
            }
        } 
  
        System.out.println("Final Balance: " + account.getBalance()); 
    } 
} 
