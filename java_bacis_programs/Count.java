
public class Count{
 static int  count=0;   
 Count(){
count++;
}
public static void main(String[] args){
  Count c=new Count();
 Count c1=new Count();
System.out.print(count);
 
}
}