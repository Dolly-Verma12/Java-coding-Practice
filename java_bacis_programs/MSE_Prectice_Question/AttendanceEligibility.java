import java.util.Scanner;
public class AttendanceEligibility {
    public static void main(String[] args){
     Scanner s=new Scanner(System.in);
     int Num=s.nextInt();
     int totalnum=s.nextInt();
     double percent=(double)Num/totalnum*100;
     System.out.println("percent "+percent+"%");
     if(percent>=75){
      System.out.println("Eligilble");
     }else{
        System.out.println("Not Eligible");
     }
s.close();
    }
}
