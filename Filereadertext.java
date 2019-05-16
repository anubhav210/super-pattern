
import java.io.File;
import java.io.IOException;


public class Filereadertext {
    
    public static void main(String[] args) throws IOException {
        
        File f=new File("pattern1.java");
             File [] ft=  f.listFiles();
             for(File f1:ft){
            System.out.println(f1.getName()+"   "+f1.getPath());
             }
    }
}
