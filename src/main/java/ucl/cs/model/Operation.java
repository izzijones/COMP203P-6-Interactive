package ucl.cs.model;

public class Operation {
    Boolean add = false;
    Boolean subtract = false;
    private static final String PLUS = "+";
    private static final String MINUS = "-";
    public Operation(String op) throws Exception {
        if(op.equals(PLUS)){
            add = true;
        }
        else if(op.equals(MINUS)){
            subtract = true;
        }
        else{
            throw new Exception("not a valid operator");
        }
    }

    public int compute(int num1, int num2){
        if(add){
            return num1+num2;
        }
        else{
            return num1-num2;
        }
    }
}
