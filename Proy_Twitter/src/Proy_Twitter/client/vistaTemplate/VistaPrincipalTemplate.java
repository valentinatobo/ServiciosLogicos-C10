
package Proy_Twitter.client.vistaTemplate;

import Proy_Twitter.client.components.barraTitulo.BarraTituloComponents;
import Proy_Twitter.servicies.ObjGraficosService;
import Proy_Twitter.servicies.RecursosService;
import java.awt.Color;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class VistaPrincipalTemplate extends JFrame {

    private RecursosService sRecursos;
    private ObjGraficosService sObjGraficos;
    private VistaPrincipalComponent vistaprincipalcomponent; 

    private JPanel pPrincipal, pInicio, pBuscar, pNavegacion, pBotones;
    
    public VistaPrincipalTemplate(VistaPrincipalComponent vistaprincipalcomponent) {
        
        sRecursos = RecursosService.getService();
        sObjGraficos = ObjGraficosService.getService();
        this.vistaprincipalcomponent = vistaprincipalcomponent;
        this.vistaprincipalcomponent.getClass();
        
        CrearJpanels();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1300, 750);
        setLocationRelativeTo(this);
        setLayout(null);
        setUndecorated(true);
        setVisible(true);
    }

    public void CrearJpanels(){
        
        pBotones = sObjGraficos.construirJPanel(0, 0, 1310, 37, null, null);
        this.add(getpBotones());
        pNavegacion = sObjGraficos.construirJPanel(0, 36, 280, 750, null, sRecursos.getBorderLado());
        this.add(pNavegacion);
        pInicio = sObjGraficos.construirJPanel(280, 36, 690, 170, null, sRecursos.getBorderTodos());
        this.add(pInicio);
        pPrincipal = sObjGraficos.construirJPanel(280, 207, 690, 680, null, sRecursos.getBorderAbajogris());
        this.add(pPrincipal);
        pBuscar = sObjGraficos.construirJPanel(970, 36, 330, 750, null, sRecursos.getBorderLadoD());
        this.add(pBuscar);
        
    }
    
    public JPanel getPPrincipal(){
        return pPrincipal;
    }
    public JPanel getPInicio(){
        return pInicio;
    }
    public JPanel getPNavegacion(){
        return pNavegacion;
    }
    public JPanel getPBuscar(){
        return pBuscar;
    }

    public JPanel getpBotones() {
        return pBotones;
    }
}