package View;

import Classes.PPTClass;
import java.awt.Cursor;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.Clip;
import javax.swing.*;

public class PPT {

    public PPT(boolean player) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PPT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PPT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PPT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PPT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        // Create and display the form 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });

        //OBSERVAR CODIGO ACIMA, PROPRIEDADES COMO SELECTION SÓ FUNCIONAM COM ESTE TRECHO
        PPTClass game = new PPTClass();

        game.janela.setTitle("PPT");
        game.janela.setResizable(false);
        game.janela.setBounds(120, 30, 1000, 700);
        game.janela.setIconImage(game.tesourab1.getImage().getScaledInstance(500, 500, 500));
        game.janela.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        game.botaovoltar.setBounds(0, 0, 100, 30);
        game.botaovoltar.setFont(new java.awt.Font("Impact", 5, 20));
        game.botaovoltar.setContentAreaFilled(false);
        game.botaovoltar.setCursor(new Cursor(Cursor.HAND_CURSOR));

        game.botaomudo.setBounds(100, 0, 100, 30);
        game.botaomudo.setFont(new java.awt.Font("Impact", 5, 20));
        game.botaomudo.setContentAreaFilled(false);
        game.botaomudo.setCursor(new Cursor(Cursor.HAND_CURSOR));

        game.labelnarrador.setBounds(290, 120, 400, 100);
        game.labelnarrador.setFont(new java.awt.Font("Pavement", 10, 30));
        game.labelnarrador.setForeground(new java.awt.Color(184, 146, 121));
        game.labelnarrador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        game.labelbot.setBounds(800, 100, 100, 100);
        game.labelbot.setFont(new java.awt.Font("Impact", 10, 30));
        game.labelbot.setForeground(new java.awt.Color(99, 25, 30));
        game.labelbot.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        game.labelplayer.setBounds(100, 100, 100, 100);
        game.labelplayer.setFont(new java.awt.Font("Impact", 10, 30));
        game.labelplayer.setForeground(new java.awt.Color(28, 122, 23));
        game.labelplayer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        game.labelbackground.setBounds(0, 0, 1000, 700);
        game.labelbackground.setIcon(game.background);

        game.labelportal.setBounds(0, 0, 1000, 700);
        game.labelportal.setIcon(game.portal);

        game.botao1.setBounds(100, 200, 100, 100);
        game.botao1.setIcon(game.pedrab1);
        game.botao1.setPressedIcon(game.pedrab2);
        game.botao1.setContentAreaFilled(false);
        game.botao1.setBorderPainted(false);
        game.botao1.setCursor(new Cursor(Cursor.HAND_CURSOR));

        game.botao2.setBounds(100, 300, 100, 100);
        game.botao2.setIcon(game.papelb1);
        game.botao2.setPressedIcon(game.papelb2);
        game.botao2.setContentAreaFilled(false);
        game.botao2.setBorderPainted(false);
        game.botao2.setCursor(new Cursor(Cursor.HAND_CURSOR));

        game.botao3.setBounds(100, 400, 100, 100);
        game.botao3.setIcon(game.tesourab1);
        game.botao3.setPressedIcon(game.tesourab2);
        game.botao3.setContentAreaFilled(false);
        game.botao3.setBorderPainted(false);
        game.botao3.setCursor(new Cursor(Cursor.HAND_CURSOR));

        game.botao4.setBounds(330, 335, 350, 234);
        game.CreateFightButton(player);
        game.botao4.setIcon(game.jo);
        game.botao4.setSelectedIcon(game.ken);
        game.botao4.setPressedIcon(game.po);
        game.botao4.setContentAreaFilled(false);
        game.botao4.setBorderPainted(false);
        game.botao4.setCursor(new Cursor(Cursor.HAND_CURSOR));

        game.botao5.setBounds(800, 200, 100, 100);
        game.botao5.setIcon(game.botPedrab1);
        game.botao5.setPressedIcon(game.botPedrab2);
        game.botao5.setSelectedIcon(game.botPedrab2);
        game.botao5.setContentAreaFilled(false);
        game.botao5.setBorderPainted(false);

        game.botao6.setBounds(800, 300, 100, 100);
        game.botao6.setIcon(game.botPapelb1);
        game.botao6.setPressedIcon(game.botPapelb2);
        game.botao6.setSelectedIcon(game.botPapelb2);
        game.botao6.setContentAreaFilled(false);
        game.botao6.setBorderPainted(false);

        game.botao7.setBounds(800, 400, 100, 100);
        game.botao7.setIcon(game.botTesourab1);
        game.botao7.setPressedIcon(game.botTesourab2);
        game.botao7.setSelectedIcon(game.botTesourab2);
        game.botao7.setContentAreaFilled(false);
        game.botao7.setBorderPainted(false);

        game.botaodog.setBounds(600, 410, 70, 160);
        game.botaodog.setIcon(game.lokigif);
        game.botaodog.setContentAreaFilled(false);
        game.botaodog.setBorderPainted(false);

        game.botaovoltar.addActionListener((e) -> {
            new Start();
            game.janela.dispose();
            game.themeSong.stop();
        });
        game.botao1.addActionListener((e) -> {
            game.JogadaPedra();
            game.button1Sound.setMicrosecondPosition(0);
            game.button1Sound.start();
        });
        game.botao2.addActionListener((e) -> {
            game.button2Sound.setMicrosecondPosition(0);
            game.button2Sound.start();
            game.JogadaPapel();
        });
        game.botao3.addActionListener((e) -> {
            game.button3Sound.setMicrosecondPosition(0);
            game.button3Sound.start();
            game.JogadaTesoura();
        });
        game.botao4.addMouseListener(game.mlistener);
        game.botaodog.addActionListener((e) -> {
            if (game.paciencia >= 3) {
                game.botaodogsound.setMicrosecondPosition(0);
                game.botaodogsound.start();
                game.paciencia = 0;
                game.botaodog.setPressedIcon(game.lokigif);
                game.botaodog.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                try {
                    Thread.sleep(200);
                } catch (InterruptedException ex) {
                    Logger.getLogger(PPT.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        game.botaomudo.addActionListener((e) -> {
            if(game.themeSong.isRunning()){
                game.themeSong.stop();
            }else{
                game.themeSong.start();
                game.themeSong.loop(Clip.LOOP_CONTINUOUSLY);
            }
        });
                
        game.janela.add(game.botaodog);
        game.janela.add(game.botaovoltar);
        game.janela.add(game.botaomudo);
        game.janela.add(game.botao1);
        game.janela.add(game.botao2);
        game.janela.add(game.botao3);
        game.janela.add(game.botao4);
        game.janela.add(game.botao5);
        game.janela.add(game.botao6);
        game.janela.add(game.botao7);
        game.janela.add(game.labelplayer);
        game.janela.add(game.labelbot);
        game.janela.add(game.labelnarrador);
        game.janela.add(game.labelportal);
        game.janela.add(game.labelbackground);
        game.janela.setVisible(true);
        game.themeSong.start();
        game.themeSong.loop(Clip.LOOP_CONTINUOUSLY);
    }

}
