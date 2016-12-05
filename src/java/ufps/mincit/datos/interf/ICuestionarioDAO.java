/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.mincit.datos.interf;

import java.util.ArrayList;
import ufps.mincit.datos.dto.CuestionarioDTO;

/**
 *
 * @author user
 */
public interface ICuestionarioDAO {
    
        public ArrayList<CuestionarioDTO> mostrarCuestionario()throws Exception;
    public int contarAlto() throws Exception;
    public int contarMedio() throws Exception;
    public int contarBajo() throws Exception;
}
