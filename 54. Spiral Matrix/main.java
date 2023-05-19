class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiral = new ArrayList<Integer>();
        int[][] visited = new int[matrix.length][matrix[0].length];
        int row = 0, col = 0;
        int cellCount = matrix.length * matrix[0].length;
        boolean lastMove = false;
        
        while(spiral.size() < cellCount) {
            if(visited[row][col] != 1) {
                spiral.add(matrix[row][col]);
                visited[row][col] = 1;
            }
            
            if(!lastMove) {
                if(col + 1 < matrix[row].length && visited[row][col + 1] != 1) {
                col++;
                } else if (row + 1 < matrix.length && visited[row + 1][col] != 1) {
                    row++;
                } else {
                    lastMove = !lastMove;
                }
            }

            if(lastMove) {
                if(col - 1 >= 0 && visited[row][col - 1] != 1) {
                col--;
                } else if (row - 1 >= 0 && visited[row - 1][col] != 1) {
                    row--;
                } else {
                    lastMove = !lastMove;
                }
            }
        }  
        return spiral;
    }
}