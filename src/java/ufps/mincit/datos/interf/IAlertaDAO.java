/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.mincit.datos.interf;

import java.util.ArrayList;
import ufps.mincit.datos.dto.AlertaDTO;

/**
 *
 * @author user
 */
public interface IAlertaDAO {
    
    public ArrayList<AlertaDTO> consultarAlertasEspe(String id)throws Exception;
    
    public boolean eliminarAlertaEspe(String id_alerta)throws Exception;
    
    public boolean registrarAlertaEspe(AlertaDTO dto)throws Exception;
}
