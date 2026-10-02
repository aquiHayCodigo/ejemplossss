
import java.io.File;

public class Bytes {

    public static void main(String[] args) {
        escribir();
        leer();
    }

    public static void leer(){
        byte[] datos= {80, 20, 40};
        File file= new File("datos.bin");

        try (FileInputStream fis= new FileInputStream()){
            
        } catch (Exception e) {
        }
    }
    
}
