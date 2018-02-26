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
    public double leftVal;
    public double rightVal;
    public char opCode;
    public double result;
    
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
