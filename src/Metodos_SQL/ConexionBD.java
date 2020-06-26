/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos_SQL;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Ya Sabes Quien Soy =D
 */
public class ConexionBD {
    Connection conect = null;
	public Connection conexion()
		{
			try {
				//Cargamos el Driver MySQL
				Class.forName("com.mysql.jdbc.Driver");
				//Class.forName("org.gjt.mm.mysql.Driver");
				conect = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/bd","root","");
				System.out.println("conexion establecida");
				
				//Cargamos el Driver Access
				//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				//Conectar en red base
				//String strConect = "jdbc:odbc:Driver=Microsoft Access Driver (*.mdb)";DBQ=//servidor/bd_cw/cw.mdb";
				//Conectar Localmente
				//String strConect = "jdbc:odbc:Driver=Microsoft Access Driver (*.mdb)";DBQ=:/cwnetbeans/cw.mdb";
				//conect = DriverManager.getConnection(strConect,"","");
			} catch (ClassNotFoundException | SQLException e) {
				System.out.println("error de conexion");
				JOptionPane.showMessageDialog(null,"Error de conexion"+e);
			}
			return conect;
		}
        
    
}
