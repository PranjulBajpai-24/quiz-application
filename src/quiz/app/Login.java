package quiz.app;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Login extends JFrame implements ActionListener {

    JTextField text;
    JButton Next, Back;

    Login() {
        getContentPane().setBackground(new Color(255, 218, 185)); // Peach background

        setLayout(null); // initialy the layout is border layout. We have set it null so that we can set it according to us.

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpg")); //ClassLoader dynamically loads classes into the Java Virtual Machine

        Image i = i1.getImage().getScaledInstance(550, 500, Image.SCALE_DEFAULT); //getScaledInstance(...) resizes the image and Image.SCALE_DEFAULT uses the system's default image-scaling algorithm

        ImageIcon i2 = new ImageIcon(i); //i2 Converts the scaled Image back to ImageIcon

        JLabel image = new JLabel(i2); // image var. creates a JLabel component with i2 as its icon.

        image.setBounds(450, 0, 550, 500);
        add(image);

        JLabel heading = new JLabel("QUIZ MASTER");
        heading.setBounds(25, 40, 400, 60);
        heading.setFont(new Font("Arial Black", Font.BOLD, 48));
        heading.setForeground(new Color(255, 140, 0)); // Dark Orange
        add(heading);

        JLabel name = new JLabel("Enter Your Name:");
        name.setBounds(125, 130, 200, 30);
        name.setFont(new Font("Serif", Font.BOLD, 22));
        name.setForeground(new Color(47, 79, 79)); // Dark Slate Gray
        add(name);

        text = new JTextField();
        text.setBounds(75, 170, 300, 30);
        text.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        text.setForeground(Color.GRAY);
        text.setBackground(new Color(255, 250, 240)); // Floral White
        add(text);

        Back = new JButton("Back");
        Back.setBounds(60, 230, 130, 35);
        Back.setBackground(new Color(255, 140, 0)); // Dark Orange
        Back.setForeground(Color.WHITE);
        Back.setFont(new Font("Tahoma", Font.BOLD, 16));
        Back.addActionListener(this);
        add(Back);

        Next = new JButton("Next");
        Next.setBounds(260, 230, 130, 35);
        Next.setBackground(new Color(255, 140, 0)); // Dark Orange
        Next.setForeground(Color.WHITE);
        Next.setFont(new Font("Tahoma", Font.BOLD, 16));
        Next.addActionListener(this);
        add(Next);

        setSize(1000, 500);
        setLocation(250, 150);
        setUndecorated(true);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Next) {

            String name=text.getText();
            setVisible(false);
            new Rules(name);
        } else if (e.getSource() == Back) {
            System.exit(50);
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
