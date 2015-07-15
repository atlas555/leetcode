package main.java;

import java.util.Arrays;

/**
 * @author xiaolong zhang
 */
public class removeDuplicatesfromSortedArrayII {
    public int removeDuplicates(int[] A) {
        if (null == A){
            return 0;
        }
        Arrays.sort(A);
        int n = A.length;
        int distinctCount = 0;
        for(int i = 0; i < n; i++)
            if(distinctCount == 0 || A[i] != A[distinctCount - 1] || distinctCount == 1 || A[i] != A[distinctCount - 2])
                A[distinctCount++] = A[i];
        return distinctCount;
    }
}
