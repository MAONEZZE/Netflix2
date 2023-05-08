/*package netflix.cliente;

import java.awt.BorderLayout;
import java.awt.Component;
import java.io.IOException;
import java.nio.Buffer;
import java.util.LinkedList;
import java.util.Queue;

import javax.media.Buffer;
import javax.media.CannotRealizeException;
import javax.media.Manager;
import javax.media.NoPlayerException;
import javax.media.Player;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PlayerVideo extends JFrame {
    
    private Queue<Buffer> bufferQueue = new LinkedList<Buffer>();
    private Player player;
    
    public PlayerVideo() {
        setTitle("Player de vídeo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cria um painel de conteúdo para adicionar o player de vídeo
        JPanel contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout());

        // Cria um player de vídeo
        player = createPlayer();
        Component video = player.getVisualComponent();

        if (video != null) {
            contentPane.add(video, BorderLayout.CENTER);
        }

        // Cria uma barra de controle para o player
        Component control = player.getControlPanelComponent();
        if (control != null) {
            contentPane.add(control, BorderLayout.SOUTH);
        }

        // Adiciona o painel de conteúdo ao JFrame
        setContentPane(contentPane);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);

        // Inicia a reprodução do vídeo
        player.start();
    }
    
    private Player createPlayer() {
        Player player = null;
        try {
            // Cria um player de vídeo
            player = Manager.createPlayer(null);
            player.realize();
        } catch (NoPlayerException e) {
            e.printStackTrace();
        } catch (CannotRealizeException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return player;
    }

    public void playBuffer(Buffer buffer) {
        // Adiciona o buffer à fila de buffers
        bufferQueue.add(buffer);

        // Se o player estiver pronto e a fila de buffers não estiver vazia, reproduz o próximo buffer
        if (player.getState() == Player.Started && !bufferQueue.isEmpty()) {
            Buffer nextBuffer = bufferQueue.poll();
            player.getProcessor().write(nextBuffer);
        }
    }

    public static void main(String[] args) {
        VideoPlayerExample player = new VideoPlayerExample();

        // Exemplo de como adicionar um buffer de vídeo ao player
        byte[] videoBuffer = // Array de bytes contendo um pedaço do vídeo
        Buffer buffer = new Buffer();
        buffer.setData(videoBuffer);
        player.playBuffer(buffer);
    }
    
}
*/