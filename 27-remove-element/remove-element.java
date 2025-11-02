import java.util.ArrayList; 

class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums.length < 0 || nums.length > 100){
            return -1;
        }

        if (val < 0 || val>100){
            return -1;
        }

        int i = 0;
        for (int n : nums){
            if (n != val){
                nums[i] = n; // in-place
                i++;
            }
        }

        return i;

    }
}