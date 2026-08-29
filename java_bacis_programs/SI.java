public class SI{

void display(int p,int r, int t){
float si=(p*r*t)/100;
System.out.print("Simple Intrest: "+si);
}
public static void main(String[] args){
SI s=new SI();
s.display(100,100,1);

}
}