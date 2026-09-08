class Employee{
    void calculateSalary(){
     System.out.println("Employee: 100000");
    }
}
class Manager extends Employee{
   void calculateSalary(){
System.out.println("Manager: 105000");
    }  
}
class Developer extends Employee{
     void calculateSalary(){
    System.out.println("Employee: 110000");
    }
}

public class Overridesalary {
    public static void main(String[] args){
    Employee e=new Manager();
    e.calculateSalary();
    }
}
