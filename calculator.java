import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

         
public class calculator implements ActionListener{

    JFrame jf;                                                                 //declaring the Jf variable as global because we need to use it in actionPerformed
    JLabel displayLabel;                                                       //declaring the displayLabel variable as global because we need to use it in actionPerformed
    JButton sevenButton, eightButton, nineButton, fourButton, fiveButton, sixButton, oneButton, twoButton, threeButton, dotButton, addButton, clearButton, multiplyButton, minusButton, divideButton, zeroButton, equalButton;         //deaclaring the buttons as global as we need to use them in actionPerformed
    boolean isOperatorClicked=false;
    char operator;
    float result=0;
    String oldvalue;

    public calculator(){
        jf=new JFrame("Calculator:");
        jf.setLayout(null);
        jf.setSize(600,600);                                       //sets the size of the window
        jf.setLocation(200, 100);                                           //to move the window towards the centre (as the window by default opens tn left area)
        
        displayLabel=new JLabel();                                              //to make the display area for the calculator (clicking is done by mouse - thats why JLable is used)
        displayLabel.setBounds(30, 30, 530, 50);               //sets the position of the area(setBounds- combines setLocation and setSize)
        displayLabel.setBackground(Color.gray);                                 //sets the background colour to know where the display is
        displayLabel.setOpaque(true);                                  //makes the background colour visible in window
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);              //makes the text to appear towards right
        displayLabel.setForeground(Color.white);                                //changes the colour of text to white (by default it is black)
        jf.add(displayLabel);                                                   //adds the display to the window
        
        sevenButton=new JButton("7");                                      //adds the 7 button
        sevenButton.setBounds(30, 110, 80, 80);
        sevenButton.setFont(new Font("Arial", Font.BOLD, 14));        //changes the font
        sevenButton.addActionListener(this);                                    //need this for actionPerformer to work here
        jf.add(sevenButton);

        eightButton=new JButton("8");                                      //adds the 8 button
        eightButton.setBounds(130, 110, 80, 80);
        eightButton.setFont(new Font("Arial", Font.BOLD, 14));        //changes the font
        eightButton.addActionListener(this);                                    //need this for actionPerformer to work here
        jf.add(eightButton);

        nineButton=new JButton("9");                                       //adds the 9 button
        nineButton.setBounds(230, 110, 80, 80);
        nineButton.setFont(new Font("Arial", Font.BOLD, 14));        //changes the font
        nineButton.addActionListener(this);                                    //need this for actionPerformer to work here
        jf.add(nineButton);

        fourButton=new JButton("4");                                        //adds the 4 button
        fourButton.setBounds(30, 210, 80, 80);
        fourButton.setFont(new Font("Arial", Font.BOLD, 14));         //changes the font
        fourButton.addActionListener(this);                                    //need this for actionPerformer to work here
        jf.add(fourButton);

        fiveButton=new JButton("5");                                       //adds the 5 button
        fiveButton.setBounds(130, 210, 80, 80);
        fiveButton.setFont(new Font("Arial", Font.BOLD, 14));        //changes the font
        fiveButton.addActionListener(this);                                    //need this for actionPerformer to work here
        jf.add(fiveButton);
 
        sixButton=new JButton("6");                                       //adds the 6 button
        sixButton.setBounds(230, 210, 80, 80);
        sixButton.setFont(new Font("Arial", Font.BOLD, 14));        //changes the font
        sixButton.addActionListener(this);                                    //need this for actionPerformer to work here
        jf.add(sixButton);

        oneButton=new JButton("1");                                       //adds the 1 button
        oneButton.setBounds(30, 310, 80, 80);
        oneButton.setFont(new Font("Arial", Font.BOLD, 14));        //changes the font
        oneButton.addActionListener(this);                                    //need this for actionPerformer to work here
        jf.add(oneButton);

        twoButton=new JButton("2");                                       //adds the 2 button
        twoButton.setBounds(130, 310, 80, 80);
        twoButton.setFont(new Font("Arial", Font.BOLD, 14));        //changes the font
        twoButton.addActionListener(this);                                    //need this for actionPerformer to work here
        jf.add(twoButton);

        threeButton=new JButton("3");                                      //adds the 3 button
        threeButton.setBounds(230, 310, 80, 80);
        threeButton.setFont(new Font("Arial", Font.BOLD, 14));        //changes the font
        threeButton.addActionListener(this);                                    //need this for actionPerformer to work here
        jf.add(threeButton);

        dotButton=new JButton(".");                                        //adds the . button
        dotButton.setBounds(30, 410, 80, 80);
        dotButton.setFont(new Font("Arial", Font.BOLD, 14));          //changes the font
        dotButton.addActionListener(this);                                     //need this for actionPerformer to work here
        jf.add(dotButton);

        zeroButton=new JButton("0");                                      //adds the 0 button
        zeroButton.setBounds(130, 410, 80, 80);
        zeroButton.setFont(new Font("Arial", Font.BOLD, 14));        //changes the font
        zeroButton.addActionListener(this);                                    //need this for actionPerformer to work here
        jf.add(zeroButton);

        equalButton=new JButton("=");                                      //adds the = button
        equalButton.setBounds(230, 410, 80, 80);
        equalButton.setFont(new Font("Arial", Font.BOLD, 14));        //changes the font
        equalButton.addActionListener(this);                                    //need this for actionPerformer to work here
        jf.add(equalButton);

        addButton=new JButton("+");                                        //adds the + button
        addButton.setBounds(330, 110, 100, 80);
        addButton.setFont(new Font("Arial", Font.BOLD, 14));         //changes the font
        addButton.addActionListener(this);                                     //need this for actionPerformer to work here
        jf.add(addButton);

        minusButton=new JButton("-");                                      //adds the - button
        minusButton.setBounds(450, 110,100, 80);
        minusButton.setFont(new Font("Arial", Font.BOLD, 14));        //changes the font
        minusButton.addActionListener(this);                                    //need this for actionPerformer to work here
        jf.add(minusButton);

        multiplyButton=new JButton("*");                                    //adds the * button
        multiplyButton.setBounds(330, 210, 100, 80);
        multiplyButton.setFont(new Font("Arial", Font.BOLD, 14));      //changes the font
        multiplyButton.addActionListener(this);                                  //need this for actionPerformer to work here
        jf.add(multiplyButton);

        divideButton=new JButton("/");                                    //adds the / button
        divideButton.setBounds(450, 210, 100, 80);
        divideButton.setFont(new Font("Arial", Font.BOLD, 14));      //changes the font
        divideButton.addActionListener(this);                                  //need this for actionPerformer to work here
        jf.add(divideButton);
        
        clearButton=new JButton("C");                                    //adds the / button
        clearButton.setBounds(330, 310, 100, 80);
        clearButton.setFont(new Font("Arial", Font.BOLD, 14));      //changes the font
        clearButton.addActionListener(this);                                  //need this for actionPerformer to work here
        jf.add(clearButton);

        jf.setVisible(true);                                                  //sets the frame visibility to true (by defaulty it is false)
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                     //stops runninng the program in the background when u exit the window
 
        }


        public static void main(String[] args) {                               //without this the program wont run
            new calculator();                                                  //runs the constructor as the code is written in a public constructor 
        }


        public void actionPerformed(ActionEvent e){
            /* jf.getContentPane().setBackground(Color.pink);  */                   //makes the colour pink when u touch the buttons 
            if(e.getSource()==sevenButton){
                if(isOperatorClicked){                                             //operator gets clicked
                    displayLabel.setText("7");                                //then all the previous value has to go, and 7 only has to be displayed (the previous number gets stored in another variable)
                    isOperatorClicked=false;                                       //return it to original (false)
                }
                else{
                    String labelText=displayLabel.getText();                            //to see of there is number already in display
                    displayLabel.setText(labelText+"7");                                //if there is a number there, then 7 gets concatenated to it
                } 
            }

            else if(e.getSource()==eightButton){
                if (isOperatorClicked) {                                             //operator gets clicked
                    displayLabel.setText("8");                                  //then all the previous value has to go, and 7 only has to be displayed (the previous number gets stored in another variable)
                    isOperatorClicked=false;
                }
                else{
                String labelText=displayLabel.getText();                            //to see of there is number already in display
                displayLabel.setText(labelText+"8");                                       //return it to original (false)
                }
            }

            else if(e.getSource()==nineButton){
                if (isOperatorClicked) {                                             //operator gets clicked
                    displayLabel.setText("9");                                  //then all the previous value has to go, and 7 only has to be displayed (the previous number gets stored in another variable)
                    isOperatorClicked=false;                                       //return it to original (false)
                }
                else{
                String labelText=displayLabel.getText();                            //to see of there is number already in display
                displayLabel.setText(labelText+"9");
                }
            }

            else if(e.getSource()==fourButton){
                if(isOperatorClicked){                                             //operator gets clicked
                    displayLabel.setText("4");                                //then all the previous value has to go, and 7 only has to be displayed (the previous number gets stored in another variable)
                    isOperatorClicked=false;                                       //return it to original (false)
                }
                else{
                    String labelText=displayLabel.getText();                            //to see of there is number already in display
                    displayLabel.setText(labelText+"4");                                //if there is a number there, then 7 gets concatenated to it
                } 
            }

            else if(e.getSource()==fiveButton){
                if(isOperatorClicked){                                             //operator gets clicked
                    displayLabel.setText("5");                                //then all the previous value has to go, and 7 only has to be displayed (the previous number gets stored in another variable)
                    isOperatorClicked=false;                                       //return it to original (false)
                }
                else{
                    String labelText=displayLabel.getText();                            //to see of there is number already in display
                    displayLabel.setText(labelText+"5");                                //if there is a number there, then 7 gets concatenated to it
                } 
            }

            else if(e.getSource()==sixButton){
                if(isOperatorClicked){                                             //operator gets clicked
                    displayLabel.setText("6");                                //then all the previous value has to go, and 7 only has to be displayed (the previous number gets stored in another variable)
                    isOperatorClicked=false;                                       //return it to original (false)
                }
                else{
                    String labelText=displayLabel.getText();                            //to see of there is number already in display
                    displayLabel.setText(labelText+"6");                                //if there is a number there, then 7 gets concatenated to it
                } 
            }

            else if(e.getSource()==oneButton){
                if(isOperatorClicked){                                             //operator gets clicked
                    displayLabel.setText("1");                                //then all the previous value has to go, and 7 only has to be displayed (the previous number gets stored in another variable)
                    isOperatorClicked=false;                                       //return it to original (false)
                }
                else{
                    String labelText=displayLabel.getText();                            //to see of there is number already in display
                    displayLabel.setText(labelText+"1");                                //if there is a number there, then 7 gets concatenated to it
                } 
            }

            else if(e.getSource()==twoButton){
                if(isOperatorClicked){                                             //operator gets clicked
                    displayLabel.setText("2");                                //then all the previous value has to go, and 7 only has to be displayed (the previous number gets stored in another variable)
                    isOperatorClicked=false;                                       //return it to original (false)
                }
                else{
                    String labelText=displayLabel.getText();                            //to see of there is number already in display
                    displayLabel.setText(labelText+"2");                                //if there is a number there, then 7 gets concatenated to it
                } 
            }

            else if(e.getSource()==threeButton){
                if(isOperatorClicked){                                             //operator gets clicked
                    displayLabel.setText("3");                                //then all the previous value has to go, and 7 only has to be displayed (the previous number gets stored in another variable)
                    isOperatorClicked=false;                                       //return it to original (false)
                }
                else{
                    String labelText=displayLabel.getText();                            //to see of there is number already in display
                    displayLabel.setText(labelText+"3");                                //if there is a number there, then 7 gets concatenated to it
                } 
            }

            else if(e.getSource()==dotButton){
                if(isOperatorClicked){                                             //operator gets clicked
                    displayLabel.setText(".");                                //then all the previous value has to go, and 7 only has to be displayed (the previous number gets stored in another variable)
                    isOperatorClicked=false;                                       //return it to original (false)
                }
                else{
                    String labelText=displayLabel.getText();                            //to see of there is number already in display
                    displayLabel.setText(labelText+".");                                //if there is a number there, then 7 gets concatenated to it
                } 
            }

            else if(e.getSource()==zeroButton){
                if(isOperatorClicked){                                             //operator gets clicked
                    displayLabel.setText("0");                                //then all the previous value has to go, and 7 only has to be displayed (the previous number gets stored in another variable)
                    isOperatorClicked=false;                                       //return it to original (false)
                }
                else{
                    String labelText=displayLabel.getText();                            //to see of there is number already in display
                    displayLabel.setText(labelText+"0");                                //if there is a number there, then 7 gets concatenated to it
                } 
            }
            
            else if(e.getSource()==equalButton){
                String newvalue=displayLabel.getText();                                 //the value in display gets stored to the variable newvalue
                float oldvalueF=Float.parseFloat(oldvalue);                             
                float newvalueF=Float.parseFloat(newvalue);

                switch(operator){
                    case'+':                                                            //does addition operation, stores in result and shows it on the display
                        result = oldvalueF + newvalueF;                                 
                        displayLabel.setText("" + result);
                        break;

                    case'-':                                                           //does subtraction operation, stores in result and shows it on the display
                        result = oldvalueF - newvalueF;
                        displayLabel.setText("" + result);
                        break;

                    case'*':                                                          //does multiplication operation, stores in result and shows it on the display
                        result = oldvalueF * newvalueF;
                        displayLabel.setText("" + result);
                        break;

                    case'/':                                                           //does division operation, stores in result and shows it on the display
                        result = oldvalueF / newvalueF;
                        displayLabel.setText("" + result);
                    break;
                }
            }
        

            else if(e.getSource()==addButton){
                oldvalue = displayLabel.getText();                                    //the value in display gets stored to the variable oldvalue
                isOperatorClicked=true;
                operator='+';
                
            }

            else if(e.getSource()==minusButton){
                oldvalue = displayLabel.getText();                                    //the value in display gets stored to the variable oldvalue
                isOperatorClicked=true; 
                operator='-';
                
            }

            else if(e.getSource()==multiplyButton){
                oldvalue = displayLabel.getText();                                    //the value in display gets stored to the variable oldvalue
                isOperatorClicked=true; 
                operator='*';
                
            }

            else if(e.getSource()==divideButton){
                oldvalue = displayLabel.getText();                                    //the value in display gets stored to the variable oldvalue
                isOperatorClicked=true; 
                operator='/';
                
            }

             else if(e.getSource()==clearButton){
                displayLabel.setText(" ");                                     //clears the complete value in the display 
            }

        }

    }

