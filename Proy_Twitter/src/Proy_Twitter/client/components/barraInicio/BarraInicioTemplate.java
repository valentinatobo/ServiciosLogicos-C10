package Proy_Twitter.client.components.barraInicio;
import Proy_Twitter.servicies.ObjGraficosService;
import Proy_Twitter.servicies.RecursosService;
import javax.swing.JPanel;

/**
 *
 * @author lenovo
 */
public class BarraInicioTemplate extends JPanel{
    
    private BarraInicioComponents barrainiciocomponent;
    private RecursosService sRecursos;
    private ObjGraficosService sObjGraficos;
    
    public BarraInicioTemplate(BarraInicioComponents barrainiciocomponets) {
        this.barrainiciocomponent = barrainiciocomponets;
        this.sRecursos = RecursosService.getService();
        this.sObjGraficos = ObjGraficosService.getService();
        
        
    }
    
}
