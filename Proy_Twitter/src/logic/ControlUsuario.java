
package logic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import models.Usuario;

/**
 *
 * @author lenovo
 */
public class ControlUsuario {
    private ArrayList<Usuario> usuarios;
    
    public ControlUsuario(){
        usuarios = new ArrayList<Usuario>();
        cargarDatos();
    }
    
    public void cargarDatos(){
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            archivo = new File ("src/archives/usuarios.txt");
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);

            String linea;
            while((linea=br.readLine())!=null){
                String[] atributos = linea.split(",");
                Usuario usuario = new Usuario();
                usuario.setApodoUs(atributos[0]);
                usuario.setClaveUs(atributos[1]);
                usuario.setNombreUs(atributos[2]);
                usuario.setImagenUs(new ImageIcon(atributos[3]));
                usuarios.add(usuario);
            }
            fr.close(); 
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public boolean verificarUsuario(String apodoUs, String claveUs){
        for(Usuario usuario : usuarios){
            if(usuario.getApodoUs().equals(apodoUs))
                if(usuario.getClaveUs().equals(claveUs))
                        return true;
        }
        return false;
    }

    public Usuario devolverUsuario(String apodoUs){
        for(Usuario usuario : usuarios){
            if(usuario.getApodoUs().equals(apodoUs))
                return usuario;
        }
        return null;
    }
}
