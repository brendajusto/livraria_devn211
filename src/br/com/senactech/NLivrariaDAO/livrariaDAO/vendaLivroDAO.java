/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senactech.NLivrariaDAO.livrariaDAO;

import br.com.senactech.NLivrariaDAO.conexao.Conexao;
import br.com.senactech.NLivrariaDAO.model.vendaLivro;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet; //vai receber o resultado de um select
import java.util.ArrayList;
/**
 *
 * @author 631701777
 */
public class vendaLivroDAO {
    
    public void cadastrarVenda(vendaLivro vlVO) throws SQLException{
        Connection con = Conexao.getConexao();
        Statement sta = con.createStatement();
        
        try {
            String sql;
            sql = "insert into vendaLivro values(null, "
                    + vlVO.getIdCliente() + " , "
                    + vlVO.getDataVenda() + "' , '"
                    + vlVO.getIdLivro() + " , "
                    + vlVO.getQtd() + " , "
                    + vlVO.getSubTotal() + ");";
                    sta.execute(sql);
        } catch (Exception e) {
            throw new SQLException("Erro ao cadastrar venda!" + e.getMessage());
        } finally {
            con.close();
            sta.close();
        }
    }
    
    public ArrayList<vendaLivro> listarVendas() throws SQLException{
        Connection con = Conexao.getConexao();
        Statement sta = con.createStatement();
        
        try {
            String sql;
            sql = "select * from vendaLivro";
            ResultSet rs = sta.executeQuery(sql);
            ArrayList<vendaLivro> VendaLivro = new ArrayList();
            while (rs.next()){
                vendaLivro vl = new vendaLivro();
                vl.setDataVenda(rs.getDate("DataVenda"));
                vl.setIdCliente(rs.getInt("IdCliente"));
                vl.setIdLivro(rs.getInt("IdLivro"));
                vl.setQtd(rs.getInt("Qtd"));
                vl.setSubTotal(rs.getInt("SubTotal"));
                VendaLivro.add(vl);
            } return VendaLivro;
            
        } catch (Exception e) {
            throw new SQLException("Erro ao listar!" + e.getMessage());
        } finally {
            con.close();
            sta.close();
        }
    }
    
    public void deletarVenda(int id) throws SQLException{
        Connection con = Conexao.getConexao();
        Statement sta = con.createStatement();
        
        try {
          String sql;
          sql = "delete * from livroVenda where id = " + id;
          sta.execute(sql);
          
        } catch (Exception e) {
            throw new SQLException("Erro ao deletar!" + e.getMessage());
            
        } finally {
          con.close();
          sta.close();
        }
    }
}
