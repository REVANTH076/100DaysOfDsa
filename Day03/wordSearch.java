public class wordSearch {
    public static boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j] == word.charAt(0) && dfs(board,word ,i,j,0)){
                    return true;
                }
                
            }
        }
        return false;
    }

    private static  boolean dfs(char[][] board ,String word ,int row ,int col , int index){
        if(index == word.length()){
            return true;
        }

        if(row<0 || row>=board.length || col <0 || col>=board[0].length){
            return false;
        }

        if(board[row][col] != word.charAt(index) ){
            return false;
        }

        char c = board[row][col];
        board[row][col] = '#';

        boolean found =dfs(board,word ,row-1 , col ,index+1) ||dfs(board,word ,row+1 , col ,index+1)||
        dfs(board,word ,row , col-1 ,index+1)||dfs(board,word ,row , col+1 ,index+1);

        board[row][col] = c;

        return found;
    }
    public static void main(String[] args) {
        char[][] board = {{'A','B','C','E'},
                          {'S','F','C','S'},
                          {'A','D','E','E'}};

        String word = "ABCCED";
        boolean res = exist(board, word);
        System.out.println(res);
    }
}
