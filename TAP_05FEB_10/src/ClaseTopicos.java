
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JOptionPane.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asael
 */
public class ClaseTopicos extends JFrame implements ActionListener{
    GridLayout grid;
    JButton []arregloBotones;
    String []contenido = {"Competencia","Temario","Bibliografía","Créditos"};

    public ClaseTopicos() throws HeadlessException {
        propiedadesVentana();
        arregloBotones = new JButton[4];
        for (int i = 0; i < 4; i++) {
            arregloBotones[i]=new JButton(contenido[i]);
            arregloBotones[i].addActionListener(this);
            add(arregloBotones[i]);
        }//for
    }
    
    public void propiedadesVentana(){
        grid=new GridLayout(2, 2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,250);
        setLocation(100, 50);
        setLocationRelativeTo(null);
        setLayout(grid);
        setTitle("Materia Tópicos avanzados de programación");           
    }   
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Competencia")){
            showMessageDialog(this,"Desarrolla soluciones de software para resolver problemas en diversos contextos utilizando\n" 
                                  +"programación concurrente, acceso a datos, que soporten interfaz gráfica de usuario y consideren\n" 
                                  +"dispositivos móviles. ");
        }
    }
    
}
