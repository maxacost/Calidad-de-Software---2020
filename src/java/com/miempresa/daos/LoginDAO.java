/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miempresa.daos;


import com.miempres.conexion.ConexionBD;
import com.miempresa.dtos.PreguntaDto;
import com.miempresa.dtos.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Alumno
 */
public class LoginDAO {
    
    private final String sql_login="select * from usuario where ident=? and clave=?";
    private final String sql_registrar="insert into usuario values(?,?,?,?)";
    private final String sql_selectNameU = "select * from usuario where ident=?";
    private static PreparedStatement pstm=null;
    private static ResultSet res=null; 
    private static Connection con = ConexionBD.Conectar().getCon();
     private ConexionBD con1 = ConexionBD.Conectar();
    
    private void cerrarConexiones() {
        try {
            if (res != null) {
                res.close();
            }
            if (pstm != null) {
                pstm.close();
            }
            if (con != null) {
                con1.cerrarConexion();
            }
        } catch (Exception e) {
            System.out.println("Error al cerrar la conexion:" + e.getMessage());
            e.printStackTrace();
        }
    }
    
    
    public boolean validarUsuario(UsuarioDTO usuario){
    
        boolean result = false;
        try {
            pstm = con.prepareStatement(sql_login);
            pstm.setString(1,usuario.getCorreo());
            pstm.setString(2,usuario.getClave());
            res = pstm.executeQuery();
            if (res.next()) {
                result = true;
            }
            
        } catch (Exception e) {
            System.out.println("Error ValidarUsuario :"+e.getMessage());
            e.printStackTrace();// Obtener el detalle de la excepcion
        }
        finally{
            try {

                
            } catch (Exception e) {
                System.out.println("Error Cierre de Conexion"+e.getMessage());
                e.printStackTrace();
            }
        
        }
        return result;
    }
    
    public boolean registraUsuario(UsuarioDTO usuario){
        boolean result = false;
        try{
            pstm = con.prepareStatement(sql_registrar);
            pstm.setString(1,usuario.getCorreo());
            pstm.setString(2,usuario.getClave());
            pstm.setString(3,usuario.getPin());
            pstm.setString(4,usuario.getRespuesta());
            if(pstm.executeUpdate()>1){
                result = true;
            }
        }catch (Exception e){
            
        }
        return result;
        
    }
    
  
    public UsuarioDTO sql_selectByU(Object c) {
        UsuarioDTO preguntaDto = null;

        try {
            pstm = con.prepareStatement(sql_selectNameU);
            pstm.setString(1, c.toString());
            res = pstm.executeQuery();
            while (res.next()) {
                preguntaDto = new UsuarioDTO(res.getInt(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5));
            }

        } catch (Exception e) {
            System.out.println("Error en   seleccionar  el usuario" + e.getMessage());
            e.printStackTrace();
        } finally {
            cerrarConexiones();
        }
        return preguntaDto;
    }
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
