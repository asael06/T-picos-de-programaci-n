/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asael
 */
public class Materia {

    public Materia(String nombre, boolean stat) {
        this.nombre = nombre;
        this.stat = stat;
    }

    public Materia() {
    }
    
    String nombre;
    boolean stat;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isStat() {
        return stat;
    }

    public void setStat(boolean stat) {
        this.stat = stat;
    }   
}
