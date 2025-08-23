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


    String[] ButtonValues ={
         "AC", "+/-", "%", "÷", 
        "7", "8", "9", "×", 
        "4", "5", "6", "-",
        "1", "2", "3", "+",
        "0", ".", "√", "="
    } ;

    String[] rightSymbols = {"÷", "×", "-", "+", "="};
    String[] topSymbols = {"AC", "+/-", "%"};

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
        frame.add(displayPanel, BorderLayout.NORTH);
        

        buttonsPanel.setLayout(new GridLayout(5, 4));
        buttonsPanel.setBackground(customOrange);
        frame.add(buttonsPanel);

        for(int i = 0; i<ButtonValues.length; i++){
            
            JButton button = new JButton();
            String buttonValue = ButtonValues[i];
            button.setFont(new Font("Arial", Font.PLAIN, 60));
            button.setText(buttonValue);
            buttonsPanel.add(button);
            frame.add(buttonsPanel);
            
        }



        frame.setVisible(true);

        
    }

    

}
