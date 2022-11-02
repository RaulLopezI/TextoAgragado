import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

 
public class Start {
	static String ruta = "C:/Users/raull/eclipse-workspace/AbrirTexto/hola.txt";
    public static void main(String[] args) throws IOException {
 
        String cont = "";
        // contenido del fichero
 
        File archivo = new File(ruta);
        // creación de archivos
 
 
        try {
            FileWriter fR = new FileWriter(archivo, true);
            // fichero en modo escritura
 
            PrintWriter pW = new PrintWriter(fR);
            // permite la escitura
 
            pW.println(" AGREGADO ");
            // ejecuta la escritura
 
            fR.close();
            pW.close();
            //cerramos
 
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("El fichero no puede abrirse");
        }
    }
}