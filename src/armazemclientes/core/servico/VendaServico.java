/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package armazemclientes.core.servico;

import armazemclientes.core.dao.VendaDao;
import armazemclientes.core.entidade.VendaEntidade;
import java.util.List;

/**
 *
 * @author CLIENTE
 */
public class VendaServico {
    public String salvarVenda(VendaEntidade venda){
        VendaDao vendaDao = new VendaDao();
        vendaDao.salvarVenda(venda);
        return null;
    }
    public List<VendaEntidade> listarVendas(){
        return new VendaDao().listarVendas();
    }
}
