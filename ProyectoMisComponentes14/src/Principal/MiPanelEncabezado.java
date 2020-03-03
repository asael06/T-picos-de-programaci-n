/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author RAHR_
 */
public class MiPanelEncabezado extends JFrame {
    JLabel logoTecNm;
    JLabel titulo;
    JLabel logoTec;
    JLabel derechosReservados;
    
    
    
    public MiPanelEncabezado() {       
        this.setLayout(new GridLayout(1,4,5,5));
        this.logoTecNm = new JLabel();
        this.logoTecNm.setText("");
        
        this.logoTecNm.setIcon(new javax.swing.ImageIcon(getClass().getResource
        ("Principal\\15.png")));
        
        this.logoTecNm.setFont(new Font("Tahoma",Font.BOLD,8));
        this.add(logoTecNm);
        
        this.titulo = new JLabel();
        this.titulo.setText("Aqui sabe que va");
        this.titulo.setFont(new Font ("Tahoma",Font.BOLD,16));
        this.add(titulo);
        setBackground(Color.red);
        
    }

    private void setLayout(GridLayout gridLayout) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 

    
}
