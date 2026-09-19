class Solution {
    public int maxScore(int[] cardPoints, int k) {
        
        int n = cardPoints.length;
        int total=0;
        for(int num : cardPoints)
            total += num;

        int size = n-k;

        int window=0;
        for(int i=0 ;i<size ;i++)
            window += cardPoints[i];

        int minWindow = window;

        for(int i=size ;i<n;i++){
            window += cardPoints[i];
            window -= cardPoints[i-size];
            minWindow = Math.min(window,minWindow);
        }

        return total-minWindow;
    }
}