/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.mincit.datos.interf;

import ufps.mincit.datos.dto.Comentario;

/**
 *
 * @author user
 */
public interface IComentarioDAO {
    
    
    public boolean recibirMensaje(Comentario comen) throws Exception;
}
