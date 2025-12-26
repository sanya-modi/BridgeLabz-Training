public class MatrixSpiral {
     public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<>();

        int startRow = 0;
        int startColumn = 0;
        int endRow = matrix.length-1;
        int endColumn = matrix[0].length-1;

        while(startRow<=endRow && startColumn<=endColumn){
            //top
            for(int j=startColumn; j<=endColumn; j++){
                ans.add(matrix[startRow][j]);
            }

            //right
            for(int i=startRow+1; i<=endRow; i++){
                ans.add(matrix[i][endColumn]);
            }

            //bottom
            for(int j=endColumn-1; j>=startColumn; j--){
                if(startRow==endRow){
                    break;
                }
                ans.add(matrix[endRow][j]);
            }

            //left
            for(int i=endRow-1; i>=startRow+1; i--){
                if(startColumn==endColumn){
                    break;
                }
                ans.add(matrix[i][startColumn]);
            }
            startRow++;
            startColumn++;
            endRow--;
            endColumn--;
        }
        return ans;
    }
}
