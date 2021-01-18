/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenuf6;

import examenuf6.Alumnos;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author arnaugarciaalvarez
 */
public interface EventDao {

    //Retorna true si es crea l'event correctament
    boolean create(Alumnos alum1) throws Exception;
    
    //Retorna true si es crea l'event correctament i data es la data actual, system false.
    boolean create(String nom, String descripcio) throws Exception;

    ArrayList<Alumnos> readAll() throws Exception;

    //Retorna true si s'actualitza l'event correctament
    boolean update(Alumnos alum1) throws Exception;
    
    Alumnos find(int id) throws Exception;

    //Retorna true si s'elimina l'event correctament
    boolean delete(Alumnos alum1) throws Exception;
    
    
    //Retorna true si s'elimina l'event correctament
    boolean delete(int id) throws Exception;
    
    //Retorna una lista de Alumnos de sistema: system == true
    ArrayList<Alumnos> readAllSystemEvents() throws Exception;
    
}
