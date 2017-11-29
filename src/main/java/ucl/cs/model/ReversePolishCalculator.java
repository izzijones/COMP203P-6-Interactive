package ucl.cs.model;


import ucl.cs.view.CalculatorGUI;

import java.util.Stack;

public class ReversePolishCalculator {
    private Stack<Integer> nums;
    private final CalculatorGUI view;
    private String currentText = "";

    public ReversePolishCalculator(CalculatorGUI view){
        nums = new Stack<Integer>();
        this.view = view;
    }

    public void execute(String input) throws Exception {
        if(input.equals("+")||input.equals("-")){
            currentText = compute(new Operation(input))+"";
        }
        else if(currentText.isEmpty()){
            currentText += input;
            nums.push(Integer.parseInt(input));
        }
        else{
            currentText += (" "+input);
            nums.push(Integer.parseInt(input));
        }
        view.update(this);
    }

    public int compute(Operation operation){

        int toCompute1 = nums.pop();
        int toCompute2 = nums.pop();
        int result = operation.compute(toCompute1,toCompute2);
        nums.push(result);
        return result;
    }

    public String getCurrentText() {
        return currentText;
    }
}
