
package br.com.cruzeirodosul.tgi.model;

import java.io.Serializable;

public class Cliente implements Serializable{
    
    private int idCliente;
    private String nomeCliente;
    private String rgCliente;
    private String enderecoCliente;
    private String telefoneCliente;
    private String emailCliente;
    private String loginCliente;
    private String senhaCliente;

   public Cliente (){}
    
    public Cliente (String nomeCliente,String senha){
        this.nomeCliente = nomeCliente;
        this.senhaCliente = senha;
    }
    
    public Cliente(String nomeCliente, String rgCliente, String enderecoCliente, String telefoneCliente, String emailCliente, String loginCliente, String senhaCliente) {
        this.nomeCliente = nomeCliente;
        this.rgCliente = rgCliente;
        this.enderecoCliente = enderecoCliente;
        this.telefoneCliente = telefoneCliente;
        this.emailCliente = emailCliente;
        this.loginCliente = loginCliente;
        this.senhaCliente = senhaCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getRgCliente() {
        return rgCliente;
    }

    public void setRgCliente(String rgCliente) {
        this.rgCliente = rgCliente;
    }

    public String getEnderecoCliente() {
        return enderecoCliente;
    }

    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getLoginCliente() {
        return loginCliente;
    }

    public void setLoginCliente(String loginCliente) {
        this.loginCliente = loginCliente;
    }

    public String getSenhaCliente() {
        return senhaCliente;
    }

    public void setSenhaCliente(String senhaCliente) {
        this.senhaCliente = senhaCliente;
    }
}
