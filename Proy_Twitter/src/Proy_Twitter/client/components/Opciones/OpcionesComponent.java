/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proy_Twitter.client.components.Opciones;

/**
 *
 * @author lenovo
 */
public class OpcionesComponent {
    private OpcionesTemplate opcionestemplate;
    
    public OpcionesComponent(){
        opcionestemplate = new OpcionesTemplate(this);
    }

    public OpcionesTemplate getOpcionesTemplate(){
        return opcionestemplate;
    }
}
