package com.mycompany.calculadora;

import javax.swing.*;
import java.awt.*;

public class Calculadora {
      //ventana----------------------------------------------------
    public static void main(String[] args) {
        JFrame frame = new JFrame("calculadora");
        frame.setSize(335, 540);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
                                              
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 3, 5, 5));
        panel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        frame.add(panel, BorderLayout.NORTH);
        panel.setPreferredSize(new Dimension(100, 80));
    
        //interfaz-----------------------------------------------
        JButton buttonmenu = new JButton ("☰");
        buttonmenu.setHorizontalAlignment(JTextField.RIGHT);
        buttonmenu.setBorder(null);
        buttonmenu.setFont(new Font("none", Font.PLAIN, 15));
        panel.add(buttonmenu);
        
        JLabel nameLabel = new JLabel("estandar");
        nameLabel.setFont(new Font("none", Font.BOLD, 20));
        panel.add(nameLabel);
        
        JButton buttonvolver = new JButton("⎋");
        buttonvolver.setHorizontalAlignment(JTextField.CENTER);
        buttonvolver.setBorder(null);
        buttonvolver.setFont(new Font("none", Font.PLAIN, 25));
        panel.add(buttonvolver);
        
        JPanel panel1 = new JPanel ();
        panel1.setLayout(new BorderLayout());
        JTextField nameField = new JTextField();
        panel1.add(nameField);
        
        nameField.setFont(new Font("Arial", Font.PLAIN, 40));
        frame.add(panel1, BorderLayout.CENTER);
        nameField.setHorizontalAlignment(JTextField.RIGHT);
        nameField.setBorder(null);
        nameField.setText("0");
        
        JPanel panel2_5 = new JPanel();
        panel2_5.setLayout(new GridLayout(1,6,5,5));
        panel1.add(panel2_5, BorderLayout.SOUTH);
        panel2_5.setPreferredSize(new Dimension(25, 25));
        
        
        //panel para botones
        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout(6,4,3,3));
        frame.add(panel2, BorderLayout.SOUTH);
        panel2.setPreferredSize(new Dimension(300, 320));
        
        
        //botones
        JButton buttonMC = new JButton("MC");
        buttonMC.setBorder(null);
        buttonMC.setFont(new Font("Arial", Font.PLAIN, 12));
        panel2_5.add(buttonMC);
        
        JButton buttonMR = new JButton("MR");
        buttonMR.setBorder(null);
        buttonMR.setFont(new Font("Arial", Font.PLAIN, 12));
        panel2_5.add(buttonMR);
        
        JButton buttonMPLUS = new JButton("M+");
        buttonMPLUS.setBorder(null);
        buttonMPLUS.setFont(new Font("Arial", Font.PLAIN, 12));
        panel2_5.add(buttonMPLUS);
        
        JButton buttonMMENOS = new JButton("M-");
        buttonMMENOS.setBorder(null);
        buttonMMENOS.setFont(new Font("Arial", Font.PLAIN, 12));
        panel2_5.add(buttonMMENOS);
        
        JButton buttonMS = new JButton("MS");
        buttonMS.setBorder(null);
        buttonMS.setFont(new Font("Arial", Font.PLAIN, 12));
        panel2_5.add(buttonMS);
        
        JButton buttonM = new JButton("M▼");
        buttonM.setBorder(null);
        buttonM.setFont(new Font("Arial", Font.PLAIN, 12));
        panel2_5.add(buttonM);
        
        JButton buttonporcentaje = new JButton("%");
        buttonporcentaje.setBorder(null);
        buttonporcentaje.setFont(new Font("Arial", Font.PLAIN, 16));
        panel2.add(buttonporcentaje);
        
        JButton buttonce = new JButton("CE");
        buttonce.setBorder(null);
        buttonce.setFont(new Font("Arial", Font.PLAIN, 16));
        panel2.add(buttonce);
        
        JButton buttonc = new JButton("C");
        buttonc.setBorder(null);
        buttonc.setFont(new Font("Arial", Font.PLAIN, 16));
        panel2.add(buttonc);
              
        JButton buttonborrar = new JButton("⌫");
        buttonborrar.setBorder(null);
        buttonborrar.setFont(new Font("nose", Font.PLAIN, 16));
        panel2.add(buttonborrar);
        
        JButton buttoninverso = new JButton("1/x");
        buttoninverso.setBorder(null);
        buttoninverso.setFont(new Font("Arial", Font.PLAIN, 14));
        panel2.add(buttoninverso);
        
         JButton buttoncuadrado = new JButton("x²");
        buttoncuadrado.setBorder(null);
        buttoncuadrado.setFont(new Font("Arial", Font.PLAIN, 14));
        panel2.add(buttoncuadrado);
        
        JButton buttonraiz = new JButton("²√x");
        buttonraiz.setBorder(null);
        buttonraiz.setFont(new Font("Arial", Font.PLAIN, 14));
        panel2.add(buttonraiz);
        
        JButton buttondivision = new JButton("÷");
        buttondivision.setBorder(null);
        buttondivision.setFont(new Font("Arial", Font.PLAIN, 20));
        panel2.add(buttondivision);
        
        JButton button7 = new JButton("7");
        button7.setBorder(null);
        button7.setFont(new Font("Arial", Font.PLAIN, 20));
        panel2.add(button7);
        
        JButton button8 = new JButton("8");
        button8.setBorder(null);
        button8.setFont(new Font("Arial", Font.PLAIN, 20));
        panel2.add(button8);
        
        JButton button9 = new JButton("9");
        button9.setBorder(null);
        button9.setFont(new Font("Arial", Font.PLAIN, 20));
        panel2.add(button9);
        
        JButton buttonmultiplicacion = new JButton("x");
        buttonmultiplicacion.setBorder(null);
        buttonmultiplicacion.setFont(new Font("Arial", Font.PLAIN, 20));
        panel2.add(buttonmultiplicacion);
        
        JButton button4 = new JButton("4");
        button4.setBorder(null);
        button4.setFont(new Font("Arial", Font.PLAIN, 20));
        panel2.add(button4);
        
        JButton button5 = new JButton("5");
        button5.setBorder(null);
        button5.setFont(new Font("Arial", Font.PLAIN, 20));
        panel2.add(button5);
        
        JButton button6 = new JButton("6");
        button6.setBorder(null);
        button6.setFont(new Font("Arial", Font.PLAIN, 20));
        panel2.add(button6);
        
        JButton buttonmenos = new JButton("-");
        buttonmenos.setBorder(null);
        buttonmenos.setFont(new Font("Arial", Font.PLAIN, 20));
        panel2.add(buttonmenos);
        
        JButton button1 = new JButton("1");
        button1.setBorder(null);
        button1.setFont(new Font("Arial", Font.PLAIN, 20));
        panel2.add(button1);
        
        JButton button2 = new JButton("2");
        button2.setBorder(null);
        button2.setFont(new Font("Arial", Font.PLAIN, 20));
        panel2.add(button2);
        
        JButton button3 = new JButton("3");
        button3.setBorder(null);
        button3.setFont(new Font("Arial", Font.PLAIN, 20));
        panel2.add(button3);
        
        JButton buttonsuma = new JButton("+");
        buttonsuma.setBorder(null);
        buttonsuma.setFont(new Font("Arial", Font.PLAIN, 20));
        panel2.add(buttonsuma);
        
        JButton buttonmasmenos = new JButton("+/-");
        buttonmasmenos.setBorder(null);
        buttonmasmenos.setFont(new Font("Arial", Font.PLAIN, 14));
        panel2.add(buttonmasmenos);
        
        JButton button0 = new JButton("0");
        button0.setBorder(null);
        button0.setFont(new Font("Arial", Font.PLAIN, 20));
        panel2.add(button0);
        
        JButton buttoncoma = new JButton(",");
        buttoncoma.setBorder(null);
        buttoncoma.setFont(new Font("Arial", Font.PLAIN, 20));
        panel2.add(buttoncoma);
        
        JButton buttonigual = new JButton("=");
        buttonigual.setBorder(null);
        buttonigual.setFont(new Font("Arial", Font.PLAIN, 20));
        panel2.add(buttonigual);
       
       frame.setVisible(true);
    }
  }

