/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.mincit.datos.interf;

/**
 *
 * @author user
 */
public interface IEvento_sectorDAO {
    
    public String consultarPorId(String id)throws Exception;
    
    public boolean borrarEve_Sectores(int id)throws Exception;
}
