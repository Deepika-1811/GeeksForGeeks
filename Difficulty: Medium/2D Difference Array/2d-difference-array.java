class Solution {
    public ArrayList<ArrayList<Integer>> applyDiff2D(int[][] mat, int[][] opr) {
        // code here
           int n=opr.length;
        for(int i=0;i<n;i++){
           int v=opr[i][0];
           int r1=opr[i][1];
           int c1=opr[i][2];
           int r2=opr[i][3];
           int c2=opr[i][4];
            for(int j=r1;j<=r2;j++){
                for(int k=c1;k<=c2;k++){
                    mat[j][k]=mat[j][k]+v;
                }
            }
        }
          ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (int i = 0; i < mat.length; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < mat[0].length; j++) {
                row.add(mat[i][j]);
            }
            result.add(row);
        }

        return result;
    }
}