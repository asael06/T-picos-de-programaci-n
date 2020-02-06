
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SO-B2
 */
public class MiVentana extends JFrame{
    //ATRIBUTOS DE CLASE
    JLabel labelCabecera;
    JLabel labelNC;
    JTextField campoNC;
    JLabel labelNombre;
    JTextField campoNombre;
    JLabel labelSemestre;
    JTextField campoSemestre;        
    JButton botonAceptar;
    JButton botonSalir;
       
    
    public MiVentana() throws HeadlessException {
        labelCabecera = new  JLabel();
        labelCabecera.setText("Informacion Estudiante");
        labelCabecera.setBounds(125, 20, 150, 20);
        add(labelCabecera);
        labelNC = new JLabel();
        labelNC.setText("NC");
        labelNC.setBounds(120, 70, 100, 20);
        add(labelNC);
        campoNC = new JTextField();
        campoNC.setBounds(120, 90, 150, 20);      
        add(campoNC);
        labelNombre = new JLabel();
        labelNombre.setText("Nombre Alumno");
        labelNombre.setBounds(120, 120, 100, 20);
        add(labelNombre);
        campoNombre = new  JTextField();
        campoNombre.setBounds(120, 140, 150, 20);        
        add(campoNombre);
        labelSemestre = new JLabel();
        labelSemestre.setText("Semestre");
        labelSemestre.setBounds(120, 170, 150, 20);
        add(labelSemestre);
        campoSemestre = new JTextField();
        campoSemestre.setBounds(120, 190, 80, 20);
        add(campoSemestre);
        botonAceptar = new JButton();
        botonAceptar.setText("Aceptar");
        botonAceptar.setBounds(110, 230, 80, 20);
        add(botonAceptar);
        botonSalir = new JButton();
        botonSalir.setText("Salir");
        botonSalir.setBounds(200, 230, 80, 20);
        add(botonSalir);
        
        //Propiedades de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setTitle("Primer Frame Manual");
    }
    
}
