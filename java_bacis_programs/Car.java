import java.util.Scanner;
public class Car{
String car;
int Price;
 
void input(){
Scanner s=new Scanner(System.in);
System.out.print("\nEnter your Car Name:");
car=s.nextLine();
System.out.print("\nEnter your Car Price Name:");
Price=s.nextInt();

}
void display(){
 System.out.print("Car:"+car);
System.out.print("price:"+Price);
}
public static void main(String[] args){
Car c=new Car();
c.input();
c.input();
c.display();

c.display(); 

}
}