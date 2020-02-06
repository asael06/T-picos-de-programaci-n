
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 *
 * @author asael
 */
public class MiVentana extends JFrame {

    GridLayout grid;
    Dimension dimension;
    Toolkit t;
    JButton []arregloBotones;
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
    
    public MiVentana() throws HeadlessException {
        t = Toolkit.getDefaultToolkit();
        dimension = t.getScreenSize();
        propiedadesVentana();
        
        panelTitulo=new JPanel();
        panelTitulo.setLayout(new FlowLayout());
        panelTitulo.setBackground(Color.blue);
        add(panelTitulo);
        
        
        arregloBotones = new JButton[50];
        fuente = new Font("Monospaced",Font.BOLD,36);
        titulo=new JLabel();        
        titulo.setText("Retícula Ingeniería en Sistemas Computacionales");
        setFont(fuente);        
        panelTitulo.add(titulo);
        
        //ciclos para agregar de forma automática los paneles con botones
//        panelReticula = new JPanel[6];
//        for (int i = 0; i < panelReticula.length-1; i++) {
//            panelReticula[i].setLayout(new GridLayout(1,8,5,5));
//            add(panelReticula[i]);                
//            //generar los botones por materia
//            for (int j = 0; j < 8; j++) {
//                arregloBotones[j] = new JButton(materias[j]);           
//                panelReticula[i].add(arregloBotones[j]);
//            }
//        }
        
        int indexPanel=0;
        int indexButton=0;
        while(indexButton<16){
            panelReticula[indexPanel].setLayout(new GridLayout(1,8,5,5));
            add(panelReticula[j]);                
            arregloBotones[j] = new JButton(materias[j]);           
            panelReticula[i].add(arregloBotones[j]);
        }
        
        
        panelReticula2 = new JPanel();
        panelReticula2.setLayout(new GridLayout(1,8,5,5));
        
        panelReticula2.setBackground(Color.black);
        add(panelReticula2);
    }
    
    public void propiedadesVentana(){
        grid = new GridLayout(8,1);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(dimension.width,dimension.height);
        setLocationRelativeTo(null);
        setLayout(grid);
        setTitle("Ingeniería en sistemas computacionales");
        
    }
}
