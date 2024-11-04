public class Game {
    private TTTBoard Board;
    private TTTPlayer XPlayer;
    private TTTPlayer OPlayer;
    private TTTPlayer CurrentPlayer;

    public Game() {
        Board = new TTTBoard(this);
        XPlayer = new TTTPlayer("X");
        OPlayer = new TTTPlayer("O");
        CurrentPlayer = XPlayer;
    }

    public void Play(int row, int col) {
        if (Board.isEmpty(row,col)) {
            Board.placeMark(row, col, CurrentPlayer.getSymbol());
            if (Board.checkWinner()) {
                System.out.println(CurrentPlayer.getSymbol() + "Winner!");
                resetGame();
            } else if (Board.isFull()) {
               System.out.println("Draw!");
               resetGame();
            }else {
                switchTurns();
            }
        }
    }
    private void switchTurns() {
        CurrentPlayer = (CurrentPlayer == XPlayer ? XPlayer : OPlayer);
    }
    private void resetGame() {
        Board.clear();
        CurrentPlayer = XPlayer;
    }
    public TTTBoard getBoard() {
        return Board;
    }
    public String getCurrentPlayerSymbol() {
        return CurrentPlayer.getSymbol();
    }

    public void makeMove(int row, int col) {
    }
}