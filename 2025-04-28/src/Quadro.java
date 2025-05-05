import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Quadro extends JFrame implements ActionListener, KeyListener {

    int larguraQuadro = 500;
    int alturaQuadro = 500;

    JLabel jogador;
    int x0Jogador = 250;
    int y0Jogador = 400;
    int larguraJogador = 30;
    int alturaJogador = 30;

    JLabel bala;
    int larguraBala = 1;
    int alturaBala = 2;
    Timer timerBala;
    int vBala = 5;

    public Quadro() {
        // INFO: configurando frame

        Container c = getContentPane();
        c.setBackground(Color.BLACK);

        this.setSize(larguraQuadro, alturaQuadro);
        this.setVisible(true);
        this.setLayout(null);
        this.addKeyListener(this);

        // INFO: criando o jogador

        jogador = new JLabel();
        jogador.setBounds(x0Jogador, y0Jogador, larguraJogador, alturaJogador);
        jogador.setBackground(Color.BLUE);
        jogador.setOpaque(true);

        // INFO: criando a bala

        bala = new JLabel();
        bala.setBounds(x0Jogador + (jogador.getWidth() / 2) - (larguraBala / 2), y0Jogador - 5, larguraBala, alturaBala);
        bala.setBackground(Color.YELLOW);
        bala.setOpaque(true);

        timerBala = new Timer(25, this);

        // INFO: atualizando frame atual

        this.add(bala);
        this.add(jogador);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        bala.setLocation(bala.getX(), bala.getY() - vBala);

        if (bala.getY() < 0) {
            bala.setBounds(x0Jogador + (jogador.getWidth() / 2) - (larguraBala / 2), y0Jogador - 5, larguraBala, alturaBala);
            timerBala.stop();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("[DEBUG]: a tecla foi pressionada: `" + e.getKeyChar() + "`");

        if (e.getKeyChar() == ' ') {
            timerBala.start();
            this.add(bala);
            bala.setLocation(x0Jogador + (jogador.getWidth() / 2) - (larguraBala / 2), y0Jogador - 5);
        }

        if (e.getKeyChar() == 'a' || e.getKeyChar() == 'd') {
            x0Jogador = x0Jogador + (e.getKeyChar() == 'a' ? -1 : +1);

            if (!timerBala.isRunning()) {
                bala.setBounds(x0Jogador + (jogador.getWidth() / 2) - (larguraBala / 2), y0Jogador - 5, larguraBala, alturaBala);
            }

            jogador.setBounds(x0Jogador, y0Jogador, larguraJogador, alturaJogador);
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
