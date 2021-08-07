package Classes;

import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;

public class PPTClass {

    //DECLARAÇÂO
    public int jogadaPlayer = 0, jogadaCPU = 0, pontosPlayer = 0, pontosCPU = 0, paciencia = 0;
    public Random rand = new Random();
    public JFrame janela = new JFrame("PPT");
    public JLabel labelplayer = new JLabel("Pontos");
    public JLabel labelbot = new JLabel("CPU");
    public JLabel labelnarrador = new JLabel("Clique neles!");
    public JLabel labelbackground = new JLabel("");
    public JLabel labelportal = new JLabel("");
    public JLabel labelportalgif = new JLabel("");
    public JButton botao1 = new JButton("Pedra");
    public JButton botao2 = new JButton("Papel");
    public JButton botao3 = new JButton("Tesoura");
    public JButton botao4 = new JButton("Play");
    public JButton botao5 = new JButton("Pedra 2");
    public JButton botao6 = new JButton("Papel 2");
    public JButton botao7 = new JButton("Tesoura 2");
    public JButton botaovoltar = new JButton("Voltar");
    public JButton botaomudo = new JButton("Mudo");
    public JButton botaodog = new JButton("Dog");
    public ImageIcon background = new ImageIcon(getClass().getResource("/IMG/fundo.gif"));
    public ImageIcon loki = new ImageIcon(getClass().getResource("/IMG/loki.png"));
    public ImageIcon lokigif = new ImageIcon(getClass().getResource("/IMG/loki.gif"));
    public ImageIcon portal = new ImageIcon(getClass().getResource("/IMG/portal.png"));
    public ImageIcon portalhit = new ImageIcon(getClass().getResource("/IMG/portalhit.png"));
    public ImageIcon pedrab1 = new ImageIcon(getClass().getResource("/IMG/Pedrab1.png"));
    public ImageIcon pedrab2 = new ImageIcon(getClass().getResource("/IMG/Pedrab2.png"));
    public ImageIcon papelb1 = new ImageIcon(getClass().getResource("/IMG/Papelb1.png"));
    public ImageIcon papelb2 = new ImageIcon(getClass().getResource("/IMG/Papelb2.png"));
    public ImageIcon tesourab1 = new ImageIcon(getClass().getResource("/IMG/Tesourab1.png"));
    public ImageIcon tesourab2 = new ImageIcon(getClass().getResource("/IMG/Tesourab2.png"));
    public ImageIcon botPedrab1 = new ImageIcon(getClass().getResource("/IMG/botPedrab1.png"));
    public ImageIcon botPedrab2 = new ImageIcon(getClass().getResource("/IMG/botPedrab2.png"));
    public ImageIcon botPapelb1 = new ImageIcon(getClass().getResource("/IMG/botPapelb1.png"));
    public ImageIcon botPapelb2 = new ImageIcon(getClass().getResource("/IMG/botPapelb2.png"));
    public ImageIcon botTesourab1 = new ImageIcon(getClass().getResource("/IMG/botTesourab1.png"));
    public ImageIcon botTesourab2 = new ImageIcon(getClass().getResource("/IMG/botTesourab2.png"));
    public ImageIcon jo = new ImageIcon(getClass().getResource("/IMG/JO.png"));
    public ImageIcon ken = new ImageIcon(getClass().getResource("/IMG/KEN.png"));
    public ImageIcon po = new ImageIcon(getClass().getResource("/IMG/PO.png"));
    public URL themeSongURL = getClass().getResource("/IMG/Sound/8bit.wav");
    public URL buttonSoundURL = getClass().getResource("/IMG/Sound/longplim.wav");
    public URL fightButtonSoundURL = getClass().getResource("/IMG/Sound/haa.wav");
    public URL resultEmpateURL = getClass().getResource("/IMG/Sound/ResultEmpate1.wav");
    public URL resultOpsURL = getClass().getResource("/IMG/Sound/ResultOps1.wav");
    public URL resultLegalURL = getClass().getResource("/IMG/Sound/ResultLegal.wav");
    public URL resultVitoriaURL = getClass().getResource("/IMG/Sound/ResultVitoria.wav");
    public URL resultEmpate2URL = getClass().getResource("/IMG/Sound/ResultEmpate2.wav");
    public URL resultNaoURL = getClass().getResource("/IMG/Sound/ResultNao.wav");
    public URL resultRecupereURL = getClass().getResource("/IMG/Sound/ResultRecupera.wav");
    public URL resultNiceURL = getClass().getResource("/IMG/Sound/ResultBoa.wav");
    public URL resultEmpate3URL = getClass().getResource("/IMG/Sound/ResultEmpate3.wav");
    public URL botaodogURL = getClass().getResource("/IMG/Sound/dog.wav");
    public Clip themeSong = AudioM(themeSongURL);
    public Clip button1Sound = AudioM(buttonSoundURL);
    public Clip button2Sound = AudioM(buttonSoundURL);
    public Clip button3Sound = AudioM(buttonSoundURL);
    public Clip fightButtonSound = AudioM(fightButtonSoundURL);
    public Clip resultEmpate = AudioM(resultEmpateURL);
    public Clip resultOps = AudioM(resultOpsURL);
    public Clip resultLegal = AudioM(resultLegalURL);
    public Clip resultVitoria = AudioM(resultVitoriaURL);
    public Clip resultEmpate2 = AudioM(resultEmpate2URL);
    public Clip resultNao = AudioM(resultNaoURL);
    public Clip resultRecupere = AudioM(resultRecupereURL);
    public Clip resultNice = AudioM(resultNiceURL);
    public Clip resultEmpate3 = AudioM(resultEmpate3URL);
    public Clip botaodogsound = AudioM(botaodogURL);

    public void CreateFightButton(boolean player) {
        if (player) {
            jo = new ImageIcon(getClass().getResource("/IMG/JO2.png"));
            ken = new ImageIcon(getClass().getResource("/IMG/KEN2.png"));
            po = new ImageIcon(getClass().getResource("/IMG/PO2.png"));
        }
    }

    public Clip AudioM(URL sound) {

        try {
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(sound);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            return clip;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Falha na função AudioM em PPTClass");
            return null;
        }
    }

    public void JogadaPedra() {
        this.jogadaPlayer = 0;
    }

    public void JogadaPapel() {
        this.jogadaPlayer = 1;
    }

    public void JogadaTesoura() {
        this.jogadaPlayer = 2;
    }

    public int JogadaCPU() {
        int num = rand.nextInt(3);
        this.jogadaCPU = num;
        return num;
    }

    public void Combate() {

        this.fightButtonSound.setMicrosecondPosition(0);
        this.fightButtonSound.start();
        JogadaCPU();
        if (this.jogadaCPU == 0) {
            botao5.setSelected(true);
            botao5.doClick(200);
            botao5.setSelected(false);
        } else if (this.jogadaCPU == 1) {
            botao6.setSelected(true);
            botao6.doClick(200);
            botao6.setSelected(false);
        } else if (this.jogadaCPU == 2) {
            botao7.setSelected(true);
            botao7.doClick(200);
            botao7.setSelected(false);
        }
        switch (this.jogadaPlayer) {
            case 0:
                if (this.jogadaCPU == 0) {
                    resultEmpate.setMicrosecondPosition(0);
                    resultEmpate.start();
                    this.labelnarrador.setText("EMPATE!");
                } else if (this.jogadaCPU == 1) {
                    resultOps.setMicrosecondPosition(0);
                    resultOps.start();
                    this.labelnarrador.setText("OPS!");
                    this.pontosCPU++;
                    this.labelbot.setText(String.valueOf(this.pontosCPU));
                } else if (this.jogadaCPU == 2) {
                    resultLegal.setMicrosecondPosition(0);
                    resultLegal.start();
                    this.labelnarrador.setText("LEGAL!");
                    this.pontosPlayer++;
                    this.labelplayer.setText(String.valueOf(this.pontosPlayer));
                }
                break;
            case 1:
                if (this.jogadaCPU == 0) {
                    resultVitoria.setMicrosecondPosition(0);
                    resultVitoria.start();
                    this.labelnarrador.setText("VITORIA!");
                    this.pontosPlayer++;
                    this.labelplayer.setText(String.valueOf(this.pontosPlayer));
                } else if (this.jogadaCPU == 1) {
                    resultEmpate2.setMicrosecondPosition(0);
                    resultEmpate2.start();
                    this.labelnarrador.setText("EMPATE!");
                } else if (this.jogadaCPU == 2) {
                    resultNao.setMicrosecondPosition(0);
                    resultNao.start();
                    this.labelnarrador.setText("AH NÃO!");
                    this.pontosCPU++;
                    this.labelbot.setText(String.valueOf(this.pontosCPU));
                }
                break;
            case 2:
                if (this.jogadaCPU == 0) {
                    resultRecupere.setMicrosecondPosition(0);
                    resultRecupere.start();
                    this.labelnarrador.setText("RECUPERE!");
                    this.pontosCPU++;
                    this.labelbot.setText(String.valueOf(this.pontosCPU));
                } else if (this.jogadaCPU == 1) {
                    resultNice.setMicrosecondPosition(0);
                    resultNice.start();
                    this.labelnarrador.setText("NICE!");
                    this.pontosPlayer++;
                    this.labelplayer.setText(String.valueOf(this.pontosPlayer));
                } else if (this.jogadaCPU == 2) {
                    resultEmpate3.setMicrosecondPosition(0);
                    resultEmpate3.start();
                    this.labelnarrador.setText("EMPATE!");
                }
                break;
        }
    }
    public MouseListener mlistener = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
        }

        @Override
        public void mousePressed(MouseEvent e) {
            labelnarrador.setText("");
            labelportal.setIcon(portalhit);
            paciencia++;
            if (paciencia >= 3) {
                botaodog.setPressedIcon(loki);
                botaodog.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            Combate();
            labelportal.setIcon(portal);
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
    };
}
