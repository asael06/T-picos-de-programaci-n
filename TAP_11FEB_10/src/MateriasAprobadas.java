
import java.awt.Dimension;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asael
 */
public class MateriasAprobadas extends JFrame implements ActionListener {

    private static GridLayout grid;    
    private static JPanel titulo,reticula[],reticulaAceptar;
    private Toolkit t;
    private Dimension dimension;
    private JLabel title;
    private Font fuente;
    private JLabel chkMaterias[];
    private Materia mat[];
    String materias[]=Selector.getMaterias();
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }

    public MateriasAprobadas() throws HeadlessException {
        propiedadesVentana();
        agregarMaterias();
    }   
    
    public void propiedadesVentana(){
        grid=new GridLayout(8,1);
        t=Toolkit.getDefaultToolkit();
        dimension=t.getScreenSize();
        setLayout(grid);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(dimension);       
    }
    
    public void agregarMaterias(){  
        fuente = new Font("Monospaced",Font.BOLD,36);
        title=new JLabel("Retícula Ingeniería en Sistemas Computacionales");
        title.setForeground(Color.white);
        title.setFont(fuente);        
        reticula=new JPanel[6];
        chkMaterias=new JLabel[materias.length];
        titulo=new JPanel();
        titulo.setLayout(new FlowLayout());
        titulo.setBackground(new Color(66,189,13));
        titulo.add(title);
        add(titulo);                
        
        for (int i = 0; i < reticula.length; i++) {
            reticula[i]=new JPanel();
            reticula[i].setLayout(new GridLayout(1,8,5,5));               
            add(reticula[i]);  
            
        }
        
        int indexPanel = 0;
        for (int i = 1; i <= materias.length; i++) {
            chkMaterias[i-1] = new JLabel(materias[i-1]);            
            chkMaterias[i-1].setFont(new Font("Sans Serif",Font.BOLD,12));
            reticula[indexPanel].add(chkMaterias[i-1]);
            if(i % 8 == 0 && i != 0) indexPanel++ ;
            
        }                     
        
        reticulaAceptar=new JPanel();
        reticulaAceptar.setLayout(new FlowLayout());
        reticulaAceptar.setBackground(new Color(143,144,143));        
        add(reticulaAceptar);
    }    
}
