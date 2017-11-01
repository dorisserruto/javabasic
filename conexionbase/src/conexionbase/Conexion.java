/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionbase;

// *****************************************************************************
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

// Fecha de creación: 01-01-2012 
// Nombre: Sergio Gamarra R.
// Descripción:
// Actualizaciones: 
// Fecha               Autor            	Descripción
// -----------------------------------------------------------------------------
// *****************************************************************************
public class Conexion {

    private Connection conn;
    private String db_connect_string;
    private String db_user_id;
    private String db_password;

    public Conexion() {
        this.initParams();
        this.open();
    }

    private void initParams() {
        //Configuracion de parametros a utilizar, se puede obtener de un properties tb.
        //this.db_connect_string = "jdbc:jtds:sqlserver://ip:port/db_name";
        this.db_connect_string = "jdbc:jtds:sqlserver://localhost:1433/mybase";
        this.db_user_id = "db_user";
        this.db_password = "db_pass";
    }

    private void open() {
        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            this.conn = DriverManager.getConnection(db_connect_string, db_user_id, db_password);
        } catch (Exception ex) {
            System.out.println("Error al abrir la conexion...");
        }
    }

    public void close() {
        try {
            if (this.getConn() != null) {
                this.getConn().close();
            }
        } catch (SQLException ex) {
            System.out.println("Error al cerrar la conexion...");
        }
    }

    public Connection getConn() {
        return conn;
    }
}
