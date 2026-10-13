public class MultuCatchUsingPipe {
    public static void main(String[] args){
    try{
        int a=10;
        int arr[]={10,20,30};
        int data=a/0;
        System.out.println(data);
        System.out.println(arr[5]);
    }
    catch( ArithmeticException |ArrayIndexOutOfBoundsException e){
        System.out.println(e);
    }
    catch(Exception ex){
        System.out.println(ex);

    }
    
}
}
