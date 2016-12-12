/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.mincit.datos.interf;

/**
 *
 * @author CESAR
 */
public interface IEvento_VisitanteDAO {
    
    public boolean registrarEvento_Visitante(String cedula,int id)throws Exception;
}
