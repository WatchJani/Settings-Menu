import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Main {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Game Menu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1080, 720);

        JPanel Container = new JPanel();
        JPanel SETTING = new JPanel();

        //New.setBackground(Color.RED);
        //New.setLayout(new FlowLayout(FlowLayout.CENTER));
        SETTING.setPreferredSize(new Dimension(500, 530));
        //buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
        
        SETTING.setBackground(Color.gray);
        Container.setBorder(new EmptyBorder(60, 0, 0, 0)); //EmptyBorder(int top, int left,


        //dificulty
        JPanel DIFFICULTY = new JPanel();
        DIFFICULTY.setPreferredSize(new Dimension(500, 100));
        DIFFICULTY.setBackground(Color.YELLOW);


        //size of the playing field
        JPanel PLAYER_FIELD = new JPanel();
        PLAYER_FIELD.setPreferredSize(new Dimension(500, 100));
        PLAYER_FIELD.setBackground(Color.RED);

        //number of moves
        JPanel NUMBER_OF_MOVES = new JPanel();
        NUMBER_OF_MOVES.setPreferredSize(new Dimension(500, 100));
        NUMBER_OF_MOVES.setBackground(Color.BLUE);

        //target value setting
        JPanel TARGET_VALUE_SETTING = new JPanel();
        TARGET_VALUE_SETTING.setPreferredSize(new Dimension(500, 100));
        TARGET_VALUE_SETTING.setBackground(Color.PINK);

        //target value setting
        JPanel BUTTONS = new JPanel();
        BUTTONS.setPreferredSize(new Dimension(500, 100));
        BUTTONS.setBackground(Color.GREEN);


        Container.add(SETTING);
        frame.add(Container);


        SETTING.add(DIFFICULTY);
        SETTING.add(PLAYER_FIELD);
        SETTING.add(NUMBER_OF_MOVES);
        SETTING.add(TARGET_VALUE_SETTING);
        SETTING.add(BUTTONS);

        frame.setVisible(true);
    }
}