package netflixserver;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArmazenadorCliente {
    private List<String> listaClienteBasicoJson = new ArrayList();
    private List<String> listaClientePremiumJson = new ArrayList();

    public List<String> getListaClienteBasicoJson() {
        return listaClienteBasicoJson;
    }

    public void setListaClienteBasicoJson(List<String> listaClienteBasicoJson) {
        this.listaClienteBasicoJson = listaClienteBasicoJson;
    }

    public List<String> getListaClientePremiumJson() {
        return listaClientePremiumJson;
    }

    public void setListaClientePremiumJson(List<String> listaClientePremiumJson) {
        this.listaClientePremiumJson = listaClientePremiumJson;
    }

    private void serializador(String nomeArquivo, List<String> listaCliente){
        try {
            FileOutputStream arquivo = new FileOutputStream(nomeArquivo);
            ObjectOutputStream out = new ObjectOutputStream(arquivo);
            
            out.writeObject(listaCliente);
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
        
        serializador(nomeArquivo, this.listaClienteBasicoJson);
    }
    
    public void serializadorClienteP(){ //usar o contains para achar o tipo da conta
        String nomeArquivo = "ClientesPremium.ser";
        
        serializador(nomeArquivo, this.listaClientePremiumJson);
    }
}
