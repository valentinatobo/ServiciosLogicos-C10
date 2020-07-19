
package Proy_Twitter.client.vistaTemplate;

import Proy_Twitter.client.components.Explorar.ExplorarComponent;
import Proy_Twitter.client.components.Guardados.GuardadosComponents;
import Proy_Twitter.client.components.Inicio.InicioComponent;
import Proy_Twitter.client.components.Listas.ListasComponent;
import Proy_Twitter.client.components.Mensajes.MensajesComponent;
import Proy_Twitter.client.components.Notificaciones.NotificacionesComponent;
import Proy_Twitter.client.components.Opciones.OpcionesComponent;
import Proy_Twitter.client.components.Perfil.PerfilComponent;
import Proy_Twitter.client.components.barraBotones.BarraBotonesComponent;
import Proy_Twitter.client.components.barraBuscar.BarraBuscarComponents;
import Proy_Twitter.client.components.barraNavegacion.NavegacionUsuarioComponents;
import Proy_Twitter.client.components.barraTitulo.BarraTituloComponents;
import Proy_Twitter.client.components.barraTitulo.BarraTituloTemplate;
import Proy_Twitter.client.login.LoginComponent;
import Proy_Twitter.servicies.servicesLogic.UsuarioService;
import java.awt.Frame;
import javax.swing.JOptionPane;
import models.Usuario;



/**
 *
 * @author lenovo
 */
public class VistaPrincipalComponent {
    
    //Declaracion de componentes
    private BarraTituloComponents barratitulocomponent;
    private VistaPrincipalTemplate vistaprincipaltemplate;
    private LoginComponent logincomponent;
    private NavegacionUsuarioComponents navegacionusuariocomponent;
    private BarraTituloTemplate barratitulotemplate;
    private BarraBuscarComponents barrabuscarcomponent;
    private BarraBotonesComponent barrabotonescomponent;
   
    private InicioComponent inicioComponent;
    private ExplorarComponent explorarcomponent;
    private MensajesComponent mensajescomponent;
    private NotificacionesComponent notificacionescomponent;
    private OpcionesComponent opcionescomponent;
    private PerfilComponent perfilcomponent;
    private ListasComponent listascomponent;
    private GuardadosComponents guardadoscomponent;
    private UsuarioService sUsuario;
    private Usuario usuariologeado;
    private String usuario;
   
    
    public VistaPrincipalComponent(LoginComponent logincomponent){
        this.logincomponent = logincomponent;
        sUsuario = UsuarioService.getService();
        usuariologeado = sUsuario.getUsuarioLogeado();
        this.vistaprincipaltemplate = new VistaPrincipalTemplate(this);
        this.barratitulocomponent = new BarraTituloComponents(this);
        this.navegacionusuariocomponent = new NavegacionUsuarioComponents(this);
        this.barrabuscarcomponent = new BarraBuscarComponents();
        this.barrabotonescomponent = new BarraBotonesComponent(this);
        this.inicioComponent = new InicioComponent();
        
        vistaprincipaltemplate.getPInicio().add(
                barratitulocomponent.getBarraTituloTemplate()
        );
        
        vistaprincipaltemplate.getPNavegacion().add(
                navegacionusuariocomponent.getBarraNavegacionTemplate()
        );
        
        vistaprincipaltemplate.getPBuscar().add(
                barrabuscarcomponent.getBarraBuscarTemplate()
        );
         vistaprincipaltemplate.getpBotones().add(
               barrabotonescomponent.getBarraBotonesTemplate()
        );
        
        vistaprincipaltemplate.getPPrincipal().add(inicioComponent.getInicioTemplate());
       
        
    }
    
    public VistaPrincipalTemplate getVistaPrincipalTemplate(){
        return vistaprincipaltemplate;
    }

    public void mostrarComponentes(String comando){
        vistaprincipaltemplate.getPPrincipal().removeAll();
        switch(comando){
            case "Inicio":
                vistaprincipaltemplate.getPPrincipal().add(
                        inicioComponent.getInicioTemplate()
                );
            break;            
        case "Explorar":
            if(this.explorarcomponent == null)
            this.explorarcomponent = new ExplorarComponent();
            vistaprincipaltemplate.getPPrincipal().add(
                        explorarcomponent.getExplorarTemplate()
                );
            break;
        case "Notificaciones":
            if(this.notificacionescomponent == null)
            this.notificacionescomponent = new NotificacionesComponent();
            vistaprincipaltemplate.getPPrincipal().add(
                        notificacionescomponent.getNotificacionesTemplate()
                );
            break;
        case "Mensajes":
            if(this.mensajescomponent == null)
            this.mensajescomponent = new MensajesComponent();
            vistaprincipaltemplate.getPPrincipal().add(
                        mensajescomponent.getMensajesTemplate()
                );
            break;
         case "Guardados":
             if(this.guardadoscomponent == null)
             this.guardadoscomponent = new GuardadosComponents();
             vistaprincipaltemplate.getPPrincipal().add(
                        guardadoscomponent.getGuardadosTemplate()
                );
            break;
        case "Listas":
            if(this.listascomponent == null)
                this.listascomponent = new ListasComponent();
            vistaprincipaltemplate.getPPrincipal().add(
                        listascomponent.getListasTemplate()
                );
            break;
        case "Perfil":
            if(this.perfilcomponent == null)
            this.perfilcomponent = new PerfilComponent();
            vistaprincipaltemplate.getPPrincipal().add(
                        perfilcomponent.getPerfilTemplate()
                );
            break;
        case "Opciones":
            if(this.opcionescomponent == null)
            this.opcionescomponent = new OpcionesComponent();
            vistaprincipaltemplate.getPPrincipal().add(
                        opcionescomponent.getOpcionesTemplate()
                );
            break; 
        case "Twiteear":
            mostrarTweet();
            break;
        case "@oiga_Tobo_":
            this.logincomponent.restaurarValores();
            logincomponent.getLoginTemplate().setVisible(true);
            this.vistaprincipaltemplate.setVisible(false);
            break;
        case "@sophitgoes":
            this.logincomponent.restaurarValores();
            logincomponent.getLoginTemplate().setVisible(true);
            this.vistaprincipaltemplate.setVisible(false);
            break;
        case "@LaSrtaSara":
            this.logincomponent.restaurarValores();
            logincomponent.getLoginTemplate().setVisible(true);
            this.vistaprincipaltemplate.setVisible(false);
            break;
        case "@daniiduuu":
            this.logincomponent.restaurarValores();
            logincomponent.getLoginTemplate().setVisible(true);
            this.vistaprincipaltemplate.setVisible(false);
            break;
        case "@Pierre__":
            this.logincomponent.restaurarValores();
            logincomponent.getLoginTemplate().setVisible(true);
            this.vistaprincipaltemplate.setVisible(false);
            break;
        
        }
        this.vistaprincipaltemplate.repaint();
    }
    
    public Usuario getUsuario(){
        return this.usuariologeado;
    }
    
    public void mostrarTweet(){
        String tweet = barratitulotemplate.gettTweet().getText();
        JOptionPane.showMessageDialog(null, tweet, "Advertencia", 1);
    }

    public void moverVentana(int posX, int posY){
        this.vistaprincipaltemplate.setLocation(posX, posY);    
    }

    public void minimizar(){
        this.vistaprincipaltemplate.setExtendedState(Frame.ICONIFIED);
    }
    
    public void restaurarValores(){
        this.vistaprincipaltemplate.getPPrincipal().add(inicioComponent.getInicioTemplate());
        this.barratitulocomponent.actualizarValores();
        this.navegacionusuariocomponent.actualizarValores();
        
        
    }
   
}
