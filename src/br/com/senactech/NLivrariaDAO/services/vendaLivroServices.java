/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senactech.NLivrariaDAO.services;

import br.com.senactech.NLivrariaDAO.livrariaDAO.DaoFactory;
import br.com.senactech.NLivrariaDAO.livrariaDAO.vendaLivroDAO;
import br.com.senactech.NLivrariaDAO.model.vendaLivro;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author 631701777
 */
public class vendaLivroServices {
    public void cadvendaLivroBD(vendaLivro vlVO) throws SQLException{
        vendaLivroDAO vlDAO = DaoFactory.getvendaLivroDAO();
                vlDAO.cadastrarVenda(vlVO);
        
    }
    
    public ArrayList<vendaLivro> getvendaLivroBD() throws SQLException{
        vendaLivroDAO vlDAO = DaoFactory.getvendaLivroDAO();
        return vlDAO.listarVendas();
    }
    
    
    
    public void deletarvendaLivroBD(int id) throws SQLException{
        vendaLivroDAO vlDAO = DaoFactory.getvendaLivroDAO();
        vlDAO.deletarVenda(id);
    }
}
