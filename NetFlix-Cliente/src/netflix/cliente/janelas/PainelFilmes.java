package netflix.cliente.janelas;

import java.awt.BorderLayout;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class PainelFilmes extends javax.swing.JPanel {
    
    private String usuarioAtual;
    
    public static InetAddress srvAddr = null;
    public static int srvPort = 50000;
    public static String ip = "127.0.0.1";
    public static Scanner input = new Scanner(System.in);
    public static DataInputStream in;
    public static DataOutputStream out;
    public static Socket sock;
    
    public PainelFilmes(String usuarioAtual) {
        initComponents();
        this.usuarioAtual = usuarioAtual;
        jLabel3.setText(usuarioAtual);
        fazerConexaoServerTCP();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        bt_clubeDaLuta = new javax.swing.JButton();
        bt_belezaAmericana = new javax.swing.JButton();
        bt_eperaMilgra = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        bt_desconc = new javax.swing.JButton();
        bt_fecharProg = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setBackground(new java.awt.Color(51, 51, 51));

        bt_clubeDaLuta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/netflix/cliente/imagens/clubeDaLutaImg.jpg"))); // NOI18N
        bt_clubeDaLuta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_clubeDaLutaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt_clubeDaLutaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_clubeDaLutaMouseExited(evt);
            }
        });

        bt_belezaAmericana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/netflix/cliente/imagens/belezaAmericana.png"))); // NOI18N
        bt_belezaAmericana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_belezaAmericanaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt_belezaAmericanaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_belezaAmericanaMouseExited(evt);
            }
        });

        bt_eperaMilgra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/netflix/cliente/imagens/esperaDeUmMilagre.jpg"))); // NOI18N
        bt_eperaMilgra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                bt_eperaMilgraMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                bt_eperaMilgraMouseMoved(evt);
            }
        });
        bt_eperaMilgra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_eperaMilgraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt_eperaMilgraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_eperaMilgraMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Netflix2");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bem vindo, ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("<nome>");

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));

        jSeparator2.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));

        bt_desconc.setBackground(new java.awt.Color(153, 0, 0));
        bt_desconc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bt_desconc.setForeground(new java.awt.Color(255, 255, 255));
        bt_desconc.setText("Desconectar");
        bt_desconc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_desconcMouseClicked(evt);
            }
        });

        bt_fecharProg.setBackground(new java.awt.Color(153, 0, 0));
        bt_fecharProg.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bt_fecharProg.setForeground(new java.awt.Color(255, 255, 255));
        bt_fecharProg.setText("Sair do Netflix2");
        bt_fecharProg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_fecharProgMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(bt_clubeDaLuta, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_eperaMilgra, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_belezaAmericana, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bt_desconc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_fecharProg)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt_belezaAmericana, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_clubeDaLuta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bt_eperaMilgra, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_desconc)
                    .addComponent(bt_fecharProg))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public void enviarRequesicaoFilme(String nomeDoFilme) {
        
        try {
            // Envia a mensagem
            out.writeUTF(nomeDoFilme);
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
    
    public void fazerConexaoServerTCP() {
        
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
            sock = new Socket(srvAddr, srvPort);
            in = new DataInputStream(sock.getInputStream());
            out = new DataOutputStream(sock.getOutputStream());
            
        } catch (IOException e) {
            System.err.print("\nError: " + e.getMessage());
            System.exit(1);
        }
        
    }
    
    private void bt_eperaMilgraMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_eperaMilgraMouseMoved
        
    }//GEN-LAST:event_bt_eperaMilgraMouseMoved

    private void bt_eperaMilgraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_eperaMilgraMouseDragged
        
    }//GEN-LAST:event_bt_eperaMilgraMouseDragged

    private void bt_eperaMilgraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_eperaMilgraMouseEntered
        
        // mouse entra *A espera de um milagre*
        bt_clubeDaLuta.setBounds(50, 106, 135, 206);
        bt_eperaMilgra.setBounds(196, 106, 170, 240);
        bt_belezaAmericana.setBounds(376, 106, 135, 206);
        
    }//GEN-LAST:event_bt_eperaMilgraMouseEntered

    private void bt_eperaMilgraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_eperaMilgraMouseExited
        
        // mouse sai
        bt_clubeDaLuta.setBounds(68, 106, 135, 206);
        bt_eperaMilgra.setBounds(214, 106, 135, 206);
        bt_belezaAmericana.setBounds(358, 106, 135, 206);
        
    }//GEN-LAST:event_bt_eperaMilgraMouseExited

    private void bt_eperaMilgraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_eperaMilgraMouseClicked
        String nomeDoFilme = "aesperadeummilagre";
        
        // envia a mensagem ao servidor com o nome do filme para ele começar o envio
        enviarRequesicaoFilme(nomeDoFilme);
        
        // passa para o proximo painel (nome do filme como parametro)
        Janela.pAssistir = new Assitir(nomeDoFilme);
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().remove(Janela.pFilme);
        janela.add(Janela.pAssistir, BorderLayout.CENTER);
        janela.pack();
        
    }//GEN-LAST:event_bt_eperaMilgraMouseClicked

    private void bt_belezaAmericanaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_belezaAmericanaMouseClicked
        String nomeDoFilme = "belezaamericana";
        
        // envia a mensagem ao servidor com o nome do filme para ele começar o envio
        enviarRequesicaoFilme(nomeDoFilme);
        
        // passa para o proximo painel (nome do filme como parametro)
        Janela.pAssistir = new Assitir(nomeDoFilme);
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().remove(Janela.pFilme);
        janela.add(Janela.pAssistir, BorderLayout.CENTER);
        janela.pack();
        
    }//GEN-LAST:event_bt_belezaAmericanaMouseClicked

    private void bt_clubeDaLutaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_clubeDaLutaMouseClicked
        String nomeDoFilme = "clubedaluta";
        
        // envia a mensagem ao servidor com o nome do filme para ele começar o envio
        enviarRequesicaoFilme(nomeDoFilme);
        
        // passa para o proximo painel (nome do filme como parametro)
        Janela.pAssistir = new Assitir(nomeDoFilme);
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().remove(Janela.pFilme);
        janela.add(Janela.pAssistir, BorderLayout.CENTER);
        janela.pack();
        
    }//GEN-LAST:event_bt_clubeDaLutaMouseClicked

    private void bt_desconcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_desconcMouseClicked

        // passa para o painel de cadastro
        Janela.pCad = new PainelCadastro();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().remove(Janela.pLog);
        janela.add(Janela.pCad, BorderLayout.CENTER);
        janela.pack();

    }//GEN-LAST:event_bt_desconcMouseClicked

    private void bt_fecharProgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_fecharProgMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_fecharProgMouseClicked

    private void bt_clubeDaLutaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_clubeDaLutaMouseEntered
        
        // mouse entra *Clube da luta*
        bt_clubeDaLuta.setBounds(34, 106, 170, 240);
        
    }//GEN-LAST:event_bt_clubeDaLutaMouseEntered

    private void bt_clubeDaLutaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_clubeDaLutaMouseExited
        
        // mouse sai *Clube da luta*
        bt_clubeDaLuta.setBounds(68, 106, 135, 206);
        
    }//GEN-LAST:event_bt_clubeDaLutaMouseExited

    private void bt_belezaAmericanaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_belezaAmericanaMouseEntered
        
        // mouse entra *Beleza americana*
        bt_belezaAmericana.setBounds(358, 106, 170, 240);
        
    }//GEN-LAST:event_bt_belezaAmericanaMouseEntered

    private void bt_belezaAmericanaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_belezaAmericanaMouseExited
        
        // mouse sai *Beleza americana*
        bt_belezaAmericana.setBounds(358, 106, 135, 206);
        
    }//GEN-LAST:event_bt_belezaAmericanaMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_belezaAmericana;
    private javax.swing.JButton bt_clubeDaLuta;
    private javax.swing.JButton bt_desconc;
    private javax.swing.JButton bt_eperaMilgra;
    private javax.swing.JButton bt_fecharProg;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
