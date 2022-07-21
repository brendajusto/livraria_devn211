/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senactech.NLivrariaDAO.livrariaDAO;

import br.com.senactech.NLivrariaDAO.conexao.Conexao;
import br.com.senactech.NLivrariaDAO.model.cliente;
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
public class clienteDAO {

    public void cadastrarCliente(cliente cVO) throws SQLException {
        Connection con = Conexao.getConexao();
        Statement sta = con.createStatement();

        try {
            String sql;
            sql = "insert into cliente values (null, '"
                    + cVO.getNomeCliente() + "', '"
                    + cVO.getCnpj() + "', '"
                    + cVO.getCpf() + "', '"
                    + cVO.getEndereco() + "', '"
                    + cVO.getTelefone() + ");";

            sta.execute(sql);

        } catch (SQLException e) {
            throw new SQLException("Erro ao cadastrar!" + e.getMessage());

        } finally {
            con.close();
            sta.close();

        }
    }

    public ArrayList<cliente> listarclientes() throws SQLException {
        Connection con = Conexao.getConexao();
        Statement sta = con.createStatement();
        
        try {
           String sql;
           sql = "select * from cliente";
           ResultSet rs = sta.executeQuery(sql);
           ArrayList<cliente> clientes = new ArrayList();
           while (rs.next()){
               cliente c = new cliente();
                //lado java /x/ lado banco
                c.setIdCliente(rs.getInt("idCliente"));
                c.setNomeCliente(rs.getString("nomeCliente"));
                c.setCpf(rs.getString("Cpf"));
                c.setCnpj(rs.getString("Cnpj"));
                c.setEndereco(rs.getString("endereco"));
                c.setTelefone(rs.getString("telefone"));
                clientes.add(c);
              
           } return clientes;
        } catch (SQLException e){
            throw new SQLException("Erro ao listar clientes!" + e.getMessage());
        } finally {
            con.close();
            sta.close();
        }

    }
    
    public boolean verCpf(String Cpf) throws SQLException{
        Connection con = Conexao.getConexao();
        Statement sta = con.createStatement();
        
        boolean verCpf = false;
        
        try {
            String sql;
            sql = "select Cpf from cliente where Cpf = " + Cpf;
            ResultSet rs = sta.executeQuery(sql);
            while (rs.next()){
                verCpf = rs.wasNull();
            }
        } catch (Exception e) {
            throw new SQLException(" CPF inválido!" + e.getMessage());
        } finally {
            con.close();
            sta.close();
            
        } return verCpf;
    }
    
    public cliente getByDoc(String Cpf) throws SQLException{
        Connection con = Conexao.getConexao();
        Statement sta = con.createStatement();
        
        cliente c = new cliente();
        
        try {
          String sql;
          sql = "select * from cliente where Cpf = " + Cpf;
          ResultSet rs = sta.executeQuery(sql);
          while (rs.next()){
              //lado do java |x| lado do banco
              c.setIdCliente(rs.getInt("idCliente"));
              c.setNomeCliente(rs.getString("nomeCliente"));
              c.setCpf(rs.getString("Cpf"));
              c.setEndereco(rs.getString("endereco"));
              c.setTelefone(rs.getString("telefone"));
              
          }
        } catch (Exception e) {
            throw new SQLException("Erro ao encontrar cliente!" + e.getMessage());
        } finally {
            con.close();
            sta.close();
            
        } return c;
    }
    
    public void deletarCliente(int id) throws SQLException{
        Connection con = Conexao.getConexao();
        Statement sta = con.createStatement();
        
        try {
          String sql;
          sql = "delete * from cliente where id = " + id;
          sta.execute(sql);
          
        } catch (Exception e) {
            throw new SQLException("Erro ao deletar!" + e.getMessage());
            
        } finally {
          con.close();
          sta.close();
        }
    }
    
    public void atualizarCliente(cliente cVO) throws SQLException{
        Connection con = Conexao.getConexao();
        Statement sta = con.createStatement();
        
        try {
        String sql;
        sql = "update cliente set"
                + "nome cliente = '" + cVO.getNomeCliente() + ", "
                + "Cpf = '" + cVO.getCpf() + ", "
                + "endereco = '" + cVO.getEndereco() + ", "
                + "telefone = '" + cVO.getTelefone() + ", "
                + "where idCliente = " + cVO.getIdCliente();
        
        sta.executeUpdate(sql);
                
    } catch(SQLException e){
        throw new SQLException("Erro ao atualizar!" + e.getMessage());
    } finally {
            con.close();
            sta.close();
        }
        
    }
}
