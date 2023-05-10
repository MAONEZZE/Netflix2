package netflixserver;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class NetFlixServer {
    
    public static void rodarServer(int porta) {
        
        try {
            ServerSocket listenSock = new ServerSocket(porta, 5);
            
            // Aguarda conexões de clientes
            while (true) {                
                System.out.println("Waiting client connection...");
                Socket clientSock = listenSock.accept();
                System.out.println("Connected to:\n\t" +
                        clientSock.getInetAddress().toString() + 
                        " at port " + clientSock.getPort());
                
                Connection c = new Connection(clientSock);
                c.start();
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
        
    }

    public static void main(String[] args) {
        
        // define a porta que fará a conexão (TCP)
        int porta = 50000;
        
        rodarServer(porta);
    }
    
}
