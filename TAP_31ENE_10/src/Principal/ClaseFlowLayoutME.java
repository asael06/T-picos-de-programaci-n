
package Principal;
//Martínez Barajas Gerson Asael 12 - 1 #10
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ClaseFlowLayoutME extends JFrame{
    
    Toolkit t;
    Dimension dimension;
    FlowLayout layo;
    
    JButton []arregloBotones;
    String []materias = {"Calculo diferencial","Calculo integral","Calculo Vectorial","Ecuaciones Diferenciales","Desarrollo Sustentable","Lenguajes y autómatas I"
                        ,"Lenguajes y autómatas II","Adminstración de redes"};
    Font fuente;
        
    public ClaseFlowLayoutME() throws HeadlessException {
        t = Toolkit.getDefaultToolkit();
        dimension = t.getScreenSize();
        propiedadesVentana();
        arregloBotones = new JButton[50];
        fuente = new Font("Monospaced",Font.BOLD,36);
        JLabel titulo=new JLabel();        
        titulo.setText("Retícula Ingeniería en Sistemas Computacionales");
        setFont(fuente);
        add(titulo);
        //generar los botones por materia
        for (int i = 0; i < 8; i++) {
            arregloBotones[i] = new JButton(materias[i]);           
            add(arregloBotones[i]);
        }
    }
    
    public void propiedadesVentana(){
        layo = new FlowLayout();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(dimension.width, dimension.height);
        setLocationRelativeTo(null);
        setLayout(layo);
        setResizable(false);
        setTitle("Retícula de ingeniería en sistemas computacionales");
    }    
}
