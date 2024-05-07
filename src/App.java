import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame {
    static JFrame Frame = new JFrame("Trivia Game");
    static JLabel Label = new JLabel("<html>TRIVIA GAME<html><br>The Game Where The Answers Just Don't Add Up<br>");
    static JLabel Status = new JLabel();
    static JButton Button1 = new JButton();
    static JButton Button2 = new JButton();
    static JButton Button3 = new JButton();
    static JButton Button4 = new JButton();
    public static void main(String[] args) throws Exception {
        Dimension Size = Toolkit.getDefaultToolkit().getScreenSize();

        Frame.setLayout(null);
        Frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        Frame.setSize((int)Size.getWidth(), (int)Size.getHeight());
        Frame.setVisible(true);

        Label.setLocation(600, 0);
        Label.setSize(1000, 500);
        Label.setFont(new Font("Arial", Font.BOLD, 30));

        JButton Button = new JButton("Play");
        Button.setLocation(800, 500);
        Button.setSize(300, 200);
        Button.setFont(new Font("Arial", Font.BOLD, 30));
        Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Button.setVisible(false);
                Question();
            }
        });

        Status.setLocation(600, 0);
        Status.setSize(1000, 500);
        Status.setFont(new Font("Arial", Font.BOLD, 50));

        Frame.add(Label);
        Frame.add(Button);
        Frame.add(Status);
    }

    public static void Question() {

        Label.setText("Question 1: Yes or No");

        Button1.setText("Yes");
        Button1.setLocation(600, 500);
        Button1.setSize(300, 200);
        Button1.setFont(new Font("Arial", Font.BOLD, 30));
        Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Status.setText("Correct!");
                Button1.setVisible(false);
                Button2.setVisible(false);
                Label.setVisible(false);
            }
        });

        Button2.setText("No");
        Button2.setLocation(1200, 500);
        Button2.setSize(300, 200);
        Button2.setFont(new Font("Arial", Font.BOLD, 30));
        Button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Status.setText("Wrong!");
                Button1.setVisible(false);
                Button2.setVisible(false);
                Label.setVisible(false);
            }
        });

        Frame.add(Button1);
        Frame.add(Button2);
    }
}
