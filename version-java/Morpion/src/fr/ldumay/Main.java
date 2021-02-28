/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ldumay;

import ldumay.lib.essentials.*;
import ldumay.lib.infoSystem.*;
import java.util.*;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;
import javax.swing.text.*;


/**
 *
 * @author ldumay
 */
public class Main extends JFrame{
    
    String projectAuteur = "LDumay.Fr";
    String projectCategoryTitle = "Games";
    String projectGamesTitle = "Morpion";
    String projectVersion = "0.1.2";
    String titleJFrame = ""+projectCategoryTitle
            +" | "+projectGamesTitle+" | V"+projectVersion+"";
    
    String A = null;
    String B = null;
    String C = null;
    String D = null;
    String E = null;
    String F = null;
    String G = null;
    String H = null;
    String I = null;
    
    String gameMode = "Facile";
    
    //Checking information for operating system client
    InfoSystem infoOS = new InfoSystem(true, true);
    
    String messageWin = "Jeu Gagner\nVous avez battu l'ordianteur.\nLe jeu va se redémarrer.";
    String messageLose = "Jeu Perdu\nL'ordniateur vous à battu.\nLe jeu va se redémarrer.";
    String messageSystemNotCompatibility = "Oups !"
            + "\n\nDésoler mais ce jeu n'est pas pris en charge pour votre PC."
            + "\nPour le moment, seul \"Mac OS X\" et \"Windows 10\" sont pris en charge."
            + "\nOr, votre système est un "+infoOS.systemName+"."
            + "\n\nLe jeu va donc s'éteindre.";
    
    JButton jButton_A = new JButton("_");
    JButton jButton_B = new JButton("_");
    JButton jButton_C = new JButton("_");
    JButton jButton_D = new JButton("_");
    JButton jButton_E = new JButton("_");
    JButton jButton_F = new JButton("_");
    JButton jButton_G = new JButton("_");
    JButton jButton_H = new JButton("_");
    JButton jButton_I = new JButton("_");
    
    ArrayList player = new ArrayList();
    boolean player_1 = false;
    boolean player_2 = false;
    
    int partiesNumber = 0;
    
    JLabel jLabelStatut = new JLabel("Staut : Partie en cours ...");
    JLabel jLabelMode = new JLabel("Mode : "+gameMode);
    JLabel jLabelPartiesNumber = new JLabel("Nombre de parties jouée : "+partiesNumber);
    
    JPanel jPanel = new JPanel();
    JMenuBar menuBar = new JMenuBar();
    
    WebLink webLink = new WebLink();
    
    //Checking information for screen client
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    
    //Sizes Frames
    int morpionScreenSizeWidth = 0;
    int morpionScreenSizeHeight = 0;
    Dimension sizeLabel = new Dimension(0, 0);
    Dimension sizeButtons = new Dimension(0, 0);
    int aboutScreenSizeWidth = 0;
    int aboutScreenSizeHeight = 0;
    Dimension aboutSizeLabel = new Dimension(0, 0);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //--
        //System.out.println("Elément de menu [" + event.getActionCommand() + "] utilisé.");
        //--
        JFrame mainJFrame = new Main();
    }
    
    public Main() {
        super();
        
        //Checking operating system informations for optimisation
        int clientScreenWidth = screenSize.width;
        int clientScreenHeight = screenSize.height;
        System.out.println("Client Width : "+clientScreenWidth);
        System.out.println("Client Height : "+clientScreenHeight);
        //--
        if(infoOS.systemName.equals("Mac OS X")){
            //-Size Frame morpion
            morpionScreenSizeWidth += 250;
            morpionScreenSizeHeight += 235;
            sizeLabel = new Dimension(200, 20);
            
            //Size Frame about
            aboutScreenSizeWidth = 350;
            aboutScreenSizeHeight = 100;
            aboutSizeLabel = new Dimension(330, 90);
            
            jLabelStatut.setPreferredSize(sizeLabel);jPanel.add(jLabelStatut, BorderLayout.CENTER);
            jLabelMode.setPreferredSize(sizeLabel);jPanel.add(jLabelMode, BorderLayout.CENTER);
            jLabelPartiesNumber.setPreferredSize(sizeLabel);jPanel.add(jLabelPartiesNumber, BorderLayout.CENTER);
            
            //Button prepartion
            
            jButton_A.setSize(20, 20);jButton_A.setLocation(20, 20);jButton_A.setLayout(null);jPanel.add(jButton_A, BorderLayout.WEST);
            jButton_B.setSize(20, 20);jButton_B.setLocation(50, 20);jButton_B.setLayout(null);jPanel.add(jButton_B, BorderLayout.CENTER);
            jButton_C.setSize(20, 20);jButton_C.setLocation(80, 20);jButton_C.setLayout(null);jPanel.add(jButton_C, BorderLayout.EAST);

            jButton_D.setSize(20, 20);jButton_D.setLocation(20, 50);jButton_D.setLayout(null);jPanel.add(jButton_D, BorderLayout.WEST);
            jButton_E.setSize(20, 20);jButton_E.setLocation(50, 50);jButton_E.setLayout(null);jPanel.add(jButton_E, BorderLayout.CENTER);
            jButton_F.setSize(20, 20);jButton_F.setLocation(80, 50);jButton_F.setLayout(null);jPanel.add(jButton_F, BorderLayout.EAST);

            jButton_G.setSize(20, 20);jButton_G.setLocation(20, 80);jButton_G.setLayout(null);jPanel.add(jButton_G, BorderLayout.WEST);
            jButton_H.setSize(20, 20);jButton_H.setLocation(50, 80);jButton_H.setLayout(null);jPanel.add(jButton_H, BorderLayout.CENTER);
            jButton_I.setSize(20, 20);jButton_I.setLocation(80, 80);jButton_I.setLayout(null);jPanel.add(jButton_I, BorderLayout.EAST);
        }else if(infoOS.systemName.equals("Windows 10")){
            //-Size Frame morpion
            morpionScreenSizeWidth += 400;
            morpionScreenSizeHeight += 335;
            sizeLabel = new Dimension(350, 30);
            
            //Size Frame about
            aboutScreenSizeWidth = 350;
            aboutScreenSizeHeight = 120;
            aboutSizeLabel = new Dimension(330, 110);
            
            jLabelStatut.setPreferredSize(sizeLabel);jPanel.add(jLabelStatut, BorderLayout.CENTER);
            jLabelMode.setPreferredSize(sizeLabel);jPanel.add(jLabelMode, BorderLayout.CENTER);
            jLabelPartiesNumber.setPreferredSize(sizeLabel);jPanel.add(jLabelPartiesNumber, BorderLayout.CENTER);
            
            //Button prepartion
            sizeButtons = new Dimension(100, 40);
            
            jButton_A.setPreferredSize(sizeButtons);jButton_A.setLocation(20, 20);jButton_A.setLayout(null);jPanel.add(jButton_A, BorderLayout.WEST);
            jButton_B.setPreferredSize(sizeButtons);jButton_B.setLocation(50, 20);jButton_B.setLayout(null);jPanel.add(jButton_B, BorderLayout.CENTER);
            jButton_C.setPreferredSize(sizeButtons);jButton_C.setLocation(80, 20);jButton_C.setLayout(null);jPanel.add(jButton_C, BorderLayout.EAST);

            jButton_D.setPreferredSize(sizeButtons);jButton_D.setLocation(20, 50);jButton_D.setLayout(null);jPanel.add(jButton_D, BorderLayout.WEST);
            jButton_E.setPreferredSize(sizeButtons);jButton_E.setLocation(50, 50);jButton_E.setLayout(null);jPanel.add(jButton_E, BorderLayout.CENTER);
            jButton_F.setPreferredSize(sizeButtons);jButton_F.setLocation(80, 50);jButton_F.setLayout(null);jPanel.add(jButton_F, BorderLayout.EAST);

            jButton_G.setPreferredSize(sizeButtons);jButton_G.setLocation(20, 80);jButton_G.setLayout(null);jPanel.add(jButton_G, BorderLayout.WEST);
            jButton_H.setPreferredSize(sizeButtons);jButton_H.setLocation(50, 80);jButton_H.setLayout(null);jPanel.add(jButton_H, BorderLayout.CENTER);
            jButton_I.setPreferredSize(sizeButtons);jButton_I.setLocation(80, 80);jButton_I.setLayout(null);jPanel.add(jButton_I, BorderLayout.EAST);
        }else {
            messageOtherComputer();
            stopGame();
        }
        
        jButton_A.addActionListener(new ActionListener() { @Override public void actionPerformed(ActionEvent e) { player_1 = true; if( (A==null) && (player_1==true) ){ A="X";jButton_A.setText("X");jButton_A.setEnabled(false);computer();checkStatus();player_1 = false; } } });
        jButton_B.addActionListener(new ActionListener() { @Override public void actionPerformed(ActionEvent e) { player_1 = true; if( (B==null) && (player_1==true) ){ B="X";jButton_B.setText("X");jButton_B.setEnabled(false);computer();checkStatus();player_1 = false; } } });
        jButton_C.addActionListener(new ActionListener() { @Override public void actionPerformed(ActionEvent e) { player_1 = true; if( (C==null) && (player_1==true) ){ C="X";jButton_C.setText("X");jButton_C.setEnabled(false);computer();checkStatus();player_1 = false; } } });
        jButton_D.addActionListener(new ActionListener() { @Override public void actionPerformed(ActionEvent e) { player_1 = true; if( (D==null) && (player_1==true) ){ D="X";jButton_D.setText("X");jButton_D.setEnabled(false);computer();checkStatus();player_1 = false; } } });
        jButton_E.addActionListener(new ActionListener() { @Override public void actionPerformed(ActionEvent e) { player_1 = true; if( (E==null) && (player_1==true) ){ E="X";jButton_E.setText("X");jButton_E.setEnabled(false);computer();checkStatus();player_1 = false; } } });
        jButton_F.addActionListener(new ActionListener() { @Override public void actionPerformed(ActionEvent e) { player_1 = true; if( (F==null) && (player_1==true) ){ F="X";jButton_F.setText("X");jButton_F.setEnabled(false);computer();checkStatus();player_1 = false; } } });
        jButton_G.addActionListener(new ActionListener() { @Override public void actionPerformed(ActionEvent e) { player_1 = true; if( (G==null) && (player_1==true) ){ G="X";jButton_G.setText("X");jButton_G.setEnabled(false);computer();checkStatus();player_1 = false; } } });
        jButton_H.addActionListener(new ActionListener() { @Override public void actionPerformed(ActionEvent e) { player_1 = true; if( (H==null) && (player_1==true) ){ H="X";jButton_H.setText("X");jButton_H.setEnabled(false);computer();checkStatus();player_1 = false; } } });
        jButton_I.addActionListener(new ActionListener() { @Override public void actionPerformed(ActionEvent e) { player_1 = true; if( (I==null) && (player_1==true) ){ I="X";jButton_I.setText("X");jButton_I.setEnabled(false);computer();checkStatus();player_1 = false; } } });
        
        // - - - [ Boutons ] - - -
        
        JMenu jMenuPrincipal = new JMenu("Menu");
        JMenuItem itemResetGame = new JMenuItem("Redémarrer le jeu", 'N');
        JMenuItem itemStopGame = new JMenuItem("Quitter le jeu", 'N');
        jMenuPrincipal.add(itemResetGame);
        jMenuPrincipal.add(itemStopGame);
        menuBar.add(jMenuPrincipal);
        
        ActionListener actionitemResetGame = new ActionListener() { public void actionPerformed(ActionEvent event) { resetGame(); } };itemResetGame.addActionListener(actionitemResetGame);
        ActionListener actionitemStopGame = new ActionListener() { public void actionPerformed(ActionEvent event) { stopGame(); } };itemStopGame.addActionListener(actionitemStopGame);
        
        JMenu jMenuLevel = new JMenu("Niveau du jeu");
        JMenuItem itemLevelEsay = new JMenuItem("Facile", 'N');
        JMenuItem itemLevelNormal = new JMenuItem("Normal", 'N');
        JMenuItem itemLevelHard = new JMenuItem("Difficile", 'N');
        jMenuLevel.add(itemLevelEsay);
        jMenuLevel.add(itemLevelNormal);
        jMenuLevel.add(itemLevelHard);
        menuBar.add(jMenuLevel);
        ActionListener actionChangeGameMode = new ActionListener() { public void actionPerformed(ActionEvent event) { changeGameMode(event.getActionCommand()); } };
        itemLevelEsay.addActionListener(actionChangeGameMode);
        itemLevelNormal.addActionListener(actionChangeGameMode);
        itemLevelHard.addActionListener(actionChangeGameMode);
        
        JMenu jMenuAbout = new JMenu("A propos");
        JMenuItem itemLdumayWebSite = new JMenuItem("LDumay.fr [Site Web]", 'N');
        JMenuItem itemLdumayGit = new JMenuItem("LDumay.fr [GitHub.com]", 'N');
        JMenuItem itemLdumayMorpion = new JMenuItem("Crédits", 'N');
        jMenuAbout.add(itemLdumayWebSite);
        jMenuAbout.add(itemLdumayGit);
        jMenuAbout.add(itemLdumayMorpion);
        menuBar.add(jMenuAbout);
        
        ActionListener actionLdumayWebSite = new ActionListener() { public void actionPerformed(ActionEvent event) { webLink.openWebpage("https://ldumay.fr/"); } };itemLdumayWebSite.addActionListener(actionLdumayWebSite);
        ActionListener actionLdumayGit = new ActionListener() { public void actionPerformed(ActionEvent event) { webLink.openWebpage("https://github.com/ldumay/"); } };itemLdumayGit.addActionListener(actionLdumayGit);
        ActionListener actionLdumayMorpion = new ActionListener() { public void actionPerformed(ActionEvent event) { messageMorpionAbout(); } };itemLdumayMorpion.addActionListener(actionLdumayMorpion);
        
        // - - - [ JFrame & JPanel ] - - -
        
        this.setJMenuBar(menuBar);
        this.setContentPane(jPanel);
        
        pack();
        
        this.setTitle(titleJFrame);
        this.setSize(morpionScreenSizeWidth,morpionScreenSizeHeight);
        //this.setSize(width/2, height/2);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        this.setLayout(new BorderLayout());
        
        WindowListener l = new WindowAdapter() {
            public void windowClosing(WindowEvent e){ stopGame(); }
        }; addWindowListener(l);
    }
    
    public void action(String elementSelected, int playerSelected){
        switch(elementSelected){
            case "test" : System.out.println("Test - OK"); break;
            case "A": A="O";jButton_A.setText("O");jButton_A.setEnabled(false);computer();checkStatus(); break;
            case "B": A="O";jButton_B.setText("O");jButton_B.setEnabled(false);computer();checkStatus(); break;
            case "C": A="O";jButton_C.setText("O");jButton_C.setEnabled(false);computer();checkStatus(); break;
            case "D": A="O";jButton_D.setText("O");jButton_D.setEnabled(false);computer();checkStatus(); break;
            case "E": A="O";jButton_E.setText("O");jButton_E.setEnabled(false);computer();checkStatus(); break;
            case "F": A="O";jButton_F.setText("O");jButton_F.setEnabled(false);computer();checkStatus(); break;
            case "G": A="O";jButton_G.setText("O");jButton_G.setEnabled(false);computer();checkStatus(); break;
            case "H": A="O";jButton_H.setText("O");jButton_H.setEnabled(false);computer();checkStatus(); break;
            case "I": A="O";jButton_I.setText("O");jButton_I.setEnabled(false);computer();checkStatus(); break;
            
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
        partiesNumber++;
        jLabelStatut.setText("Staut : Partie en cours ...");
        jLabelMode.setText("Mode : "+gameMode);
        jLabelPartiesNumber.setText("Nombre de parties jouée : "+partiesNumber);
        System.out.println("Le jeu a été redémarré.");
    }
    
    public void stopGame(){
        //System.out.println("Le jeu va s'arrêter.");
        System.exit(0);
    }
    
    public void changeGameMode(String gamemode) {
        System.out.println("gamemode : "+gamemode);
        switch(gamemode){
            case "Facile": gameMode="Facile";  break;
            case "Normal": gameMode="Normal";  break;
            case "Difficile": gameMode="Difficile";  break;
        }
        jLabelMode.setText("Mode : "+gameMode);
    }
    
    public void messageOtherComputer(){
        JOptionPane.showMessageDialog(this, messageSystemNotCompatibility, "Oh oh !", HEIGHT);
    }
    
    public void messageMorpionAbout(){
        JFrame frameMorpionAbout = new JFrame();
        frameMorpionAbout.setSize(aboutScreenSizeWidth, aboutScreenSizeHeight);
        
        String message = "Ce Morpion a été crée par Loïc Dumay.\nCelui-ci est mon premier jeu en Java."
                + "\nN'hésitez pas à consulter mon Site et mon GitHub.\nMerci à vous d'avoir testé ce 1er petit jeu Java.";
        
        JTextPane  messageTextPane = new JTextPane();
        messageTextPane.setText(message);
        messageTextPane.setEditable(false);
        //Centrage du JTextPane
        StyledDocument styleMessageTextPane = messageTextPane.getStyledDocument();
        SimpleAttributeSet center = new SimpleAttributeSet();
        StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
        styleMessageTextPane.setParagraphAttributes(0, styleMessageTextPane.getLength(), center, false);
        
        JTextArea  messageTextArea = new JTextArea(message);
        messageTextArea.setHighlighter(null);
        
        JScrollPane messageScrollPane = new JScrollPane(messageTextPane);
        messageScrollPane.setPreferredSize(aboutSizeLabel);
        
        frameMorpionAbout.setTitle("Crédits");
        frameMorpionAbout.getContentPane().add(messageScrollPane);
        frameMorpionAbout.setLocationRelativeTo(null);
        frameMorpionAbout.setResizable(false);
        frameMorpionAbout.setVisible(true);
        frameMorpionAbout.setLayout(new BorderLayout());
        frameMorpionAbout.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }
}