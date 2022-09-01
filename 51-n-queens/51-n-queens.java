class Solution {
    private static boolean checkEligibility(int[][] matrix, int a, int b, int n) {
        int i = a, j = b;
        while (i < n && j < n) {
            if (matrix[i][j] == 1) {
                return false;
            }
            i++;
            j++;
        }
        i = a;
        j = b;
        while (i >= 0 && j >= 0) {
            if (matrix[i][j] == 1) {
                return false;
            }
            i--;
            j--;
        }
        i = a;
        j = b;
        while (i >= 0 && j < n) {
            if (matrix[i][j] == 1) {
                return false;
            }
            i--;
            j++;
        }
        i = a;
        j = b;
        while (i < n && j >= 0) {
            if (matrix[i][j] == 1) {
                return false;
            }
            i++;
            j--;
        }
        i = a;
        j = b;
        while (i < n) {
            if (matrix[i][j] == 1) {
                return false;
            }
            i++;
        }
        i = a;
        j = b;
        while (j < n) {
            if (matrix[i][j] == 1) {
                return false;
            }
            j++;
        }
        i = a;
        j = b;
        while (j >= 0) {
            if (matrix[i][j] == 1) {
                return false;
            }
            j--;
        }
        i = a;
        j = b;
        while (i >= 0) {
            if (matrix[i][j] == 1) {
                return false;
            }
            i--;
        }
        return true;
    }

    private static void placeNQueen(int[][] matrix, int col,List<List<String>> ans) {
        if(col==matrix.length){
            int n=matrix.length;
            ArrayList<String> ds=new ArrayList<String>();
            
            for (int i = 0; i < n; i++) {
                String str="";
                for (int j = 0; j < n; j++) {
                  if(matrix[i][j]==1){
                      str+="Q";
                  }else{
                      str+=".";
                  }
                }
                ds.add(str);
           }
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = 0; i < matrix.length; i++) {
            if (checkEligibility(matrix, i, col, matrix.length)) {
                matrix[i][col] = 1;
                placeNQueen(matrix, col + 1,ans);
                matrix[i][col] = 0;
            }
        }
        return;
    }

    public List<List<String>> solveNQueens(int n) {
        int[][] matrix = new int[n][n];
        List<List<String>> ans=new ArrayList<>();
        placeNQueen(matrix, 0,ans);
        return ans;
    }
}