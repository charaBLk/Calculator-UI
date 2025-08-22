import java.awt.*;
import java.awt.event.*;;
import java.util.Arrays;
import javax.swing.*;
import javax.swing.border.LineBorder;


public class Calculator {
    int boardWidth = 500;
    int boardHeight = 540;

    Color customLightGray = new Color(212, 212, 210);
    Color customDarkGray = new Color(80, 80, 80);
    Color customBlack = new Color(28, 28, 28);
    Color customOrange = new Color(255, 149, 0);

    JFrame frame = new JFrame("Calculator");
    JPanel displayPanel = new JPanel();
    JLabel displayLabel = new JLabel();
    JPanel buttonsPanel = new JPanel();
    


    Calculator(){
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        
        displayLabel.setBackground(customBlack);
        displayLabel.setForeground(Color.WHITE);
        displayLabel.setFont(new Font("Arial", Font.PLAIN, 80));     
        displayLabel.setHorizontalAlignment(JLabel.RIGHT);
        displayLabel.setText("00000000");
        displayLabel.setOpaque(true);
        
        displayPanel.setLayout(new BorderLayout());
        displayPanel.add(displayLabel);
        frame.add(displayPanel);
        frame.setVisible(true);
        
    }

}
