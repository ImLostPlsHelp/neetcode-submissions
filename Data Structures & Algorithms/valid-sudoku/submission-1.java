class Solution {
    public boolean isValidSudoku(char[][] board) {
        //Three Conditions
        //1). Columns can't contain duplicates
        //2). Rows can't contain duplicates
        //3). Sub grids (3x3) can't contain duplicates
        //Check per condition?
        //1). Rows
        for(char[] row : board) {
            HashSet<Character> elementCheck = new HashSet<>();
            for(char element : row) {
                if(!elementCheck.add(element) && element != '.') {
                    return false;
                }
            }
        }

        //2). Column
        for(int j = 0; j < board[0].length; j++) {
            HashSet<Character> elementCheck = new HashSet<>();
            for(int i = 0; i < board.length; i++) {
                if(!elementCheck.add(board[i][j]) && board[i][j] != '.') {
                    return false;
                }
            }
        }

        //3). Subgrid
        // Need two pair of loops
        // First pair is to traverse to the top left of each subgrid
        // Second pair is to scan each of the 3x3 subgrid
        for(int boxRow = 0; boxRow < 9; boxRow += 3) {
            for(int colRow = 0; colRow < 9; colRow += 3) {
                //Second Pair
                HashSet<Character> elementCheck = new HashSet<>();
                for(int i = boxRow; i < boxRow + 3; i++) {
                    for(int j = colRow; j < colRow + 3; j++) {
                        if(!elementCheck.add(board[i][j]) && board[i][j] != '.') {
                            return false;
                        }
                    }
                }
            }
        }

        return true;
    }
}
