import java.util.Scanner;

public class MovieTicket {
    public static void main(){
        Scanner s=new Scanner(System.in);
        int age=s.nextInt();
        if(age<12 || age>60){
            System.out.println(100);
            
        }
        else{
            System.out.println(200);
        }
        s.close();
    }

}
