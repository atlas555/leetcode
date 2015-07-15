package main.java.others;

/**
 * xiaolong.zhang3
 */

/**
 问题：给定一个数组，此数组先递增后递减，找出其中最大值位置。

 思路：先递增后递减的数组最大元素A[i]，此值最大的条件是A[i]>A[i-1]，同时A[i]>A[i+1]。此题目原型为有序数组查找问题，有序数组一般采用二分查找，但是需要注意退出条件。
 */
public class findMaxIndexInOrderAscAndDesc {

    /**
     * A为数组名
     * @param A
     * @param len
     * @return
     */
    public int findIndex(int[] A, int len) {
        if (len == 0) {
            return -1;
        }
        int begin = 0;
        int end = len - 1;
        int mid = begin + ( begin + end )/2;

        while (mid > 0 && mid < len-1) {
            if (A[mid] > A[mid+1] && A[mid] > A[mid-1]) {
                return mid;
            } else if (A[mid] < A[mid+1]){
                begin = mid + 1;
                mid = begin + ( end - begin )/2;
            } else {
                end = mid - 1;
                mid = begin + ( end - begin )/2;
            }
        }


        if (mid == 0) {
            return 0;
        }

        if (mid == len - 1) {
            return len - 1;
        }

        return -1;
    }
}
