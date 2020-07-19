/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proy_Twitter.client.components.barraBuscar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author lenovo
 */
public class BarraBuscarComponents implements ActionListener{
    
    BarraBuscarTemplate barrabuscartemplate;
    
    public BarraBuscarComponents(){
        barrabuscartemplate = new BarraBuscarTemplate(this);
    }
      
    @Override
    public void actionPerformed(ActionEvent e) {
    }
    
    public BarraBuscarTemplate getBarraBuscarTemplate(){
        return barrabuscartemplate;
    }
}
