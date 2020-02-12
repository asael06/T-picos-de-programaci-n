
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asael
 */
public class EscuchadorItem extends JFrame implements ItemListener{
    GridLayout grid;
    JCheckBox musica,pintura;
    JLabel lbDescription,lbTitle,lbIcon;
    JPanel pnlTitulo;
    private String sMusica,sPintura;
    Font fuente;
    Toolkit t;
    Dimension dimension;
    
    @Override
    public void itemStateChanged(ItemEvent e) {
        
    }

    public EscuchadorItem() throws HeadlessException {
        lbIcon = new JLabel(new ImageIcon("C:\\Users\\asael\\Pictures\\triforce.jpg"));
        lbIcon.setOpaque(true);
        sMusica=sPintura="";
        pnlTitulo=new JPanel();
        pnlTitulo.setBackground(new Color(192,186,0));
        lbTitle=new JLabel("Preferencias App <Persona Favorita>");
        fuente = new Font("Monospace",Font.BOLD,20);
        lbTitle.setFont(fuente);
        pnlTitulo.add(lbTitle);   
        
        musica=new JCheckBox("Musica");
        musica.setFont(fuente);
        pintura = new JCheckBox("Pintura");
        pintura.setFont(fuente);
        lbDescription=new JLabel("Seleccione: ");
        lbDescription.setFont(fuente);
        propiedadesVentana();
    }
    
    public void propiedadesVentana(){
        grid=new GridLayout(5,1);
        
        t=Toolkit.getDefaultToolkit();
        dimension=t.getScreenSize();
        setLayout(grid);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, dimension.height);
        setResizable(false);
        setTitle("Preferencias persona favorita");
        add(pnlTitulo);
        add(lbIcon);
        add(musica);
        add(pintura);
        add(lbDescription);
        
    }
    
}
