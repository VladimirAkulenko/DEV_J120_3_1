/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author USER
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Controller implements ActionListener {
    Calculator frame;
    private double a =0;
    private int key = 0;



    public Controller(Calculator frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

       if (e.getSource() == frame.butt[0]){
           frame.textArea.setText(frame.textArea.getText() +"7");
        }
       if (e.getSource() == frame.butt[1]){
           frame.textArea.setText(frame.textArea.getText() + "8");
        }
       if (e.getSource() == frame.butt[2]){
           frame.textArea.setText(frame.textArea.getText() + "9");
        }
        if (e.getSource() == frame.butt[3]){
            if (!frame.textArea.getText().isEmpty()){
                a = Double.parseDouble(frame.textArea.getText());
                key = 1;
                frame.textArea.setText("");
            }
        }
       if (e.getSource() == frame.butt[4]){
           frame.textArea.setText(frame.textArea.getText() + "4");
        }
       if (e.getSource() == frame.butt[5]){
           frame.textArea.setText(frame.textArea.getText() + "5");
        }
       if (e.getSource() == frame.butt[6]){
           frame.textArea.setText(frame.textArea.getText() + "6");
        }
        if (e.getSource() == frame.butt[7]){
            if (!frame.textArea.getText().isEmpty()){
                a = Double.parseDouble(frame.textArea.getText());
                key = 2;
                frame.textArea.setText("");
            }
        }
        if (e.getSource() == frame.butt[8]){
            frame.textArea.setText(frame.textArea.getText() + "1");
       }
        if (e.getSource() == frame.butt[9]){
            frame.textArea.setText(frame.textArea.getText() + "2");
       }
        if (e.getSource() == frame.butt[10]){
            frame.textArea.setText(frame.textArea.getText() + "3");
       }
       if (e.getSource() == frame.butt[11]){
           if (!frame.textArea.getText().isEmpty()){
               a = Double.parseDouble(frame.textArea.getText());
               key = 3;
               frame.textArea.setText("");
           }
       }
        if (e.getSource() == frame.butt[12]){
            frame.textArea.setText(frame.textArea.getText() + "0");
        }
        if (e.getSource() == frame.butt[13]){
            if (!frame.textArea.getText().contains(".")){
                frame.textArea.setText(frame.textArea.getText() + ".");
            }
        }
       if (e.getSource() == frame.butt[14]){
            frame.textArea.setText("");
        }
        if (e.getSource() == frame.butt[15]){
            if (!frame.textArea.getText().isEmpty()){
                a = Double.parseDouble(frame.textArea.getText());
                key = 4;
                frame.textArea.setText("");
            }
        }

       if (e.getSource() == frame.butt[16]){
            if (!frame.textArea.getText().isEmpty()) {
                double d = Double.parseDouble(frame.textArea.getText());
                switch (key) {
                    case 1:
                        frame.textArea.setText(String.valueOf(a * d));
                        break;
                    case 2:
                        frame.textArea.setText(String.valueOf(a - d));
                        break;
                    case 3:
                       frame.textArea.setText(String.valueOf(a + d));
                        break;
                    case 4:
                        frame.textArea.setText(String.valueOf(a / d));
                        break;
                }
            }
        }

    }
}
