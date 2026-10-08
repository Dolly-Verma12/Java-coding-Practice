package Strings_program;

public class Countlen {
    public static  void main(String[] args){
        String s="helooooo";
        int count=0;
        for(char ch: s.toCharArray()){
            count++;
        }System.out.println(count);
    }
}
