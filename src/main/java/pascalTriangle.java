package main.java;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaolong.zhang
 */
public class pascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        if (0 == numRows){
            return lists;
        }

        list.add(0,1); //作为开始
        lists.add(list);

        for (int i = 1; i < numRows; i++) {
            List<Integer> tmp = new ArrayList<Integer>(i + 1);
            for (int j = 0; j < i + 1; j++){
                tmp.add(-1);
            }
            List<Integer> prev = lists.get(i - 1);
            tmp.set(0, prev.get(0));
            tmp.set(i, prev.get(i - 1));
            for (int j = 1; j < i; j++){
                tmp.set(j, prev.get(j - 1)+prev.get(j));
            }
            lists.add(tmp);
        }
        return  lists;
    }
}
