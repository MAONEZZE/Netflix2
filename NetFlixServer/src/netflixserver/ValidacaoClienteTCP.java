package netflixserver;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ValidacaoClienteTCP extends Thread {
    DataInputStream in;
    DataOutputStream out;
    Socket clientSock;

    public ValidacaoClienteTCP(Socket sock) {  
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
            List<String> listaClienteB = new ArrayList();
            List<String> listaClienteP = new ArrayList();
            ArmazenadorCliente armC;
            // Looping de recebimento de mensagens
            while (true) {
                // Aguarda o recebimento da mensagem
                String msgIn = in.readUTF();
                System.out.println("\n\t[Received from " + clientSock.getInetAddress().toString() + ":" + clientSock.getPort() + "]: " + msgIn);

                
                if(msgIn.contains("Basico")){
                    listaClienteB.add(msgIn);
                    armC = new ArmazenadorCliente(listaClienteB, clientSock);
                    armC.serializadorClienteB();
                }
                else if(msgIn.contains("Premium")){
                    
                    listaClienteB.add(msgIn);
                    armC = new ArmazenadorCliente(listaClienteP, clientSock);
                    armC.serializadorClienteP();
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
            
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
