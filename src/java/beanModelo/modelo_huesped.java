/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beanModelo;

import java.util.Date;

/**
 *
 * @author ALDAIR
 */
public class modelo_huesped {
  private String _idCliente,_idhabitacion,_Asignacion,_Tipo,_Reserva,_costo,_estado_reserva;
  private Date _fingreso,fsalida;

    public String getIdCliente() {
        return _idCliente;
    }

    public void setIdCliente(String _idCliente) {
        this._idCliente = _idCliente;
    }

    public String getIdhabitacion() {
        return _idhabitacion;
    }

    public void setIdhabitacion(String _idhabitacion) {
        this._idhabitacion = _idhabitacion;
    }

    public String getAsignacion() {
        return _Asignacion;
    }

    public void setAsignacion(String _Asignacion) {
        this._Asignacion = _Asignacion;
    }

    public String getTipo() {
        return _Tipo;
    }

    public void setTipo(String _Tipo) {
        this._Tipo = _Tipo;
    }

    public String getReserva() {
        return _Reserva;
    }

    public void setReserva(String _Reserva) {
        this._Reserva = _Reserva;
    }

    public String getCosto() {
        return _costo;
    }

    public void setCosto(String _costo) {
        this._costo = _costo;
    }

    public String getEstado_reserva() {
        return _estado_reserva;
    }

    public void setEstado_reserva(String _estado_reserva) {
        this._estado_reserva = _estado_reserva;
    }

    public Date getFingreso() {
        return _fingreso;
    }

    public void setFingreso(Date _fingreso) {
        this._fingreso = _fingreso;
    }

    public Date getFsalida() {
        return fsalida;
    }

    public void setFsalida(Date fsalida) {
        this.fsalida = fsalida;
    }
    
}
