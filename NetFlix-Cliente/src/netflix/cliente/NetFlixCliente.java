package netflix.cliente;

import java.net.InetAddress;
import netflix.cliente.janelas.Janela;

public class NetFlixCliente {

    public static void main(String[] args) {
        InetAddress srvAddr = null;
        int srvPort = 0;
        
        if(args.length == 2){
            try{
                srvAddr = InetAddress.getByName(args[0]);
            }catch(Exception e){
                System.err.println("ERROR: \n\tServer address: "+e.getMessage());
                System.exit(1);
            }
            srvPort = Integer.parseInt(args[1]);
            if((srvPort < 1) || (srvPort > 65535)){
                System.err.println("ERRO - Porta Invalida Faixa (1 - 65535)");
            }
        }
        else{
            System.err.println("Use: TCP <IP server>");
        }
        
        Janela j1 = new Janela(srvAddr, srvPort);
        j1.setLocationRelativeTo(null);
        j1.setVisible(true);
        
    }
    
}
