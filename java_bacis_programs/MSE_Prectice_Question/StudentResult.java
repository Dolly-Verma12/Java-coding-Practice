import java.util.Scanner;
 class Student1{
    private String name;
    private int num;

 Student1 (String name, int num){
    this.name=name;
    this.num=num;
 }
 void result(){
    if(num >40){
     System.out.print("Pass");
    }else{
        System.out.println("Fail");
    }
 }
 }
public class StudentResult {
   public static void main(String[] args){

    Scanner s=new Scanner(System.in);
    String name=s.next();
    int num=s.nextInt();
    Student1 st=new Student1(name, num);
     st.result();
     s.close();
   }
}
