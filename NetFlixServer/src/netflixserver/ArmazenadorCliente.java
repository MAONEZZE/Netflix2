package netflixserver;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArmazenadorCliente {
    private String cliente;
    
    public ArmazenadorCliente(String cliente){
        this.cliente = cliente;
    }

    private void serializador(String nomeArquivo, String cliente){
        try {
            FileOutputStream arquivo = new FileOutputStream(nomeArquivo);
            ObjectOutputStream out = new ObjectOutputStream(arquivo);
            
            out.writeObject(cliente);
            out.close();
            arquivo.close();

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
