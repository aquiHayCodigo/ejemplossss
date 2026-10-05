import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;

public class Ejercicio1 {

    public static void main(String[] args) {
        pasarFotoBinario();
        leerFotoBinario();
    }

    public static void pasarFotoBinario(){
        File file= new File("foto.avif");
        File fotoEnBinario= new File("bytesFoto.dat");

        try (FileOutputStream os= new FileOutputStream(fotoEnBinario);){
            
            byte[] fotoBytes= Files.readAllBytes(file.toPath());
            os.write(fotoBytes);
            
        } catch (Exception e) {
        }


    }

    public static void leerFotoBinario(){
        File file= new File("bytesFoto.dat");
        String nuevoNombre= "foto2.avif";
        File fileFoto= new File(nuevoNombre);

        try (FileInputStream fis= new FileInputStream(file);
             FileOutputStream fos= new FileOutputStream(fileFoto); ){
            int byteLeido;

            while((byteLeido= fis.read())!=-1){
                fos.write(byteLeido);
            }



        } catch (Exception e) {
        }

    }


}
