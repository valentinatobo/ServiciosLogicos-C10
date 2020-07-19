/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proy_Twitter.client.components.Perfil;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author lenovo
 */
public class PerfilTemplate extends JPanel{

    private PerfilComponent Perfilcomponent;
    
    public PerfilTemplate(PerfilComponent Perfilcomponent){
        this.Perfilcomponent = Perfilcomponent;
        
        setSize(690, 680);
        this.setBackground(Color.ORANGE);
        setLayout(null);
        setVisible(true);
    }
    
}
