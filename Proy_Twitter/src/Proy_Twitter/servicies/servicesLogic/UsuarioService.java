
package Proy_Twitter.servicies.servicesLogic;

import logic.ControlUsuario;
import models.Usuario;

/**
 *
 * @author lenovo
 */
public class UsuarioService {
    public static UsuarioService servicio;
    private ControlUsuario cUsuario;
    private String usuariologeado;
    
    public UsuarioService(){
        cUsuario = new ControlUsuario();
    }
    
     public boolean verificarUsuario(String apodoUs, String claveUs){
        if(cUsuario.verificarUsuario(apodoUs, claveUs)){
            this.usuariologeado = apodoUs;
            return true;
        }
        return false;
     }
     
    public Usuario getUsuarioLogeado(){
        return cUsuario.devolverUsuario(usuariologeado);
    }
    public static UsuarioService getService(){
        if(servicio == null){
            servicio = new UsuarioService();
        }
        return servicio;
    }
}
