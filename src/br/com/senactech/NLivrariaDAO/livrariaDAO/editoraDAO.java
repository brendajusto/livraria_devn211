/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senactech.NLivrariaDAO.livrariaDAO;
import br.com.senactech.NLivrariaDAO.conexao.Conexao;
import br.com.senactech.NLivrariaDAO.model.editora;
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
public class editoraDAO {
    
    public void cadastrarEditora(editora eVO) throws SQLException{
        Connection con = Conexao.getConexao();
        Statement sta = con.createStatement();
        
        try {
          String sql;
          sql = "inser into editora values (null, '"
                  + eVO.getEndereco() + "', '"
                  + eVO.getGerente()+ "', '"
                  + eVO.getNmEditora()+ "', '"
                  + eVO.getTelefone()+ ");";
          
          sta.execute(sql);
          
        } catch (Exception e) {
            throw new SQLException("Erro ao cadastrar!" + e.getMessage());
            
        } finally{
            con.close();
            sta.close();
        }
    }
    
    public ArrayList<editora> listarEditora() throws SQLException{
        Connection con = Conexao.getConexao();
        Statement sta = con.createStatement();
        
        try {
           String sql;
           sql = "select * from editora";
           ResultSet rs = sta.executeQuery(sql);
           ArrayList<editora> editoras = new ArrayList();
           while (rs.next()){
               editora ed = new editora();
               //lado java /x/ lado banco
               ed.setEndereco(rs.getString("Endereco"));
               ed.setGerente(rs.getString("Gerente"));
               ed.setNmEditora(rs.getString("NmEditora"));
               ed.setTelefone(rs.getString("Telefone"));
               editoras.add(ed);
           } return editoras;
        } catch (Exception e) {
            throw new SQLException("Erro ao listar!" + e.getMessage());
            
        } finally{
           con.close();
           sta.close();
        }
    }
    
    public void deletarEditora(int id) throws SQLException{
        Connection con = Conexao.getConexao();
        Statement sta = con.createStatement();
        
        try {
          String sql;
          sql = "delete * from editora where id = " + id;
          sta.execute(sql);
          
        } catch (Exception e) {
            throw new SQLException("Erro ao deletar editora!" + e.getMessage());
            
        } finally {
            con.close();
            sta.close();
        }
    }
    
    public boolean verCnpj(String Cnpj) throws SQLException{
        Connection con = Conexao.getConexao();
        Statement sta = con.createStatement();
        
        boolean verCnpj = false;
        
        try {
            String sql;
            sql = "select Cpf from editora where Cnpj = " + Cnpj;
            ResultSet rs = sta.executeQuery(sql);
            while (rs.next()){
                verCnpj = rs.wasNull();
            }
        } catch (Exception e) {
            throw new SQLException(" CNPJ inválido!" + e.getMessage());
        } finally {
            con.close();
            sta.close();
            
        } return verCnpj;
    }
}
