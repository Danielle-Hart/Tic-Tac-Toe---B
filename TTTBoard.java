public class TTTBoard {
    private String[][] Board;
    private Game Game;

    public TTTBoard(Game game) {
        this.Game = game;
        Board = new String[3][3];
        clear();
    }
    public boolean isEmpty(int row, int col) {
        return Board[row][col].isEmpty();
    }
    public void placeMark(int row, int col, String mark) {
        Board[row][col] = mark;
    }
    public boolean checkWinner() {
        for (int i = 0; i < 3; i++) {
            if (Board[i][0].equals(Board[i][1]) && Board[i][1].equals(Board[i][2]) && !Board[i][0].isEmpty()) return true;
            if (Board[0][i].equals(Board[1][i]) && Board[1][i].equals(Board[2][i]) && !Board[0][i].isEmpty()) return true;
        }
        if (Board[0][0].equals(Board[1][1]) && Board[1][1].equals(Board[2][2]) && !Board[0][0].isEmpty()) return true;
        if (Board[0][2].equals(Board[1][1]) && Board[1][1].equals(Board[2][0]) && !Board[0][2].isEmpty()) return true;
        return false;
        }
        public boolean isFull() {
        for (String[] row : Board) {
            for (String col : row) {
                if (col.equals("")) return false;
            }
        }
        return true;
    }
    public void clear() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Board[i][j] = "";
            }
        }
    }
}
