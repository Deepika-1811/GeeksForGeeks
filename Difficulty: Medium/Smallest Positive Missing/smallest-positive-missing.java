class Solution {
    public int missingNumber(int[] arr) {
        // code here
           int n = arr.length;

        for (int i = 0; i < n; i++) {
            // Place arr[i] to its correct position if possible
            while (arr[i] > 0 && arr[i] <= n && arr[arr[i] - 1] != arr[i]) {
                // Swap arr[i] with arr[arr[i] - 1]
                int correctIndex = arr[i] - 1;
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }
        }

        // Find the first place where index doesn't match value
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1)
                return i + 1;
        }

        return n + 1;
    }
}
