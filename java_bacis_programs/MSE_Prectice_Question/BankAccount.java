import java.util.Scanner;

public class BankAccount {
    private double balance;
    boolean check = false;
    BankAccount(double balance){
        this.balance=balance;
    }
   void deposite(double Ammount){
       balance=balance+Ammount;
    }
    void withdraw(double Ammount){
        if(balance<Ammount){
            check=true;
          
        }else{
           balance=balance-Ammount;
        }
        
    }
    void getbalance()
{
    if(!check){
          System.out.println("Insuffisiant balance");
    }
    System.out.println("total balance: "+balance);
}    public static void main(String[]args){
        Scanner s= new Scanner(System.in);
          double in=s.nextDouble();
    BankAccount Ac=new BankAccount(in);
       
        int n=s.nextInt();
      
        for(int i=0;i<n;i++){
            char ch=s.next().charAt(0);
            if(ch=='D'){
              double d=s.nextDouble();
               Ac.deposite(d);
            }
            else if(ch=='W'){
                  double w=s.nextDouble();
             Ac.withdraw(w); 
            }
        }
        Ac.getbalance();
        s.close();
    }
}
