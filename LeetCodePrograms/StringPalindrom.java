public class StringPalindrom {
    public static void main(String[] args){
        String str="rtrerer";
        boolean check=false;
        for(int i=0;i<str.length()/2;i++){
            for(int j=0;j<str.length();j++){
                char c=str.charAt(j);
                if(c==str.charAt(str.length()-1-i)){
                    check=true;
                }else{
                    check=false;
                }
            }
        }if(!check){
            System.out.println("palindrom");
        }else{
            System.out.println("not");
        }
    }
}
