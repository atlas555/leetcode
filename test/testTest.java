package test;

import org.junit.Test;

import main.java.mergerSortedArray;
import main.java.others.SingletonEnum;
import main.java.others.findMaxIndexInOrderAscAndDesc;
import main.java.twoSum;

/**
 * xiaolong.zhang
 */
public class testTest {
    @Test
    public void testTwoSum(){
        int[] numbers = {2, 7, 11, 15};
        int[] result = new twoSum().twoSum(numbers,9);
        System.out.println("index1=" + result[0] + "," + "index2=" + result[1]);
    }

    @Test
    public void testSortList(){
        int[] A = {1,4,23};
        int[] B = {1};
        new mergerSortedArray().merge(A,0,B,1);
        System.out.println("ok");
    }

    @Test
    public void testSingletonEnum(){
        SingletonEnum.INSTANCE.test();
    }

    @Test
    public void testfindMaxIndexInOrderAscAndDesc(){
        int[] A = {1,0};
        int index = new findMaxIndexInOrderAscAndDesc().findIndex(A,A.length);
        System.out.println(index);
    }


//    public static void main(String args[]) {
////       new testTest().testTwoSum();
////        new testTest().testSortList();
////        new testTest().testSingletonEnum();
////        new testTest().testfindMaxIndexInOrderAscAndDesc();
//    }
}