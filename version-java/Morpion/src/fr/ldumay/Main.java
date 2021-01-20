/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ldumay;

import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author mtl
 */
public class Main extends JFrame{
    
    String projectAuteur = "LDumay.Fr";
    String projectCategoryTitle = "Games";
    String projectGamesTitle = "Morpion";
    String projectVersion = "0.0.1";
    String titleJFrame = "" 
            + " | " + projectAuteur
            + " | " + projectCategoryTitle 
            + " | " + projectGamesTitle 
            + " | Version [" + projectVersion + "]";
    
    boolean A = false;
    boolean B = false;
    boolean C = false;
    boolean D = false;
    boolean E = false;
    boolean F = false;
    boolean G = false;
    boolean H = false;
    boolean I = false;
    
    JButton jButton_A = new JButton("_");
    JButton jButton_B = new JButton("_");
    JButton jButton_C = new JButton("_");
    JButton jButton_D = new JButton("_");
    JButton jButton_E = new JButton("_");
    JButton jButton_F = new JButton("_");
    JButton jButton_G = new JButton("_");
    JButton jButton_H = new JButton("_");
    JButton jButton_I = new JButton("_");
    
    JButton jButton_ResetGame = new JButton("Redémarrer le jeu");
    
    JPanel jPanel = new JPanel();
    
    public Main() {
        super("Title");

        WindowListener l = new WindowAdapter() {
            
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
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
        
        jButton_ResetGame.setSize(20, 20);jButton_ResetGame.setLocation(80, 80);jPanel.add(jButton_ResetGame);
        
        this.setContentPane(jPanel);
        this.setSize(250,165);
        this.setVisible(true);
        this.setName(titleJFrame);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JFrame mainJFrame = new Main();
    }
    
}