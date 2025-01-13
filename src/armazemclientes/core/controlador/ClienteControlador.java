/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package armazemclientes.core.controlador;

import armazemclientes.core.entidade.ClienteEntidade;
import armazemclientes.core.servico.ClienteServico;
import java.util.List;

/**
 *
 * @author CLIENTE
 */
public class ClienteControlador {

    /*Salvar o cliente no banco de dados!*/
    public String salvarCliente(ClienteEntidade cliente){
        ClienteServico clienteServico = new ClienteServico();
        clienteServico.salvarCliente(cliente);
        return null;
    }
    
    public List<ClienteEntidade> listarClientes(){
        return new ClienteServico().listarClientes();
    }
    
    public String atualizarCliente(ClienteEntidade cliente){
        ClienteServico clienteServico = new ClienteServico();
        clienteServico.atualizarCliente(cliente);
        return null;
    }
}   
