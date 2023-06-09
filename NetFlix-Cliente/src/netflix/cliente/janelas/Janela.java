package netflix.cliente.janelas;

import java.awt.BorderLayout;
import java.net.InetAddress;

public class Janela extends javax.swing.JFrame {

    static PainelLogin pLog;
    static PainelFilmes pFilme;
    static PainelCadastro pCad;
    static Assitir pAssistir;
    static InetAddress srvAddr = null;
    public static int srvPort = 0;
    
    public Janela(InetAddress srvAddr, int srvPort) {
        initComponents();
        this.srvAddr = srvAddr;
        this.srvPort = srvPort;
        this.setLayout(new BorderLayout());
        pLog = new PainelLogin();
        
        this.add(pLog, BorderLayout.CENTER);
        this.pack();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
