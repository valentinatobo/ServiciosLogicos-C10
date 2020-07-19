/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proy_Twitter.client.components.Opciones;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author lenovo
 */
public class OpcionesTemplate extends JPanel{

    private OpcionesComponent Opcionescomponent;
    
    public OpcionesTemplate(OpcionesComponent Opcionescomponent){
        this.Opcionescomponent = Opcionescomponent;
        
        setSize(690, 680);
        this.setBackground(Color.MAGENTA);
        setLayout(null);
        setVisible(true);
    }
}
