package main.java;

import java.util.Arrays;

/**
 * @author xiaolong zhang
 */
public class reverseWordsinaString {
    //388ms
    public String reverseWords(String s) {
        if (null == s || s.length() == 0){
            return "";
        }
        String[] index = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = index.length - 1;i >= 0;--i){
            if(!index[i].equals("")){
                result.append(index[i]).append(" ");
            }
        }
        return result.length() == 0 ? "" : result.substring(0,result.length() - 1);
    }

    //640ms
    public String reverseWords2(String s) {
        if(null == s || s.length() == 0){
            return "";
        }
        String str[] = s.split(" ");
        String finalStr = "";
        for (int i = str.length - 1; i >= 0; i--) {
            if(!str[i].equals("")){
                finalStr += str[i] + " ";
            }
        }
        return finalStr.length() == 0 ? "" : finalStr.substring(0,finalStr.length() -1);
    }


    public static void main(String[] args){
        String s = "the sky is blue";
        String t = new reverseWordsinaString().reverseWords2("a ");
        System.out.println("t:" + t);
    }
}
