import java.awt.Color;

import javax.swing.*;
public class Java {
    

public static void main (String []args){
JFrame frame = new JFrame( "userinterface");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(300, 300);
frame.setBackground(Color.ORANGE);

JButton button = new JButton("press");
JButton button2 = new JButton("run");
frame.getContentPane().add(button2);
frame.getContentPane().add(button);

frame.setVisible(true);

}
}