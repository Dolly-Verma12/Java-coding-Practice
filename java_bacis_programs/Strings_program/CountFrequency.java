package Strings_program;

public class CountFrequency {
    public static void main(String[] args){
    String s="hlooo worldd";
    char ch='o';
    int count=0;
    for(int i=0;i<s.length();i++){
        if( ch==s.charAt(i)){
            count++;
        }
    }System.out.println(count);
}
}
