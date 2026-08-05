class Solution {
    public int lengthOfLongestSubstring(String s) {
       int [] hash = new int[256];
       Arrays.fill(hash,-1);

       int l=0;
       int maxlength = 0;

       for(int r = 0; r< s.length() ; r++)
       {
        char ch = s.charAt(r);
        if(hash[ch]!=-1 && hash[ch]>=l)
        {
            l = hash[ch] + 1;
        }

        maxlength = Math.max(maxlength , r-l +1);
        hash[ch] = r;
       }
        return maxlength;
    }
}
