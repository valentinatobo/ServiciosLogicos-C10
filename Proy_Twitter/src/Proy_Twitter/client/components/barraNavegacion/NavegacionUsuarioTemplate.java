/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proy_Twitter.client.components.barraNavegacion;

import Proy_Twitter.servicies.ObjGraficosService;
import Proy_Twitter.servicies.RecursosService;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author lenovo
 */
public class NavegacionUsuarioTemplate extends JPanel{
    
    private NavegacionUsuarioComponents navegacionusuariocomponent;
    private RecursosService sRecursos;
    private ObjGraficosService sObjGraficos;
    
    //Declaracion objetos decoradores
    private ImageIcon iLogoT, iInicio, iExplorar, iNotificaciones, iMensjaes, iGuardados, iListas, iPerfil, iOpciones, iTwitter, iIrPerfil, iDimaux;

    //Declaracion de Servicios
    private JButton bInicio, bExplorar, bNotificaciones, bMensjaes, bGuardados, bListas, bPerfil, bOpciones, bTwittear, bIrPerfil;
    
    private JLabel lLogoT;
    
    public NavegacionUsuarioTemplate(NavegacionUsuarioComponents navegacionusuariocomponets) {
        this.navegacionusuariocomponent = navegacionusuariocomponets;
        sRecursos = RecursosService.getService();
        sObjGraficos = ObjGraficosService.getService();
        
        this.crearObjetosDecoradores();
        this.crearJButons();
        this.crearJLabels();
        
        setSize(280, 750);
        this.setBackground(sRecursos.getColorAzulos());
        setLayout(null);
        setVisible(true);
    }
    
    public void crearObjetosDecoradores() {
        iLogoT = new ImageIcon("resources/img/twitter.png"); 
        iInicio = new ImageIcon("resources/img/browser.png");
        iExplorar = new ImageIcon("resources/img/search.png");
        iNotificaciones = new ImageIcon("resources/img/notification.png");
        iMensjaes = new ImageIcon("resources/img/mail.png");
        iGuardados = new ImageIcon("resources/img/files-and-folders.png");
        iListas = new ImageIcon("resources/img/list.png");
        iPerfil = new ImageIcon("resources/img/user.png");
        iOpciones = new ImageIcon("resources/img/opciones.png");      
    }
     
    public void crearJLabels() {
        iDimaux = new ImageIcon(iLogoT.getImage().getScaledInstance(35, 35, Image.SCALE_AREA_AVERAGING));
         
        lLogoT = sObjGraficos.construirJLabel("", 05, 05, 40, 40, iDimaux, Color.WHITE, null, sRecursos.getFontTitulo(), null);
        this.add(lLogoT);
     }
    
    public void crearJButons() {
        //Boton ir a inicio---------------------------------------------------------------------------------------------------------------------------------------
        iDimaux = new ImageIcon(iInicio.getImage().getScaledInstance(35, 35, Image.SCALE_AREA_AVERAGING));
        
        bInicio = sObjGraficos.construirJButton(
                "   Inicio", 10, 65, 200, 45, sRecursos.getcMano(), iDimaux, sRecursos.getFontBotNavegador(),
                sRecursos.getColorAzulos(), Color.WHITE, null, true, "l"
        );
        getbInicio().addActionListener(navegacionusuariocomponent);
        getbInicio().addMouseListener(navegacionusuariocomponent);
        this.add(getbInicio());
        
        //Boton ir a explorar--------------------------------------------------------------------------------------------------------------------------------------
        iDimaux = new ImageIcon(iExplorar.getImage().getScaledInstance(35, 35, Image.SCALE_AREA_AVERAGING));
        
        bExplorar = sObjGraficos.construirJButton(
                "   Explorar", 10, 125, 200, 45, sRecursos.getcMano(), iDimaux, sRecursos.getFontBotNavegador(),
                sRecursos.getColorAzulos(), Color.WHITE, null, true, "l"
        );
        getbExplorar().addActionListener(navegacionusuariocomponent);
        getbExplorar().addMouseListener(navegacionusuariocomponent);
        this.add(getbExplorar());
        
        //Boton ir a notificaciones--------------------------------------------------------------------------------------------------------------------------------
        iDimaux = new ImageIcon(iNotificaciones.getImage().getScaledInstance(35, 35, Image.SCALE_AREA_AVERAGING));
        
        bNotificaciones = sObjGraficos.construirJButton(
                "   Notificaciones", 10, 185, 300, 45, sRecursos.getcMano(), iDimaux, sRecursos.getFontBotNavegador(),
                sRecursos.getColorAzulos(), Color.WHITE, null, true, "l"
        );
        getbNotificaciones().addActionListener(navegacionusuariocomponent);
        getbNotificaciones().addMouseListener(navegacionusuariocomponent);
        this.add(getbNotificaciones());
        
        //Boton ir a mensajes--------------------------------------------------------------------------------------------------------------------------------------
        iDimaux = new ImageIcon(iMensjaes.getImage().getScaledInstance(35, 35, Image.SCALE_AREA_AVERAGING));
        
        bMensjaes = sObjGraficos.construirJButton(
                "   Mensajes", 10, 235, 200, 45, sRecursos.getcMano(), iDimaux, sRecursos.getFontBotNavegador(),
                sRecursos.getColorAzulos(), Color.WHITE, null, true, "l"
        );
        getbMensjaes().addActionListener(navegacionusuariocomponent);
        getbMensjaes().addMouseListener(navegacionusuariocomponent);
        this.add(getbMensjaes());
        
        //Boton ir a guardados--------------------------------------------------------------------------------------------------------------------------------------
        iDimaux = new ImageIcon(iGuardados.getImage().getScaledInstance(35, 35, Image.SCALE_AREA_AVERAGING));
        
        bGuardados = sObjGraficos.construirJButton(
                "   Guardados", 10, 285, 300, 45, sRecursos.getcMano(), iDimaux, sRecursos.getFontBotNavegador(),
                sRecursos.getColorAzulos(), Color.WHITE, null, true, "l"
        );
        getbGuardados().addActionListener(navegacionusuariocomponent);
        getbGuardados().addMouseListener(navegacionusuariocomponent);
        this.add(getbGuardados());
        
        //Boton ir a listas-----------------------------------------------------------------------------------------------------------------------------------------
        iDimaux = new ImageIcon(iListas.getImage().getScaledInstance(35, 35, Image.SCALE_AREA_AVERAGING));
        
        bListas = sObjGraficos.construirJButton(
                "   Listas", 10, 335, 200, 45, sRecursos.getcMano(), iDimaux, sRecursos.getFontBotNavegador(),
                sRecursos.getColorAzulos(), Color.WHITE, null, true, "l"
        );
        getbListas().addActionListener(navegacionusuariocomponent);
        getbListas().addMouseListener(navegacionusuariocomponent);
        this.add(getbListas());
        
        //Boton ir a perfil-----------------------------------------------------------------------------------------------------------------------------------------
        iDimaux = new ImageIcon(iPerfil.getImage().getScaledInstance(35, 35, Image.SCALE_AREA_AVERAGING));
        
        bPerfil = sObjGraficos.construirJButton(
                "   Perfil", 10, 385, 200, 45, sRecursos.getcMano(), iDimaux, sRecursos.getFontBotNavegador(),
                sRecursos.getColorAzulos(), Color.WHITE, null, true, "l"
        );
        getbPerfil().addActionListener(navegacionusuariocomponent);
        getbPerfil().addMouseListener(navegacionusuariocomponent);
        this.add(getbPerfil());
        
        //Boton ir a mas opciones-----------------------------------------------------------------------------------------------------------------------------------
        iDimaux = new ImageIcon(iOpciones.getImage().getScaledInstance(35, 35, Image.SCALE_AREA_AVERAGING));
        
        bOpciones = sObjGraficos.construirJButton(
                "   Opciones", 10, 435, 200, 45, sRecursos.getcMano(), iDimaux, sRecursos.getFontBotNavegador(),
                sRecursos.getColorAzulos(), Color.WHITE, null, true, "l"
        );
        getbOpciones().addActionListener(navegacionusuariocomponent);
        getbOpciones().addMouseListener(navegacionusuariocomponent);
        this.add(getbOpciones());
        
        //Boton hacer tweet-----------------------------------------------------------------------------------------------------------------------------------------
        
        bTwittear = sObjGraficos.construirJButton(
                "Twittear", 10, 525, 230, 45, sRecursos.getcMano(), null, sRecursos.getFontBotNavegador(),
                sRecursos.getColorVerdeClaro(), Color.WHITE, null, true, "c"
        );
        getbTwittear().addActionListener(navegacionusuariocomponent);
        this.add(getbTwittear());
        
        //Boton ir a perfil--------------------------------------------------------------------------------------------------------------------------------------
        iDimaux = new ImageIcon(navegacionusuariocomponent.getUsuario().getImagenUs().getImage().getScaledInstance(45, 45, Image.SCALE_AREA_AVERAGING));
        
        bIrPerfil = sObjGraficos.construirJButton(
                "   "+ navegacionusuariocomponent.getUsuario().getApodoUs() , 15, 650, 200, 45, sRecursos.getcMano(), iDimaux, sRecursos.getFontBotReg(),
                sRecursos.getColorAzulos(), Color.WHITE, null, true, "l"
        );
        getbIrPerfil().addActionListener(navegacionusuariocomponent);
        getbIrPerfil().addMouseListener(navegacionusuariocomponent);
        this.add(getbIrPerfil()); 
     }

    public JButton getbInicio() {
        return bInicio;
    }

    public JButton getbExplorar() {
        return bExplorar;
    }

    public JButton getbNotificaciones() {
        return bNotificaciones;
    }

    public JButton getbMensjaes() {
        return bMensjaes;
    }

    public JButton getbGuardados() {
        return bGuardados;
    }

    public JButton getbListas() {
        return bListas;
    }

    public JButton getbPerfil() {
        return bPerfil;
    }

    public JButton getbOpciones() {
        return bOpciones;
    }

    public JButton getbTwittear() {
        return bTwittear;
    }

    public JButton getbIrPerfil() {
        return bIrPerfil;
    }
   
}
