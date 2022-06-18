class Solution {
    public int maxArea(int[] height) {
        int maxarea=Integer.MIN_VALUE;
        int l=0;
        int r=height.length-1;
        while(l<r){
            int length=Math.min(height[l],height[r]);
            maxarea = Math.max(maxarea, length * (r - l));
             if(height[l]<height[r]){                
                l++;
            }
            else{
                r--;
            }
        }
        return maxarea;   
        }
    }
