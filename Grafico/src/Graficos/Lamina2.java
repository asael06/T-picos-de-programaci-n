
package Graficos;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;
import static javax.swing.JOptionPane.*;

/**
 *
 * @author asael
 */
public class Lamina2 extends JPanel {
    String noControl,carrera,domicilio;

    public Lamina2(String noControl, String carrera, String domicilio) {
        this.noControl = noControl;
        this.carrera = carrera;
        this.domicilio = domicilio;
    }
    
    /**
     *
     * @param g
     */
    @Override
    public void paintComponent(Graphics g){
        File ruta=new File("C:\\Users\\asael\\Documents\\Tecnológico\\TAP\\Programas TAP\\Grafico\\src\\Graficos\\TEC_logo.png");
        try {
            BufferedImage img=ImageIO.read(ruta);       
            super.paint(g);

            g.drawRect(10, 10, 200, 200);
            g.setFont(new Font("Arial",Font.PLAIN,40));
            g.setColor(Color.BLUE);
            g.drawString(noControl,10,60);
            g.drawImage(img, 20, 20, this);
        } catch (Exception ex) {
            showMessageDialog(this,ex.getMessage()+" Error al cargar la imagen");
        }
    }
    
}
