/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proy_Twitter.client.components.Listas;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author lenovo
 */
public class ListasTemplate extends JPanel{

    private ListasComponent listascomponent;
    
    public ListasTemplate(ListasComponent listascomponent){
        this.listascomponent = listascomponent;
        
        setSize(690, 680);
        this.setBackground(Color.DARK_GRAY);
        setLayout(null);
        setVisible(true);
    }
    
}
