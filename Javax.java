/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javax;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 *
 * @author student
 */
public class Javax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        JFrame frame = new JFrame();
                
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(Jframe.EXIT_ON_CLOSE);
        frame.setTitle("User Interface");
        
        JLabel lbl3 =new JLabel();
        lbl3.setText("Enter Your desired Number");
        
         //===========================================================
        JLabel lbl =new JLabel();
        lbl.setText("\n");
        //===========================================================
         JLabel lbl2 =new JLabel();
        lbl2.setText("\n");
  //===========================================================
        JPanel pan =new JPanel();
        pan.setLayout(new FlowLayout());
  //===========================================================
       JButton add =new JButton();
       add.setText("+");
  //===========================================================
       JButton min =new JButton();
       min.setText("-");
    //===========================================================   
       JButton div =new JButton();
       div.setText("/");
    //===========================================================   
       JButton mult =new JButton();
       mult.setText("*");
  //===========================================================
       JTextField tf1 = new JTextField(16);
       tf1.setBounds(100, 50, 85, 20);
  //===========================================================     
  JTextField tf2 = new JTextField(16);
  tf2.setBounds(200, 200, 85, 20); 
    //===========================================================  
    pan.add(lbl3);   
    pan.add(tf1);
       pan.add(tf2);
       pan.add(add);
       pan.add(lbl);
       pan.add(lbl2);
       pan.add(min);
       pan.add(div);
       pan.add(mult);
       
       frame.add(pan);
       
       add.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent e){
       int a = Integer.parseInt(tf1.getText());
       int b = Integer.parseInt(tf2.getText());
       int c = a + b;
       
       lbl.setText("Their sum is = " + String.valueOf(c));
     }
     });
       min.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent e){
       int a = Integer.parseInt(tf1.getText());
       int b = Integer.parseInt(tf2.getText());
       int c = a - b;
       
       lbl.setText("Their sum is = " + String.valueOf(c));
     }
     });
       div.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent e){
       int a = Integer.parseInt(tf1.getText());
       int b = Integer.parseInt(tf2.getText());
       int c = a / b;
       
       lbl.setText("Their sum is = " + String.valueOf(c));
     }
     });
      mult.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent e){
       int a = Integer.parseInt(tf1.getText());
       int b = Integer.parseInt(tf2.getText());
       int c = a * b;
       
       lbl.setText("Their sum is = " + String.valueOf(c));
     }
     });
       
        
       frame.setVisible(true);
       
      
    }
    
}

