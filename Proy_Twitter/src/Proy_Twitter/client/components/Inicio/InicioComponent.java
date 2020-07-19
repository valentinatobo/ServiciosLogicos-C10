
package Proy_Twitter.client.components.Inicio;



/**
 *
 * @author lenovo
 */
public class InicioComponent {
    
    private InicioTemplate iniciotemplate;
    
    
    public InicioComponent(){
        iniciotemplate = new InicioTemplate(this);
    }
    
    public InicioTemplate getInicioTemplate(){
        return iniciotemplate;
    }
}
