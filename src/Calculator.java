import java.awt.*;
import java.awt.event.*;import java.lang.reflect.Array;
;
import java.util.Arrays;
import javax.swing.*;
import javax.swing.border.LineBorder;


public class Calculator {
    int boardWidth = 470;
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
    

    String A = "0";
    String operator = null;
    String B = null;

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
        displayLabel.setText("0");
        displayLabel.setOpaque(true);
        
        displayPanel.setLayout(new BorderLayout());
        displayPanel.add(displayLabel);
        frame.add(displayPanel, BorderLayout.NORTH);
        

        buttonsPanel.setLayout(new GridLayout(5, 4));
        buttonsPanel.setBackground(customBlack);
        frame.add(buttonsPanel);

        for(int i = 0; i<ButtonValues.length; i++){
            
            JButton button = new JButton();
            String buttonValue = ButtonValues[i];
            button.setFont(new Font("Arial", Font.ITALIC, 60));
            button.setText(buttonValue);
            button.setBackground(customDarkGray);
            button.setForeground(Color.WHITE);
            button.setFocusable(false);
            

            if(Arrays.asList(rightSymbols).contains(ButtonValues[i])){
                button.setBackground(customOrange);
                button.setForeground(Color.WHITE);
            }
            if(Arrays.asList(topSymbols).contains(ButtonValues[i])){
                button.setBackground(customLightGray);
                button.setForeground(customBlack);
            }
            buttonsPanel.add(button);
            frame.add(buttonsPanel);
            button.addActionListener(new ActionListener() {
                @SuppressWarnings("StringEquality")
                public void actionPerformed(ActionEvent e){
                    JButton button = (JButton) e.getSource();
                    String buttonValue = button.getText();

                    if(Arrays.asList(rightSymbols).contains(buttonValue)){

                    }
                    else if (Arrays.asList(topSymbols).contains(buttonValue)) {
                        if(buttonValue=="AC"){
                            clearAll();
                            displayLabel.setText(A);
                        }
                        else if (buttonValue=="+/-") {
                            double numDouble = Double.parseDouble(displayLabel.getText());
                            
                            numDouble *= -1;
                            displayLabel.setText(Double.toString(numDouble));
                        }
                    }
                    else{
                        if(buttonValue == "."){
                            if(!displayLabel.getText().contains(buttonValue)){
                                displayLabel.setText(displayLabel.getText()+buttonValue);
                            }
                        }
                        else if("0123456789".contains(buttonValue)){
                            if(displayLabel.getText() == "0"){
                                displayLabel.setText(buttonValue);
                            }
                            else{
                                displayLabel.setText(displayLabel.getText()+buttonValue);
                            }
                        }
                    }

                }
            });
        }
        
        frame.setVisible(true);
        
    }
    public void clearAll(){
        A="0";
        operator = null;
        B=null;
    }
}


