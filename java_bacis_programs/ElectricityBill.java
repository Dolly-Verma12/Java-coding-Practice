import java.util.Scanner;

public class ElectricityBill {
  
    public static void main(String[] args){
   Scanner s=new Scanner(System.in);
     System.out.print("Input: ");
     int num=s.nextInt();
     int bill=0;
     if(num<=100){
        bill= num*2;
     }
     else if(num<=200){
        bill=(100*2)+((num-100)*3);
     }else if(num<=400){
        bill=(100*2)+(100*3)+((num-200)*5);
     }else {
        bill=(100*2)+(100*3)+(200*5)+((num-400)*7);
     }
     System.out.println(bill);
     s.close();
    }
}
