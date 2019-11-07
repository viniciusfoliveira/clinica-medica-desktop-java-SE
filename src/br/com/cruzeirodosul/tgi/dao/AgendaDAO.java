package br.com.cruzeirodosul.tgi.dao;

import br.com.cruzeirodosul.tgi.model.Agenda;
import br.com.cruzeirodosul.tgi.util.Connections;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AgendaDAO {

    public void salvar(Agenda agenda) throws Exception {
        Connection con = Connections.getConexao();
        String sql = "INSERT INTO Agenda (exame, convenio, medico, data, status) VALUES(?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, agenda.getExame());
        ps.setString(2, agenda.getConvenio());
        ps.setString(3, agenda.getMedico());
        ps.setString(4, agenda.getData());
        ps.setString(5, agenda.getStatus());
        //Executa a instrução SQL
        ps.execute();
        ps.close();
    }

    public void Listar(JTable jtable) throws Exception {
        Connection con = Connections.getConexao();
        ResultSet rs = null;
        Statement Statement = con.createStatement();

        String sql = "SELECT ID,exame,convenio,medico,data, status AS horario FROM Agenda";
        rs = Statement.executeQuery(sql);
        Object dados[] = new Object[6];
        while (rs.next()) {
            int cod = rs.getInt("ID");
            String exame = rs.getString("exame");
            String conv = rs.getString("convenio");
            String medico = rs.getString("medico");
            String data = rs.getString("data");
            String status = rs.getString("horario");

            dados[0] = cod;
            dados[1] = exame;
            dados[2] = conv;
            dados[3] = medico;
            dados[4] = data;
            dados[5] = status;

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

        String sql = "DELETE FROM Agenda WHERE ID = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, valor);

        ((DefaultTableModel) jtable.getModel()).removeRow(linha);
        //Executa a instrução SQL
        ps.execute();
        ps.close();
    }

    public ResultSet listarDadosAgenda(String medico) throws Exception {

        Connection con = Connections.getConexao();
        ResultSet rs;
        Statement Statement = con.createStatement();

        String querrySQL = ("SELECT ID AS CODIGO, EXAME, CONVENIO, MEDICO, DATA, STATUS FROM Agenda");

        if (medico == null) {
            rs = Statement.executeQuery(querrySQL);
            return (rs);
        } else {
            if (medico.isEmpty()) {
                rs = Statement.executeQuery(querrySQL);
                return (rs);

            } else {

                querrySQL += ("WHERE MEDICO = '" + medico + "';");
                rs = Statement.executeQuery(querrySQL);
                return (rs);
            }
        }
    }
}
