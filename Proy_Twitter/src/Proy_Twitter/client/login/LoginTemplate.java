package Proy_Twitter.client.login;

import Proy_Twitter.servicies.ObjGraficosService;
import Proy_Twitter.servicies.RecursosService;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

/**
 *
 * @author Admin
 */
public class LoginTemplate extends JFrame {

    private static final long serialVersionUID = 7215779126893195799L;

    //Declaracion objetos decoradores
    private ImageIcon iLogo, iPunto, iContraseña, iDimaux;

    //Declaración objetos Graficos
    private JPanel pArriba, pAbajo, pMedio;
    private JTextField tNombreus;
    private JPasswordField tClaveus;
    private JButton bEntrar, bContraseña, bRegistrarse, bICon, bPuntos;
    private JLabel lTitulo, ltituloentrada, ltitulocontraseña, lLogo;

    //Declaraión de Servicios
    private ObjGraficosService sObjGraficos;
    private RecursosService sRecursos;
    private LoginComponent logincomponent;

    public LoginTemplate(LoginComponent logincomponent) {

        this.logincomponent = logincomponent;
        sObjGraficos = ObjGraficosService.getService();
        sRecursos = RecursosService.getService();
        
        
        this.crearObjetosDecoradores();
        this.crearJPanels();
        this.crearJLabels();
        this.crearJButons();
        this.crearJPaswordFields();
        this.crearJTextFields();
        
        this.setSize(350, 460);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setUndecorated(true);
        this.setVisible(true);
    }

    public void crearObjetosDecoradores() {

        iLogo = new ImageIcon("resources/img/icons8-twitter-48.png");
        iPunto = new ImageIcon("resources/img/icons8-más-96.png");
        iContraseña = new ImageIcon("resources/img/icons8-visible-50.png");
    }

    public void crearJPanels() {
        pArriba = sObjGraficos.construirJPanel(0, 0, 350, 50, sRecursos.getColorAzulClaro(), null);
        this.add(pArriba);

        pMedio = sObjGraficos.construirJPanel(0, 50, 350, 349, new Color(26, 38, 55), null);
        this.add(pMedio);

        pAbajo = sObjGraficos.construirJPanel(0, 400, 350, 60, new Color(26, 38, 55), null);
        this.add(pAbajo);
    }

    
    public void crearJTextFields() {

        tNombreus = sObjGraficos.construirJTextField("@ejemplo", 10, 96, 300, 35, sRecursos.getColorAzulos(),
                Color.DARK_GRAY, Color.GRAY, null,
                sRecursos.getBorderAbajogris(), "c"
        );
        gettNombreus().addMouseListener(logincomponent);
        pMedio.add(gettNombreus());
    }
    
    public void crearJButons() {
        
        
        //Boton Registrarse -------------------------------------------------------------------------------------------------------------------------------
        bRegistrarse = sObjGraficos.construirJButton(
                "Registrate", 228, 15, 90, 24, sRecursos.getcMano(), null, sRecursos.getFontBotReg(),
                sRecursos.getColorAzulClaro(), sRecursos.getColorAzulcielo(), null, true, "l"
        );
        bRegistrarse.addActionListener(logincomponent);
        pArriba.add(bRegistrarse);

        //Boton icono de mas -------------------------------------------------------------------------------------------------------------------------------
        iDimaux = new ImageIcon(iPunto.getImage().getScaledInstance(25, 30, Image.SCALE_AREA_AVERAGING));
        bPuntos = sObjGraficos.construirJButton(
                "", 317, 10, 15, 30, sRecursos.getcMano(), iDimaux, sRecursos.getFontBotReg(),
                sRecursos.getColorAzulClaro(), null, null, true, "l"
        );
        bPuntos.addActionListener(logincomponent);
        pArriba.add(bPuntos);

        //Boton Contraseña -------------------------------------------------------------------------------------------------------------------------------
        bContraseña = sObjGraficos.construirJButton("¿Olvidaste tu contraseña?", 53, 295, 220, 45, sRecursos.getcMano(), null, sRecursos.getFontTitulos(),
                sRecursos.getColorAzulos(), Color.GRAY, null, true, "c");
        bContraseña.addMouseListener(logincomponent);
        bContraseña.addActionListener(logincomponent);
        pMedio.add(bContraseña);

        //Boton Icono contraseña --------------------------------------------------------------------------------------------------------------------------
        iDimaux = new ImageIcon(iContraseña.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING));

        bICon = sObjGraficos.construirJButton(
                "", 313, 174, 25, 25, sRecursos.getcMano(), iDimaux, sRecursos.getFontBotReg(),
                sRecursos.getColorAzulos(), null, null, true, "l"
        );
        bICon.addActionListener(logincomponent);
        bICon.addMouseListener(logincomponent);
        pMedio.add(bICon);

        //Boton de entrar ---------------------------------------------------------------------------------------------------------------------------------
        bEntrar = sObjGraficos.construirJButton(
                "Iniciar sesión", 208, 10, 120, 35, sRecursos.getcMano(), null, sRecursos.getFontBotReg(),
                sRecursos.getColorAzulcielo(), Color.WHITE, null, true, "c"
        );
        bEntrar.addActionListener(logincomponent);
        pAbajo.add(bEntrar);
    }

    public void crearJLabels() {

        //Label logo de twitter---------------------------------------------------------------------------------------------------------------------------
        iDimaux = new ImageIcon(iLogo.getImage().getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING));
        lLogo = sObjGraficos.construirJLabel("", 150, 07, 40, 40, iDimaux, null, null, null, null);
        pArriba.add(lLogo);
        
        //Label titulo incio -----------------------------------------------------------------------------------------------------------------------------
        lTitulo = sObjGraficos.construirJLabel("Iniciar Sesión en Twitter.", 10, 07, 300, 20, null, Color.WHITE, null, sRecursos.getFontTitulo(), null);
        pMedio.add(lTitulo);

        //Label titulo de correo o nombre de ususario ----------------------------------------------------------------------------------------------------
        ltituloentrada = sObjGraficos.construirJLabel("Telefono, correo o usuario", 10, 75, 200, 15, null, Color.LIGHT_GRAY, null,
                sRecursos.getFontTitulos(), null
        );
        ltituloentrada.addMouseListener(logincomponent);
        pMedio.add(ltituloentrada);

        //Label titulo de la contraseña ------------------------------------------------------------------------------------------------------------------
        ltitulocontraseña = sObjGraficos.construirJLabel("Contraseña", 10, 145, 100, 15, null, Color.lightGray, null, sRecursos.getFontTitulos(), null);
        ltitulocontraseña.addMouseListener(logincomponent);
        pMedio.add(ltitulocontraseña);

    }
    
    public void crearJPaswordFields() {

        tClaveus = sObjGraficos.construirJPasswordField("ejemplo", 10, 166, 300, 35, sRecursos.getColorAzulos(), Color.WHITE, sRecursos.getColorAzulcielo(),
                null, sRecursos.getBorderAbajogris(), "c"
        );
        gettClaveus().addMouseListener(logincomponent);
        pMedio.add(gettClaveus());

    }
    
    public JButton getBEntrar(){
        return bEntrar;
    }
    
    public JButton getBRegistrarse(){
        return bRegistrarse;
    }
    
    public JButton getBContraseña(){
        return bContraseña;
    }
    
    public JButton getEntrar(){
        return bEntrar;
    }
    
    public JButton getBVerContraseña(){
        return bICon;
    }
    
    public JButton getBVerMas(){
        return bPuntos;
    }

    public JTextField getNombre(){
        return gettNombreus();
    }
    
    public JPasswordField getContraseña(){
        return gettClaveus();
    }

    public JTextField gettNombreus() {
        return tNombreus;
    }

    public JPasswordField gettClaveus() {
        return tClaveus;
    }
    public RecursosService getRecursosService(){
        return sRecursos;
    }
}
