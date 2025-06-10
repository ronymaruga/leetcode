/**
 * Two Sum
 * Given an array of integers nums and an interger target, return
 * indices of two numbers such that they add up to target
 * You may assume that each input would have exactly one solution,
 * you may not use the same element twice
 * you may return the answer in any order
 */

public class TwoSum{

    //approach 1 using nested for loops 
    /**
     * Running time is Quadratic O(n^2)
     */
    public int[] returnIndices(int[] nums, int target){
        int x;
        int y;
        for(int i = 0; i < nums.length; i++){
            for(int j=1; j < nums.length; j++){
                x = nums[i];
                y = nums[j];
                int sum = x + y;
                if(sum == target){
                    int[] result = {i, j};
                    return result;
                }
            }
        }
        int[] notFound = {-1,-1};
        return notFound;
    }


    public static void main(String[] args){
        int target = 10;
        int[] array = {1, 2, 3, 4, 6};
        
        TwoSum obj = new TwoSum();
        int[] indices = obj.returnIndices(array, target);

        for(int i : indices){
            System.out.println(i);
        }

    }
}