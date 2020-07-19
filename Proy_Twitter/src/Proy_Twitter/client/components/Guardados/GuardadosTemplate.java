/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proy_Twitter.client.components.Guardados;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author lenovo
 */
public class GuardadosTemplate extends JPanel{

    private GuardadosComponents guardadoscomponent;
    
    public GuardadosTemplate(GuardadosComponents guardadoscomponent){
        this.guardadoscomponent = guardadoscomponent;
        
        setSize(690, 680);
        this.setBackground(Color.BLUE);
        setLayout(null);
        setVisible(true);
    }
    
}
