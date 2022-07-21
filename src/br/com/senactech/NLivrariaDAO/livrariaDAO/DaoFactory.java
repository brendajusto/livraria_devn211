/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senactech.NLivrariaDAO.livrariaDAO;

/**
 *
 * @author Marcia
 */
public class DaoFactory {

    private static clienteDAO cDAO = new clienteDAO();
    private static editoraDAO eDAO = new editoraDAO();

    public static clienteDAO getclienteDAO() {
        return cDAO;

    }

    public static editoraDAO geteditoraDAO() {
        return eDAO;
    }
}
