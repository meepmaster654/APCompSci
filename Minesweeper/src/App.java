import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class App {
    private static final int FRAME_WIDTH = 400, FRAME_HEIGHT = 200;
    private static JPanel panel = null;
    private JLabel label = null;
    private JButton[][] mineButtons = null;
    private boolean[][] isMine = null;
    public App(int minesWidth, int minesHeight) {
        mineButtons = new JButton[minesWidth][minesHeight];
        isMine = new boolean[minesWidth][minesHeight];
        for (int x = 0; x < minesWidth; x++) {
            for (int y = 0; y < minesHeight; y++) {
                mineButtons[x][y].addActionListener(new MineListener(x,y));
                panel.add(mineButtons[x][y]);
            }
        }
    }
    private class MineListener implements ActionListener {
        int x, y;
        public MineListener(int x, int y) {
            this.x = x;
            this.y = y;
        }
        @Override
        public void actionPerformed(ActionEvent event) {
            boolean mineVal = isMine[x][y];
        }
    }
    public static void main(String[] args) throws Exception {
        App myApp = new App(10,10);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setPreferredSize(new Dimension(FRAME_WIDTH, FRAME_HEIGHT));
        frame.getContentPane().add(panel);
        frame.pack();
    }
}
