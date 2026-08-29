import java.util.Scanner;

public class EvenOdd {
    void check(int n){
     if(n%2==0){
        System.out.println("Number is Even!!");
     }else{
         System.out.println("Number is Odd!!");
        if(n%3==0){
            System.out.println("Number is Divisible by 3.");
        }
       
     }
    }
    public static void main(String[] args){
        EvenOdd e=new EvenOdd();
    Scanner S=new Scanner(System.in);
    System.out.print("Enter your Number: ");
    int num =S.nextInt();
     e.check(num);
     S.close();
    }
}
