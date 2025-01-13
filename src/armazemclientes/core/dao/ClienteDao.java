/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package armazemclientes.core.dao;
import armazemclientes.core.dao.conexao.ConexaoJDBC;
import armazemclientes.core.entidade.ClienteEntidade;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author CLIENTE
 */
public class ClienteDao {
    public String salvarCliente(ClienteEntidade cliente){
        
        String sql = "INSERT INTO DADOSCLIENTE (NOME, EMAIL) VALUES (?,?)";
        PreparedStatement ps;
        
        try{
            
            ps = ConexaoJDBC.getConexao().prepareStatement(sql);
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getEmail());
            
            ps.execute();
            
        }catch(SQLException e){
            e.printStackTrace();
            return null;
        }
        JOptionPane.showMessageDialog(null, "Cliente registrado com sucesso!");
        return null;
    }
    
    public List<ClienteEntidade> listarClientes(){
       
        String sql = "SELECT * FROM DADOSCLIENTE";
        PreparedStatement ps;
        ResultSet rs;
        
        try{
            
            ps = ConexaoJDBC.getConexao().prepareStatement(sql);
            rs = ps.executeQuery();
            
            List<ClienteEntidade> clientes = new ArrayList<ClienteEntidade>();
            while(rs.next()){
                ClienteEntidade cl = new ClienteEntidade();
                cl.setId(rs.getLong(1));
                cl.setNome(rs.getString(2));
                cl.setEmail(rs.getString(3));
                
                clientes.add(cl);
            }
            return clientes;
            
        }catch(SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro na listagem dos clientes!");
        }
        JOptionPane.showMessageDialog(null, "Clientes listados com sucesso!");
        return null;
    }
    
    public String atualizarCliente(ClienteEntidade cliente){
        
        String sql = "UPDATE DADOSCLIENTE SET NOME=?, EMAIL=? WHERE IDDADOSCLIENTE=?";
        PreparedStatement ps;
        
        try{
            
            ps = ConexaoJDBC.getConexao().prepareStatement(sql);
            ps.setLong(1, cliente.getId());
            ps.setString(2, cliente.getNome());
            ps.setString(3, cliente.getEmail());
            
            ps.executeUpdate();
            ps.close();
        }catch(SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao atualizar tabela de clientes!");
        }
        JOptionPane.showMessageDialog(null, "Atualização bem sucedida!");
        return null;
    }
}
