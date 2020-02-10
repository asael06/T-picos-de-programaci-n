/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import static javax.swing.JOptionPane.*;

/**
 *
 * @author asael
 */
public class Seleccionador extends JFrame implements ActionListener{
    
    GridLayout grid;
    JCheckBox []arregloCheck;
    ClaseDatos datos;
    int totalMaterias;
    JButton calcula;
    
    public Seleccionador() throws HeadlessException {
        
        arregloCheck=new JCheckBox[50];
        datos = new ClaseDatos();
        totalMaterias = 0;
        datos.t = Toolkit.getDefaultToolkit();
        datos.dimension=datos.t.getScreenSize();
        calcula=new JButton("Calcular");
        calcula.addActionListener(this);
        propiedadesVentana();
        int i=0;
        for (; i < 8; i++) {
            arregloCheck[i]=new JCheckBox(datos.materias[i]);
            add(arregloCheck[i]);
        }
        for (; i < 16; i++) {
            arregloCheck[i]=new JCheckBox(datos.materias[i]);
            add(arregloCheck[i]);            
        }        
        for (; i < 24; i++) {
            arregloCheck[i]=new JCheckBox(datos.materias[i]);
            add(arregloCheck[i]);
        }
        for (; i < 32; i++) {
            arregloCheck[i]=new JCheckBox(datos.materias[i]);
            add(arregloCheck[i]);
        }
        for (; i < 40; i++) {
            arregloCheck[i]=new JCheckBox(datos.materias[i]);
            add(arregloCheck[i]);
        }
        add(calcula);
    }
    
    

    public void propiedadesVentana(){
        grid = new GridLayout(9,4);        
        setSize(datos.dimension.width,datos.dimension.height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(grid);
        setResizable(false);
        setTitle("Datos avance retícula");                
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Calcular")) {
            for (int i = 0; i < 40; i++) {
                if(arregloCheck[i].isSelected()) totalMaterias++;
            }
            showMessageDialog(this,"Total de materias aprobadas "+totalMaterias+"\nPorcentaje de avence: "+totalMaterias*100/40+"%");
        }
    }
}
