class Solution {
    public int removeDuplicates(int[] nums) {
        int cnt = 1;
        int i=0,j=1;
        while(i<j && j<nums.length){
            if(nums[j]>nums[i]) {
                nums[cnt++]= nums[j];
            }
            i++;
            j++;
        }
        return cnt;
    }
}





