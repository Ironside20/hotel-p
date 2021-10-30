/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beanControlador;

import beanModelo.modelo_huesped;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author ALDAIR
 */
@Named(value = "controlador_huesped")
@RequestScoped
public class controlador_huesped {
    private modelo_huesped _modhuesped = new modelo_huesped(); 
    public static List<modelo_huesped> _mhuesped = new ArrayList();

    /**
     * Creates a new instance of controlador_huesped
     */
    public controlador_huesped() {
    }

    public modelo_huesped getModhuesped() {
        return _modhuesped;
    }

    public void setModhuesped(modelo_huesped _modhuesped) {
        this._modhuesped = _modhuesped;
    }

    public static List<modelo_huesped> getMhuesped() {
        return _mhuesped;
    }

    public static void setMhuesped(List<modelo_huesped> _mhuesped) {
        controlador_huesped._mhuesped = _mhuesped;
    }
    
}
