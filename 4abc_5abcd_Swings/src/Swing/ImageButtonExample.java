/*Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour
Glass is pressed” depending upon the Jbutton with image either Digital Clock or Hour Glass is
pressed by implementing the event handling mechanism with addActionListener( ).*/

package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageButtonExample {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Image Button Example");
        frame.setSize(200, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create label to show messages
        JLabel label = new JLabel("Click an image button");
        label.setFont(new Font("Arial", Font.PLAIN, 14));

        ImageIcon digitalIcon = new ImageIcon("C:\\Users\\varsh\\OneDrive\\Desktop\\sandclock.jpeg");
        ImageIcon hourglassIcon = new ImageIcon("C:\\Users\\varsh\\OneDrive\\Desktop\\clock.jpeg");

        // Create buttons with image icons
        JButton digitalButton = new JButton(digitalIcon);
        JButton hourglassButton = new JButton(hourglassIcon);

        // Add action listeners
        digitalButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Digital Clock is pressed");
            }
        });

        hourglassButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Hour Glass is pressed");
            }
        });

        // Add buttons and label to the frame
        frame.add(digitalButton);
        frame.add(hourglassButton);
        frame.add(label);

        // Center and show the frame
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
