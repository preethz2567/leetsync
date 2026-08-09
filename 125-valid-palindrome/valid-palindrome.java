class Solution {
    public boolean isPalindrome(String s) {
        return check(s,0,s.length()-1);
    }

    private boolean check(String s, int i,int j){

        if(i>=j) return true;

        if(!Character.isLetterOrDigit(s.charAt(i))){
            return check(s,i+1,j);
        }

        if(!Character.isLetterOrDigit(s.charAt(j))){
            return check(s,i,j-1);
        }

        if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
            return false;
        }

        return check(s,i+1,j-1);
    }
}