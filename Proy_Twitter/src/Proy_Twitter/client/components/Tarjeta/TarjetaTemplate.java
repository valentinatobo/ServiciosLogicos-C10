/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proy_Twitter.client.components.Tarjeta;

import Proy_Twitter.servicies.ObjGraficosService;
import Proy_Twitter.servicies.RecursosService;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author lenovo
 */
public class TarjetaTemplate extends JPanel {

    //Declaracion objetos decoradores
    private ImageIcon iResponder, iRetweet, iLike, iCompartir, iMas, iDimaux;

    //Declaración objetos Graficos
    private JButton bResponder, bRetweet, bLike, bCompartir, bMas;
    private JLabel lFotop, lNombre, lArroba, lTiempo, lTweet;

    //Declaraión de Servicios
    private TarjetaComponent tarjetacomponent;
    private RecursosService sRecursos;
    private ObjGraficosService sObjGraficos;

    public TarjetaTemplate(TarjetaComponent tarjetacomponent,ImageIcon imagenp, String Nombre, String Alias, String Tweet) {
        this.tarjetacomponent = tarjetacomponent;
        this.sRecursos = RecursosService.getService();
        this.sObjGraficos = ObjGraficosService.getService();

        this.crearObjetosDecoradores();
        this.crearJButons();
        
        iDimaux = new ImageIcon(imagenp.getImage().getScaledInstance(60, 60, Image.SCALE_AREA_AVERAGING));
        
        lFotop = sObjGraficos.construirJLabel("", 15, 15, 60, 60, iDimaux, Color.WHITE, null, sRecursos.getFontTitulo(), null);
        this.add(lFotop);
        
        lNombre = sObjGraficos.construirJLabel(Nombre, 80, 16, 100, 20,null, Color.WHITE, null, sRecursos.getFontLabeltweetn(), null);
        this.add(lNombre);
        
        lArroba = sObjGraficos.construirJLabel(Alias, 160, 15, 200, 20, null, Color.LIGHT_GRAY, null, sRecursos.getFontLabeltweet(), null);
        this.add(lArroba);
        
        lTweet = sObjGraficos.construirJLabel(Tweet, 80, 40, 600, 23, null, Color.WHITE, null, sRecursos.getFontTweet(), null);
        this.add(lTweet);
        
        setSize(680, 130);
        this.setBackground(sRecursos.getColorAzulos());
        setLayout(null);
        setVisible(true);
    }
    public void crearObjetosDecoradores() {

        iResponder = new ImageIcon("resources/img/responder.png");
        iRetweet = new ImageIcon("resources/img/retweet.png");
        iLike = new ImageIcon("resources/img/gustar.png");
        iCompartir = new ImageIcon("resources/img/compartir.png");
        iMas = new ImageIcon("resources/img/vermas.png");
    }
    
    public void crearJButons() {

        //Boton responder Tweet --------------------------------------------------------------------------------------------------------------------------------
        iDimaux = new ImageIcon(iResponder.getImage().getScaledInstance(20, 20, Image.SCALE_AREA_AVERAGING));

        bResponder = sObjGraficos.construirJButton(
                "", 80, 95, 30, 30, sRecursos.getcMano(), iDimaux, null,
                sRecursos.getColorAzulos(), null, null, true, "c"
        );
       // getbImagen().addActionListener(barratitulocomponent);
        this.add(bResponder);

        //Boton hacer retweet--------------------------------------------------------------------------------------------------------------------------------------
        iDimaux = new ImageIcon(iRetweet.getImage().getScaledInstance(20, 20, Image.SCALE_AREA_AVERAGING));

        bRetweet = sObjGraficos.construirJButton(
                "", 220, 95, 30, 30, sRecursos.getcMano(), iDimaux, null,
                sRecursos.getColorAzulos(), null, null, true, "c"
        );
        //getbGif().addActionListener(barratitulocomponent);
        this.add(bRetweet);

        //Boton dar me gusta------------------------------------------------------------------------------------------------------------------------------------
        iDimaux = new ImageIcon(iLike.getImage().getScaledInstance(20, 20, Image.SCALE_AREA_AVERAGING));

        bLike = sObjGraficos.construirJButton(
                "", 380, 95, 30, 30, sRecursos.getcMano(), iDimaux, null,
                sRecursos.getColorAzulos(), null, null, true, "c"
        );
        //getbTendencias().addActionListener(barratitulocomponent);
        this.add(bLike);

        //Boton compartir tweet -----------------------------------------------------------------------------------------------------------------------------------
        iDimaux = new ImageIcon(iCompartir.getImage().getScaledInstance(20, 20, Image.SCALE_AREA_AVERAGING));

        bCompartir = sObjGraficos.construirJButton(
                "", 540, 95, 30, 30, sRecursos.getcMano(), iDimaux, null,
                sRecursos.getColorAzulos(), null, null, true, "c"
        );
        //getbEmojis().addActionListener(barratitulocomponent);
        this.add(bCompartir);

        //Boton ver mas------------------------------------------------------------------------------------------------------------------------------------------
        iDimaux = new ImageIcon(iMas.getImage().getScaledInstance(20, 20, Image.SCALE_AREA_AVERAGING));

        bMas = sObjGraficos.construirJButton(
                "", 660, 10, 20, 20, sRecursos.getcMano(), iDimaux, null,
                sRecursos.getColorAzulos(), null, null, true, "c"
        );
        //getbCalendario().addActionListener(barratitulocomponent);
        this.add(bMas);

    }
    
    
}
