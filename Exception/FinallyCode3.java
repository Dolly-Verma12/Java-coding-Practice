public class FinallyCode3 {
    
    public static void main(String[] args){
    try{
     int num=25/0;
     System.out.println(num);
    }
    catch(ArithmeticException e){
System.out.println(e);
    } finally{
        System.out.println("this is finally block!!");
    }
    System.out.println("Rest of the code.....");
    }
}
