/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.mincit.interf;

import ufps.mincit.dto.ComentarioDTO;

/**
 *
 * @author user
 */
public interface IComentarioDAO {
    
    public boolean recibirMensaje(ComentarioDTO dto) throws Exception;
}
