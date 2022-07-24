/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senactech.NLivrariaDAO.services;

import br.com.senactech.NLivrariaDAO.model.livro;
import java.sql.SQLException;
import br.com.senactech.NLivrariaDAO.livrariaDAO.DaoFactory;
import br.com.senactech.NLivrariaDAO.livrariaDAO.livroDAO;
import java.util.ArrayList;
/**
 *
 * @author 631701777
 */
public class livroServices {
    
    public void cadLivroBD(livro lVO) throws SQLException{
        livroDAO lDAO = DaoFactory.getlivroDAO();
        lDAO.cadastrarLivro(lVO);
    }
    
    public ArrayList<livro> getlivroBD()throws SQLException{
        livroDAO lDAO = DaoFactory.getlivroDAO();
        return lDAO.listarLivros();
    }
    
    public void deletarLivroBD(int id) throws SQLException{
        livroDAO lDAO = DaoFactory.getlivroDAO();
        lDAO.deletarLivro(id);
    }
    
    public void atuaEstoqueBD(int idLivro, int venda, int devolucao) throws SQLException{
        livroDAO lDAO = DaoFactory.getlivroDAO();
        lDAO.atualizarEstoque(idLivro, venda, devolucao);
    }
}
