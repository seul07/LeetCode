class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int left =0;
        int right =height.length-1;
        while(left < right){
            int tmp = Math.min(height[left], height[right]);
            int mul = tmp * (right-left);
            max = Math.max(max, mul);
            if(height[left] < height[right]) left++;
            else if(height[left] > height[right]) right--;
            else {
                left++;
                right--;
            }
        }
        return max;
    }
}