import javax.swing.*;
import java.awt.*;

public class TTTFrame extends JFrame {
    private Game Game;

    public TTTFrame() {
        Game = new Game();
        setTitle("Danielle's Tic-Tac-Toe");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 3));

        TTTBoard Board = Game.getBoard();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                TTTTileButton Tile = new TTTTileButton(i, j, Game);
                add(Tile);
            }
        }
        setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TTTFrame());
    }
}
