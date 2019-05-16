
import java.io.File;
import java.io.IOException;


public class Filetext {
    
    public static void main(String[] args) throws IOException {
        
        File f=new File("pattern1.java");
             System.out.println(f.exists());
          System.out.println(f.createNewFile());
    }
}
