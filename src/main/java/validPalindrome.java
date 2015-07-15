package main.java;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;
import java.lang.String;

/**
 * @author  xiaolong.zhang
 */
public class validPalindrome {
    public boolean isPalindrome(String s) {
        if(null == s){
            return true;
        }
        char[] test = s.toCharArray();
        Queue<String> queue = new ArrayDeque<String>();

        for (char c : test){
            if ((c != ' ') && (c != ',') && (c != ':') && (c != '.')){
                c = Character.toLowerCase(c);
                queue.add(String.valueOf(c));
            }
        }
        int length = queue.size();
        int control = length/2;
        Stack<String> stack = new Stack<String>();
        while (!queue.isEmpty() && control != 0){
            control--;
            stack.push(queue.remove());
        }
        while (!queue.isEmpty()){
            if(!queue.remove().equals(stack.pop())){
                return false;
            }
        }
        return true;
    }
}
