/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beanControlador;

import beanModelo.modelo_cliente;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author ALDAIR
 */
@Named(value = "controlador_cliente")
@RequestScoped
public class controlador_cliente {
    private modelo_cliente _modcliente = new modelo_cliente(); 
    public static List<modelo_cliente> _mcliente = new ArrayList();
private String _opcNacionalidad;
    
    /**
     * Creates a new instance of controlador_cliente
     */
    public controlador_cliente() {
    }

    public modelo_cliente getModcliente() {
        return _modcliente;
    }

    public void setModcliente(modelo_cliente _modcliente) {
        this._modcliente = _modcliente;
    }

    public static List<modelo_cliente> getMcliente() {
        return _mcliente;
    }

    public static void setMcliente(List<modelo_cliente> _mcliente) {
        controlador_cliente._mcliente = _mcliente;
    }

    public String getOpcNacionalidad() {
        return _opcNacionalidad;
    }

    public void setOpcNacionalidad(String _opcNacionalidad) {
        this._opcNacionalidad = _opcNacionalidad;
    }
    
    
}
