package netflix.cliente;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONObject;
import netflix.cliente.janelas.PainelFilmes;

public abstract class Cliente {
    
    private String nome;
    private String email;
    private String senha;
    private String metodoPagamento;
    private String tipo;
    private String comando;
    
    private Socket sock;
    private DataInputStream in;
    private DataOutputStream out;

    public Cliente() {}

    public Cliente(String nome, String email, String senha, String metodoPagamento, String tipo, String comando) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.metodoPagamento = metodoPagamento;
        this.tipo = tipo;
        this.comando = comando;//comando vai ser de acesso ou cadastro
        
        try {
            sock = new Socket(PainelFilmes.srvAddr, PainelFilmes.srvPort);
            in = new DataInputStream(sock.getInputStream());
            out = new DataOutputStream(sock.getOutputStream());

        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        conversorJson();
    }

    private void enviarJson(JSONObject json){
        String jsonStr = json.toString();
        try {
            out.writeUTF(jsonStr);
            
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    private void conversorJson(){
        JSONObject json = new JSONObject();

        json.put("Nome", this.nome);
        json.put("Email", this.email);
        json.put("Senha", this.senha);
        json.put("Pagamento", this.metodoPagamento);
        json.put("Tipo", this.tipo);
        
        enviarJson(json);
    }
}
