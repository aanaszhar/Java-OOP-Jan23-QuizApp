package com.example.demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

class WelcomePage extends JPanel {

    JButton play , exit ;
    JLabel label,imagelogo;
    JFrame frame;

    static boolean go  = false ;

    WelcomePage(JFrame window) {

        setSize(window.getSize().width,window.getSize().height);
        setLayout(null);
        setBackground(Color.DARK_GRAY);
        window.setContentPane(this);

        imagelogo = new JLabel(new ImageIcon("utp logo.png"));
        imagelogo.setBounds(200,20,400,200);
        //imagelogo.setPreferredSize(new Dimension(100, 200));
        add(imagelogo);

        label = new JLabel ("<html><span style='font-weight:bold;color:blue;font-size:15px;'>WELCOME TO THE UTP LABORATORY MANAGEMENT QUIZ</span></html>");
        label.setBounds(100,200,600,50);
        add(label);


        play = new JButton ("Play");
        play.setBackground(new Color(255,255,255)) ;
        play.setBounds(300,275,200,50);
        add(play);

        exit = new JButton ("Exit");
        exit.setBackground(new Color(255,255,255)) ;
        exit.setBounds(300,350,200,50);
        add(exit);

        window.setVisible(true);

    }

    void choose (int time) {

        play.addActionListener((ActionEvent e) -> {
            go = true ;
            setVisible(false);
        });

        exit.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });

        while (!go) {
            try {
                Thread.sleep(0);
            } catch (InterruptedException ex) {}
        }

        go = false ;

    }

}