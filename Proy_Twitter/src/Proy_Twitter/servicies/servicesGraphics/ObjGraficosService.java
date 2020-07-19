/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proy_Twitter.servicies;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import javax.swing.ImageIcon;
import java.awt.Cursor;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

/**
 *
 * @author Admin
 */
public class ObjGraficosService {

    //Declaracion objetos decoradores
    private JPanel panel;
    private JButton boton;
    private JLabel label;
    private JTextField textField;
    private JPasswordField passwordField;

    static private ObjGraficosService servicio;

    public ObjGraficosService() {
    }

    
    public JPanel construirJPanel(int x, int y, int ancho, int alto, Color colorFondo, Border border) {
        panel = new JPanel();
        panel.setSize(ancho, alto);
        panel.setLocation(x, y);
        panel.setLayout(null);
        panel.setBackground(colorFondo);
        panel.setBorder(border);
        return panel;
    }

    public JButton construirJButton(String texto, int x, int y, int ancho, int alto, Cursor cursor, ImageIcon imagen, Font fuente,
            Color colorFondo, Color colorFuente, Border borde, boolean esSolido, String direccion
    ) {
        boton = new JButton(texto);
        boton.setSize(ancho, alto);
        boton.setLocation(x, y);
        boton.setFocusable(false);
        boton.setCursor(cursor);
        boton.setFont(fuente);
        boton.setBackground(colorFondo);
        boton.setForeground(colorFuente);
        boton.setIcon(imagen);
        boton.setBorder(borde);
        boton.setContentAreaFilled(esSolido); //pregunta si se quiere construir un boton solido o transparente true sold false tansparente
        switch(direccion){
            case "l":
                boton.setHorizontalAlignment(SwingConstants.LEFT);
                break;
            case "r":
                boton.setHorizontalAlignment(SwingConstants.RIGHT);
                break;    
            default:
                break;
        }
        return boton;
    }

    public JLabel construirJLabel(
            String texto, int x, int y, int ancho, int alto, ImageIcon imagen, Color colorFuente,
            Color colorFondo, Font fuente, String direccion
    ) {
        label = new JLabel(texto);
        label.setSize(ancho, alto);
        label.setLocation(x, y);
        label.setForeground(colorFuente);
        label.setFont(fuente);
        label.setIcon(imagen);
        label.setVisible(true);
        if (colorFondo != null) {
            label.setOpaque(true);
            label.setBackground(colorFondo);
        }
        return label;
    }

    public JTextField construirJTextField(
            String texto, int x, int y, int ancho, int alto, Color colorFondo, Color colorFuente,
            Color colorCaret, Font fuente, Border borde, String direccion
    ) {
        textField = new JTextField();
        textField.setSize(ancho, alto);
        textField.setLocation(x, y);
        textField.setText(texto);
        textField.setForeground(colorFuente);
        textField.setBackground(colorFondo);
        textField.setCaretColor(colorCaret);
        textField.setFont(fuente);
        textField.setBorder(borde);
        switch (direccion) {
            case "c":
                textField.setHorizontalAlignment(SwingConstants.CENTER);
                break;
            case "r":
                textField.setHorizontalAlignment(SwingConstants.RIGHT);
                break;
            default:
                break;
        }
        return textField;
    }

    public JPasswordField construirJPasswordField(
            String texto, int x, int y, int ancho, int alto, Color colorFondo, Color colorFuente,
            Color colorCaret, Font fuente, Border borde, String direccion) {
        passwordField = new JPasswordField();
        passwordField.setSize(ancho, alto);
        passwordField.setLocation(x, y);
        passwordField.setText(texto);
        passwordField.setForeground(colorFuente);
        passwordField.setBackground(colorFondo);
        passwordField.setCaretColor(colorCaret);
        passwordField.setBorder(borde);
        switch (direccion) {
            case "c":
                passwordField.setHorizontalAlignment(SwingConstants.CENTER);
                break;
            case "r":
                passwordField.setHorizontalAlignment(SwingConstants.RIGHT);
                break;
            default:
                break;
        }
        return passwordField;
    }

    public static ObjGraficosService getService() {
        if (servicio == null) 
            servicio = new ObjGraficosService();
        return servicio;
    }

}
