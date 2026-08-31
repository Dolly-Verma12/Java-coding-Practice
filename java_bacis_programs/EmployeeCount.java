public class EmployeeCount{
static void display(){
System.out.println("hello");
}
static int count=0;
static {
display();
}
EmployeeCount(String n){
count++;
}
public static void main(String[] args){
EmployeeCount e=new EmployeeCount("ravi");
System.out.print(count);
}
}