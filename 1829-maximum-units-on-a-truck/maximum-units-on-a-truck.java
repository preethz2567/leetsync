class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        
        Arrays.sort(boxTypes,
            (a,b) -> b[1]-a[1]);
        
        int ans = 0;

        for(int[] boxType : boxTypes){

            int load = Math.min(boxType[0],truckSize);
            ans += load * boxType[1];
            truckSize-=load;

            if(truckSize==0) break;
        }
        return ans;
    }
}