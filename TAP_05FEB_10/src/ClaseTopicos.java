
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
        
        switch(e.getActionCommand()){
            case "Competencia":showMessageDialog(this,"Desarrolla soluciones de software para resolver problemas en diversos contextos utilizando\n" 
                                  +"programación concurrente, acceso a datos, que soporten interfaz gráfica de usuario y consideren\n" 
                                  +"dispositivos móviles. ");
            break;
            case "Temario":showMessageDialog(this,"1.- Interfaz gráfica de usuario\n"
                                                + "2.- Componentes y librerías\n"
                                                + "3.- Programación concurrente(Multihilos)\n"
                                                + "4.- Acceso a datos\n"
                                                + "5.- Programación de dispositivos móviles");
            break;
            case "Bibliografía":showMessageDialog(this,"1. Aguilar, L. J. (2010). Programacion en c/c++ java y UML. México: McGraw Hill.\n" +
                                                        "2. Bell, D. (2011). Java para estudiantes. México: Pearson.\n" +
                                                        "3. Ceballos, F. J. (2010). JAVA 2: Curso de programación. Madrid: RA-MA.\n" +
                                                        "4. Dean, J. (2009). Introducción a la programación con Java. México: McGraw Hill.\n" +
                                                        "5. Deitel, D. y. (2010). Java Cómo Programar. México: Prentice Hall.\n" +
                                                        "6. Friesen, J. (2011). Java para desarrollo android. España: Anaya Multimedia.\n" +
                                                        "7. Huddleston, R. (2011). Android para todos. España: Anaya Multimedia.\n" +
                                                        "8. Lauren Darcey, S. C. (2012). Android 4. Madrid: Anaya Multimedia.\n" +
                                                        "9. Soriano, J. E. (2011). Android: Programación de dispositivos móviles a través de ejemplos. México: Marcombo, S.A.\n" +
                                                        "10. Raynal, Michel. (2012). Concurrent Programming: Algorithms, Principles, and Foundations Springer.");
            break;
            case "Créditos":showMessageDialog(this,"2 - 3 - 5 ");
            break;
        }
                
    }
    
}
