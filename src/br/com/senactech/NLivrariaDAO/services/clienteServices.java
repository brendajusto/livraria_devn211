/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senactech.NLivrariaDAO.services;
import br.com.senactech.NLivrariaDAO.livrariaDAO.clienteDAO;
import br.com.senactech.NLivrariaDAO.livrariaDAO.DaoFactory;
import br.com.senactech.NLivrariaDAO.model.cliente;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author Marcia
 */
public class clienteServices {
    
    public void cadClienteBD(cliente cVO) throws SQLException{
        clienteDAO cDAO = DaoFactory.getclienteDAO();
        cDAO.cadastrarCliente(cVO);
    }
    
    public ArrayList<cliente> getclientesBD() throws SQLException{
        clienteDAO cDAO = DaoFactory.getclienteDAO();
        return cDAO.listarclientes();
    }
    
    public boolean verCpfBD(String Cpf) throws SQLException{
        clienteDAO cDAO = DaoFactory.getclienteDAO();
        return cDAO.verCpf(Cpf);
    }
    
    public cliente buscarClienteBD(String Cpf) throws SQLException{
        clienteDAO cDAO = DaoFactory.getclienteDAO();
        return cDAO.getByDoc(Cpf);
    }
    
    public void deletarClienteBD(int id) throws SQLException{
        clienteDAO cDAO = DaoFactory.getclienteDAO();
        cDAO.deletarCliente(id);
    }
    
    public void atualizarClienteBD(cliente cVO) throws SQLException{
        clienteDAO cDAO = DaoFactory.getclienteDAO();
        cDAO.atualizarCliente(cVO);
    }
}
