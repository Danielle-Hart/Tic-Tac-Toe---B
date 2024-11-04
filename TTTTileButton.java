import javax.swing.JButton;
import java.awt.event.ActionListener;

public class TTTTileButton extends JButton {
    private int row;
    private int col;
    private Game Game;

    public TTTTileButton(int row, int col, Game game) {
        this.row = row;
        this.col = col;
        this.Game = game;
        setText("");
        addActionListener(e -> handleClick());
    }
    private void handleClick() {
        if (getText().isEmpty()){
            Game.makeMove(row, col);
            setText(Game.getCurrentPlayerSymbol());
        }

    }
}
