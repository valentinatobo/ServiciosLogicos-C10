/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proy_Twitter.client.components.Guardados;

/**
 *
 * @author lenovo
 */
public class GuardadosComponents {
    
    private GuardadosTemplate guardadostemplate;
    
    public GuardadosComponents(){
        guardadostemplate = new GuardadosTemplate(this);
    }

    public GuardadosTemplate getGuardadosTemplate(){
        return guardadostemplate;
    }
    
}
