/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proy_Twitter.client.components.barraTitulo;

import Proy_Twitter.servicies.ObjGraficosService;
import Proy_Twitter.servicies.RecursosService;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author lenovo
 */
public class BarraTituloTemplate extends JPanel {

    private BarraTituloComponents barratitulocomponent;
    private RecursosService sRecursos;
    private ObjGraficosService sObjGraficos;

    //Declaracion objetos decoradores
    private ImageIcon iEstrellas, iImagen, iGif, iTendencias, iEmojis, iCalendario, iDimaux, iPerfil;

    //Declaracion de Servicios
    private JPanel pSuperior, pTweet;
    private JButton bEstrellas, bImagen, bGif, bTendencias, bEmojis, bCalendario, bTwittear;
    private JLabel lTitulo, lFotop;
    private JTextField tTweet;

    public BarraTituloTemplate(BarraTituloComponents barratitulocomponets) {
        
        this.barratitulocomponent = barratitulocomponets;
        sRecursos = RecursosService.getService();
        sObjGraficos = ObjGraficosService.getService();
        this.CrearJpanels();
        this.crearObjetosDecoradores();
        this.crearJLabels();
        this.crearJButons();
        this.crearJTextFields();
        this.addMouseListener(barratitulocomponets);
        
        setSize(690, 170);
        this.setBackground(sRecursos.getColorAzulos());
        setLayout(null);
        setVisible(true);
    }

    public void crearObjetosDecoradores() {

        iEstrellas = new ImageIcon("resources/img/estrellas.png");
        iImagen = new ImageIcon("resources/img/foto.png");
        iGif = new ImageIcon("resources/img/Gif.png");
        iTendencias = new ImageIcon("resources/img/estadisticas.png");
        iEmojis = new ImageIcon("resources/img/emoji.png");
        iCalendario = new ImageIcon("resources/img/calendario.png");
        iPerfil = new ImageIcon("resources/img/perfiles/perfil.png");
    }
    
    public void CrearJpanels(){
        
        pSuperior = sObjGraficos.construirJPanel(0, 0, 690, 60, null, sRecursos.getBorderTodos());
        this.add(pSuperior);
        pTweet = sObjGraficos.construirJPanel(0, 60, 690, 110, null, sRecursos.getBorderTodos());
        this.add(getpTweet());
        
        
    }
    
    public void crearJButons() {
        // Creacion boton ver destacados panel superior-----------------------------------------------------------------------------------------------------------------------
        iDimaux = new ImageIcon(iEstrellas.getImage().getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING));
        
        bEstrellas = sObjGraficos.construirJButton(
                "", 655, 15, 30, 30, sRecursos.getcMano(), iDimaux, null,
                sRecursos.getColorAzulos(), null, null, true, "c"
        );
        getbEstrellas().addActionListener(barratitulocomponent);
        bEstrellas.addMouseListener(barratitulocomponent);
        pSuperior.add(getbEstrellas());
        
        //Boton añadir imagenes --------------------------------------------------------------------------------------------------------------------------------
        iDimaux = new ImageIcon(iImagen.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING));
        
        bImagen = sObjGraficos.construirJButton(
                "", 60, 75, 30, 30, sRecursos.getcMano(), iDimaux, null,
                sRecursos.getColorAzulos(), null, null, true, "c"
        );
        getbImagen().addActionListener(barratitulocomponent);
        bImagen.addMouseListener(barratitulocomponent);
        getpTweet().add(getbImagen());
        
        //Boton añadir Gif --------------------------------------------------------------------------------------------------------------------------------------
        iDimaux = new ImageIcon(iGif.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING));
        
        bGif = sObjGraficos.construirJButton(
                "", 100, 75, 30, 30, sRecursos.getcMano(), iDimaux, null,
                sRecursos.getColorAzulos(), null, null, true, "c"
        );
        getbGif().addActionListener(barratitulocomponent);
        bGif.addMouseListener(barratitulocomponent);
        getpTweet().add(getbGif());
        
        //Boton añadir tendencias--------------------------------------------------------------------------------------------------------------------------------
        iDimaux = new ImageIcon(iTendencias.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING));
        
        bTendencias = sObjGraficos.construirJButton(
                "", 140, 75, 30, 30, sRecursos.getcMano(), iDimaux, null,
                sRecursos.getColorAzulos(), null, null, true, "c"
        );
        getbTendencias().addActionListener(barratitulocomponent);
        bTendencias.addMouseListener(barratitulocomponent);
        getpTweet().add(getbTendencias());
        
        //Boton añadir emojis -----------------------------------------------------------------------------------------------------------------------------------
        iDimaux = new ImageIcon(iEmojis.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING));
        
        bEmojis = sObjGraficos.construirJButton(
                "", 180, 75, 30, 30, sRecursos.getcMano(), iDimaux, null,
                sRecursos.getColorAzulos(), null, null, true, "c"
        );
        getbEmojis().addActionListener(barratitulocomponent);
        bEmojis.addMouseListener(barratitulocomponent);
        getpTweet().add(getbEmojis());
        
        //Boton añadir Calendario---------------------------------------------------------------------------------------------------------------------------------
        iDimaux = new ImageIcon(iCalendario.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING));
        
        bCalendario = sObjGraficos.construirJButton(
                "", 220, 75, 30, 30, sRecursos.getcMano(), iDimaux, null,
                sRecursos.getColorAzulos(), null, null, true, "c"
        );
        getbCalendario().addActionListener(barratitulocomponent);
        bCalendario.addMouseListener(barratitulocomponent);
        getpTweet().add(getbCalendario());
        
        //Boton añadir tweet-------------------------------------------------------------------------------------------------------------------------------------
        bTwittear = sObjGraficos.construirJButton(
                "Twittear", 595, 65, 90, 35, sRecursos.getcMano(), null, sRecursos.getFontBotReg(),
                sRecursos.getColorVerdeClaro(), Color.WHITE, null, true, "c"
        );
        getbTwittear().addActionListener(barratitulocomponent);
        getpTweet().add(getbTwittear());
     }
     
     public void crearJLabels() {
        //Creacion label panel superior de inicio ---------------------------------------------------------------------------------------------------------------
        lTitulo = sObjGraficos.construirJLabel("Inicio", 05, 15, 60, 30, null, Color.WHITE, null, sRecursos.getFontTitulo(), null);
        pSuperior.add(lTitulo);
        
        iDimaux = new ImageIcon(barratitulocomponent.getUsuario().getImagenUs().getImage().getScaledInstance(50, 50, Image.SCALE_AREA_AVERAGING));
        
        lFotop = sObjGraficos.construirJLabel("", 05, 05, 50, 50, iDimaux, Color.WHITE, null, sRecursos.getFontTitulo(), null);
        getpTweet().add(lFotop);
        
     }

     public void crearJTextFields() {

        tTweet = sObjGraficos.construirJTextField("¿Qué está pasando?", 65, 15, 600, 35, sRecursos.getColorAzulos(),
                Color.LIGHT_GRAY, Color.GRAY, sRecursos.getFontBotTwe(),
                null, "l"
        );
        tTweet.addMouseListener(barratitulocomponent);
        getpTweet().add(gettTweet());
    }

    public JButton getbEstrellas() {
        return bEstrellas;
    }

    public JButton getbImagen() {
        return bImagen;
    }

    public JButton getbGif() {
        return bGif;
    }

    public JButton getbTendencias() {
        return bTendencias;
    }

    public JButton getbEmojis() {
        return bEmojis;
    }

    public JButton getbCalendario() {
        return bCalendario;
    }

    public JButton getbTwittear() {
        return bTwittear;
    }

    public JTextField gettTweet() {
        return tTweet;
    }

    public JPanel getpTweet() {
        return pTweet;
    }
}