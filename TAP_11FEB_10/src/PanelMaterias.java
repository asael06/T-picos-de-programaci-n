
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asael
 */
public class PanelMaterias extends JFrame implements ActionListener{

    GridLayout grid;
    Dimension dimension;
    Toolkit t;
    JCheckBox []arregloBotones;
    String []materias = {"Calculo diferencial","Calculo integral","Calculo Vectorial","Ecuaciones Diferenciales","Desarrollo Sustentable",
                         "Lenguajes y autómatas I","Lenguajes y autómatas II","Adminstración de redes","Fundamentos de programación",
                         "Programación orientada a objetos","Estructura de datos","Métodos numéricos","Fundamentos de Telecomunicaciones",
                         "Redes de computadora","Conmutación y enrutación de redes de datos","Taller de investigación II","Taller de ética",
                         "Contabilidad financiera","Cultura empresarial","Tópicos avanzados de programación","Taller de bases de datos",
                         "Administración de bases de datos","Taller de investigación I","Programación web","Matemáticas discretas","Química",
                         "Investigación de operaciones","Fundamentos de bases de datos","Simulación","Graficación","Gestión de proyectos de sofware",
                         "Inteligencia artificial","Taller de administración","Álgebra lineal","Sistemas operativos","Taller de sistemas operativos",
                         "Fundamentos de ingeniería de software","Ingeniería de software","Sistemas programables","Fundamentos de investigación",
                         "Probabilidad y estadística","Física general","Principios eléctricos","Arquitectura de computadoras","Lenguajes de interfaz",
                         "Programación lógica y funcional"};
    Font fuente;
    JPanel panelTitulo;
    JPanel panelReticula[];
    JPanel panelReticula2;
    JLabel titulo;
    JButton aceptar;
    Materia []mat;   

    public PanelMaterias() throws HeadlessException {
        mat=new Materia[materias.length];
        t = Toolkit.getDefaultToolkit();
        dimension = t.getScreenSize();
        
        propiedadesVentana();        
        panelTitulo=new JPanel();
        panelTitulo.setLayout(new FlowLayout());
        panelTitulo.setBackground(Color.blue);
        add(panelTitulo);
        
        
        arregloBotones = new JCheckBox[50];
        fuente = new Font("Monospaced",Font.BOLD,36);
        titulo=new JLabel();        
        titulo.setText("Retícula Ingeniería en Sistemas Computacionales");
        setFont(fuente);        
        panelTitulo.add(titulo);
        
        panelReticula = new JPanel[6];
        //Aquí se agragan los botones a cada uno
        
            //En este fragmento se crean los nuevos JPanels
        for (int i = 0; i < panelReticula.length; i++) {
            panelReticula[i]=new JPanel();
            panelReticula[i].setLayout(new GridLayout(1,8,5,5));
            panelReticula[i].setSize(dimension.width, 50);            
            add(panelReticula[i]);            
        }
        
        int indexPanel = 0;
        for (int i = 1; i < materias.length-1; i++) {
            arregloBotones[i-1] = new JCheckBox(materias[i-1]);            
            panelReticula[indexPanel].add(arregloBotones[i-1]);
            if(i % 8 == 0 && i != 0) indexPanel++ ;
        }                     
         
        panelReticula2 = new JPanel();
        panelReticula2.setLayout(new GridLayout(1,8,5,5));
        
        panelReticula2.setBackground(Color.black);
        add(panelReticula2);
        aceptar=new JButton("Aceptar");  
        aceptar.addActionListener(this);
        panelReticula2.add(aceptar);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String cad="";
        if (e.getActionCommand().equals("Aceptar")) {
            for (int i = 0; i < materias.length; i++) {
                mat[i]=new Materia(materias[i],false);                
                if(arregloBotones[i].isSelected()){
                    mat[i].setStat(true);
                    //cad+=materias[i];
                }
            }
        }
        JOptionPane.showMessageDialog(this,cad);
    }
    
    
    
    public void propiedadesVentana(){
        grid = new GridLayout(8,1);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(dimension.width,dimension.height);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(grid);
        setTitle("Ingeniería en sistemas computacionales");
    }
    
    
}
