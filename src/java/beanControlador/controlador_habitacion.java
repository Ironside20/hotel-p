/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beanControlador;

import beanModelo.modelo_habitacion;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author ALDAIR
 */
@Named(value = "controlador_habitacion")
@RequestScoped
public class controlador_habitacion {
    private modelo_habitacion _modhabitacion = new modelo_habitacion(); 
    public static List<modelo_habitacion> _mhabitacion = new ArrayList();

    /**
     * Creates a new instance of controlador_habitacion
     */
    public controlador_habitacion() {
    }

    public modelo_habitacion getModhabitacion() {
        return _modhabitacion;
    }

    public void setModhabitacion(modelo_habitacion _modhabitacion) {
        this._modhabitacion = _modhabitacion;
    }

    public static List<modelo_habitacion> getMhabitacion() {
        return _mhabitacion;
    }

    public static void setMhabitacion(List<modelo_habitacion> _mhabitacion) {
        controlador_habitacion._mhabitacion = _mhabitacion;
    }
    
    
}
