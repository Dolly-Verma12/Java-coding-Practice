public class lastwordlen {
    public static void main(String[] args){
        String s="heloo world in java programming ";
        int count=0;
        for(int i=0;i<s.length();i++){
         if(s.charAt(i)!=' '){
            count++;
         }
         else{
         System.out.println(count);
         count=0;
        }
         
        }
    }
}
