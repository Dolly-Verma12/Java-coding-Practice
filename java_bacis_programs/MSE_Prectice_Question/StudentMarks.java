import java.util.Scanner;
class student{
    private int Marks;
 void setMarks (int Marks){
    this.Marks=Marks;
 }
 void getMarks(){
    if (Marks>100 || Marks<0){
        Marks=0;
    System.out.println(Marks);
    }else{
        System.out.println(Marks);
    }
 }
}
public class StudentMarks {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
         student m=new student();
    int marks=s.nextInt();
          m.setMarks(marks);
          m.getMarks();
        s.close();
    }
    
}
