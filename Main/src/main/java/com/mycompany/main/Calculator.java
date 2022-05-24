/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author USER
 */
import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {
    JPanel centerPanel;
    JTextArea textArea;
    JButton[] butt;


    public Calculator(){
        setTitle("Калькулятор");
        init();
        setBounds(500,150,350,400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    private void init() {

        textArea = new JTextArea(2,0);
        add(textArea, BorderLayout.NORTH);
        Font font = new Font("Calibri",Font.BOLD,35);
        textArea.setFont(font);
        textArea.setBackground(Color.LIGHT_GRAY);

        centerPanel = new JPanel(new GridLayout(5,4,3,3));
        add(centerPanel, BorderLayout.CENTER);
        buttons();
        Controller calc = new Controller(this);
        butt[3].addActionListener(calc);
        butt[7].addActionListener(calc);
        butt[11].addActionListener(calc);
        butt[15].addActionListener(calc);
        butt[16].addActionListener(calc);
                
    }

    private void buttons (){
        butt = new JButton[17];
        butt[0] = new JButton("7");
        butt[1] = new JButton("8");
        butt[2] = new JButton("9");
        butt[3] = new JButton("*");
        butt[4] = new JButton("4");
        butt[5] = new JButton("5");
        butt[6] = new JButton("6");
        butt[7] = new JButton("-");
        butt[8] = new JButton("1");
        butt[9] = new JButton("2");
        butt[10] = new JButton("3");
        butt[11] = new JButton("+");
        butt[12] = new JButton("0");
        butt[13] = new JButton(".");
        butt[14] = new JButton("C");
        butt[15] = new JButton("/");
        butt[16] = new JButton("=");


        for(JButton b: butt){
            b.addActionListener(new Controller(this));
            centerPanel.add(b);
            Font font = new Font("Calibri",Font.BOLD,25);
            b.setFont(font);

        }
    }

}
