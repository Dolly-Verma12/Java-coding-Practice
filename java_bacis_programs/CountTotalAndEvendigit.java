import java.util.Scanner;

public class CountTotalAndEvendigit {
    public static  void main(String[] args){
        Scanner S= new Scanner(System.in);
        System.out.print("Enter Positive Number: ");
        int n=S.nextInt();
        int d;
        int t_count=0;
        int e_count=0;
        while(n>0){
            d=n%10;
            n=n/10;
            t_count++;
            if(d%2==0){
                e_count++;
            }
        }
System.out.println("Total Digit in Positive Number="+t_count);
System.out.print("Even Digit in Positive Number="+e_count);
        S.close();
    }
}
