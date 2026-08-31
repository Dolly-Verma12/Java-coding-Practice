public class StaticAreaCircle{
 static int r;
StaticAreaCircle(int n){
r=n;
}
static void display(){
System.out.println("Area of Circle is:" +(2*3.14*r));
}
public static void main(String[] args){
 StaticAreaCircle a=new StaticAreaCircle(5);
a.display();

}
}