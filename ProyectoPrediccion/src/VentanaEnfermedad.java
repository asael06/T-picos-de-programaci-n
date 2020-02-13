
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
public class VentanaEnfermedad extends JFrame implements ItemListener{

    GridLayout grid;
    JCheckBox chkAnimo,chkSueno,chkApetito,chkCansancio,chkSentimiento,chkConcentracion,chkRapido,chkInactividad,chkDesesperanza,chkRepetitivo,chkPerdida;
    JLabel lbDescription,lbTitle,lbIcon;
    JPanel pnlTitulo,pnlSintomas;
    private String sMusica,sPintura;
    Font fuente;
    Toolkit t;
    Dimension dimension;
    int contadorSintomas;
    
    @Override
    public void itemStateChanged(ItemEvent e) {
        contadorSintomas=0;
        if(chkAnimo.isSelected())contadorSintomas++;
        if(chkApetito.isSelected())contadorSintomas++;
        if(chkCansancio.isSelected())contadorSintomas++;
        if(chkConcentracion.isSelected())contadorSintomas++;
        if(chkDesesperanza.isSelected())contadorSintomas++;
        if(chkInactividad.isSelected())contadorSintomas++;
        if(chkPerdida.isSelected())contadorSintomas++;
        if(chkRapido.isSelected())contadorSintomas++;
        if(chkRepetitivo.isSelected())contadorSintomas++;
        if(chkSentimiento.isSelected())contadorSintomas++;     
        if(chkSueno.isSelected())contadorSintomas++;
        lbDescription.setText("Usted padece: ");
        if(contadorSintomas>7 && lbDescription.getText().indexOf("Depresión")==-1)lbDescription.setText(lbDescription.getText()+"Depresión");        
        
         
    }

    public VentanaEnfermedad() throws HeadlessException {
        lbIcon = new JLabel(new ImageIcon("C:\\Users\\asael\\Pictures\\triforce.jpg"));
        lbIcon.setOpaque(true);
        sMusica=sPintura="";
        pnlTitulo=new JPanel();
        pnlTitulo.setBackground(new Color(192,186,0));
        lbTitle=new JLabel("Enfermedades");
        fuente = new Font("Monospace",Font.BOLD,20);
        lbTitle.setFont(fuente);
        pnlTitulo.add(lbTitle);         
        lbDescription=new JLabel("Usted padece: ");
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
        setTitle("Enfermedades");
        add(pnlTitulo);
        add(lbIcon);  
        agregarSintomas();
        
        
    }
    public void agregarSintomas(){
        chkAnimo=new JCheckBox("Estado de ánimo irritable o bajo la mayoría de las veces");
        chkSueno=new JCheckBox("Dificultad para conciliar el sueño o exceso de sueño");
        chkApetito=new JCheckBox("Cambio grande en el apetito, a menudo con aumento o pérdida de peso");
        chkCansancio=new JCheckBox("Cansancio y falta de energía");
        chkSentimiento=new JCheckBox("Sentimientos de inutilidad, odio a sí mismo y culpa");
        chkConcentracion=new JCheckBox("Dificultad para concentrarse");
        chkRapido=new JCheckBox("Movimientos lentos o rápidos");
        chkInactividad=new JCheckBox("Inactividad y retraimiento de las actividades usuales");
        chkDesesperanza=new JCheckBox("Sentimientos de desesperanza o abandono");
        chkRepetitivo=new JCheckBox("Pensamientos repetitivos de muerte o suicidio");
        chkPerdida=new JCheckBox("Pérdida de placer en actividades que suelen hacerlo feliz, incluso la actividad sexual");
        pnlSintomas=new JPanel();
        pnlSintomas.setLayout(new GridLayout(11,1));
        add(pnlSintomas);
        pnlSintomas.add(chkAnimo);
        pnlSintomas.add(chkApetito);
        pnlSintomas.add(chkCansancio);
        pnlSintomas.add(chkConcentracion);
        pnlSintomas.add(chkDesesperanza);
        pnlSintomas.add(chkInactividad);
        pnlSintomas.add(chkPerdida);
        pnlSintomas.add(chkRapido);
        pnlSintomas.add(chkRepetitivo);
        pnlSintomas.add(chkSentimiento);
        pnlSintomas.add(chkSueno);
        
        chkAnimo.addItemListener(this);
        chkApetito.addItemListener(this);
        chkCansancio.addItemListener(this);
        chkConcentracion.addItemListener(this);
        chkDesesperanza.addItemListener(this);
        chkInactividad.addItemListener(this);
        chkPerdida.addItemListener(this);
        chkRapido.addItemListener(this);
        chkRepetitivo.addItemListener(this);
        chkSentimiento.addItemListener(this);
        chkSueno.addItemListener(this);
        
        add(lbDescription);
        
        
    }
    
    
}
