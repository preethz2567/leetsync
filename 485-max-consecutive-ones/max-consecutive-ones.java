class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxcount = 0;
        int current = 0;
        for(int num : nums)
        {
            if(num==1)
            {
                current++;
                maxcount = Math.max(maxcount,current);
            }
            else current=0;
        }

        return maxcount;

    }
}