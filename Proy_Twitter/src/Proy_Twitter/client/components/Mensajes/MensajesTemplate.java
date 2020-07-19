/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proy_Twitter.client.components.Mensajes;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author lenovo
 */
public class MensajesTemplate extends JPanel{

    private MensajesComponent mensajescomponent;
    
    public MensajesTemplate(MensajesComponent mensajescomponent){
        this.mensajescomponent = mensajescomponent;
        
        setSize(690, 680);
        this.setBackground(Color.GRAY);
        setLayout(null);
        setVisible(true);
    }
    
}
