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

        //SETTING.setBackground(Color.gray);
        Container.setBorder(new EmptyBorder(60, 0, 0, 0)); //EmptyBorder(int top, int left,


        //dificulty
        JPanel DIFFICULTY = new JPanel();
        DIFFICULTY.setLayout(new BoxLayout(DIFFICULTY, BoxLayout.Y_AXIS));
        DIFFICULTY.setPreferredSize(new Dimension(500, 80));
        //DIFFICULTY.setBackground(Color.YELLOW);
        JLabel DIFFICULTY_LABEL = new JLabel("Choose a difficulty!");
        DIFFICULTY.add(DIFFICULTY_LABEL);

        JPanel PANEL_BUTTON = new JPanel();

        JButton EASY = new JButton("EASY");
        JButton NORMAL = new JButton("NORMAL");
        JButton HARD = new JButton("HARD");

        PANEL_BUTTON.add(EASY);
        PANEL_BUTTON.add(NORMAL);
        PANEL_BUTTON.add(HARD);

        PANEL_BUTTON.setAlignmentX(Component.LEFT_ALIGNMENT);

        DIFFICULTY.add(PANEL_BUTTON);

        //===========================================================================

        //size of the playing field
        JPanel PLAYER_FIELD = new JPanel();
        PLAYER_FIELD.setLayout(new BoxLayout(PLAYER_FIELD, BoxLayout.Y_AXIS));
        PLAYER_FIELD.setPreferredSize(new Dimension(500, 50));
        //PLAYER_FIELD.setBackground(Color.RED);
        JLabel SIZE_OF_THE_PLAYING_FIELD_LABEL = new JLabel("Choose a SIZE OF THE PLAYING FIELD");
        PLAYER_FIELD.add(SIZE_OF_THE_PLAYING_FIELD_LABEL);

        JLabel COLUMN_LABEL = new JLabel("Column:");
        JLabel ROW_LABEL = new JLabel("Row:");

        JPanel FIELD_PANEL = new JPanel();

        FIELD_PANEL.add(COLUMN_LABEL);
        JTextField ROW_FIELD = new JTextField(8);
        FIELD_PANEL.add(ROW_FIELD);

        FIELD_PANEL.add(ROW_LABEL);
        JTextField COLUMN = new JTextField(8);
        FIELD_PANEL.add(COLUMN);

        FIELD_PANEL.setAlignmentX(Component.LEFT_ALIGNMENT);
        PLAYER_FIELD.add(FIELD_PANEL);

        //===========================================================================

        //number of moves
        JPanel NUMBER_OF_MOVES = new JPanel();
        NUMBER_OF_MOVES.setPreferredSize(new Dimension(500, 100));
        NUMBER_OF_MOVES.setBackground(Color.BLUE);
        JLabel NUMBER_OF_MOVES_LABEL = new JLabel("Choose a NUMBER OG MOVES");
        NUMBER_OF_MOVES.add(NUMBER_OF_MOVES_LABEL);




        //===========================================================================


        //target value setting
        JPanel TARGET_VALUE_SETTING = new JPanel();
        TARGET_VALUE_SETTING.setPreferredSize(new Dimension(500, 100));
        TARGET_VALUE_SETTING.setBackground(Color.PINK);
        JLabel TARGET_VALUE_SETTING_LABEL = new JLabel("Choose a TARGET VALUE SETTING");
        TARGET_VALUE_SETTING.add(TARGET_VALUE_SETTING_LABEL);

        //===========================================================================


        //target value setting
        JPanel BUTTONS = new JPanel();
        BUTTONS.setPreferredSize(new Dimension(500, 100));
        BUTTONS.setBackground(Color.GREEN);
        JButton BACK = new JButton("BACK");
        JButton SAVE = new JButton("SAVE");
        BUTTONS.add(BACK);
        BUTTONS.add(SAVE);


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
