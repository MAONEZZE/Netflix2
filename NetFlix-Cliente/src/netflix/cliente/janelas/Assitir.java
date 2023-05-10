package netflix.cliente.janelas;

import java.awt.Component;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.media.Manager;
import javax.media.MediaLocator;
import javax.media.NoPlayerException;
import javax.media.Player;
import javax.swing.JButton;

public class Assitir extends javax.swing.JPanel {

    JButton botaoPlay = new JButton();
    
    public Assitir(String nomeFilme) {
        initComponents();
        definirBackgroundImagem(nomeFilme);
        criarBotaoEPosicionar();
        myconfig();
        
    }
    
    public void criarBotaoEPosicionar() {
<<<<<<< HEAD:NetFlix-Cliente/src/netflix/cliente/Assitir.java
        jLabel1.add(button);
        button.setBounds(320, 150, 106, 120);
        button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/netflix/cliente/imagens/botaoPlayer.png")));
        
=======
        lb_fotoAssistir.add(botaoPlay);
        botaoPlay.setBounds(320, 150, 106, 120);
        botaoPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/netflix/cliente/imagens/botaoPlayer.png")));

>>>>>>> 3483bf239bf01918d6f6601df5991cf408e019db:NetFlix-Cliente/src/netflix/cliente/janelas/Assitir.java
    }
    
    public void definirBackgroundImagem(String nomeFilme) {
        switch (nomeFilme) {
            case "clubedaluta":
                break;
            case "aesperadeummilagre":
                break;
            case "belezaamericana":
                break;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_fotoAssistir = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));

        lb_fotoAssistir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/netflix/cliente/imagens/capa-clube.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_fotoAssistir, javax.swing.GroupLayout.PREFERRED_SIZE, 765, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_fotoAssistir, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void rodarFilme() throws MalformedURLException, IOException, NoPlayerException {
        
        // cria o player (que vai rodar o filme)
        File videoFile = new File("C:\\Users\\alunolages\\Documents\\videoteste.mp4");
        MediaLocator mediaLocator = new MediaLocator(videoFile.toURI().toURL());
        Player player = Manager.createPlayer(mediaLocator);
        
        // cria o componente e une ao player e coloca no painel
        Component videoComponent = player.getVisualComponent();
        jPanel2.add(videoComponent);
        
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
        
    }
    
    private void buttonMouseClicked(java.awt.event.MouseEvent evt) throws IOException, MalformedURLException, NoPlayerException {
        
        // quando o play é clicado, deve ser fazer todo o processo de requesição
        
        // faz a troca de botoes (some o play grande, inclui o pequeno play e pause, etc)
        // faz a troca de paineis 
        
<<<<<<< HEAD:NetFlix-Cliente/src/netflix/cliente/Assitir.java
        jLabel1.setVisible(false);
        
        rodarFilme();
        
=======
        lb_fotoAssistir.setVisible(false);
>>>>>>> 3483bf239bf01918d6f6601df5991cf408e019db:NetFlix-Cliente/src/netflix/cliente/janelas/Assitir.java
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lb_fotoAssistir;
    // End of variables declaration//GEN-END:variables
}
