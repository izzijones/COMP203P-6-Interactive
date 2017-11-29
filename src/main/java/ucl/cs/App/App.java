package ucl.cs.App;

import ucl.cs.model.ReversePolishCalculator;
import ucl.cs.view.CalculatorGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private CalculatorGUI view = new CalculatorGUI(new Controller());
    private ReversePolishCalculator reversePolishCalculator = new ReversePolishCalculator(view);
    class Controller implements ActionListener {
        public void actionPerformed(ActionEvent actionEvent) {
            try {
                reversePolishCalculator.execute(actionEvent.getActionCommand());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        new App();
    }
}
