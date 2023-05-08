package netflix.cliente;

import javax.swing.JButton;

public class Assitir extends javax.swing.JPanel {

    JButton button = new JButton();
    
    public Assitir(String nomeFilme) {
        initComponents();
        definirBackgroundImagem(nomeFilme);
        criarBotaoEPosicionar();
        myconfig();
    }
    
    public void criarBotaoEPosicionar() {
        jLabel1.add(button);
        button.setBounds(320, 150, 106, 120);
        button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/netflix/cliente/imagens/botaoPlayer.png")));
        
        
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/netflix/cliente/imagens/capa-clube.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 731, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    public void myconfig() {
        
        button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonMouseClicked(evt);
            }
        });
        
    }
    
    private void buttonMouseClicked(java.awt.event.MouseEvent evt) {
        
        // quando o play é clicado, deve ser fazer todo o processo de requesição
        
        // faz a troca de botoes (some o play grande, inclui o pequeno play e pause, etc)
        // faz a troca de paineis 
        
        jLabel1.setVisible(false);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
