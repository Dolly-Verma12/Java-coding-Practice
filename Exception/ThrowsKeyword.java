

class InsufficientBalance extends Exception{
   public String getMessage(){
    return "Insufficent Balance";
   }
   public String geString(){
    return "get string";
   }
   InsufficientBalance(String data){
     super(data);
    // System.out.println(data);
    
   }
}
public class ThrowsKeyword{
     static double bank(double balance, double deposite) throws InsufficientBalance{
        double result=balance-deposite;
     if(result <0){
       throw new InsufficientBalance("hello");
     }
      return result;
        }
    public static void main(String[] args){

        try{
            bank(145.0,2334);
        }
        catch(InsufficientBalance e){
            System.out.println(e);
            System.out.println(e.geString());
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
    }
}