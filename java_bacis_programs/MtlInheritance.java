class Person{
String Name="Krn";
void name(){
System.out.println(" Name= "+Name);
}
}

class Employee extends Person{
void employee(){
System.out.println("Employeed!!");
System.out.println("Salary= "+100);
}
}

class Manager extends Employee{
void department(){
System.out.println("Department= "+"HR");
}
}

public class MtlInheritance{
public static void main(String[] args){
 Manager m=new Manager();
m.department();
m.employee();
m.name();
}
}