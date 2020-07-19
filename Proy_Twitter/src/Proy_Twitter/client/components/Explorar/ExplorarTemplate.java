
package Proy_Twitter.client.components.Explorar;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author lenovo
 */
public class ExplorarTemplate extends JPanel{

    private ExplorarComponent explorarcomponent;
    
    public ExplorarTemplate(ExplorarComponent explorarcomponent){
        this.explorarcomponent = explorarcomponent;
        
        setSize(690, 680);
        this.setBackground(Color.BLACK);
        setLayout(null);
        setVisible(true);
    }
    
}
