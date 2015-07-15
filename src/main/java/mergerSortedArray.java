package main.java;

/**
 * @author xiaolong zhang
 */
public class mergerSortedArray {
    public void merge(int A[], int m, int B[], int n) {
        int result[] = new int[m + n];
        int i =0; int j = 0;int k = 0;
        while(i<m && j <n) {
            if(A[i]<B[j]) {
                result[k++] = A[i];
                i++;
            } else {
                result[k++] = B[j];
                j++;
            }
        }
        while (i < m){
            result[k++] = A[i++];
        }
        while (j < n){
            result[k++] = B[j++];
        }
//        System.arraycopy(A, i, result, k, (m -i));
//        System.arraycopy(B, j, result, k, (n -j));
        A = result;
    }

    public static void main(String[] args){
        int[] A = null;
        int[] B = {1};
        new mergerSortedArray().merge(A,0,B,1);
        System.out.println("ok");
    }
}
