import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int temp;
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
            
        }
        for (int i = 1; i < nums.length; i++) {
    for (int j = i; j > 0; j--) {
     if (nums[j] < nums [j - 1]) {
      temp = nums[j];
      nums[j] = nums[j - 1];
      nums[j - 1] = temp;
     }
    }
   }
        return nums;

        
    }
}