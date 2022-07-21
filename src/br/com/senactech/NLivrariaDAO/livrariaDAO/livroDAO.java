/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senactech.NLivrariaDAO.livrariaDAO;

import br.com.senactech.NLivrariaDAO.conexao.Conexao;
import br.com.senactech.NLivrariaDAO.model.livro;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet; //vai receber o resultado de um select
import java.util.ArrayList;
/**
 *
 * @author Marcia
 */
public class livroDAO {
    
    public void cadastrarLivro(livro lVO) throws SQLException{
        Connection con = Conexao.getConexao();
        Statement sta = con.createStatement();
        
        try {
           String sql;
           sql = "insert into livro values(null, '"
                   + lVO.getTitulo() + "', '"
                   + lVO.getAutor() + "', '"
                   + lVO.getAssunto()+ "', '"
                   + lVO.getIsbn()+ ");";
                   sta.execute(sql);
                  
        } catch (Exception e) {
            throw new SQLException("Erro ao cadastrar livro!" + e.getMessage());
        } finally {
            con.close();
            sta.close();
        }
    }
    
    public ArrayList<livro> listarLivros() throws SQLException{
        Connection con = Conexao.getConexao();
        Statement sta = con.createStatement();
        
        try {
           String sql;
           sql = "select * from livro";
           ResultSet rs = sta.executeQuery(sql);
           ArrayList<livro> livros = new ArrayList();
           while (rs.next()){
               livro l = new livro();
                //lado java /x/ lado banco
                l.setAssunto(rs.getString("Assunto"));
                l.setAutor(rs.getString("Autor"));
                l.setTitulo(rs.getString("Titulo"));
                l.setIsbn(rs.getString("Isbn"));
                livros.add(l);
           } return livros;
           
        } catch (Exception e) {
            throw new SQLException("Erro ao listar!" + e.getMessage());
        } finally {
            con.close();
            sta.close();
        }
    }
    
    public void deletarLivro(int id) throws SQLException{
        Connection con = Conexao.getConexao();
        Statement sta = con.createStatement();
        
        try {
           String sql;
           sql = "delete * from livro where id = " + id;
           sta.execute(sql);
        } catch (Exception e) {
            throw new SQLException("Erro ao deletar!" + e.getMessage());
            
        } finally{
            con.close();
            sta.close();
        }
    }
    
    
}
