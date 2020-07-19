package Proy_Twitter.client.login;

import Proy_Twitter.client.vistaTemplate.VistaPrincipalComponent;
import Proy_Twitter.servicies.RecursosService;
import Proy_Twitter.servicies.servicesLogic.UsuarioService;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
public class LoginComponent implements ActionListener, MouseListener {

    private LoginTemplate logintemplate;
    private VistaPrincipalComponent vistaPrincipal;
    private UsuarioService sUsuario;

    public LoginComponent() {
        sUsuario = UsuarioService.getService();
        this.logintemplate = new LoginTemplate(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //JOptionPane.showMessageDialog(null, "Oprimido" , "Advertencia", 1);
        if (e.getActionCommand() == "Iniciar sesión") {
            this.enviarDatosUsuario();
        }
        if (e.getActionCommand() == "Registrate") {
            JOptionPane.showMessageDialog(null, "Oprimió botón registrarse", "Advertencia", 1);
        }
        if (e.getActionCommand() == "¿Olvidaste tu contraseña?") {
            JOptionPane.showMessageDialog(null, "Oprimió botón recuperar contraseña", "Advertencia", 1);
        }
        if (e.getSource() == logintemplate.getBVerContraseña()) {
            JOptionPane.showMessageDialog(null, "Oprimido botón ver contraseña", "Advertencia", 1);
        }
        if (e.getSource() == logintemplate.getBVerMas()) {
            JOptionPane.showMessageDialog(null, "Oprimido botón ver mas", "Advertencia", 1);
        }
    }

    public void enviarDatosUsuario() {
        String nomUsuario = logintemplate.getNombre().getText();
        String claveUsuario = new String(logintemplate.getContraseña().getPassword());
        if (sUsuario.verificarUsuario(nomUsuario, claveUsuario)) {
            JOptionPane.showMessageDialog(null, nomUsuario + " has ingresado exitosamente", "Advertencia", 1);
            entrar();
        } else {
            JOptionPane.showMessageDialog(null, "Ups la información no coincide", "Error", 1);
        }
    }

    public void entrar() {
        if (vistaPrincipal == null) 
            this.vistaPrincipal = new VistaPrincipalComponent(this);
         else {
            this.vistaPrincipal.restaurarValores();
            this.vistaPrincipal.getVistaPrincipalTemplate().setVisible(true); 
        }
        logintemplate.setVisible(false);
    }

    public LoginTemplate getLoginTemplate() {
        return logintemplate;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == logintemplate.gettNombreus()) {
            if (new String(logintemplate.gettNombreus().getText()).equals("@ejemplo")) {
                logintemplate.gettNombreus().setText("");
                logintemplate.gettNombreus().setForeground(Color.LIGHT_GRAY);
                logintemplate.gettNombreus().setBorder(RecursosService.getService().getBorderAbajo());
            }
            if (new String(logintemplate.gettClaveus().getPassword()).equals("")) {
                logintemplate.gettClaveus().setText("ejemplo");
                logintemplate.gettClaveus().setForeground(Color.WHITE);
                logintemplate.gettClaveus().setBorder(RecursosService.getService().getBorderAbajogris());
            }
        }
        if (e.getSource() == logintemplate.gettClaveus()) {
            if (new String(logintemplate.gettClaveus().getPassword()).equals("ejemplo")) {
                logintemplate.gettClaveus().setText("");
                logintemplate.gettClaveus().setForeground(RecursosService.getService().getColorAzulcielo());
                logintemplate.gettClaveus().setBorder(RecursosService.getService().getBorderAbajo());
            }
            if (new String(logintemplate.gettNombreus().getText()).equals("")) {
                logintemplate.gettNombreus().setText("@ejemplo");
                logintemplate.gettNombreus().setForeground(Color.GRAY);
                logintemplate.gettNombreus().setBorder(RecursosService.getService().getBorderAbajogris());
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() instanceof JButton) {
            JButton boton = (JButton) e.getSource();
            boton.setContentAreaFilled(true);
            boton.setBackground(RecursosService.getService().getColorAzulcielo());
        }
        if (e.getSource() instanceof JLabel) {
            JLabel label = (JLabel) e.getSource();
            label.setForeground(RecursosService.getService().getColorAzulcielo());
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() instanceof JButton) {
            JButton boton = (JButton) e.getSource();
            boton.setContentAreaFilled(false);
        }
        if (e.getSource() instanceof JLabel) {
            JLabel label = (JLabel) e.getSource();
            label.setForeground(Color.LIGHT_GRAY);
        }
    }
    
    public void restaurarValores(){
    this.getLoginTemplate().gettNombreus().setText("@ejemplo");
        this.getLoginTemplate().gettNombreus().setBorder(
            this.getLoginTemplate().getRecursosService().getBorderAbajogris()
        );
        this.getLoginTemplate().gettNombreus().setForeground(
            Color.DARK_GRAY
        );
        this.getLoginTemplate().gettClaveus().setText("ejemplo");
        this.getLoginTemplate().gettClaveus().setBorder(
            this.getLoginTemplate().getRecursosService().getBorderAbajogris()
        );
        this.getLoginTemplate().gettClaveus().setForeground(
            Color.WHITE
        );
    }

}
