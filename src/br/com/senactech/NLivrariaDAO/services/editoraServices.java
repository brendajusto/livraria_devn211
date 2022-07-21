/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senactech.NLivrariaDAO.services;
import br.com.senactech.NLivrariaDAO.livrariaDAO.editoraDAO;
import br.com.senactech.NLivrariaDAO.livrariaDAO.DaoFactory;
import br.com.senactech.NLivrariaDAO.model.editora;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author 631701777
 */
public class editoraServices {
    
    public void cadEditoraBD(editora eVO) throws SQLException{
        editoraDAO eDAO = DaoFactory.geteditoraDAO();
                eDAO.cadastrarEditora(eVO);
        
    }
    
    public ArrayList<editora> geteditorasBD() throws SQLException{
        editoraDAO eDAO = DaoFactory.geteditoraDAO();
        return eDAO.listarEditora();
    }
    
    public boolean verCNPJ(String Cnpj) throws SQLException{
        editoraDAO eDAO = DaoFactory.geteditoraDAO();
        return eDAO.verCnpj(Cnpj);
    }
    
    public void deletarEditora(int id) throws SQLException{
        editoraDAO eDAO = DaoFactory.geteditoraDAO();
        eDAO.deletarEditora(id);
    }
}
