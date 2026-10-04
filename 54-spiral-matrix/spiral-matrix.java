class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> out = new ArrayList<>();
        int top = 0;
        int[][] m = matrix;
        int bottom = m.length - 1;
        int left = 0;
        int right = m[0].length - 1;

        while (top <= bottom && left <= right) {

            for (int j = left; j <= right; j++) out.add(m[top][j]);
            top++;

            for (int i = top; i <= bottom; i++) out.add(m[i][right]);
            right--;

            if (top <= bottom) {
                for (int j = right; j >= left; j--) out.add(m[bottom][j]);
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) out.add(m[i][left]);
                left++;
            }
        }

        return out;
    }
}