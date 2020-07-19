
package Proy_Twitter.client.components.barraBotones;


import Proy_Twitter.client.vistaTemplate.VistaPrincipalComponent;
import Proy_Twitter.servicies.RecursosService;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;

/**
 *
 * @author lenovo
 */
public class BarraBotonesComponent implements ActionListener, MouseListener, MouseMotionListener{
    private BarraBotonesTemplate barrabotonestemplate;
    private VistaPrincipalComponent vistaprincipalcomponent;
    private int posIniX, posIniY;
    
    public BarraBotonesComponent(VistaPrincipalComponent vistaprincipalcomponent){
        barrabotonestemplate = new BarraBotonesTemplate(this);
        vistaprincipalcomponent = vistaprincipalcomponent;
    }

    public BarraBotonesTemplate getBarraBotonesTemplate(){
        return barrabotonestemplate;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == barrabotonestemplate.getbMinimizar())
            vistaprincipalcomponent.minimizar();
        if(e.getSource() == barrabotonestemplate.getbCerrar())
            System.exit(0);
    }
    public void mouseClicked(MouseEvent e) {       
    }

    @Override
    public void mousePressed(MouseEvent e) {
       this.posIniX = e.getX();
       this.posIniY = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {    
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }
    
    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        this.vistaprincipalcomponent.moverVentana(
            e.getXOnScreen() - posIniX, e.getYOnScreen() - posIniY
        );
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }
}
