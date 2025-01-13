/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package armazemclientes.core.dao.conexao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author CLIENTE
 */
public class ConexaoJDBC {
    private static final String URL = "jdbc:mysql://localhost:3306/banco";
    private static final String USER = "root";
    private static final String PASSWORD = "root";
    
    private static Connection conn;
    public static Connection  getConexao(){
        
        try{
            if(conn == null){
               conn = DriverManager.getConnection(URL, USER, PASSWORD);
               return conn; 
            }
            else{
                return conn;
            }
            }catch(SQLException e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro no estabelecimento da conexão!");
            }
        JOptionPane.showMessageDialog(null, "A conexão foi estabelecida com sucesso!");
        return null;
    }
}
