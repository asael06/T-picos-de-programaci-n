package Graficos;


import java.awt.HeadlessException;
import javax.swing.JFrame;


public class MarcoFrame extends JFrame{

    public MarcoFrame() throws HeadlessException {
        setTitle("Mi primer Gráfico");
        setSize(800,600);      
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Lamina lamina=new Lamina();
        add(lamina);
    }    
}
