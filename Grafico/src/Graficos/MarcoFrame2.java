
package Graficos;

import javax.swing.*;


public class MarcoFrame2 extends JFrame{
    String ncContro,carrera,domicilio;

    public MarcoFrame2(String ncContro, String carrera, String domicilio) {
        this.ncContro = ncContro;
        this.carrera = carrera;
        this.domicilio = domicilio;
        
        setTitle("Primer Gráfico");
        setSize(600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        Lamina2 lamina2=new Lamina2(this.ncContro, this.carrera, this.domicilio);        
        add(lamina2);       
    }
    
    
}
