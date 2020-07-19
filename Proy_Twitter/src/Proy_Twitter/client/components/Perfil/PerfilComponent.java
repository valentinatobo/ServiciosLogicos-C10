/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proy_Twitter.client.components.Perfil;

/**
 *
 * @author lenovo
 */
public class PerfilComponent {
    private PerfilTemplate perfiltemplate;
    
    public PerfilComponent(){
        perfiltemplate = new PerfilTemplate(this);
    }

    public PerfilTemplate getPerfilTemplate(){
        return perfiltemplate;
    }
}
