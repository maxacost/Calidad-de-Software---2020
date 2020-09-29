/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miempresa.dao;

import com.miempres.conexion.ConexionBD;
import com.miempresa.dtos.PreguntaDto;
import com.miempresa.dtos.UsuarioDTO;
import com.miempresa.interfaces.OperacionesBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovo1
 */
public class PreguntaDao implements OperacionesBD<PreguntaDto> {

    private static final String sql_insertPregunta = "insert into preguntasP values (?,?,?,?,?)";
    private static final String sql_updatePregunta = "update preguntasP set anio=?,bimestre=?,curso=?,dificultad=?,pregunta=? where id=?";
    private static final String sql_selectByIdPregunta = "select  id , anio , bimestre, curso, iif(dificultad='A','Facil',iif(dificultad='B','Intermedio','Dificil')) Dificultad, pregunta from preguntasP where id=? ";
    private static final String sql_deletePregunta = "delete from preguntasP where id=? ";
    private static final String sql_selectAllPregunta = "select id , anio , bimestre, curso, iif(dificultad='A','Facil',iif(dificultad='B','Intermedio','Dificil')) Dificultad, pregunta from preguntasP";
    private static final String sql_selectByNamePregunta = "select * from preguntasP where pregunta = ?";
    private static final String sql_selectBPregunta = "select * from preguntasP where dificultad = ?";
    private static final String sql_insertExamen = "insert into examenP values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    private static final String sql_selectAllExamen = "select * from examenP";
    private static final String sql_selectByIdExamen = "select * from examenP where ExamenID=?";
    private static final String sql_selectNameU = "select * from usuario where ident=?";
    private static final String sql_deletePCascada = "delete from examenP where idPreguntas=?";
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

    @Override
    public boolean sql_insert(PreguntaDto t) {
        boolean result = false;
        try {
            pstm = con.getCon().prepareStatement(sql_insertPregunta);
            pstm.setString(1, t.getAnio());
            pstm.setString(2, t.getBimestre());
            pstm.setString(3, t.getCurso());
            pstm.setString(4, t.getDificultad());
            pstm.setString(5, t.getPregunta());

            if (pstm.executeUpdate() > 0) {

                result = true;
            }
        } catch (Exception e) {
            System.out.println("Error al insertar" + e.getMessage());
            e.printStackTrace();
        } finally {
            cerrarConexiones();
        }
        return result;
    }

    @Override
    public boolean sql_insertExam(PreguntaDto t) {
        boolean result = false;
        try {
            pstm = con.getCon().prepareStatement(sql_insertExamen);
            pstm.setString(1, t.getPregunta1());
            pstm.setString(2, t.getPregunta2());
            pstm.setString(3, t.getPregunta3());
            pstm.setString(4, t.getPregunta4());
            pstm.setString(5, t.getPregunta5());
            pstm.setString(6, t.getPregunta6());
            pstm.setString(7, t.getPregunta7());
            pstm.setString(8, t.getPregunta8());
            pstm.setString(9, t.getPregunta9());
            pstm.setString(10, t.getPregunta10());
            pstm.setString(11, t.getPregunta11());
            pstm.setString(12, t.getPregunta12());
            pstm.setString(13, t.getPregunta13());
            pstm.setString(14, t.getPregunta14());
            pstm.setString(15, t.getPregunta15());
            pstm.setString(16, t.getPregunta16());
            pstm.setString(17, t.getPregunta17());
            pstm.setString(18, t.getPregunta18());
            pstm.setString(19, t.getPregunta19());
            pstm.setString(20, t.getPregunta20());
            if (pstm.executeUpdate() > 0) {

                result = true;
            }
        } catch (Exception e) {
            System.out.println("Error al insertar examen" + e.getMessage());
            e.printStackTrace();
        } finally {
            cerrarConexiones();
        }
        return result;
    }

    @Override
    public boolean sql_update(PreguntaDto t) {
        boolean result = false;
        try {
            pstm = con.getCon().prepareStatement(sql_updatePregunta);
            pstm.setString(1, t.getAnio());
            pstm.setString(2, t.getBimestre());
            pstm.setString(3, t.getCurso());
            pstm.setString(4, t.getDificultad());
            pstm.setString(5, t.getPregunta());
            pstm.setInt(6, t.getId());

            if (pstm.executeUpdate() > 0) {

                result = true;
            }

        } catch (Exception e) {
            System.out.println("Error al actualizar" + e.getMessage());
            e.printStackTrace();

        } finally {
            cerrarConexiones();
        }
        return result;
    }

    @Override
    public boolean sql_delete(Object id) {

        boolean result = false;
        try {
            pstm = con.getCon().prepareStatement(sql_deletePregunta);
            pstm.setInt(1, Integer.parseInt(id.toString()));
            if (pstm.executeUpdate() > 0) {
                result = true;
            }
        } catch (Exception ex) {
            System.out.println("Error en la eliminar pregunta " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            cerrarConexiones();
        }
        return result;
    }
    
    
    @Override
    public boolean sql_deletePC(Object id) {
         boolean result = false;
        try {
            pstm = con.getCon().prepareStatement(sql_deletePCascada);
            pstm.setInt(1, Integer.parseInt(id.toString()));
            if (pstm.executeUpdate() > 0) {
                result = true;
            }
        } catch (Exception ex) {
            System.out.println("Error en la eliminar pregunta " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            cerrarConexiones();
        }
        return result;
    }

    @Override
    public PreguntaDto sql_selectById(Object id) {
        PreguntaDto preguntaDto = null;

        try {
            pstm = con.getCon().prepareStatement(sql_selectByIdPregunta);
            pstm.setInt(1, Integer.parseInt(id.toString()));
            res = pstm.executeQuery();
            while (res.next()) {
                preguntaDto = new PreguntaDto(res.getInt(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6));
            }

        } catch (Exception e) {
            System.out.println("Error en   seleccionar  la pregunta" + e.getMessage());
            e.printStackTrace();
        } finally {
            cerrarConexiones();
        }
        return preguntaDto;
    }

    @Override
    public PreguntaDto sql_selectByIdExam(Object ide) {
        PreguntaDto preguntaDto = null;
        try {
            pstm = con.getCon().prepareStatement(sql_selectByIdExamen);
            pstm.setInt(1, Integer.parseInt(ide.toString()));
            res = pstm.executeQuery();
            while (res.next()) {
                preguntaDto = new PreguntaDto(res.getInt(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10), res.getString(11), res.getString(12), res.getString(13), res.getString(14), res.getString(15), res.getString(16), res.getString(17), res.getString(18), res.getString(19), res.getString(20), res.getString(21));
            }
        } catch (Exception e) {
            System.err.println("error" + e.getMessage());
            e.printStackTrace();
        } finally {
            cerrarConexiones();
        }
        return preguntaDto;
    }

    @Override
    public ArrayList<PreguntaDto> sql_selectAll() {
        ArrayList<PreguntaDto> resultlista = new ArrayList<>();
        try {
            pstm = con.getCon().prepareStatement(sql_selectAllPregunta);
            res = pstm.executeQuery();
            while (res.next()) {
                PreguntaDto pregunta = new PreguntaDto(res.getInt(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6));
                resultlista.add(pregunta);
            }
        } catch (Exception ex) {
            System.out.println("Error en   seleccionar  la pregunta" + ex.getMessage());
            ex.printStackTrace();
        } finally {
            cerrarConexiones();
        }
        return resultlista;
    }

    @Override
    public ArrayList<PreguntaDto> sql_selectAllEx() {
        ArrayList<PreguntaDto> resultlista = new ArrayList<>();
        try {
            pstm = con.getCon().prepareStatement(sql_selectNameU);
            res = pstm.executeQuery();
            while (res.next()) {
                PreguntaDto pregunta = new PreguntaDto(res.getInt(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6));
                resultlista.add(pregunta);
            }
        } catch (Exception ex) {
            System.out.println("Error en   seleccionar  el examen" + ex.getMessage());
            ex.printStackTrace();
        } finally {
            cerrarConexiones();
        }
        return resultlista;
    }

    @Override
    public ArrayList<PreguntaDto> sql_selectAllE() {
        ArrayList<PreguntaDto> resultlist = new ArrayList<>();
        try {
            pstm = con.getCon().prepareStatement(sql_selectAllExamen);
            res = pstm.executeQuery();
            while (res.next()) {
                PreguntaDto examen = new PreguntaDto(res.getInt(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10), res.getString(11), res.getString(12), res.getString(13), res.getString(14), res.getString(15), res.getString(16), res.getString(17), res.getString(18), res.getString(19), res.getString(20), res.getString(21));
                resultlist.add(examen);
            }
        } catch (Exception e) {
            System.out.println("Error en   seleccionar  el examen" + e.getMessage());
            e.printStackTrace();
        } finally {
            cerrarConexiones();
        }

        return resultlist;
    }

    @Override
    public ArrayList<PreguntaDto> sql_selectByName() {
        ArrayList<PreguntaDto> resultArray = null;
        try {
            pstm = con.getCon().prepareStatement(sql_selectByNamePregunta);
            pstm.setString(1, toString());
            res = pstm.executeQuery();
            while (res.next()) {
                PreguntaDto pregunta = new PreguntaDto(res.getInt(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6));
                resultArray.add(pregunta);
            }
        } catch (Exception ex) {
            System.out.println("Error en   seleccionar  la pregunta " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            cerrarConexiones();
        }
        return resultArray;
    }

    public ArrayList<PreguntaDto> sql_selectB(Object b) {
        ArrayList<PreguntaDto> resultlista = new ArrayList<>();
        try {
            pstm = con.getCon().prepareStatement(sql_selectBPregunta);
            pstm.setString(1, b.toString());
            res = pstm.executeQuery();
            while (res.next()) {
                PreguntaDto pregunta = new PreguntaDto(res.getInt(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6));
                resultlista.add(pregunta);
            }
        } catch (Exception ex) {
            System.out.println("Error en   seleccionar  la pregunta" + ex.getMessage());
            ex.printStackTrace();
        } finally {
            cerrarConexiones();
        }
        return resultlista;
    }

    @Override
    public List buscar(String texto) {
        List<PreguntaDto> lista = new ArrayList<>();
        String sql = "select*from preguntasP where curso like '%" + texto + "%'";
        try {
            co = con.getCon();
            pstm = co.prepareStatement(sql);
            res = pstm.executeQuery();
            while (res.next()) {
                PreguntaDto pe = new PreguntaDto();
                pe.setId(res.getInt("Id"));
                pe.setPregunta(res.getString("Pregunta"));
                pe.setDificultad(res.getString("Difultad"));
                pe.setCurso(res.getString("Curso"));
                pe.setBimestre(res.getString("Bimestre"));
                pe.setAnio(res.getString("Anio"));
                lista.add(pe);
            }
        } catch (Exception ex) {
            System.out.println("error" + ex.getLocalizedMessage());
        }
        return lista;
    }

    

}
