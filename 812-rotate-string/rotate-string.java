class Solution {
    public boolean rotateString(String s, String goal) {

        String n = s+s;
        return(s.length()==goal.length())&&(n.contains(goal));
        
    }
}