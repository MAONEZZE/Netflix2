package netflixserver;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class RodarFilmeTCP extends Thread {

    DataInputStream in;
    DataOutputStream out;
    Socket clientSock;
    
    public RodarFilmeTCP(Socket sock) {
        
        try {
            clientSock = sock;
            in = new DataInputStream(clientSock.getInputStream());
            out = new DataOutputStream(clientSock.getOutputStream());
            
        } catch (IOException ex) {
            System.err.println("Error: " + ex.getMessage());
        }
        
    }
    
    public void run() {
        
        try {
            
            while (true) {
                // variaveis de inicia
                int numeroFragmentos = 0;
                String urlDosFragmentos = "C:\\Users\\alunolages\\Documents\\";
                
                // Aguarda o recebimento da mensagem
                String msgIn = in.readUTF();
                System.out.println("\n\t[Received from " + clientSock.getInetAddress().toString() + ":" + clientSock.getPort() + "]: " + msgIn);

                // verifica se o comando é um nome de filme
                if(msgIn.contains("clubedaluta") || msgIn.contains("aesperadeummilagre") || msgIn.contains("belezaamericana")){
                    
                    urlDosFragmentos = urlDosFragmentos.concat(msgIn);
                    switch (msgIn) {
                        case "clubedaluta":
                            numeroFragmentos = 982;
                            break;
                        case "aesperadeummilagre":
                            numeroFragmentos =1032;
                            break;
                        case "belezaamericana":
                            numeroFragmentos = 3978;
                            break;
                    }
                    
                    // faz o envio dos fragmentos via protocolo (UDP)
                    
                    int srvPort = clientSock.getPort() - 1;
                    InetAddress srvIPAddr = clientSock.getInetAddress();
                    
                    // loop para enviar todos os fragmentos
                    for (int i=0;i<(numeroFragmentos+1);i++) {
                        
                        
                        
                    }
                    
                }
                else {
                    
                }
                
                
                
                
                
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
            
        }
        catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
        
    }
    
}
