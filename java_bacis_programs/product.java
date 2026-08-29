import java.util.Scanner;
class prod{
 int prid;
 String Name;
int price;

void input(){
  Scanner s=new Scanner(System.in);
prid=s.nextInt();
Name=s.next();
price=s.nextInt();
s.close();
}
 void display(){
   System.out.println("product id: "+prid);
   System.out.println("product Name: "+Name);
   System.out.println("product price: "+price);
}

}

public class product{
 public static void main(String[] args){
 prod p1=new prod();
prod p2=new prod();
 p1.input();
p2.input();
if(p1.price>p2.price){
p1.display();
}else{

p2.display();
}
}
}