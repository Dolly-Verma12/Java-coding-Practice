public class Employee{

void display(String name, int Salary){
System.out.print("\nEmployee Name:"+name);
System.out.print("\nEmployee Salary:"+Salary);

}

public static void main(String[] args){

Employee E=new Employee();
E.display("karn",345);
E.display("nm",3445);


}
}