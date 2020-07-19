/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proy_Twitter.client.components.Mensajes;

/**
 *
 * @author lenovo
 */
public class MensajesComponent {
    
private MensajesTemplate mensajestemplate;
    
    public MensajesComponent(){
        mensajestemplate = new MensajesTemplate(this);
    }

    public MensajesTemplate getMensajesTemplate(){
        return mensajestemplate;
    }
    
}
