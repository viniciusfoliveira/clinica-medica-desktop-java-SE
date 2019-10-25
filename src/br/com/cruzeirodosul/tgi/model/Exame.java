
package br.com.cruzeirodosul.tgi.model;

public class Exame {
    
    private int idExame;
    private String tipoExame;
    private String convenioExame;
    private String medicoExame;
    private String data;

    public Exame(String tipoExame, String convenioExame, String medicoExame, String data) {
        this.tipoExame = tipoExame;
        this.convenioExame = convenioExame;
        this.medicoExame = medicoExame;
        this.data = data;
    }

    public int getIdExame() {
        return idExame;
    }

    public void setIdExame(int idExame) {
        this.idExame = idExame;
    }

    public String getTipoExame() {
        return tipoExame;
    }

    public void setTipoExame(String tipoExame) {
        this.tipoExame = tipoExame;
    }

    public String getConvenioExame() {
        return convenioExame;
    }

    public void setConvenioExame(String convenioExame) {
        this.convenioExame = convenioExame;
    }

    public String getMedicoExame() {
        return medicoExame;
    }

    public void setMedicoExame(String medicoExame) {
        this.medicoExame = medicoExame;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    
}
