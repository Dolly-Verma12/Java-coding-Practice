import java.util.Scanner;
public class ClassCal{

void add(int a, int b){
 System.out.print("Addition is: "+(a+b));
}

void mul(int a, int b){
 System.out.print("Multiplication is: "+(a*b));
}

void div(int a,int b){
 System.out.print("Division is: "+(a/b));
}

void sub(int a,int b){
 System.out.print("Addition is: "+(a-b));
}

public static void main(String[] args){
ClassCal c= new ClassCal();
 Scanner s=new Scanner(System.in);
System.out.println("Enter 1 Number for ADD: ");
System.out.println("Enter 2 Number for MUL: ");
System.out.println("Enter 3 Number for DIV: ");
System.out.println("Enter 4 Number for SUB: ");
System.out.print("Enter your Choice: ");
int n=s.nextInt();
System.out.println("Enter your Numbers: ");
int a=s.nextInt();
int b=s.nextInt();
switch(n){
case 1: c.add(a,b);break;
case 2: c.mul(a,b);break;
case 3: c.div(a,b);break;
case 4: c.sub(a,b);break;
default:System.out.print("Wrong choice");break;
}
s.close();
}
}