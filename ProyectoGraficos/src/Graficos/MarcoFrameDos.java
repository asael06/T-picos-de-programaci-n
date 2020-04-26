/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author asael
 */
public class MarcoFrameDos extends JFrame {

    private String nombre, nc, domicilio;    
    private String carrera;         

    public MarcoFrameDos(String nombre, String nc, String domicilio, String carrera) {
        this.nombre = nombre;
        this.nc = nc;
        this.domicilio = domicilio;
        this.carrera = carrera;        
        
        this.setTitle("Credencial TecNM campus Tepic");
        this.setSize(800,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Lamina lamina=new Lamina(this.nombre, this.nc, this.domicilio, this.carrera);
        add(lamina);
        
    }   
}//class

class Lamina extends JPanel {
    
    private String nombre, nc, domicilio;    
    private String carrera;    

    public Lamina(String nombre, String nc, String domicilio, String carrera) {
        this.nombre = nombre;
        this.nc = nc;
        this.domicilio = domicilio;
        this.carrera = carrera;
    }    
    
@Override
    public void paintComponent(Graphics g){
        File ruta= new File("C:\\Users\\asael\\Documents\\Tecnológico\\TAP\\Programas TAP\\ProyectoGraficos\\src\\Graficos\\logotec.png");
        try{
            BufferedImage img= ImageIO.read(ruta);            
            super.paintComponent(g);
            
            int x=270;
            g.drawRect(50, 30, 200, 200);
            g.setFont(new Font("Arial",Font.PLAIN,25));
            g.setColor(Color.yellow);
            g.drawString(carrera, x, 120);
            g.drawString(nc, x, 150);
            g.drawImage(img, 50, 30, this);
            g.drawString(nombre, x, 180);
            g.drawString(domicilio, x, 210);

          
       }catch(Exception e){
            showMessageDialog(null,"Error al cargar la imagen");
       }
    }
}//paint component
