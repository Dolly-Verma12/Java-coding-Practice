import java.util.Scanner;

public class AccountCal {
    private double balance;
    AccountCal(double balance){
        this.balance=balance;
    }
    void deposte(double deposite){
        balance=balance+deposite;
    }
    void bal(){
        System.out.println(balance);
    }
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        double balance=s.nextDouble();
        double deposite=s.nextDouble();
        AccountCal ac=new AccountCal(balance);
        ac.deposte(deposite);
        ac.bal();
        s.close();
    }
}
