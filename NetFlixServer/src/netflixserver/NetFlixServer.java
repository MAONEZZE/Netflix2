package netflixserver;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class NetFlixServer {
    
    public static void rodarServer(int porta) {
        
        try {
            //5 --> quantidade de pessoas que poderão conectar ao mesmo tempo no servidor
            ServerSocket listenSock = new ServerSocket(porta, 5);
            
            // Aguarda conexões de clientes
            while (true) {                
                System.out.println("Waiting client connection...");
                Socket clientSock = listenSock.accept();
                System.out.println("Connected to:\n\t" +
                        clientSock.getInetAddress().toString() + 
                        " at port " + clientSock.getPort());
                
                ValidacaoClienteTCP c = new ValidacaoClienteTCP(clientSock);
                c.start();
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
        
    }

    public static void main(String[] args) {
        //Lembrete* a concção tcp é para a validação dos dados do usuario
        //udp vai ser para a tranmissão do filme
        //Porta sendo passada pelo argumento
        rodarServer(Integer.parseInt(args[0]));
    }
    
}
