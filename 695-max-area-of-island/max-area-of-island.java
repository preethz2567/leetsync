class Solution {

    public int maxAreaOfIsland(int[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;

        boolean[][] visited = new boolean[rows][cols];

        int maxArea = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (grid[i][j] == 1 && !visited[i][j]) {

                    int area = dfs(grid, i, j, visited);

                    maxArea = Math.max(maxArea, area);
                }
            }
        }

        return maxArea;
    }

    public int dfs(int[][] grid, int row, int col, boolean[][] visited) {

        visited[row][col] = true;

        int area = 1;

        // UP, DOWN, LEFT, RIGHT
        int[] rowDir = {-1, 1, 0, 0};
        int[] colDir = {0, 0, -1, 1};

        for (int i = 0; i < 4; i++) {

            int newRow = row + rowDir[i];
            int newCol = col + colDir[i];

            // Check boundaries
            if (newRow >= 0 && newRow < grid.length &&
                newCol >= 0 && newCol < grid[0].length) {

                // Check whether it is unvisited land
                if (grid[newRow][newCol] == 1 &&
                    !visited[newRow][newCol]) {

                    area += dfs(grid, newRow, newCol, visited);
                }
            }
        }

        return area;
    }
}