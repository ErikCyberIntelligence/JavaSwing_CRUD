/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package armazemclientes.core.controlador;

import armazemclientes.core.entidade.VendaEntidade;
import armazemclientes.core.servico.VendaServico;
import java.util.List;

/**
 *
 * @author CLIENTE
 */
public class VendaControlador {
    public String salvarVenda(VendaEntidade venda){
        VendaServico vendaServico = new VendaServico();
        vendaServico.salvarVenda(venda);
        return null;
    }
    public List<VendaEntidade> listarVendas(){
        return new VendaServico().listarVendas();
    }
}
