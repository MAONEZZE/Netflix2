package netflix.cliente;

public class Cliente {
    
    private String nome;
    private String email;
    private String senha;
    private String metodoPagamento;

    public Cliente() {
    }

    public Cliente(String nome, String email, String senha, String metodoPagamento) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.metodoPagamento = metodoPagamento;
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

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", email=" + email + ", senha=" + senha + ", metodoPagamento=" + metodoPagamento + '}';
    }
    
    
}
