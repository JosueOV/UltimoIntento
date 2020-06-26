///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package Metodos_SQL;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.Statement;
//import javax.swing.table.DefaultTableModel;
//
///**
// *
// * @author Ya Sabes Quien Soy =D
// */
//public class MetodosSQL {
//    
//    public static ConexionBD conexion = new ConexionBD();
//    
//    public static PreparedStatement sentencia_preparada;
//    
//    public static ResultSet resultado;
//    
//    public static String sql;
//    
//    public static int resultado_numero = 0;
//    
//    
//  public static String buscarNombre(String correo){
//            String busnom = null;
//            Connection conexion = null;
//            String sql = "SELECT * FROM clientes";
//            ConexionBD cc = new ConexionBD();
//            Connection cn = cc.conexion();
//            Statement st;
//            
//            try {
//                conexion = ConexionBD.conectar
//                String sentenciab = ("SELECT nombre , apellidos FROM clientes WHERE correo = '" + correo + "'");
//                
//                
//            }catch(Exception e){
//                
//            }
//        }
//}
