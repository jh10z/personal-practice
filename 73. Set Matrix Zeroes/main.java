class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> row = new ArrayList<Integer>();
        ArrayList<Integer> col = new ArrayList<Integer>();

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 0) {
                    row.add(i);
                    col.add(j);
                }
            }
        }

        for(int i = 0; i < row.size(); i++) { //cordinates of zero cells in matrix
            for(int j = 0; j < matrix.length; j++) { //set rows - keep 
                matrix[j][col.get(i)] = 0;
            }

            for(int j = 0; j < matrix[0].length; j++) { //set cols
                matrix[row.get(i)][j] = 0;
            }
            
        }
    }
}