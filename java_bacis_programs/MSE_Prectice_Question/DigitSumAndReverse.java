import java.util.Scanner;
public class DigitSumAndReverse{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
     int Num=s.nextInt();
     int sum=0;
     int rev=0;
     while(Num>0){
        int rem=Num%10;
        rev=rev*10+rem;
        Num=Num/10;
        sum=sum+rem;
     }
     s.close();
        System.out.println("Reverse of number:c"+rev);
     
     System.out.println("Sum of the number: "+sum);
     
    }
}