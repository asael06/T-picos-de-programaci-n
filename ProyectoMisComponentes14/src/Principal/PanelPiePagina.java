/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.awt.Color;
import java.awt.LayoutManager;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author RAHR_
 */
public class PanelPiePagina extends JPanel{
    JLabel logoSep;
    JLabel direccion;

    public PanelPiePagina() {
        logoSep = new JLabel();
        /*this.logoSep.setIcon(new javax.swing.ImageIcon(getClass().getResource
        ("C:\\Users\\RAHR_\\Documents\\NetBeansProjects\\ProyectoMisComponentes14\\src\\Principal\\15.png")));*/
        this.add(logoSep);
        this.setBackground(Color.BLUE);
        this.setForeground(Color.WHITE);
    }
    
    
}
