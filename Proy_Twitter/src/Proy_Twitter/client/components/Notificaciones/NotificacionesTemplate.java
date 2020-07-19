/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proy_Twitter.client.components.Notificaciones;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author lenovo
 */
public class NotificacionesTemplate extends JPanel{

    private NotificacionesComponent notificacionescomponent;
    
    public NotificacionesTemplate(NotificacionesComponent notificacionescomponent){
        this.notificacionescomponent = notificacionescomponent;
        
        setSize(690, 680);
        this.setBackground(Color.LIGHT_GRAY);
        setLayout(null);
        setVisible(true);
        
    }
    
}
