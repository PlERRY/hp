
package Banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HPL 
 */
public class Conexao {
    
    private static final String DRIVER = "com.mysql.jdbc.Driver";
 private static final String URL = "jdbc:mysql://localhost:3306/hupi";
 private static final String USER = "root";
 private static final String PASS = "";

 
 
 public static Connection getConnection(){
     try {
         Class.forName(DRIVER);
         return DriverManager.getConnection(URL, USER, PASS) ;
         
     } catch (ClassNotFoundException | SQLException ex) {
          throw new RuntimeException("erro na conexão", ex);
     }
 }
 
 public static void closeConnection(Connection con){
   
         try {
             if(con!= null){
             con.close();
             }
         } catch (SQLException ex) {
             Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
 public static void closeConnection(Connection con, PreparedStatement pst){
        closeConnection(con);
         try {
             if(pst!= null){
             pst.close();
             }
         } catch (SQLException ex) {
             Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
 public static void closeConnection(Connection con, PreparedStatement pst, ResultSet rs){
      
        closeConnection(con, pst);
         try {
             if(rs!= null){
            rs.close();
             }
         } catch (SQLException ex) {
             Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
 
// public void executaSQL(String sql){
//       try {
//           
//        
//        Connection con = ConnectionFactory.getConnection();
//           
//           stmt = (com.mysql.jdbc.PreparedStatement) con.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
//           rs = stmt.executeQuery(sql);
//   
//     } catch (SQLException ex) {
//           JOptionPane.showMessageDialog(null, "erro de executaSQL\n"+ex.getMessage());
//            
//       }
//      }
// public void crudSQL(String sql){
//       
//        Connection con = ConnectionFactory.getConnection();
//   try{ 
//                    stmt = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql);
//                    stmt.executeUpdate();
//                     JOptionPane.showMessageDialog(null,"Item excluido com sucesso.");
//                   
//                 }catch(SQLException erro3){
//                     JOptionPane.showMessageDialog(null,"Erro ao inserir  "+ erro3);
//                      }  
//       }
      }
 
    


    
    

