import java.lang.reflect.Array;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for (int i=0; i<nums.length; i++){
            for (int j=i+1; j<nums.length; j++){
                int sum = nums[i] + nums[j];
                if (sum == target){
                    
                    arr[0] = i;
                    arr[1] = j;
                    return new int[] { i, j }; 
                    
                }else{
                    continue;
                }
            }
            
        }
        throw new IllegalArgumentException("no solution");
    }

}

public class twoSum {
    public static void main(String[] args) {
int[] nums = {2, 4, 11, 3};
        int target = 6;
        
        Solution solution = new Solution(); 

        int[] result = solution.twoSum(nums, target); 
        
    
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
    
}

