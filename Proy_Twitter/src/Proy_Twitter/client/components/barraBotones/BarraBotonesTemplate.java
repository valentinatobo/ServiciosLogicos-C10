/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proy_Twitter.client.components.barraBotones;

import Proy_Twitter.servicies.ObjGraficosService;
import Proy_Twitter.servicies.RecursosService;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author lenovo
 */
public class BarraBotonesTemplate extends JPanel{
    private BarraBotonesComponent barrabotonescomponent;
    private RecursosService sRecursos;
    private ObjGraficosService sObjGraficos;
    
    //Declaracion objetos decoradores
    private ImageIcon iCerrar, iMinimizar, iDimaux;

    //Declaracion de Servicios
    private JButton bCerrar, bMinimizar;

    BarraBotonesTemplate(BarraBotonesComponent barrabotonescomponent) {
        this.barrabotonescomponent = barrabotonescomponent;
        sRecursos = RecursosService.getService();
        sObjGraficos = ObjGraficosService.getService();
        this.crearObjetosDecoradores();
        this.crearJButons();
        this.addMouseListener(barrabotonescomponent);
        this.addMouseMotionListener(barrabotonescomponent);
        
        this.setSize(1310, 36);
        this.setBackground(sRecursos.getColorAzulos());
        setLayout(null);
        setVisible(true);
        
    }
    
    public void crearObjetosDecoradores() {

        iCerrar = new ImageIcon("resources/img/close.png");
        iMinimizar = new ImageIcon("resources/img/minimize.png");
    }
    
    public void crearJButons() {
        iDimaux = new ImageIcon(iCerrar.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING));
        
        bCerrar = sObjGraficos.construirJButton(
                "", 1270, 0, 30, 30, sRecursos.getcMano(), iDimaux, null,
                sRecursos.getColorAzulos(), null, null, true, "c"
        );
        bCerrar.addActionListener(barrabotonescomponent);
        
        this.add(getbCerrar());
        
        iDimaux = new ImageIcon(iMinimizar.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING));
        
        bMinimizar = sObjGraficos.construirJButton(
                "", 1230, 0, 30, 30, sRecursos.getcMano(), iDimaux, null,
                sRecursos.getColorAzulos(), null, null, true, "c"
        );
        bMinimizar.addActionListener(barrabotonescomponent);
        this.add(getbMinimizar());
    }

    /**
     * @return the bCerrar
     */
    public JButton getbCerrar() {
        return bCerrar;
    }

    /**
     * @return the bMinimizar
     */
    public JButton getbMinimizar() {
        return bMinimizar;
    }
    
    
}
