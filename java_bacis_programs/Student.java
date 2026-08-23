import java.util.Scanner;
public class Student { 
 String name;
 int age;
 int phone;
    void input()
{
Scanner S= new Scanner(System.in);
System.out.println("Enter Name Age Phone:");
name=S.next();
age=S.nextInt();
phone=S.nextInt();

}
void display(){
System.out.println("Name:"+name);
System.out.println("Age:"+age);
System.out.println("phone:"+phone);
} 

    public static void main(String[] args){
Student st=new Student();
st.input();
st.display();

    }
}
