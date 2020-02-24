/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author RAHR_
 */
public class MiPanel extends JPanel{
    JLabel logoTecNm;
    JLabel logoTec; 
    JLabel titulo;

    public MiPanel() {
        logoTecNm = new JLabel();
        titulo = new JLabel();
        logoTec = new JLabel();
        /*
        this.logoTec.setIcon(new javax.swing.ImageIcon(getClass().getResource
        ("C:\\Users\\RAHR_\\Documents\\NetBeansProjects\\ProyectoMisComponentes14\\src\\Principal\\15.png")));
        titulo.setText("Aqui Añada el titulo");*/
        
        titulo.setForeground(Color.WHITE);
        titulo.setFont(new Font("Tahoma",Font.BOLD,20));
        this.setBackground(Color.BLUE);
        add(titulo);
        add(logoTecNm);
       
        
    }

    
    
    
}
