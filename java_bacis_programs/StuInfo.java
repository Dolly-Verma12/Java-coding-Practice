class Student{
String Name="Karn";
int Stid=101;
}

class Marks extends Student{
int m1=10;
int m2=80;
int m3=70;

}
class Result extends Marks{
int total=m1+m2+m3;
float Avg=total/3;
void display(){
System.out.println("Student Name: "+Name);
System.out.println("Student ID: " +Stid);
System.out.println("Result: "+Avg);
}
}

public class StuInfo{
public static void main(String[] args){
Result r=new Result();
r.display();
}
}