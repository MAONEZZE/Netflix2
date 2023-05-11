package netflixserver;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Connection extends Thread {
    DataInputStream in;
    DataOutputStream out;
    Socket clientSock;
    
    public void rodarFilme(String nomeDoFilme) {
        // encontramos onde está o filme
        String urlDiretorioPadrao = "C:\\Users\\alunolages\\Documents\\movies";
        
        String urlDoFilme = urlDiretorioPadrao.concat("\\");
        urlDoFilme = urlDiretorioPadrao.concat(nomeDoFilme);
        urlDoFilme = urlDoFilme.concat(".mp4");
        
        // pega o arquivo do filme e divide para enviar pelo protocolo UDP
        
    }
    
    public void encerrarFilme() {
        
        // para o envio do filme e encerra todo o processo que envolve este
        
    }
    
    public void tratarMensagem(String msg) {
        
        if (msg.equals("clubedaluta") || msg.equals("aesperadeummilagre") || msg.equals("belezaamericana")) {
            rodarFilme(msg);
        }
        else {
            if (msg.equals("encerrar")) {
                encerrarFilme();
            }
        }
        
    }
    
    public Connection(Socket sock) {        
        try {
            clientSock = sock;
            in = new DataInputStream(clientSock.getInputStream());
            out = new DataOutputStream(clientSock.getOutputStream());
        } catch (IOException ex) {
            System.err.println("Error: " + ex.getMessage());
        }        
    }
    
    @Override
    public void run() {
        try {
            // Looping de recebimento de mensagens
            while (true) {
                // Aguarda o recebimento da mensagem
                String msgIn = in.readUTF();
                System.out.println("\n\t[Received from " +
                        clientSock.getInetAddress().toString() +
                        ":" + clientSock.getPort() + "]: " +
                        msgIn);
                
                // Trata a mensagem
                tratarMensagem(msgIn);
                
                // Envia a resposta para o cliente
                System.out.println("\n\tSending response...");
                String msgOut = "Receibed by server!";
                out.writeUTF(msgOut);
                
                // Verifica se o cliente enviou o "<close>"
                if ("<close>".equals(msgIn)) {
                    System.out.println("\n\tClosing connection with " +
                            clientSock.getInetAddress().toString() + 
                            ":" + clientSock.getPort() + "...");
                    in.close();
                    out.close();
                    clientSock.shutdownInput();
                    clientSock.shutdownOutput();
                    break;
                }
            }
            
            // Fecha o socket
            clientSock.close();
            
            // Elimina a thread
            interrupt();
            
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
