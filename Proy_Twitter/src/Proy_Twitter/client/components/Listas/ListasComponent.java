
package Proy_Twitter.client.components.Listas;

/**
 *
 * @author lenovo
 */
public class ListasComponent {
    
private ListasTemplate listastemplate;
    
    public ListasComponent(){
        listastemplate = new ListasTemplate(this);
    }

    public ListasTemplate getListasTemplate(){
        return listastemplate;
    }
    
}
