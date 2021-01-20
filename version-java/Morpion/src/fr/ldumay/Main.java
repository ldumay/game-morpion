/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ldumay;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author mtl
 */
public class Main extends JFrame{
    
    String projectAuteur = "LDumay.Fr";
    String projectCategoryTitle = "Games";
    String projectGamesTitle = "Morpion";
    String projectVersion = "0.0.1";
    String titleJFrame = ""+projectAuteur+" | "+ projectCategoryTitle
            +" | "+projectGamesTitle+" | Version ["+projectVersion+"]";
    
    String A = null;
    String B = null;
    String C = null;
    String D = null;
    String E = null;
    String F = null;
    String G = null;
    String H = null;
    String I = null;
    
    String messageWin = "Jeu Gagner\nVous avez battu l'ordianteur.\nLe jeu va se redémarrer.";
    String messageLose = "Jeu Perdu\nL'ordniateur vous à battu.\nLe jeu va se redémarrer.";
    
    JButton jButton_A = new JButton("_");
    JButton jButton_B = new JButton("_");
    JButton jButton_C = new JButton("_");
    JButton jButton_D = new JButton("_");
    JButton jButton_E = new JButton("_");
    JButton jButton_F = new JButton("_");
    JButton jButton_G = new JButton("_");
    JButton jButton_H = new JButton("_");
    JButton jButton_I = new JButton("_");
    
    List player = new ArrayList();
    boolean player_1 = false;
    boolean player_2 = false;
    
    JLabel jLabelStatut = new JLabel("Staut : Nouveau en cours ...");
    JButton jButton_ResetGame = new JButton("Redémarrer le jeu");
    JButton jButton_StopGame = new JButton("Quitter le jeu");
    
    JPanel jPanel = new JPanel();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JFrame mainJFrame = new Main();
    }
    
    public Main() {
        super("Title");

        WindowListener l = new WindowAdapter() {
            public void windowClosing(WindowEvent e){ stopGame(); }
        };
        
        addWindowListener(l);
        
        jButton_A.setSize(20, 20);jButton_A.setLocation(20, 20);jPanel.add(jButton_A);
        jButton_B.setSize(20, 20);jButton_B.setLocation(50, 20);jPanel.add(jButton_B);
        jButton_C.setSize(20, 20);jButton_C.setLocation(80, 20);jPanel.add(jButton_C);
        jButton_D.setSize(20, 20);jButton_D.setLocation(20, 50);jPanel.add(jButton_D);
        jButton_E.setSize(20, 20);jButton_E.setLocation(50, 50);jPanel.add(jButton_E);
        jButton_F.setSize(20, 20);jButton_F.setLocation(80, 50);jPanel.add(jButton_F);
        jButton_G.setSize(20, 20);jButton_G.setLocation(20, 80);jPanel.add(jButton_G);
        jButton_H.setSize(20, 20);jButton_H.setLocation(50, 80);jPanel.add(jButton_H);
        jButton_I.setSize(20, 20);jButton_I.setLocation(80, 80);jPanel.add(jButton_I);
        
        jButton_A.addActionListener(new ActionListener() { @Override public void actionPerformed(ActionEvent e) { player_1 = true; if( (A==null) && (player_1==true) ){ A="X";jButton_A.setText("X");jButton_A.setEnabled(false);computer();checkStatus();player_1 = false; } } });
        jButton_B.addActionListener(new ActionListener() { @Override public void actionPerformed(ActionEvent e) { player_1 = true; if( (B==null) && (player_1==true) ){ B="X";jButton_B.setText("X");jButton_B.setEnabled(false);computer();checkStatus();player_1 = false; } } });
        jButton_C.addActionListener(new ActionListener() { @Override public void actionPerformed(ActionEvent e) { player_1 = true; if( (C==null) && (player_1==true) ){ C="X";jButton_C.setText("X");jButton_C.setEnabled(false);computer();checkStatus();player_1 = false; } } });
        jButton_D.addActionListener(new ActionListener() { @Override public void actionPerformed(ActionEvent e) { player_1 = true; if( (D==null) && (player_1==true) ){ D="X";jButton_D.setText("X");jButton_D.setEnabled(false);computer();checkStatus();player_1 = false; } } });
        jButton_E.addActionListener(new ActionListener() { @Override public void actionPerformed(ActionEvent e) { player_1 = true; if( (E==null) && (player_1==true) ){ E="X";jButton_E.setText("X");jButton_E.setEnabled(false);computer();checkStatus();player_1 = false; } } });
        jButton_F.addActionListener(new ActionListener() { @Override public void actionPerformed(ActionEvent e) { player_1 = true; if( (F==null) && (player_1==true) ){ F="X";jButton_F.setText("X");jButton_F.setEnabled(false);computer();checkStatus();player_1 = false; } } });
        jButton_G.addActionListener(new ActionListener() { @Override public void actionPerformed(ActionEvent e) { player_1 = true; if( (G==null) && (player_1==true) ){ G="X";jButton_G.setText("X");jButton_G.setEnabled(false);computer();checkStatus();player_1 = false; } } });
        jButton_H.addActionListener(new ActionListener() { @Override public void actionPerformed(ActionEvent e) { player_1 = true; if( (H==null) && (player_1==true) ){ H="X";jButton_H.setText("X");jButton_H.setEnabled(false);computer();checkStatus();player_1 = false; } } });
        jButton_I.addActionListener(new ActionListener() { @Override public void actionPerformed(ActionEvent e) { player_1 = true; if( (I==null) && (player_1==true) ){ I="X";jButton_I.setText("X");jButton_I.setEnabled(false);computer();checkStatus();player_1 = false; } } });
        
        jLabelStatut.setSize(180, 20);jLabelStatut.setLocation(80, 80);jPanel.add(jLabelStatut);
        
        jButton_ResetGame.setSize(20, 20);jButton_ResetGame.setLocation(80, 80);jPanel.add(jButton_ResetGame);
        jButton_StopGame.setSize(20, 20);jButton_StopGame.setLocation(80, 80);jPanel.add(jButton_StopGame);
        
        jButton_ResetGame.addActionListener(new ActionListener() { @Override public void actionPerformed(ActionEvent e) { resetGame(); } });
        jButton_StopGame.addActionListener(new ActionListener() { @Override public void actionPerformed(ActionEvent e) { stopGame(); } });
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;
        /*
        System.out.println("width : "+width);
        System.out.println("height : "+height);
        */
        this.setSize(width/2, height/2);
        this.setLocationRelativeTo(null);
        
        this.setContentPane(jPanel);
        this.setSize(250,215);
        this.setVisible(true);
        this.setName(titleJFrame);
    }
    
    public void action(String elementSelected, int playerSelected){
        switch(elementSelected){
            case "test" : System.out.println("Test - OK"); break;
            case "A": A="O";jButton_A.setText("O");jButton_A.setEnabled(false);computer();checkStatus(); break;
        }
    }
    
    public void computer(){
        Random randomInt = new Random();
        int max = 8; //[0-8]
        int random = randomInt.nextInt(max);
        /*
        System.out.println("- - - - - - -");
        System.out.println("Computer :");
        System.out.println(random);
        */
        if( (A==null) || (B==null) || (C==null) || (D==null) || (E==null) || (F==null) || (G==null) || (H==null) || (I==null) ){
            switch(random){
                case 0: player_2 = true; if( (A==null) && (player_2==true) ){ A="O";jButton_A.setText("O");jButton_A.setEnabled(false);checkStatus();player_2 = false; } else { computer(); } break;
                case 1: player_2 = true; if( (B==null) && (player_2==true) ){ B="O";jButton_B.setText("O");jButton_B.setEnabled(false);checkStatus();player_2 = false; } else { computer(); } break;
                case 2: player_2 = true; if( (C==null) && (player_2==true) ){ C="O";jButton_C.setText("O");jButton_C.setEnabled(false);checkStatus();player_2 = false; } else { computer(); } break;
                case 3: player_2 = true; if( (D==null) && (player_2==true) ){ D="O";jButton_D.setText("O");jButton_D.setEnabled(false);checkStatus();player_2 = false; } else { computer(); } break;
                case 4: player_2 = true; if( (E==null) && (player_2==true) ){ E="O";jButton_E.setText("O");jButton_E.setEnabled(false);checkStatus();player_2 = false; } else { computer(); } break;
                case 5: player_2 = true; if( (F==null) && (player_2==true) ){ F="O";jButton_F.setText("O");jButton_F.setEnabled(false);checkStatus();player_2 = false; } else { computer(); } break;
                case 6: player_2 = true; if( (G==null) && (player_2==true) ){ G="O";jButton_G.setText("O");jButton_G.setEnabled(false);checkStatus();player_2 = false; } else { computer(); } break;
                case 7: player_2 = true; if( (H==null) && (player_2==true) ){ H="O";jButton_H.setText("O");jButton_H.setEnabled(false);checkStatus();player_2 = false; } else { computer(); } break;
                case 8: player_2 = true; if( (I==null) && (player_2==true) ){ I="O";jButton_I.setText("O");jButton_I.setEnabled(false);checkStatus();player_2 = false; } else { computer(); } break;
            }
            action("test", 0);
        }
    }
    
    public void checkStatus(){
        System.out.println("- - - - - - -");
        System.out.println("Player 1 : "+player_1+" - Player 2 : "+player_2);
        System.out.println("A : "+A+" - B : "+B+" - C : "+C);
        System.out.println("D : "+D+" - E : "+E+" - F : "+F);
        System.out.println("G : "+G+" - H : "+H+" - I : "+I);
        //--
        if( ( (A=="X") && (B=="X") && (C=="X") ) ||
            ( (D=="X") && (E=="X") && (F=="X") ) ||
            ( (G=="X") && (H=="X") && (I=="X") ) ||
            ( (A=="X") && (D=="X") && (G=="X") ) ||
            ( (B=="X") && (E=="X") && (H=="X") ) ||
            ( (C=="X") && (F=="X") && (I=="X") ) ||
            ( (A=="X") && (E=="X") && (I=="X") ) ||
            ( (C=="X") && (E=="X") && (G=="X") ) ){
            JOptionPane.showMessageDialog(this, messageWin, "Super !", HEIGHT);
            resetGame();
            //System.out.println("Le jeu est gagné.");
        }
        //--
        else if( ( (A=="O") && (B=="O") && (C=="O") ) ||
                ( (D=="O") && (E=="O") && (F=="O") ) ||
                ( (G=="O") && (H=="O") && (I=="O") ) ||
                ( (A=="O") && (D=="O") && (G=="O") ) ||
                ( (B=="O") && (E=="O") && (H=="O") ) ||
                ( (C=="O") && (F=="O") && (I=="O") ) ||
                ( (A=="O") && (E=="O") && (I=="O") ) ||
                ( (C=="O") && (E=="O") && (G=="O") ) ){
            JOptionPane.showMessageDialog(this, messageLose, "Dommage !", HEIGHT);
            resetGame();
            //System.out.println("Le jeu est gagné.");
        }
    }
    
    public void resetGame(){
        A = null;jButton_A.setText("_");jButton_A.setEnabled(true);
        B = null;jButton_B.setText("_");jButton_B.setEnabled(true);
        C = null;jButton_C.setText("_");jButton_C.setEnabled(true);
        D = null;jButton_D.setText("_");jButton_D.setEnabled(true);
        E = null;jButton_E.setText("_");jButton_E.setEnabled(true);
        F = null;jButton_F.setText("_");jButton_F.setEnabled(true);
        G = null;jButton_G.setText("_");jButton_G.setEnabled(true);
        H = null;jButton_H.setText("_");jButton_H.setEnabled(true);
        I = null;jButton_I.setText("_");jButton_I.setEnabled(true);
        //System.out.println("Le jeu a été redémarré.");
    }
    
    public void stopGame(){
        //System.out.println("Le jeu va s'arrêter.");
        System.exit(0);
    }
}