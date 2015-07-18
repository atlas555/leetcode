package java;

/**
 * @author xiaolong zhang
 */
public class twoSum {
    public int[] twoSum(int[] numbers, int target) {
        int[] index = new int[2];
        int index1,index2;
        for(int i = 0;i<numbers.length;i++){
            for (int j = i+1;j<numbers.length;j++){
                if (numbers[i] + numbers[j] == target){
                    index[0] = i + 1;
                    index[1] = j + 1;
                }
            }
        }
        return index;
    }
    public static void main(String[] args){
        int[] numbers = {2, 7, 11, 15};
        int[] result = new twoSum().twoSum(numbers,9);
        System.out.println("index1=" + result[0] + "," + "index2=" + result[1]);
    }
}

