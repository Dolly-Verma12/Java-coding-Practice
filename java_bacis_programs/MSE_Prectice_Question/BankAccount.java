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
        Scanner sc= new Scanner(System.in);
          double in=sc.nextDouble();
    BankAccount Ac=new BankAccount(in);  
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            char ch=sc.next().charAt(0);
            if(ch=='D'){
              double d=sc.nextDouble();
               Ac.deposite(d);
            }
            else if(ch=='W'){
                  double w=sc.nextDouble();
             Ac.withdraw(w); 
            }else{
                System.out.println("invailid iutput");return;
            }
        }
       
        Ac.getbalance();
          sc.close();  
     
    }
}
