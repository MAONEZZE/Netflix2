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
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import static netflix.cliente.janelas.PainelFilmes.in;
import static netflix.cliente.janelas.PainelFilmes.out;

public class Assitir extends javax.swing.JPanel {

    JButton botaoPlay = new JButton();
    JButton botaoVoltar = new JButton();
    
    public Assitir(String nomeFilme) {
        initComponents();
        definirBackgroundImagem(nomeFilme);
        criarBotaoEPosicionar();
        myconfig();
        
    }
    
    public void encerrarFilme() {
        
        String msg = "encerrar";
        
        try {
            // Envia a mensagem
            out.writeUTF(msg);
            } catch (IOException ex) {
                Logger.getLogger(PainelFilmes.class.getName()).log(Level.SEVERE, null, ex);
            }

            // Recebe a resposta
            String data = "";
            try {
                data = in.readUTF();
            } catch (IOException ex) {
                Logger.getLogger(PainelFilmes.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.print("\n[Response]: " + data);
        
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
        
        // instalar o javaFX e criar um painel dele para rodar o filme e criar o player

        
        
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
        
        // desabilita a visibilidade de tudo e habilita a do label que vai ter o player do javaFX
        
        
        botaoPlay.setVisible(false);
    }
    
    private void buttonMouseClicked2(java.awt.event.MouseEvent evt) throws IOException, MalformedURLException, NoPlayerException {
        
        // botao voltar
        
        // pergunta se o usuario quer sair do filme
        int option = JOptionPane.showInternalConfirmDialog(null, "Tem certeza que deseja sair do filme?", "Netflix2", JOptionPane.INFORMATION_MESSAGE);  
        
        if (option == 0) {
            // faz o encerramento do filme no servidor
            encerrarFilme();

            // volta para o painel de filmes
            JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);
            janela.getContentPane().remove(Janela.pAssistir);
            janela.add(Janela.pFilme);
            janela.pack();
        }
        else {
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lb_fotoAssistir;
    // End of variables declaration//GEN-END:variables
}
