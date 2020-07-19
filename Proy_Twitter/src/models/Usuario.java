package models;

import javax.swing.ImageIcon;

/**
 *
 * @author lenovo
 */
public class Usuario {
    private String apodoUs;
    private String claveUs;
    private String nombreUs;
    private ImageIcon imagenUs;

    public String getApodoUs() {
        return apodoUs;
    }

    public void setApodoUs(String apodoUs) {
        this.apodoUs = apodoUs;
    }

    public String getClaveUs() {
        return claveUs;
    }

    public void setClaveUs(String claveUs) {
        this.claveUs = claveUs;
    }

    public String getNombreUs() {
        return nombreUs;
    }

    public void setNombreUs(String nombreUs) {
        this.nombreUs = nombreUs;
    }

    public ImageIcon getImagenUs() {
        return imagenUs;
    }

    public void setImagenUs(ImageIcon imagenUs) {
        this.imagenUs = imagenUs;
    }
}
