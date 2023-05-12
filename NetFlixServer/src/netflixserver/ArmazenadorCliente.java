package netflixserver;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArmazenadorCliente {
    private List<String> cliente; 
    private Socket clientSock;
    private DataOutputStream out;
    
    public ArmazenadorCliente(List<String> listaCliente, Socket clientSock){
        this.cliente = listaCliente;
        this.clientSock = clientSock;
    }

    private void serializador(String nomeArquivo, List<String> listaCliente){
        try {
            FileOutputStream arquivo = new FileOutputStream(nomeArquivo);
            ObjectOutputStream outSerializador = new ObjectOutputStream(arquivo);
            
            outSerializador.writeObject(cliente);
            outSerializador.close();
            arquivo.close();
            
            //Enviar para o cliente que o cliente foi cadastrado
            out = new DataOutputStream(clientSock.getOutputStream());
            out.writeUTF("Cliente cadastrado no servidor");
            

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArmazenadorCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ArmazenadorCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void serializadorClienteB(){ //usar o contains para achar o tipo da conta
        String nomeArquivo = "ClientesBasicos.ser";
        
        serializador(nomeArquivo, this.cliente);
    }
    
    public void serializadorClienteP(){ //usar o contains para achar o tipo da conta
        String nomeArquivo = "ClientesPremium.ser";
        
        serializador(nomeArquivo, this.cliente);
    }
}
