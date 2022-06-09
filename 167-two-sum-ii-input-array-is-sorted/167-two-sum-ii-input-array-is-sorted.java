class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0, j=numbers.length-1;
        boolean res=true;
        while(res){
            if(numbers[i]+numbers[j]==target){
                res=false;
                break;
            }
            
            else if(numbers[i]+numbers[j]>target){
                 j--;
            }
            else if(numbers[i]+numbers[j]<target){
                i++;
             }
        }
        return new int[] {i+1,j+1};
    }
}