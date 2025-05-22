
package com.mycompany.apuntes;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class Apuntes {

    public static void main(String[] args) {
        
        Frame telefono = new Frame("telefono");
        telefono.setSize(400,600);
        telefono.setLayout(null);
        telefono.setVisible(true);
        telefono.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
         });
        
        TextField numeros = new TextField("");
        numeros.setBounds(111,70,180,60);
        telefono.add(numeros);
        
        Button numero1 = new Button ("1");
        numero1.setBounds(100,150,60,60);
        telefono.add(numero1);
        
        numero1.addActionListener(new ActionListener() {
            @Override
        public void actionPerformed(ActionEvent e) {
        numeros.setText(numeros.getText() + "1");
        }
            });
        
                
        Button numero2 = new Button ("2");
        numero2.setBounds(170,150,60,60);
        telefono.add(numero2);
        
        numero2.addActionListener(new ActionListener() {
            @Override
        public void actionPerformed(ActionEvent e) {
        numeros.setText(numeros.getText() + "2");
        }
            });
                
        Button numero3 = new Button ("3");
        numero3.setBounds(240,150,60,60);
        telefono.add(numero3);
        
        numero3.addActionListener(new ActionListener() {
            @Override
        public void actionPerformed(ActionEvent e) {
        numeros.setText(numeros.getText() + "3");
        }
            });
        
        Button numero4 = new Button ("4");
        numero4.setBounds(100,220,60,60);
        telefono.add(numero4);
        
        numero4.addActionListener(new ActionListener() {
            @Override
        public void actionPerformed(ActionEvent e) {
        numeros.setText(numeros.getText() + "4");
        }
            });
        
        Button numero5 = new Button ("5");
        numero5.setBounds(170,220,60,60);
        telefono.add(numero5);
        
        numero5.addActionListener(new ActionListener() {
            @Override
        public void actionPerformed(ActionEvent e) {
        numeros.setText(numeros.getText() + "5");
        }
            });
        
        Button numero6 = new Button ("6");
        numero6.setBounds(240,220,60,60);
        telefono.add(numero6);
        
        numero6.addActionListener(new ActionListener() {
            @Override
        public void actionPerformed(ActionEvent e) {
        numeros.setText(numeros.getText() + "6");
        }
            });
        
        Button numero7 = new Button ("7");
        numero7.setBounds(100,290,60,60);
        telefono.add(numero7);
        
        numero7.addActionListener(new ActionListener() {
            @Override
        public void actionPerformed(ActionEvent e) {
        numeros.setText(numeros.getText() + "7");
        }
            });
        
        Button numero8 = new Button ("8");
        numero8.setBounds(170,290,60,60);
        telefono.add(numero8);
        
        numero8.addActionListener(new ActionListener() {
            @Override
        public void actionPerformed(ActionEvent e) {
        numeros.setText(numeros.getText() + "8");
        }
            });
        
        Button numero9 = new Button ("9");
        numero9.setBounds(240,290,60,60);
        telefono.add(numero9);
        
        numero9.addActionListener(new ActionListener() {
            @Override
        public void actionPerformed(ActionEvent e) {
        numeros.setText(numeros.getText() + "9");
        }
            });
        
        Button asterisco = new Button ("*");
        asterisco.setBounds(100,360,60,60);
        telefono.add(asterisco);
        
        asterisco.addActionListener(new ActionListener() {
            @Override
        public void actionPerformed(ActionEvent e) {
        numeros.setText(numeros.getText() + "*");
        }
            });
        
        Button numero0 = new Button ("0");
        numero0.setBounds(170,360,60,60);
        telefono.add(numero0);
        
        numero0.addActionListener(new ActionListener() {
            @Override
        public void actionPerformed(ActionEvent e) {
        numeros.setText(numeros.getText() + "0");
        }
            });
        
        Button gato = new Button ("#");
        gato.setBounds(240,360,60,60);
        telefono.add(gato);
        
        gato.addActionListener(new ActionListener() {
            @Override
        public void actionPerformed(ActionEvent e) {
        numeros.setText(numeros.getText() + "#");
        }
            });
        
        Button llamar = new Button ("✆");
        llamar.setBounds(170,430,60,60);
        telefono.add(llamar);
        llamar.addActionListener(e -> {
            String numeromarcado = numeros.getText();
            System.out.println("Llamando al numero: " + numeromarcado);
        });
        
        Button borrar = new Button ("<x)"); 
        borrar.setBounds(240,430,60,60);
        telefono.add(borrar);
         borrar.addActionListener(e -> {
            String numeroactual = numeros.getText();
            if (!numeroactual.isEmpty()) {
                numeros.setText(numeroactual.substring(0, numeroactual.length() - 1));
            }
        });
    }
}
