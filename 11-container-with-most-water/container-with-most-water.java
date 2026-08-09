class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int ans=-1;

        while(left<right){
            int width=right-left;
            int h = height[left]<height[right]? height[left] : height[right];
            int area = width*h;
            if(area>ans) ans=area;


            if(height[left]<height[right]) left++;
            else right--;
        }
        return ans;
    }
}