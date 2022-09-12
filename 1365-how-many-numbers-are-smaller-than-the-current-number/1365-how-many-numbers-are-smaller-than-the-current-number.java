class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        HashMap<Integer,Integer> s= new HashMap<>();
        int[] copy = nums.clone();
        Arrays.sort(copy);
        for(int i = 0; i < nums.length; i++){
            s.putIfAbsent(copy[i],i);
        }
        for(int i=0;i<nums.length;i++){
            copy[i] = s.get(nums[i]);
        }
        return copy;
    }
}