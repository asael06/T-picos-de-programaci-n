/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficos;
import java.awt.*;
import java.io.File;
import javax.swing.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import static javax.swing.JOptionPane.showMessageDialog;


/**
 *
 * @author User
 */


class MarcoFrame extends JFrame{

    public MarcoFrame() {
        setTitle("Primer Grafico");
        setSize(600,400);
        Lamina2 lamina= new Lamina2();
        add(lamina);
    }//oonsructor marco frame
   
}//clase MarcoFrame

class Lamina2 extends JPanel{
@Override
    public void paintComponent(Graphics g){
        File ruta= new File("C:\\Users\\asael\\Documents\\Tecnológico\\TAP\\Programas TAP\\ProyectoGraficos\\src\\Graficos\\logotec.png");
        try{
            BufferedImage img= ImageIO.read(ruta);            
            super.paintComponent(g);
            
            g.drawRect(50, 50, 200, 200);
            g.setFont(new Font("Arial",Font.PLAIN,40));
            g.setColor(Color.yellow);
            g.drawString("Hola Mundo", 10, 60);
            g.drawImage(img, 10, 10, this);
          
       }catch(Exception e){
            showMessageDialog(null,"Error al cargar la imagen");
       }
}//paint component

}//Lamina
class MarcoFrame2 extends JFrame{
    String noControl;
    String carrera;
    String domicilio;

    public MarcoFrame2(String noControl, String carrera, String domicilio) {
        
        this.noControl=noControl;
        this.carrera=carrera;
        this.domicilio=domicilio; 
        
        setTitle("Credencial TecNM - Campus Tepic -");
        setSize(600,400);
        LaminaDos lamina = new LaminaDos(noControl, carrera, domicilio);
        
    }
    
    

}//Marco Frame 2


class LaminaDos extends JPanel{
    String noControl;
    String carrera; 
    String domicilio; 

    public LaminaDos(String noControl, String carrera, String domicilio) {
    
        this.noControl = noControl;
        this.carrera= carrera;
        this.domicilio = domicilio; 
        
    
    
    }
    
    public void paintComponent(Graphics g){
        File ruta= new File("C:\\Users\\User\\Pictures\\logotec.png");
        try{
            
            BufferedImage img= ImageIO.read(ruta);
            super.paintComponent(g);

        
        
        
        g.drawRect(50, 50, 200, 200);
        g.setFont(new Font("Arial",Font.PLAIN,40));
        g.setColor(Color.yellow);
        g.drawImage(img, 10, 10, this);
        g.drawString(noControl, 10, 60);

  
        
       }catch(Exception e){
       showMessageDialog(null,"Error al cargar la imagen");
       }


}
    }