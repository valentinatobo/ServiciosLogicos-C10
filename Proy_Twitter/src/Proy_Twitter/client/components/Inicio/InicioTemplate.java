/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proy_Twitter.client.components.Inicio;

import Proy_Twitter.client.components.Tarjeta.TarjetaComponent;
import Proy_Twitter.client.components.Tarjeta.TarjetaTemplate;
import Proy_Twitter.servicies.ObjGraficosService;
import Proy_Twitter.servicies.RecursosService;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


/**
 *
 * @author lenovo
 */
public class InicioTemplate extends JPanel{

    private InicioComponent iniciocomponent;
    private RecursosService sRecursos;
    private ObjGraficosService sObjGraficos;
    
    //Declarar objetos decoradores
    private ImageIcon iFotop1, iFotop2, iFotop3, iFotop4;
    
    
    private JPanel pUno, pDos, pTres, pCuatro;
    
    public InicioTemplate(InicioComponent iniciocomponent){
        this.iniciocomponent = iniciocomponent;
        this.sRecursos = RecursosService.getService();
        this.sObjGraficos = ObjGraficosService.getService();
        
        this.CrearJpanels();
        this.crearObjetosDecoradores();
        this.crearContenidopUno();
        this.crearContenidopDos();
        this.crearContenidopTres();
        this.crearContenidopCuatro();
//        
        setSize(690, 690);
        this.setBackground(sRecursos.getColorAzulos());
        setLayout(null);
        setVisible(true);
    }
    
    public void CrearJpanels(){
        
        pUno = sObjGraficos.construirJPanel(01, 0, 690, 132, null, sRecursos.getBorderAbajodel());
        this.add(pUno);
        
        pDos = sObjGraficos.construirJPanel(01, 130, 690, 132, null, sRecursos.getBorderAbajodel());
        this.add(pDos);
        
        pTres = sObjGraficos.construirJPanel(01, 260, 690, 132, null, sRecursos.getBorderAbajodel());
        this.add(pTres);
        
        pCuatro = sObjGraficos.construirJPanel(01, 390, 690, 132, null, sRecursos.getBorderAbajodel());
        this.add(pCuatro);  
    }
    
    public void crearObjetosDecoradores() {
        
        iFotop1 = new ImageIcon("resources/img/perfiles/perfil1.png");
        iFotop2 = new ImageIcon("resources/img/perfiles/perfil2.png");
        iFotop3 = new ImageIcon("resources/img/perfiles/perfil3.png");
        iFotop4 = new ImageIcon("resources/img/perfiles/perfil4.png");
    }
    
    public void crearContenidopUno(){
        this.pUno.add(new TarjetaComponent(
                iFotop1,
                "María_ca",
                "@Maruulanda - 1h",
                "Con el tiempo los panas no son tan panas y está bien"
        ).getTarjetaTemplate());        
    }
    
     public void crearContenidopDos(){
        this.pDos.add(new TarjetaComponent(
                iFotop2,
                "David_Rk",
                "@___deeRick - 3min",
                "Que locha hacer ensayos, nunca he podido hacer una vaina decente"
        ).getTarjetaTemplate());
    }
    
    public void crearContenidopTres(){
        this.pTres.add(new TarjetaComponent(
                iFotop3,
                "DRAMAle",
                "@ValeriaFrank - 23min",
                "Ser mujer puede llegar a ser tan desgastante en una sociedad tan.."
        ).getTarjetaTemplate());
    }
    
    public void crearContenidopCuatro(){
        this.pCuatro.add(new TarjetaComponent(
                iFotop4,
                "Camila(-)",
                "@orenjyi_ - 3h",
                "Me acabo de regalar un tarot de Thoth"
        ).getTarjetaTemplate());
    }   
   
    
}
