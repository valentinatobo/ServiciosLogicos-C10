/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proy_Twitter.client.components.barraTitulo;

import Proy_Twitter.client.vistaTemplate.VistaPrincipalComponent;
import Proy_Twitter.servicies.RecursosService;
import Proy_Twitter.servicies.servicesLogic.UsuarioService;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import models.Usuario;

/**
 *
 * @author lenovo
 */
public class BarraTituloComponents implements ActionListener, MouseListener{
    
    private BarraTituloTemplate barratitulotemplate;
    private VistaPrincipalComponent vistaprincipalcomponent;
    private UsuarioService sUsuario;
    private Usuario usuariologeado;
    private int posIniX, posIniY;
    
    public BarraTituloComponents(VistaPrincipalComponent vistaprincipalcomponent){
        sUsuario = UsuarioService.getService();
        usuariologeado = sUsuario.getUsuarioLogeado();
        barratitulotemplate = new BarraTituloTemplate(this);
        vistaprincipalcomponent = vistaprincipalcomponent;
    }
    
    public Usuario getUsuario(){
        return this.usuariologeado;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == barratitulotemplate.getbEstrellas()){
        JOptionPane.showMessageDialog(null, "Te muestra los tweets destacados" , "Inicio", 1);
        }
        if(e.getSource() == barratitulotemplate.getbImagen()){
        JOptionPane.showMessageDialog(null, "Te muestra la carpeta para agregar imagenes" , "Crear Tweet", 1);
        }
        if(e.getSource() == barratitulotemplate.getbGif()){
        JOptionPane.showMessageDialog(null, "Te muestra los gif que puedes agregar" , "Crear Tweet", 1);
        }
        if(e.getSource() == barratitulotemplate.getbTendencias()){
        JOptionPane.showMessageDialog(null, "Te permite crear un tweet con una encuesta" , "Crear Tweet", 1);
        }
        if(e.getSource() == barratitulotemplate.getbEmojis()){
        JOptionPane.showMessageDialog(null, "Te muestra los emojis que puedes agregar" , "Crear Tweet", 1);
        }
        if(e.getSource() == barratitulotemplate.getbCalendario()){
        JOptionPane.showMessageDialog(null, "Te permite programar la pulicación de un tweet" , "Crear Tweet", 1);
        }
        if(e.getSource() == barratitulotemplate.getbTwittear()){
        mostrarTweet();
        }
    }
    
    public void mostrarTweet(){
        String tweet = barratitulotemplate.gettTweet().getText();
        JOptionPane.showMessageDialog(null, tweet, "Advertencia", 1);
    }
    public BarraTituloTemplate getBarraTituloTemplate(){
        return barratitulotemplate;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == barratitulotemplate.gettTweet()){
            if (barratitulotemplate.gettTweet().getText().equals("¿Qué está pasando?")){
            barratitulotemplate.gettTweet().setText("");
            }
        }
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
       this.posIniX = e.getX() + 280;
       this.posIniY = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() instanceof JButton){
            JButton boton = (JButton)e.getSource();
            boton.setContentAreaFilled(true);
            boton.setBackground(RecursosService.getService().getColorVerdeClaro());
        }
    }
    
    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() instanceof JButton){
            JButton boton = (JButton)e.getSource();
            boton.setContentAreaFilled(false);
        }
    }
    public void actualizarValores() {
        
        this.usuariologeado = sUsuario.getUsuarioLogeado();
        this.barratitulotemplate.getpTweet().removeAll();
        this.barratitulotemplate.crearJLabels();
        this.barratitulotemplate.crearJButons();
        this.barratitulotemplate.crearJTextFields();
        this.barratitulotemplate.repaint();
    }
    
    
}
