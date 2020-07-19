package Proy_Twitter.client.components.Explorar;

/**
 *
 * @author lenovo
 */
public class ExplorarComponent {
    private ExplorarTemplate explorartemplate;
    
    public ExplorarComponent(){
        explorartemplate = new ExplorarTemplate(this);
    }

    public ExplorarTemplate getExplorarTemplate(){
        return explorartemplate;
    }
    
}
