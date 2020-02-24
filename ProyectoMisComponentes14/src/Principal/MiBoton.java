/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;

/**
 *
 * @author RAHR_
 */
public class MiBoton extends JButton {

    public MiBoton() {
        this.setBorder(null);
        this.setOpaque(true);
        this.setFont(new Font("Tahoma",Font.BOLD,14));
        this.setBackground(Color.BLACK);
        this.setForeground(Color.WHITE);
        this.setPreferredSize(new Dimension(200,40));
        this.setSize(200,40);
        this.setCursor(new Cursor(12));
        this.setText("Copyright-TAP");
    }
    
}
