package netflix.cliente.janelas;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.util.InputMismatchException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static netflix.cliente.janelas.PainelFilmes.out;
import org.json.simple.JSONObject;

public class PainelCadastro extends javax.swing.JPanel {

    private String rbBoletoCartao;
    private String rbPremiumBasico;
    
    public PainelCadastro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        rb_premium = new javax.swing.JRadioButton();
        rb_basico = new javax.swing.JRadioButton();
        rb_boleto = new javax.swing.JRadioButton();
        rb_cartaoC = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txf_senha = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txf_email = new javax.swing.JTextField();
        txf_nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        bt_cadastrar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        bt_voltar = new javax.swing.JButton();
        lbl_confirmacaoServer = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));

        rb_premium.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(rb_premium);
        rb_premium.setForeground(new java.awt.Color(255, 255, 255));
        rb_premium.setText("Premium");
        rb_premium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_premiumMouseClicked(evt);
            }
        });

        rb_basico.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(rb_basico);
        rb_basico.setForeground(new java.awt.Color(255, 255, 255));
        rb_basico.setText("Básico");
        rb_basico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_basicoMouseClicked(evt);
            }
        });

        rb_boleto.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup2.add(rb_boleto);
        rb_boleto.setForeground(new java.awt.Color(255, 255, 255));
        rb_boleto.setText("Boleto");
        rb_boleto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_boletoMouseClicked(evt);
            }
        });

        rb_cartaoC.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup2.add(rb_cartaoC);
        rb_cartaoC.setForeground(new java.awt.Color(255, 255, 255));
        rb_cartaoC.setText("Cartão de Crédito");
        rb_cartaoC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_cartaoCMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Método de pagamento: ");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tipo de conta: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Senha: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Email: ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome: ");

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("Netflix2");

        bt_cadastrar.setBackground(new java.awt.Color(153, 0, 0));
        bt_cadastrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bt_cadastrar.setForeground(new java.awt.Color(255, 255, 255));
        bt_cadastrar.setText("Cadastrar");
        bt_cadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_cadastrarMouseClicked(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));

        bt_voltar.setBackground(new java.awt.Color(153, 0, 0));
        bt_voltar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bt_voltar.setForeground(new java.awt.Color(255, 255, 255));
        bt_voltar.setText("Voltar");
        bt_voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_voltarMouseClicked(evt);
            }
        });

        lbl_confirmacaoServer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_confirmacaoServer.setForeground(new java.awt.Color(0, 153, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_cadastrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txf_nome, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                    .addComponent(txf_email, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                    .addComponent(txf_senha)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rb_boleto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rb_cartaoC))
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rb_basico)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rb_premium)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(lbl_confirmacaoServer)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txf_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txf_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rb_boleto)
                    .addComponent(rb_cartaoC))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(rb_basico)
                    .addComponent(rb_premium))
                .addGap(18, 18, 18)
                .addComponent(lbl_confirmacaoServer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_voltar)
                    .addComponent(bt_cadastrar))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_voltarMouseClicked
        Janela.pLog = new PainelLogin();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().remove(Janela.pCad);
        janela.add(Janela.pLog);
        janela.pack();
    }//GEN-LAST:event_bt_voltarMouseClicked

    private boolean verificadorMissMatch(){
        String nome = txf_nome.getText();
        String senha = txf_senha.getText();
        String email = txf_email.getText(); 

                
        if(nome.equals("") || senha.equals("") || email.equals("") || rbPremiumBasico.equals("") || rbBoletoCartao.equals("")){
            return true;
        }
        else{
            return false;
        }
    }
    
    private void bt_cadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_cadastrarMouseClicked
        try{
            if(verificadorMissMatch()){
                throw new InputMismatchException();
            }
            
            PainelFilmes.sock = new Socket(PainelFilmes.srvAddr, Janela.srvPort);
            PainelFilmes.in = new DataInputStream(PainelFilmes.sock.getInputStream());
            PainelFilmes.out = new DataOutputStream(PainelFilmes.sock.getOutputStream());
            JSONObject json = new JSONObject();
            json.put("Nome", txf_nome.getText());
            json.put("Senha", txf_senha.getText());
            json.put("Email", txf_email.getText());
            json.put("Tipo", rbPremiumBasico);
            json.put("Forma de Pagamento", rbBoletoCartao);
            
            PainelFilmes.out.writeUTF("aaa");
            
            
            
        }catch(InputMismatchException ex){
            JOptionPane.showMessageDialog(null, "Todos os campos têm que estar preenchidos!", "ERRO", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(PainelCadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bt_cadastrarMouseClicked

    private void rb_boletoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_boletoMouseClicked
        this.rbBoletoCartao = "Boleto";
    }//GEN-LAST:event_rb_boletoMouseClicked

    private void rb_cartaoCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_cartaoCMouseClicked
        this.rbBoletoCartao = "Credito";
    }//GEN-LAST:event_rb_cartaoCMouseClicked

    private void rb_basicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_basicoMouseClicked
        this.rbPremiumBasico = "Basico";
    }//GEN-LAST:event_rb_basicoMouseClicked

    private void rb_premiumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_premiumMouseClicked
       this.rbPremiumBasico = "Premium";
    }//GEN-LAST:event_rb_premiumMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cadastrar;
    private javax.swing.JButton bt_voltar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl_confirmacaoServer;
    private javax.swing.JRadioButton rb_basico;
    private javax.swing.JRadioButton rb_boleto;
    private javax.swing.JRadioButton rb_cartaoC;
    private javax.swing.JRadioButton rb_premium;
    private javax.swing.JTextField txf_email;
    private javax.swing.JTextField txf_nome;
    private javax.swing.JTextField txf_senha;
    // End of variables declaration//GEN-END:variables
}
