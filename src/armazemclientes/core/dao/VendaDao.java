/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package armazemclientes.core.dao;
import armazemclientes.core.dao.conexao.ConexaoJDBC;
import armazemclientes.core.entidade.VendaEntidade;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author CLIENTE
 */
public class VendaDao {
    public String salvarVenda(VendaEntidade venda){
        
        String sql = "INSERT INTO DADOSVENDA (VENDA, FP) VALUES (?,?)";
        PreparedStatement ps;
        
        try{
        
            ps = ConexaoJDBC.getConexao().prepareStatement(sql);
            ps.setDouble(1, venda.getValorVenda());
            ps.setString(2, venda.getFp());
            
            ps.execute();
        }catch(SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar inserir os dados no banco!");
        }
        JOptionPane.showMessageDialog(null, "Venda registrada com sucesso!");
        return null;
    }
    
    public List<VendaEntidade> listarVendas(){
        
        String sql = "SELECT * FROM DADOSVENDA";
        PreparedStatement ps;
        ResultSet rs;
        
        try{
            
            ps = ConexaoJDBC.getConexao().prepareStatement(sql);
            rs = ps.executeQuery();
            
            List<VendaEntidade> vendas = new ArrayList<VendaEntidade>();
            while(rs.next()){
                VendaEntidade vs = new VendaEntidade();
                vs.setId(rs.getLong(1));
                vs.setValorVenda(rs.getDouble(2));
                vs.setFp(rs.getString(3));
                
                vendas.add(vs);
            }
            return vendas;
            
        }catch(SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao tentar listar os dados!");
        }
        JOptionPane.showMessageDialog(null, "Vendas listadas com sucesso!");
        return null;
    }
}
