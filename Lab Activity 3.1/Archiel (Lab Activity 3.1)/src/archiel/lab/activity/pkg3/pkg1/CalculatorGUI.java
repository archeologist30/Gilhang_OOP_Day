
package archiel.lab.activity.pkg3.pkg1;

import java.awt.Color;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class CalculatorGUI extends Calculator implements ActionListener{
    
    
    JTextField i_o, i_o2, operator;
    JButton n1, n2, n3, n4, n5, n6, n7, n8, n9, n0, equal, clear, plus, minus, multiply, divide;
    
    
    
     public CalculatorGUI(){
         
         
         //LABELS-----------------------------------------------------------------------------------
         /*JLabel numberbox= new JLabel(); //makes a label object
         numberbox.setText("a");
         numberbox.setForeground(Color.white);*/
         
         
         
    
         
         //TEXTFIELDS-----------------------------------------------------------------------------------
         i_o = new JTextField(11);
         i_o.setFont(new Font("Roboto", Font.BOLD,50));
         i_o.setForeground(Color.white);
         i_o.setBackground(Color.darkGray);
         i_o.setBounds(180, 90, 290, 70);
         i_o.setEditable(false);
         
         i_o2 = new JTextField(11);
         i_o2.setFont(new Font("Roboto", Font.BOLD,30));
         i_o2.setForeground(Color.white);
         i_o2.setBackground(Color.darkGray);
         i_o2.setBounds(270, 30, 200, 50);
         i_o2.setEditable(false);
         
         operator = new JTextField(11);
         operator.setFont(new Font("Roboto", Font.BOLD,50));
         operator.setForeground(Color.white);
         operator.setBackground(Color.darkGray);
         operator.setBounds(180, 90, 290, 70);
         operator.setEditable(false);
         
         
         //PANELS-----------------------------------------------------------------------------------
         /*JPanel number_box = new JPanel();
         number_box.setBackground(Color.DARK_GRAY);
         number_box.setBounds(0, 160, 100, 100); //x,y,w,h
         
         number_box.add(i_o);*/
         
         
         //BUTTONS-----------------------------------------------------------------------------------
         
         plus = new JButton();
         plus.setFocusable(false);
         plus.addActionListener(this);
         plus.setBounds(400, 171, 70, 26);
         plus.setBackground(Color.darkGray);
         plus.setText("+");
         plus.setForeground(Color.white);
         plus.setFont(new Font("Roboto", Font.BOLD, 20));
         
         minus = new JButton();
         minus.setFocusable(false);
         minus.addActionListener(this);
         minus.setBounds(400, 201, 70, 26);
         minus.setBackground(Color.darkGray);
         minus.setText("-");
         minus.setForeground(Color.white);
         minus.setFont(new Font("Roboto", Font.BOLD, 20));
         
         multiply = new JButton();
         multiply.setFocusable(false);
         multiply.addActionListener(this);
         multiply.setBounds(400, 231, 70, 21);
         multiply.setBackground(Color.darkGray);
         multiply.setText("x");
         multiply.setForeground(Color.white);
         multiply.setFont(new Font("Roboto", Font.BOLD, 20));
         
         divide = new JButton();
         divide.setFocusable(false);
         divide.addActionListener(this);
         divide.setBounds(400, 256, 70, 21);
         divide.setBackground(Color.darkGray);
         divide.setText("/");
         divide.setForeground(Color.white);
         divide.setFont(new Font("Roboto", Font.BOLD, 20));
         
         clear = new JButton();
         clear.setFocusable(false);
         clear.addActionListener(this);
         clear.setBounds(10, 30, 80, 50);
         clear.setBackground(Color.darkGray);
         clear.setText("CLEAR");
         clear.setForeground(Color.white);
         clear.setFont(new Font("Roboto", Font.BOLD,13));
         
         equal = new JButton();
         equal.setFocusable(false);
         equal.addActionListener(this);
         equal.setBounds(400, 293, 70, 52);
         equal.setBackground(Color.LIGHT_GRAY);
         equal.setText("=");
         equal.setForeground(Color.DARK_GRAY);
         equal.setFont(new Font("Roboto", Font.BOLD,50));
         
         
         n1 = new JButton();
         n1.setFocusable(false);
         n1.addActionListener(this);
         n1.setBounds(10, 170, 120, 80);
         n1.setBackground(Color.darkGray);
         n1.setText("1");
         n1.setForeground(Color.white);
         n1.setFont(new Font("Roboto", Font.BOLD,50));
         
         n2 = new JButton();
         n2.setFocusable(false);
         n2.addActionListener(this);
         n2.setBounds(140, 170, 120, 80);
         n2.setBackground(Color.darkGray);
         n2.setText("2");
         n2.setForeground(Color.white);
         n2.setFont(new Font("Roboto", Font.BOLD,50));
         
         n3 = new JButton();
         n3.setFocusable(false);
         n3.addActionListener(this);
         n3.setBounds(270, 170, 120, 80);
         n3.setBackground(Color.darkGray);
         n3.setText("3");
         n3.setForeground(Color.white);
         n3.setFont(new Font("Roboto", Font.BOLD,50));
         
         n4 = new JButton();
         n4.setFocusable(false);
         n4.addActionListener(this);
         n4.setBounds(10, 265, 120, 80);
         n4.setBackground(Color.darkGray);
         n4.setText("4");
         n4.setForeground(Color.white);
         n4.setFont(new Font("Roboto", Font.BOLD,50));
         
         n5 = new JButton();
         n5.setFocusable(false);
         n5.addActionListener(this);
         n5.setBounds(140, 265, 120, 80);
         n5.setBackground(Color.darkGray);
         n5.setText("5");
         n5.setForeground(Color.white);
         n5.setFont(new Font("Roboto", Font.BOLD,50));
         
         n6 = new JButton();
         n6.setFocusable(false);
         n6.addActionListener(this);
         n6.setBounds(270, 265, 120, 80);
         n6.setBackground(Color.darkGray);
         n6.setText("6");
         n6.setForeground(Color.white);
         n6.setFont(new Font("Roboto", Font.BOLD,50));
         
         n7 = new JButton();
         n7.setFocusable(false);
         n7.addActionListener(this);
         n7.setBounds(10, 360, 120, 80);
         n7.setBackground(Color.darkGray);
         n7.setText("7");
         n7.setForeground(Color.white);
         n7.setFont(new Font("Roboto", Font.BOLD,50));
         
         n8 = new JButton();
         n8.setFocusable(false);
         n8.addActionListener(this);
         n8.setBounds(140, 360, 120, 80);
         n8.setBackground(Color.darkGray);
         n8.setText("8");
         n8.setForeground(Color.white);
         n8.setFont(new Font("Roboto", Font.BOLD,50));
         
         n9 = new JButton();
         n9.setFocusable(false);
         n9.addActionListener(this);
         n9.setBounds(270, 360, 120, 80);
         n9.setBackground(Color.darkGray);
         n9.setText("9");
         n9.setForeground(Color.white);
         n9.setFont(new Font("Roboto", Font.BOLD,50));
         
         n0 = new JButton();
         n0.setFocusable(false);
         n0.addActionListener(this);
         n0.setBounds(400, 360, 70, 80);
         n0.setBackground(Color.darkGray);
         n0.setText("0");
         n0.setForeground(Color.white);
         n0.setFont(new Font("Roboto", Font.BOLD,50));
         
         
         //FRAME WINDOW ----------------------------------------------------------------------------
         JFrame f = new JFrame(); //makes a window object
       
         
         
         //sets the window
         f.setVisible(true); //makes the window visible
         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //makes a close button
         f.setTitle("Archiel's Calculator"); //title of window
         f.setResizable(false); //turns off the resizability of the window
         f.setSize(500,500); //sets the size of the window
         f.setLayout(null);
         
         
         //adding textfields
         f.add(i_o);
         f.add(i_o2);
         //setsicon
         Image icon = new ImageIcon(this.getClass().getResource("/custom_calcu_icon_archiel.png")).getImage(); //makes an imag object
         f.setIconImage(icon); //sets the icon image
         f.getContentPane().setBackground(Color.black);
         
         //adding labels
         //f.add(numberbox);
         
         
         //panel
         //f.add(number_box);
 
         //adding buttons
         f.add(n1);
         f.add(n2);
         f.add(n3);
         f.add(n4);
         f.add(n5);
         f.add(n6);
         f.add(n7);
         f.add(n8);
         f.add(n9);
         f.add(n0);
         f.add(equal);
         f.add(clear);
         f.add(plus);
         f.add(minus);
         f.add(multiply);
         f.add(divide);
  
          
         
         
        
     }

    
     @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == equal){
            
            if (hasOperator == true){
                trigEqual = true;
                CalculatorOperation();
                i_o.setText(Integer.toString(result));
                i_o2.setText(Integer.toString(0));
                
            } 
            
            
        }
        
        if(e.getSource() == plus){
            
            if (hasOperator == false){
                hasOperator = true;
            trigPlus = true;
            input2 = input;
            input = 0;
            i_o.setText(Integer.toString(input));
            
            i_o2.setText(Integer.toString(input2));
            
            } 
            
        }
        
        if(e.getSource() == clear){
            
            input = 0;
            input2 = 0;
            
            i_o.setText(Integer.toString(input));
            i_o2.setText(Integer.toString(input2));
            hasOperator = false;
        }
        
        
        
        
        if(e.getSource() == n1){
            if (hasOperator == true){
                input = input * 10 + 1;
                
                i_o.setText(Integer.toString(input));
                i_o2.setText(Integer.toString(input2));
                
            } else {
            input = input * 10 + 1;
            
            i_o.setText(Integer.toString(input));
            }
        }
        
        if(e.getSource() == n2){
            if (hasOperator == true){
                input = input * 10 + 2;
                
                i_o.setText(Integer.toString(input));
                i_o2.setText(Integer.toString(input2));
                
            } else {
            input = input * 10 + 2;
           
            i_o.setText(Integer.toString(input));
            }
        }
        
        if(e.getSource() == n3){
            if (hasOperator == true){
                input = input * 10 + 3;
                
                i_o.setText(Integer.toString(input));
                i_o2.setText(Integer.toString(input2));
                
            } else {
            input = input * 10 + 3;
            
            i_o.setText(Integer.toString(input));
            }
        }
        
        if(e.getSource() == n4){
           if (hasOperator == true){
                input = input * 10 + 4;
                
                i_o.setText(Integer.toString(input));
                i_o2.setText(Integer.toString(input2));
                
            } else {
            input = input * 10 + 4;
            
            i_o.setText(Integer.toString(input));
            }
        }
        
        if(e.getSource() == n5){
           if (hasOperator == true){
                input = input * 10 + 5;
                
                i_o.setText(Integer.toString(input));
                i_o2.setText(Integer.toString(input2));
                
            } else {
            input = input * 10 + 5;
            
            i_o.setText(Integer.toString(input));
            }
        }
        if(e.getSource() == n6){
            if (hasOperator == true){
                input = input * 10 + 6;
               
                i_o.setText(Integer.toString(input));
                i_o2.setText(Integer.toString(input2));
                
            } else {
            input = input * 10 + 6;
            
            i_o.setText(Integer.toString(input));
            }
        }
        if(e.getSource() == n7){
            if (hasOperator == true){
               input = input * 10 + 7;
                
                i_o.setText(Integer.toString(input));
                i_o2.setText(Integer.toString(input2));
                
            } else {
            input = input * 10 + 7;
            
            i_o.setText(Integer.toString(input));
            }
        }
        if(e.getSource() == n8){
            if (hasOperator == true){
               input = input * 10 + 8;
                
                i_o.setText(Integer.toString(input));
                i_o2.setText(Integer.toString(input2));
                
            } else {
            input = input * 10 + 8;
            
            i_o.setText(Integer.toString(input));
            }
        }
        if(e.getSource() == n9){
           if (hasOperator == true){
               input = input * 10 + 9;
                
                i_o.setText(Integer.toString(input));
                i_o2.setText(Integer.toString(input2));
                
            } else {
            input = input * 10 + 9;
            
            i_o.setText(Integer.toString(input));
            }
        }
        if(e.getSource() == n0){
            if (hasOperator == true){
               input = input * 10;
                
                i_o.setText(Integer.toString(input));
                i_o2.setText(Integer.toString(input2));
                
            } else {
            input = input * 10;
            
            i_o.setText(Integer.toString(input));
            }
        }
        
    }
     
    
    
    
    
    }
    
    
   
    
