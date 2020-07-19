/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proy_Twitter.client.components.Tarjeta;

import javax.swing.ImageIcon;

/**
 *
 * @author lenovo
 */
public class TarjetaComponent {
    private TarjetaTemplate tarjetatemplate;
    
    public TarjetaComponent(ImageIcon imagenp, String Nombre, String Alias, String Tweet){
        tarjetatemplate = new TarjetaTemplate(this,imagenp, Nombre, Alias, Tweet);
    }

    public TarjetaTemplate getTarjetaTemplate(){
        return tarjetatemplate;
    }
    
}
