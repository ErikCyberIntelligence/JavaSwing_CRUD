/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package armazemclientes.core.servico;

import armazemclientes.core.dao.ClienteDao;
import armazemclientes.core.entidade.ClienteEntidade;
import java.util.List;


/**
 *
 * @author CLIENTE
 */
public class ClienteServico {
    public String salvarCliente(ClienteEntidade cliente){
        ClienteDao clienteDao = new ClienteDao();
        clienteDao.salvarCliente(cliente);
        return null;
    }
    
    public List<ClienteEntidade> listarClientes(){
        return new ClienteDao().listarClientes();
    }
    
    public String atualizarCliente(ClienteEntidade cliente){
        ClienteDao clienteDao = new ClienteDao();
        clienteDao.atualizarCliente(cliente);
        return null;
    }
}
