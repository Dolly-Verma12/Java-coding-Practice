public class IsPalindrom{
    public static void main(String[] args){
        // String s="hloo,this is me:  12Dolly";
        String s="IM uu MI";
        s=s.replaceAll("[^a-zA-Z0-9]", "");
        s=s.toLowerCase();
        String str=new StringBuilder(s).reverse().toString();
        if(s.equals(str)){
            System.out.println("Palindrom");
        }else{
            System.out.println("Not Palindrom!!");
        }
    }
}