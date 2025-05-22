//clase main---------------------------------------------------------------------------------------------------------------
package com.mycompany.calculatorapp;

public class CalculatorApp {
    public static void main(String[] args) {
        // Crear el modelo, la vista y el controlador
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView();
        CalculatorController controller = new CalculatorController(view, model);

        // Hacer visible la vista
        view.setVisible(true);
    }
}

//clase 2----------------------------------------------------------------------------------------------------
package com.mycompany.calculatorapp;

import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
    private CalculatorView view;
    private CalculatorModel model;
    private double firstNumber;
    private String operator;

    public CalculatorController(CalculatorView view, CalculatorModel model) {
        this.view = view;
        this.model = model;

        // Añadir ActionListeners a los botones
        for (int i = 0; i < 10; i++) {
            view.getNumberButtons()[i].addActionListener(new NumberButtonListener());
        }
        view.getAddButton().addActionListener(new OperatorButtonListener());
        view.getSubButton().addActionListener(new OperatorButtonListener());
        view.getMulButton().addActionListener(new OperatorButtonListener());
        view.getDivButton().addActionListener(new OperatorButtonListener());
        view.getEqualsButton().addActionListener(new EqualsButtonListener());
        view.getClearButton().addActionListener(e -> view.getDisplay().setText(""));
    }

    class NumberButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String currentText = view.getDisplay().getText();
            String buttonText = ((JButton) e.getSource()).getText();
            view.getDisplay().setText(currentText + buttonText);
        }
    }

    class OperatorButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            firstNumber = Double.parseDouble(view.getDisplay().getText());
            operator = ((JButton) e.getSource()).getText();
            view.getDisplay().setText("");
        }
    }

    class EqualsButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double secondNumber = Double.parseDouble(view.getDisplay().getText());

            switch (operator) {
                case "+":
                    model.add(firstNumber, secondNumber);
                    break;
                case "-":
                    model.subtract(firstNumber, secondNumber);
                    break;
                case "*":
                    model.multiply(firstNumber, secondNumber);
                    break;
                case "/":
                    model.divide(firstNumber, secondNumber);
                    break;
            }

            view.getDisplay().setText(String.valueOf(model.getResult()));
        }
    }
}

//clase 3-------------------------------------------------------------------------------------------------------
package com.mycompany.calculatorapp;

public class CalculatorModel {
    // Atributo para almacenar el resultado de las operaciones
    private double result;

    public void add(double number1, double number2) {
        result = number1 + number2;
    }

    public void subtract(double number1, double number2) {
        result = number1 - number2;
    }

    public void multiply(double number1, double number2) {
        result = number1 * number2;
    }

    public void divide(double number1, double number2) {
        if (number2 != 0) {
            result = number1 / number2;
        } else {
            result = 0; // Manejo simple de división por cero
        }
    }

    public double getResult() {
        return result;
    }
}

//clase 4 -------------------------------------------------------------------------------------------------------------------------------------
package com.mycompany.calculatorapp;

import javax.swing.*;
import java.awt.*;

public class CalculatorView extends JFrame {
    private final JTextField display;
    private final JButton[] numberButtons;
    private final JButton addButton;
    private JButton subButton, mulButton, divButton, equalsButton, clearButton;

    public CalculatorView() {
        // Configuración de la ventana
        setTitle("Calculadora");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Crear el campo de texto para la pantalla
        display = new JTextField();
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.PLAIN, 24));
        add(display, BorderLayout.NORTH);

        // Crear los botones numéricos y de operaciones
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            panel.add(numberButtons[i]);
        }

        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        equalsButton = new JButton("=");
        clearButton = new JButton("C");

        panel.add(addButton);
        panel.add(subButton);
        panel.add(mulButton);
        panel.add(divButton);
        panel.add(equalsButton);
        panel.add(clearButton);

        add(panel, BorderLayout.CENTER);
    }

    public JTextField getDisplay() {
        return display;
    }

    public JButton[] getNumberButtons() {
        return numberButtons;
    }

    public JButton getAddButton() {
        return addButton;
    }

    public JButton getSubButton() {
        return subButton;
    }

    public JButton getMulButton() {
        return mulButton;
    }

    public JButton getDivButton() {
        return divButton;
    }

    public JButton getEqualsButton() {
        return equalsButton;
    }

    public JButton getClearButton() {
        return clearButton;
    }
}
