/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proy_Twitter.client.components.barraNavegacion;


import Proy_Twitter.client.vistaTemplate.VistaPrincipalComponent;
import Proy_Twitter.servicies.RecursosService;
import Proy_Twitter.servicies.servicesLogic.UsuarioService;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import models.Usuario;

/**
 *
 * @author lenovo
 */
public class NavegacionUsuarioComponents implements ActionListener, MouseListener{
    
    private NavegacionUsuarioTemplate navegacionusuariotemplate;
    private VistaPrincipalComponent vistaprincipalcomponent;
    private UsuarioService sUsuario;
    private Usuario usuariologeado;
    
    public NavegacionUsuarioComponents(VistaPrincipalComponent vistaprincipalcomponent){
        this.sUsuario = UsuarioService.getService();
        this.usuariologeado = sUsuario.getUsuarioLogeado();
        this.navegacionusuariotemplate = new NavegacionUsuarioTemplate(this);
        this.vistaprincipalcomponent = vistaprincipalcomponent;
    }
    
    public Usuario getUsuario(){
        return this.usuariologeado;
    }
      
    @Override
    public void actionPerformed(ActionEvent e) {
        vistaprincipalcomponent.mostrarComponentes(e.getActionCommand().trim());
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        JButton boton = (JButton)e.getSource();
        boton.setContentAreaFilled(true);
        boton.setBackground(RecursosService.getService().getColorVerdeClaro());
    }

    @Override
    public void mouseExited(MouseEvent e) {
        JButton boton = (JButton)e.getSource();
        boton.setContentAreaFilled(false);
    }
    
    public NavegacionUsuarioTemplate getBarraNavegacionTemplate(){
        return navegacionusuariotemplate;
    }
    
    public void actualizarValores() {
        this.usuariologeado = sUsuario.getUsuarioLogeado();
        this.navegacionusuariotemplate.removeAll();
        this.navegacionusuariotemplate.crearJLabels();
        this.navegacionusuariotemplate.crearJButons();
        this.navegacionusuariotemplate.repaint();
    }
}
