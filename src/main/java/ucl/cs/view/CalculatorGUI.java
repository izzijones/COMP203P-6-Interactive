package ucl.cs.view;

import ucl.cs.model.ReversePolishCalculator;

import javax.swing.*;
import java.awt.event.ActionListener;

public class CalculatorGUI {

    private final JButton button1 = new JButton("1");
    private final JButton button2 = new JButton("2");
    private final JButton button3 = new JButton("3");
    private final JButton button4 = new JButton("4");
    private final JButton button5 = new JButton("5");
    private final JButton buttonplus = new JButton("+");
    private final JButton buttonminus = new JButton("-");

    private final JTextField textField = new JTextField(10);
    public CalculatorGUI(ActionListener controller) {
        JFrame frame = new JFrame("Reverse Polish Notation Calculator");
        frame.setSize(400,200);
        button1.setActionCommand("1");
        button1.addActionListener(controller);
        button2.setActionCommand("2");
        button2.addActionListener(controller);
        button3.setActionCommand("3");
        button3.addActionListener(controller);
        button4.setActionCommand("4");
        button4.addActionListener(controller);
        button5.setActionCommand("5");
        button5.addActionListener(controller);

        buttonminus.setActionCommand("-");
        buttonminus.addActionListener(controller);
        buttonplus.setActionCommand("+");
        buttonplus.addActionListener(controller);


        JPanel panel = new JPanel();
        panel.add(textField);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(buttonminus);
        panel.add(buttonplus);

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
    public void update(ReversePolishCalculator reversePolishCalculator) {
        textField.setText(reversePolishCalculator.getCurrentText());
    }
}
