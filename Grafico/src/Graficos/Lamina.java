package Graficos;


import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import static javax.swing.JOptionPane.*;
import javax.swing.*;


public class Lamina extends JPanel{

    public Lamina() {
        
    }
    
    @Override
    public void paintComponent(Graphics g){
        File ruta=new File("C:\\Users\\asael\\Documents\\Tecnológico\\TAP\\Programas TAP\\Grafico\\src\\Graficos\\TEC_logo.png");
        try {
            BufferedImage img=ImageIO.read(ruta);       
            super.paint(g);

            g.drawRect(40,40, 200, 200);
            g.setFont(new Font("Arial",Font.PLAIN,40));
            g.setColor(Color.BLUE);
            g.drawString("Hola Mundo",10,60);
            g.drawImage(img, 20, 20, this);
        } catch (Exception ex) {
            showMessageDialog(this,ex.getMessage()+" Error al cargar la imagen");
        }
    }
}
