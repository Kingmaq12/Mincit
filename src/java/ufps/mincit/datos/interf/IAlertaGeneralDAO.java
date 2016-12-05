/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.mincit.datos.interf;

import java.util.ArrayList;
import ufps.mincit.datos.dto.AlertaGeneralDTO;

/**
 *
 * @author CESAR
 */
public interface IAlertaGeneralDAO {
    
    public boolean modificarAlerta(AlertaGeneralDTO dto)throws Exception;
    
    public ArrayList<String> consultarAlertas()throws Exception;
    
}
