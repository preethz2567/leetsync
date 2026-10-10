class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int curr_cnt = 0;
        int max_cnt = 0;
        for(int num : nums){
            if(num==1){
                curr_cnt++;
                max_cnt = Math.max(curr_cnt,max_cnt);
            }else if(num==0){
                curr_cnt=0;
            }
        }
        return max_cnt;
    }
}