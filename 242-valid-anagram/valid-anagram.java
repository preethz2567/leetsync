class Solution {
    public boolean isAnagram(String s, String t) {

        int[] s_hash = new int[26];
        for(int i=0 ;i<s.length() ;i++){

            s_hash[s.charAt(i)-'a']++;
        }

        for(int i=0 ;i<t.length() ; i++){
            s_hash[t.charAt(i)-'a']--;
        }

        for(int num : s_hash) if(num!=0) return false;

        return true;
        
    }
}