import java.io.File;

public class DeleteFile {
    public static void main(String[] args){
        File f=new File("tell.txt");
        if(f.delete()){
            System.out.println("Delete file"+f.getName());
        }else{
            System.out.println("hloo");
        }
    }
}
