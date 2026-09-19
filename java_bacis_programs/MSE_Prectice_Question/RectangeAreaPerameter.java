import java.util.Scanner;

class Ractangle{
int len;
int wid;
Ractangle(int a,int b){
    len=a;
    wid=b;
}
void area(){
    System.out.println("Area: "+len*wid);
}
void pera(){
    System.out.println("Perameter: "+ (2*(len+wid)));
}
}


public class RectangeAreaPerameter {
   public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int len=s.nextInt();
    int wid=s.nextInt();
    Ractangle r=new Ractangle(len,wid);
    r.area();
    r.pera();
   s.close();
   } 
}
