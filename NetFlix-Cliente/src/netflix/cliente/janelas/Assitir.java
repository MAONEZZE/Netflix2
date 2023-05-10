package netflix.cliente.janelas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.media.Manager;
import javax.media.MediaLocator;
import javax.media.NoPlayerException;
import javax.media.Player;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Assitir extends javax.swing.JPanel {

    JButton botaoPlay = new JButton();
    JButton botaoVoltar = new JButton();
    
    public Assitir(String nomeFilme) {
        initComponents();
        definirBackgroundImagem(nomeFilme);
        criarBotaoEPosicionar();
        myconfig();
        
    }
    
    public void criarBotaoEPosicionar() {
        lb_fotoAssistir.add(botaoPlay);
        lb_fotoAssistir.add(botaoVoltar);
        botaoPlay.setBounds(320, 150, 106, 120);
        botaoVoltar.setBounds(10, 10, 50, 40);
        botaoPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/netflix/cliente/imagens/botaoPlayer.png")));
        botaoVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/netflix/cliente/imagens/botaoVoltar.png")));
    }
    
    public void definirBackgroundImagem(String nomeFilme) {
        switch (nomeFilme) {
            case "clubedaluta":
                lb_fotoAssistir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/netflix/cliente/imagens/capa-clube.png")));
                break;
            case "aesperadeummilagre":
                lb_fotoAssistir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/netflix/cliente/imagens/capa-a-espera-de-um-milagre.png")));
                break;
            case "belezaamericana":
                lb_fotoAssistir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/netflix/cliente/imagens/capa-beleza-americana.png")));
                break;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_fotoAssistir = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_fotoAssistir, javax.swing.GroupLayout.PREFERRED_SIZE, 765, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_fotoAssistir, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public void rodarFilme() throws MalformedURLException, IOException, NoPlayerException {
        
        // cria o player (que vai rodar o filme)
        File videoFile = new File("C:\\Users\\alunolages\\Documents\\videoteste.mp4");
        MediaLocator mediaLocator = new MediaLocator(videoFile.toURI().toURL());
        Player player = Manager.createPlayer(mediaLocator);
        
        // cria o componente e une ao player e coloca no painel
        Component videoComponent = player.getVisualComponent();
        //jPanel.add(videoComponent);
        
        // roda o filme
        player.start();

        
        // loop infinito para rodar o filme. 
        // as interações (pause, etc) devem ser feitas por uma classe externa, via metodo
        while (true) {
            
            
            
        }
        
    }
    
    public void myconfig() {
        
        botaoPlay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
                    buttonMouseClicked(evt);
                } catch (IOException ex) {
                    Logger.getLogger(Assitir.class.getName()).log(Level.SEVERE, null, ex);
                } catch (NoPlayerException ex) {
                    Logger.getLogger(Assitir.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        botaoVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
                    buttonMouseClicked2(evt);
                } catch (IOException ex) {
                    Logger.getLogger(Assitir.class.getName()).log(Level.SEVERE, null, ex);
                } catch (NoPlayerException ex) {
                    Logger.getLogger(Assitir.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
    }
    
    private void buttonMouseClicked(java.awt.event.MouseEvent evt) throws IOException, MalformedURLException, NoPlayerException {
        
        // quando o play é clicado, deve ser fazer todo o processo de requesição
        
        // faz a conexão ao servidor (TCP)
        // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        
        InetAddress srvAddr = null;
        int srvPort = 50000;
        String ip = "127.0.0.1";
        Scanner input = new Scanner(System.in);
        String outStr;
        
        try {
            srvAddr = InetAddress.getByName(ip);
        } catch (UnknownHostException e) {
            System.err.println("Error!\n\tServer address: " +
                    e.getMessage());
            System.exit(1);
        }
        
        try {
            System.out.println("Connecting to " + srvAddr.toString()
            + ":" + srvPort + "...");
            Socket sock = new Socket(srvAddr, srvPort);
            DataInputStream in = new DataInputStream(sock.getInputStream());
            DataOutputStream out = new DataOutputStream(sock.getOutputStream());
            
            // Looping de comunicação
            while (true) {                
                // Obtém a mensagem a ser enviada
                System.out.print("\nMessage: ");
                outStr = input.nextLine();
                
                // Envia a mensagem
                out.writeUTF(outStr);
                
                // Recebe a resposta
                String data = in.readUTF();
                System.out.print("\n[Response]: " + data);
                
                // Fecha a conexão
                if ("<close>".equals(outStr)) {
                    System.out.print("\nClosing client sock!");
                    sock.shutdownInput();
                    sock.shutdownOutput();
                    break;
                }
            }
            
        } catch (IOException e) {
            System.err.print("\nError: " + e.getMessage());
            System.exit(1);
        }
        
        // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        
        // faz a troca de botoes (some o play grande, inclui o pequeno play e pause, etc)
        // faz a troca de paineis 
        
        botaoPlay.setVisible(false);
    }
    
    private void buttonMouseClicked2(java.awt.event.MouseEvent evt) throws IOException, MalformedURLException, NoPlayerException {
        
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().remove(Janela.pAssistir);
        janela.add(Janela.pFilme);
        janela.pack();
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lb_fotoAssistir;
    // End of variables declaration//GEN-END:variables
}
