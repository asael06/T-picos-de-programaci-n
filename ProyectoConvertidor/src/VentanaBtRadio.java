
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RAHR_
 */
public class VentanaBtRadio extends JFrame implements ItemListener{
//Atributos de clase
    GridLayout grid;
    JRadioButton divisa,volumen,longitud,pesoMasa,temp;
    JRadioButton energia;
    ButtonGroup convertidorGrupo;
    JLabel labelConvertidor,labelSalida;
    JTextField campoEntrada,campoSalida;
    
    float peso,dolar;

    public VentanaBtRadio() throws HeadlessException {
        labelConvertidor = new JLabel("Convertir a...");
        campoEntrada = new JTextField();
        labelSalida = new JLabel("Salida...");
        campoSalida = new JTextField();
        divisa = new JRadioButton("Divisa");
        volumen = new JRadioButton("Volumen");
        longitud = new JRadioButton("Longitud");
        pesoMasa = new JRadioButton("Peso y Masa");
        temp = new JRadioButton("Temperatura");
        energia = new JRadioButton("Energía");
        convertidorGrupo = new ButtonGroup();
        
        peso=dolar=0;
        
        add(labelConvertidor);
        add(campoEntrada);
        add(labelSalida);
        add(campoSalida);
        convertidorGrupo.add(divisa);
        convertidorGrupo.add(volumen);
        convertidorGrupo.add(longitud);
        convertidorGrupo.add(pesoMasa);
        convertidorGrupo.add(temp);
        //agregar los escuchadores
        divisa.addItemListener(this);
        volumen.addItemListener(this);
        longitud.addItemListener(this);
        pesoMasa.addItemListener(this);
        temp.addItemListener(this);
        
        PropiedadesVentana();
    }//BtnRadio
    
     public void PropiedadesVentana (){
        grid = new GridLayout(10,1);
        setSize(500,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(grid);
        setResizable(false);
        setTitle("CONVERTIDOR");
    }
    
    
    @Override
    public void itemStateChanged(ItemEvent ie) {
        if(ie.getItemSelectable() == divisa){
         //convertir la entrada(campo entrada) a dolares y asignarla a (campo salida)   
         
        }//divisa
        
        if(ie.getItemSelectable() == volumen){
         //convertir la entrada(campo entrada) a dolares y asignarla a (campo salida)   
        
        }//divisa
        
        if(ie.getItemSelectable() == longitud){
         //convertir la entrada(campo entrada) a dolares y asignarla a (campo salida)   
        
        }//divisa
        
        if(ie.getItemSelectable() == pesoMasa){
         //convertir la entrada(campo entrada) a dolares y asignarla a (campo salida)   
        
        }//divisa
        
        if(ie.getItemSelectable() == temp){
         //convertir la entrada(campo entrada) a dolares y asignarla a (campo salida)   
        
        }//divisa
    }
    
}
