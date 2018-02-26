/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcengine;

/**
 *
 * @author matth
 */
public class MathEquation {
    private double leftVal;
    private double rightVal;
    private char opCode;
    private double result;
    
    public double getLeftVal() {
        return leftVal;
    }
    
    public void setLeftVal(double leftVal) {
        this.leftVal = leftVal;
    }
    
    public double getRightVal() {
        return rightVal;
    }
    
    public void setRightVal(double rightVal) {
        this.rightVal = rightVal;
    }
    
    public char getOpCode() {
        return opCode;
    }
    
    public void setOpCode(char opCode) {
        this.opCode = opCode;
    }
    
    public double getResult() {
        return result;
    }
    
    public void execute() {
        switch (opCode) {
                case 'a':
                    result = leftVal + rightVal;
                    break;
                case 's':
                    result = leftVal - rightVal;
                    break;
                case 'd':
                    result = rightVal != 0 ? leftVal / rightVal : 0.0d;
                    break;
    //            if(val2 != 0.0d)
    //                result = val1 / val2;
    //            else
    //                result = 0.0d;
                case 'm':
                    result = leftVal * rightVal;
                    break;
                default:
                    System.out.println("Error - invalid opCode)");
                    result = 0.0d;
                    break;
            }
    }
}
