package java;

import java.io.IOException;
import java.util.Stack;

/**
 * @author xiaolong zhang
 */
public class evaluateReversePolishNotation {
    public static void main(String[] agrs) throws IOException{
        String[] tokens = {"2", "1", "+", "3", "*"};
        System.out.println(evalRPN(tokens));
    }

    public static int evalRPN(String[] tokens){
        int returnValue = 0;
        String operators="+-*/";

        Stack<String> stack = new Stack<String>();

        for (String s : tokens){
            if(!operators.contains(s)){
                stack.push(s);
            }
            else {
                int a = Integer.valueOf(stack.pop());
                int b = Integer.valueOf(stack.pop());
                int index = operators.indexOf(s);
                switch (index){
                    //在JDK1.7包含及以上可以使用switch string statement
                    case 0:
                        stack.push(String.valueOf(a+b));
                        break;
                    case 1:
                        stack.push(String.valueOf(a-b));
                        break;
                    case 2:
                        stack.push(String.valueOf(a*b));
                        break;
                    case 3:
                        stack.push(String.valueOf(a/b));
                        break;
                    default:
                        break;
                }
            }
        }
        returnValue = Integer.valueOf(stack.pop());
        return returnValue;
    }
}
