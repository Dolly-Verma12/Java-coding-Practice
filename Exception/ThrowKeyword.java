public class ThrowKeyword {
    public static void main(String[] ar){
        try{
       int age=-12;
        System.out.println(age);
       if(age<0){
        throw new ArithmeticException("age cannot be negitive");
    }
}
catch(ArithmeticException e){
    System.out.println("error" + e);
}
catch(Exception e){
    System.out.println("Error: "+e);
}
    
       System.out.println("Rest of the code....");

    }

}
