/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.mincit.datos.dto;

/**
 *
 * @author CESAR
 */
public class AlertaGeneralDTO {
    
    private String dia;
    private String numero_alerta;

    public AlertaGeneralDTO(String dia, String numero_alerta) {
        this.dia = dia;
        this.numero_alerta = numero_alerta;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getNumero_alerta() {
        return numero_alerta;
    }

    public void setNumero_alerta(String numero_alerta) {
        this.numero_alerta = numero_alerta;
    }
    
    
}
