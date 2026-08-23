import java.util.Scanner;

public class NaturalNum {
    public static void main(String[] args){
     Scanner S=new Scanner(System.in);
     System.out.print("Enter Number till you want to print:");
     int num= S.nextInt();
     for(int i=1;i<=num;i++){
        System.out.println(i);
     }
     S.close();
     System.out.println("Even Numbers:");
     for(int j=1;j<=num;j++){
        if(j%2==0){
            System.out.println(j);
        }
     }
    }
    
}
