import java.util.InputMismatchException;
import java.util.Scanner;
public class MultiCatch {
    public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    try{
     System.out.print("Enter input: ");
    int num=s.nextInt();
    System.out.println(num);
    }
    catch(ArithmeticException e){
     System.out.println("Arithmetic Error....");
    }
    catch(InputMismatchException e){
        System.out.println("Number Formate error...");
    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Array index out of bound..");
    }
    s.close();
    }
}
