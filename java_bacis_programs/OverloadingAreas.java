class Poly{
int area(int l,int b){
  return l*b;
 }
int area(int a){
  return (a*a);
 }
float area(float r){

return r*r*3.14f ;
}
}
public class OverloadingAreas{
public static void main(String[] args){
Poly p=new Poly();
System.out.println(p.area(2));
System.out.println(p.area(2 , 4));
System.out.println(p.area(1.2f));
}
}