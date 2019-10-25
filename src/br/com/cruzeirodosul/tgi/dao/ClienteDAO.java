package br.com.cruzeirodosul.tgi.dao;

import br.com.cruzeirodosul.tgi.model.Cliente;
import br.com.cruzeirodosul.tgi.util.Connections;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ClienteDAO {
    
    public void salvar(Cliente cliente) throws Exception {
        Connection con = Connections.getConexao();
        String sql = "INSERT INTO Cliente (nome, rg, endereco, telefone, email, login, senha) VALUES(?,?,?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1,cliente.getNomeCliente());
        ps.setString(2,cliente.getRgCliente());
        ps.setString(3,cliente.getEnderecoCliente());
        ps.setString(4,cliente.getTelefoneCliente());
        ps.setString(5, cliente.getEmailCliente());
        ps.setString(6,cliente.getLoginCliente());
        ps.setString(7,cliente.getSenhaCliente());
        //Executa a instrução SQL
        ps.execute();
        ps.close();
    }
      public void alterar(Cliente cliente) throws Exception {
        Connection con = Connections.getConexao();
        String sql = "UPDATE Cliente SET senha =? WHERE login=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, cliente.getSenhaCliente());
        ps.setString(2, cliente.getNomeCliente());
       //Executa a instrução SQL
        ps.execute();
        ps.close();
    }
      
      
     public boolean autentificar(String login, String senha) throws Exception{            
            Connection con = Connections.getConexao();
            String sql = "select * from Cliente where login=? and senha=?";
            //Prepara a instrução SQL
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,login);
            ps.setString(2,senha);
            //Executa a instrução SQL
            ResultSet rs = ps.executeQuery();
            return rs.next();        
    }
     
     public void Listar(JTable jtable) throws Exception {
        Connection con = Connections.getConexao();
        ResultSet rs = null;
        Statement Statement = con.createStatement();

        String sql = "SELECT ID,nome,email,login,senha FROM Cliente";
        rs = Statement.executeQuery(sql);
        Object dados [] = new Object[5];
        while (rs.next()) {
            int cod = rs.getInt("ID");
            String nome = rs.getString("nome");
            String email = rs.getString("email");
            String login = rs.getString("login");
            String senha = rs.getString("senha");


            dados[0] = cod;
            dados[1] = nome;
            dados[2] = email;
            dados[3] = login;
            dados[4] = senha;
            
           ((DefaultTableModel) jtable.getModel()).addRow(dados);
        }
        rs.close();
        Statement.close();
        con.close();      
    }
     
      public void Exluir(JTable jtable) throws Exception {
        Connection con = Connections.getConexao();
        int linha = jtable.getSelectedRow(); 
        int valor = Integer.parseInt(jtable.getValueAt(linha, 0).toString());
  
        String sql = "DELETE FROM Cliente WHERE ID = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1,valor);
        
        ((DefaultTableModel)jtable.getModel()).removeRow(linha);
         //Executa a instrução SQL
         ps.execute();
         ps.close();
    }
    
}
