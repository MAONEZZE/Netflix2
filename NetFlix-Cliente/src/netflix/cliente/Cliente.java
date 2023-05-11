package netflix.cliente;

import org.json.simple.JSONObject;

public abstract class Cliente {
    
    private String nome;
    private String email;
    private String senha;
    private String metodoPagamento;
    private String tipo;

    public Cliente() {}

    public Cliente(String nome, String email, String senha, String metodoPagamento, String tipo) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.metodoPagamento = metodoPagamento;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    private void conversorJson(){
        JSONObject json = new JSONObject();

        json.put("Nome", this.nome);
        json.put("Email", this.email);
        json.put("Senha", this.senha);
        json.put("Pagamento", this.metodoPagamento);
        json.put("Tipo", this.tipo);
        
        //enviarJson(json);
    }
}
