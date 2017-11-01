package conexionbase;


import conexionbase.Conexion;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
/**
 *
 * @author Sergio Gamarra Ramirez
 */
public class ConexionBase {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {

        //Esto es lo que se deberia de realizar en las clases DAO (Data Access Object).
        
        String sql = "SELECT * FROM myTable";
        Conexion conn = new Conexion();        
        
        try {
            PreparedStatement st = conn.getConn().prepareStatement(sql);
            //st.setString(parameterIndex, sql);    //Si es que el sql tiene parametros agregarlos de 1 en 1 con esta línea
            
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                //Accedemos al dato de la columna deseada en la fila actual.
                System.out.println(rs.getString("myRow"));
            }
            
        } catch (Exception ex) {
            System.out.println("Error al tulizar la conexion: "+ex.getMessage());
        } finally {
            conn.close();
        }

    }
}
