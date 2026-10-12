import java.util.Scanner;
public class cnvt_Str_int {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        try{

        String Enter=sc.nextLine();
        int num=Integer.parseInt(Enter);
        System.out.println(num);
        }catch(NumberFormatException n){
            System.out.println("Error"+n);
        }

sc.close();
    }
}
