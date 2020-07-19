/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proy_Twitter.client.components.Notificaciones;

/**
 *
 * @author lenovo
 */
public class NotificacionesComponent {
    private NotificacionesTemplate notificacionestemplate;
    
    public NotificacionesComponent(){
        notificacionestemplate = new NotificacionesTemplate(this);
    }

    public NotificacionesTemplate getNotificacionesTemplate(){
        return notificacionestemplate;
    }
    
}
