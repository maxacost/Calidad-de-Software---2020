package com.miempres.conexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Alumno
 */
// PATRON DE SOFTWARE SINGLETON
public class ConexionBD {

    private static ConexionBD instance = null;
    private static final String url = "jdbc:sqlserver://localhost\\MSSQLSERVER:1433;databaseName=BDDColegioKLF";
    private static final String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String user = "sa";
    private static final String pass = "123456";
    private static Connection con ;

    public ConexionBD() {
        //Instanciando el driver
        try {
            Class.forName(driver).newInstance();
            con = DriverManager.getConnection(url, user, pass);
            
        } catch (Exception e) {
            System.out.println("Error al conectar"+ e);
        }

    }

    public synchronized static ConexionBD Conectar() {
        if (instance == null) {
            instance = new ConexionBD();
        }

        return instance;
    }

    public  Connection getCon() {
        return con;
    }

    public void cerrarConexion() {
        instance = null;
    }
    
    
    public static void main(String[] args) {
        
        ConexionBD co = new ConexionBD();
        System.out.println("" + co);
        
        
    }
    
    

}
