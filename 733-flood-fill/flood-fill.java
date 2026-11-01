class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        int originalColor = image[sr][sc];

        if(originalColor == color) return image;

        dfs(image,sr,sc,originalColor,color);
        return image;
    }

    public void dfs(int[][] image, int row, int col, int originalColor,int newColor){

        image[row][col] = newColor;

        int[] rowDir = {-1,1,0,0};
        int[] colDir = {0,0,-1,1};

        for(int i=0 ; i<4 ; i++){
            
            int newRow = row+rowDir[i];
            int newCol = col+colDir[i];

            if(newRow>=0 && newRow<image.length && newCol>=0 && newCol<image[0].length){

                if(image[newRow][newCol]==originalColor)
                    dfs(image,newRow,newCol,originalColor,newColor);
            }

        }
    }
}