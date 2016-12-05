/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.mincit.datos.interf;

import ufps.mincit.datos.dto.Usuario;

/**
 *
 * @author user
 */
public interface IUsuarioDAO {

    public Usuario consultarUsuarioTipo(int tipoUsuario) throws Exception;

    public boolean consultarContraseña(String cedula, String antigua) throws Exception;

    public boolean cambiarContraseña(String cedula, String tipo_usuario, String nueva) throws Exception;

    public boolean registrarUsuario(Usuario dto) throws Exception;

    public String consultarEmprendedor(String cedula) throws Exception;
}
