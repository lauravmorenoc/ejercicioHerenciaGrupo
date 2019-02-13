/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

/**
 *
 * @author lamorenoca
 */
public class Profesional extends Sede{
    private int programasAltaCalidad;
    
    
    public Profesional(String nombre, String direccion, int telefono, double areaConstruida, int programasAltaCalidad) {
        super(nombre, direccion, telefono, areaConstruida);
        this.programasAltaCalidad=programasAltaCalidad;
        
    }
    
    
    
}
