/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.mincit.datos.interf;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public interface IRespuestaDAO {
    
     public ArrayList<String> consultarRespuestas()throws Exception;
    
}
