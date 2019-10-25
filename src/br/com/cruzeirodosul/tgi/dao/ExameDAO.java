package br.com.cruzeirodosul.tgi.dao;

import br.com.cruzeirodosul.tgi.model.Agenda;
import br.com.cruzeirodosul.tgi.model.Exame;
import br.com.cruzeirodosul.tgi.util.Connections;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class ExameDAO {
    
    public void salvar(Exame exame) throws Exception {
        Connection con = Connections.getConexao();
        String sql = "INSERT INTO Exame(exame, convenio, medico, data) VALUES(?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1,exame.getTipoExame());
        ps.setString(2,exame.getConvenioExame());
        ps.setString(3, exame.getMedicoExame());
        ps.setString(4,exame.getData());
        //Executa a instrução SQL
        ps.execute();
        ps.close();
    }
}
