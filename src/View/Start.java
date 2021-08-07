package View;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GraphicsEnvironment;
import Classes.PPTClass;
import javax.swing.JLabel;

public class Start extends JFrame {

    public Start() {

        //Declaração
        JFrame tela = new JFrame();
        JLabel label = new JLabel();
        JButton botao = new JButton("Paulo");
        JButton botao2 = new JButton("Daniel");
        GraphicsEnvironment ge;
        PPTClass game = new PPTClass();


        try {
            ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, this.getClass().getResourceAsStream("/IMG/pavement.ttf")));
        } catch (Exception e) {
            System.out.println("Falha ao Carregar a Fonte!");
        }
       

        tela.setSize(415,238);
        tela.setResizable(false);
        tela.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        botao.setBounds(0,0,200,200);
        botao.setFont(new java.awt.Font("Pavement", 20,20));
        botao.setForeground(Color.BLACK);
        botao.setCursor(new Cursor(Cursor.HAND_CURSOR));

        botao2.setBounds(200,0,200,200);
        botao2.setFont(new java.awt.Font("Pavement", 20,20));
        botao2.setForeground(Color.MAGENTA);
        botao2.setCursor(new Cursor(Cursor.HAND_CURSOR));

        botao.addActionListener((e) -> {
            new PPT(true);
            tela.dispose();
            game.themeSong.stop();
        });
        botao2.addActionListener((e) -> {
            new PPT(false);
            tela.dispose();
            game.themeSong.stop();
        });
        
        label.setBounds(0,0,400,200);

        tela.add(botao);
        tela.add(botao2);
        tela.add(label);
        tela.setVisible(true);
        game.themeSong.start();
    }

    public static void main(String[] args) {
        new Start();
    }
}
