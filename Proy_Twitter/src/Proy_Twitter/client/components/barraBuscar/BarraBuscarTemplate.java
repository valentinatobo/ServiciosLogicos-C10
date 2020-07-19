
package Proy_Twitter.client.components.barraBuscar;

import Proy_Twitter.servicies.ObjGraficosService;
import Proy_Twitter.servicies.RecursosService;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author lenovo
 */
public class BarraBuscarTemplate extends JPanel{
    
    private BarraBuscarComponents barrabuscarcomponent;
    private RecursosService sRecursos;
    private ObjGraficosService sObjGraficos;
    
    //Declaracion objetos decoradores
    private ImageIcon iLupa, iSeguir, iTendencias, iDimaux;
    
    private JTextField tBuscar;
    private JLabel lTendencia, lSeguir;
    private JButton bLupa;
    
    public BarraBuscarTemplate(BarraBuscarComponents barrabuscarcomponets) {
        this.barrabuscarcomponent = barrabuscarcomponets;
        sRecursos = RecursosService.getService();
        sObjGraficos = ObjGraficosService.getService();
        
        this.crearObjetosDecoradores();
        this.crearJButons();
        this.crearJLabels();
        this.crearJTextFields();
        
        setSize(330, 750);
        this.setBackground(sRecursos.getColorAzulos());
        setLayout(null);
        setVisible(true);
    }
    
    
    public void crearObjetosDecoradores() {

        iLupa = new ImageIcon("resources/img/search.png");
        iTendencias = new ImageIcon("resources/img/tendencias.png");
        iSeguir = new ImageIcon("resources/img/seguir.png");        
    }
    
    public void crearJLabels() {
        //Creacion label panel superior de inicio ---------------------------------------------------------------------------------------------------------------
        iDimaux = new ImageIcon(iTendencias.getImage().getScaledInstance(300, 350, Image.SCALE_AREA_AVERAGING));
        lTendencia = sObjGraficos.construirJLabel("", 10, 50, 300, 350, iDimaux, Color.WHITE, null, sRecursos.getFontTitulo(), null);
        this.add(lTendencia);
        
        iDimaux = new ImageIcon(iSeguir.getImage().getScaledInstance(300, 300, Image.SCALE_AREA_AVERAGING));
        
        lSeguir = sObjGraficos.construirJLabel("", 10, 400, 300, 300, iDimaux, Color.WHITE, null, sRecursos.getFontTitulo(), null);
        this.add(lSeguir);
        
     }

     public void crearJTextFields() {

        tBuscar = sObjGraficos.construirJTextField("   Buscar en Twitter", 50, 05, 250, 40, sRecursos.getColorAzulGris(),
                Color.LIGHT_GRAY, Color.GRAY, sRecursos.getFontBotReg(),
                null, "l"
        );
        this.add(tBuscar);
    }
    
     public void crearJButons() {
        iDimaux = new ImageIcon(iLupa.getImage().getScaledInstance(18, 18, Image.SCALE_AREA_AVERAGING));

        bLupa = sObjGraficos.construirJButton(
                "", 13, 05, 40, 40, sRecursos.getcMano(), iDimaux, null,
                sRecursos.getColorAzulGris(), null, null, true, "c"
        );
       // getbEstrellas().addActionListener(barratitulocomponent);
        this.add(getbLupa());
     }

    public JButton getbLupa() {
        return bLupa;
    }
}
