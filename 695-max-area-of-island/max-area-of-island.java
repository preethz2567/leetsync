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

        // Check UP
        if (row - 1 >= 0 &&
            grid[row - 1][col] == 1 &&
            !visited[row - 1][col]) {

            area += dfs(grid, row - 1, col, visited);
        }

        // Check DOWN
        if (row + 1 < grid.length &&
            grid[row + 1][col] == 1 &&
            !visited[row + 1][col]) {

            area += dfs(grid, row + 1, col, visited);
        }

        // Check LEFT
        if (col - 1 >= 0 &&
            grid[row][col - 1] == 1 &&
            !visited[row][col - 1]) {

            area += dfs(grid, row, col - 1, visited);
        }

        // Check RIGHT
        if (col + 1 < grid[0].length &&
            grid[row][col + 1] == 1 &&
            !visited[row][col + 1]) {

            area += dfs(grid, row, col + 1, visited);
        }

        return area;
    }
}