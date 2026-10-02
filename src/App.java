
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class App {
    static File file= new File("password.bin");

    public static void main(String[] args) throws Exception {
        String passw= "blablabla";

        escribirBinario(passw);
        leerBinario();
        
    }

    public static void escribirBinario(String passw){
        try (OutputStream os= new FileOutputStream(file);
             ObjectOutputStream oos= new ObjectOutputStream(os);
        ){
            oos.writeUTF(passw);
            oos.close();
            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static void leerBinario(){
        try (InputStream is= new FileInputStream(file);
             DataInputStream ois= new DataInputStream(is);
        ) {
            String frase= ois.readUTF();
            System.out.println(frase);

        } catch (Exception e) {
        }
    }
}
