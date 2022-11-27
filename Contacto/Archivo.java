package Archivo;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Archivo {
    
    File archivo; 
            
    public void CrearArchivo(){
        try {
            archivo = new File("Agenda.txt");
            if (archivo.createNewFile()) {
                JOptionPane.showMessageDialog(null, "Archivo creado");
            }
        } catch (IOException e) {
            System.out.println(e);
        }

}
    public void EscribirArchivo(Contacto contacto){
        try {
            FileWriter escrito = new FileWriter(archivo, true);
            escrito.write(contacto.getIdentificacion() + "," + contacto.getNombre()+ ","+ contacto.getApellidos() + "\r\n");
            escrito.close();
        }catch (IOException e) {
            System.out.println(e);
        }     
    }
    
}
