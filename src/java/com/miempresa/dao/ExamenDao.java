/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miempresa.dao;

import com.miempres.conexion.ConexionBD;
import com.miempresa.dtos.ExamenDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author Alumno
 */
public class ExamenDao {
    private static final String sql_insertExamen = "insert into examen(profesor) values(?)";
    private static final String sql_iDExamen = "SELECT MAX(ExamenID) as id FROM examen";
    private static final String sql_insertExamenPregunta = "insert into examenP(ExamenID,idPreguntas) values(?,?)";
    private static final String sql_listadoExamen = "select e.ExamenID,e.profesor,pp.curso,pp.bimestre,iif(dificultad='A','Facil',iif(dificultad='B','Intermedio','Dificil')) Dificultad,pp.pregunta from examen e inner join examenP ep on e.ExamenID=ep.ExamenID inner join preguntasP pp on ep.idPreguntas=pp.id";
    private PreparedStatement pstm = null;
    private ResultSet res = null;
    private ConexionBD con = ConexionBD.Conectar();
    Connection co;
    private void cerrarConexiones() {
        try {
            if (res != null) {
                res.close();
            }
            if (pstm != null) {
                pstm.close();
            }
            if (con != null) {
                con.cerrarConexion();
            }
        } catch (Exception e) {
            System.out.println("Error al cerrar la conexion:" + e.getMessage());
            e.printStackTrace();
        }
    }
    public int sql_insert(String profesor) {
        int result = 2;
        try {
            pstm = con.getCon().prepareStatement(sql_insertExamen);
            pstm.setString(1, profesor);

            if (pstm.executeUpdate() > 0) {

                result = 1;
            }
        } catch (Exception e) {
            System.out.println("Error al insertar" + e.getMessage());
            e.printStackTrace();
        } finally {
            cerrarConexiones();
        }
        return result;
    }
    public int insert_examenP(int idExamen, int idPregunta) {
        int result = 2;
        try {
            pstm = con.getCon().prepareStatement(sql_insertExamenPregunta);
            pstm.setInt(1, idExamen);
            pstm.setInt(2, idPregunta);
            if (pstm.executeUpdate() > 0) {
                result = 1;
            }
        } catch (Exception e) {
            System.out.println("Error al insertar" + e.getMessage());
            e.printStackTrace();
        } finally {
            cerrarConexiones();
        }
        return result;
    }
    public int idExamen() {
        int id=0;
        try {
            pstm = con.getCon().prepareStatement(sql_iDExamen);
            ResultSet res = pstm.executeQuery();            
            if (res!=null) {
                while (res.next()) {
                    id = res.getInt(1);
                }
            }
        } catch (Exception e) {
        }
        return id;
    }
    
    public ArrayList<ExamenDTO> sql_selectAll(){
         ArrayList<ExamenDTO> resultlista = new ArrayList<>();
         try{
             pstm = con.getCon().prepareStatement(sql_listadoExamen);
             res = pstm.executeQuery();
             while (res.next()){
                 ExamenDTO pregunta = new ExamenDTO( res.getInt(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6));
                 resultlista.add(pregunta);
             }
         } catch (Exception e){
             System.out.println("Error al seleccionar la pregunta" + e.getMessage());
             e.printStackTrace();
         } finally{
             cerrarConexiones();
         }
             return resultlista;
    }
}
