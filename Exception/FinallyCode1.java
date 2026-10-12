public class FinallyCode1 {
    public static void main(String[] args){
    try{
     int num=25/5;
     System.out.println(num);
    }
    catch(NullPointerException e){
System.out.println(e);
    } finally{
        System.out.println("this is finally block!!");
    }
    System.out.println("Rest of the code.....");
    }
}
