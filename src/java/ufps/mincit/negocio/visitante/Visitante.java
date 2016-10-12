/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.mincit.negocio.visitante;

import ufps.mincit.datos.dao.ComentarioDAO;
import ufps.mincit.datos.dto.ComentarioDTO;

/**
 *
 * @author user
 */
public class Visitante {
    
     public boolean recibirMensaje(String nombre_empresa,String nombre_empleado,String email, String asunto, String mensaje)throws Exception{
         
     ComentarioDTO comen = new ComentarioDTO(nombre_empresa, nombre_empleado, email, asunto, mensaje, true);
     ComentarioDAO dao = new ComentarioDAO();
         
        return dao.recibirMensaje(comen);
    }
    
}
