class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atmost(nums,k)-atmost(nums,k-1);
    }

    private int atmost(int[] nums,int k){

        int l=0;
        int count = 0;
        int oddCount = 0;

        for(int r=0 ;r<nums.length ;r++){

            if(nums[r]%2==1) oddCount++;

            while(oddCount>k){

                if(nums[l]%2==1) oddCount--;
                l++;
            }
            count += r-l+1; 
        }
        return count;
    }
}