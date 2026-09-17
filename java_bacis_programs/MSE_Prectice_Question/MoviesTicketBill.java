import java.util.Scanner;

public class MoviesTicketBill {
    private  int age;

    MoviesTicketBill(int age){
        this.age=age;
    }
    void display(){
        if(age<12){
         System.out.println("Category: Child");
         System.out.println("Price: "+100);
        }
        if(age>=12 && age<59){
         System.out.println("Category: Adult");
         System.out.println("Price: "+250);  
        }
        if(age >=60){
        System.out.println("Category: Senoir");
         System.out.println("Price: "+150);  
        }
    }
    public static void main(String[] args){
  Scanner s=new Scanner(System.in);
  int age=s.nextInt();
 MoviesTicketBill m=new MoviesTicketBill(age);
 m.display();
s.close();
    }
}
