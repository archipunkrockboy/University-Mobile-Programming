package calc.operation;

public class OperatorAnd {
    private int result;
    private String strResult;
    public OperatorAnd() { result=0; strResult=Integer.toBinaryString(result);}
    public OperatorAnd(int a) {result = a; strResult=Integer.toBinaryString(result);}
    public void and(int b) {
        result = result&b;
        strResult = Integer.toBinaryString(result);
    }
    public int getResult() { return result; }
    public String getStrResult() { return strResult; }
}
