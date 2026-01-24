// User function Template for Java

class Solution {
    public int[][] spiralFill(int n, int m, int[] arr) {
        // code here
          // Result matrix of size n*m
        int[][] res = new int[n][m];

        // Boundary variables
        int top = 0, bottom = n - 1, left = 0, right = m - 1;
        int index = 0;

        while (index < arr.length) {

            // Traverse top row from left to right
            for (int j = left; j <= right; j++) {
                res[top][j] = arr[index++];
            }
            top++;

            // Traverse rightmost column from top to bottom
            for (int i = top; i <= bottom; i++) {
                res[i][right] = arr[index++];
            }
            right--;

            // Traverse bottommost row from right to left
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    res[bottom][j] = arr[index++];
                }
                bottom--;
            }

            // Traverse leftmost column from bottom to up
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    res[i][left] = arr[index++];
                }
                left++;
            }
        }

        return res;
    }
}
