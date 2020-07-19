/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proy_Twitter.client.components.barraInicio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author lenovo
 */
public class BarraInicioComponents implements ActionListener{
    
    BarraInicioTemplate barranavegaciontemplate;
    
    
    public BarraInicioComponents(){
        barranavegaciontemplate = new BarraInicioTemplate(this);
    }
      
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public BarraInicioTemplate getBarraInicioTemplate(){
        return barranavegaciontemplate;
    }
    
}
