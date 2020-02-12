
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asael
 */
public class Selector extends JFrame implements ActionListener {    
    private static GridLayout grid;
    private JButton aceptar;
    private static JPanel titulo,reticula[],reticulaAceptar;
    private Toolkit t;
    private Dimension dimension;
    private JLabel title;
    private Font fuente;
    private JCheckBox chkMaterias[];
    private Materia mat[];
    private static String materias[]={"Calculo diferencial","Calculo integral","Calculo Vectorial","Ecuaciones Diferenciales","Desarrollo Sustentable",
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
    
    
    
    
    public Selector() throws HeadlessException {
        propiedadesVentana();        
        agregarMaterias();
        
    }        
    public void propiedadesVentana(){
        //Inicializar variables
        grid=new GridLayout(8,1);
        t=Toolkit.getDefaultToolkit();
        dimension=t.getScreenSize();
        setSize(dimension.width,dimension.height);
        setResizable(false);
        setLayout(grid);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);        
        setTitle("Ingeniería en sistemas");
    }    
    public void agregarMaterias(){  
        fuente = new Font("Monospaced",Font.BOLD,36);
        title=new JLabel("Retícula Ingeniería en Sistemas Computacionales");
        title.setForeground(Color.white);
        title.setFont(fuente);
        aceptar=new JButton("Aceptar");        
        aceptar.addActionListener(this);
        reticula=new JPanel[6];
        chkMaterias=new JCheckBox[materias.length];
        titulo=new JPanel();
        titulo.setLayout(new GridBagLayout());
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
            chkMaterias[i-1] = new JCheckBox(materias[i-1]);
            chkMaterias[i-1].setSelected(false);
            chkMaterias[i-1].setFont(new Font("Sans Serif",Font.BOLD,12));
            reticula[indexPanel].add(chkMaterias[i-1]);
            if(i % 8 == 0 && i != 0) indexPanel++ ;
            
        }              
        reticula[5].add(aceptar);
        
        reticulaAceptar=new JPanel();
        reticulaAceptar.setLayout(new FlowLayout());
        reticulaAceptar.setBackground(new Color(143,144,143));        
        add(reticulaAceptar);
    }    
    public void crearMaterias(){
        mat = new Materia[materias.length];//Damos el tamaño al arreglo de tipo materia        
        boolean checked=false;
        System.out.println(materias.length);
        for (int i = 0; i < mat.length; i++) {
            if(chkMaterias[i].isSelected())checked=true;//Si el checkbox está activo asigna el valor true a la variable ckecked
            mat[i]=new Materia(materias[i], checked);//Se crea cada uno de los objetos de tipo materia y se asignan el nombre y el status
            checked=false;//Se vuelve a asignar el valor false a la variable checked            
        System.out.println(mat[i].getNombre()+" - "+mat[i].getStat());        
        }
        MateriasAprobadas ma=new MateriasAprobadas();
        ma.setVisible(true);
    }
    public static String[] getMaterias(){
        return materias;
    }
    public static GridLayout gridLayout(){
        return grid;
    }
    public static JPanel pnlTitle(){
        return titulo;
    }
    public static JPanel pnlAceptar(){
        return reticulaAceptar;
    }
    
     @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Aceptar"))crearMaterias();
    }
    
}
