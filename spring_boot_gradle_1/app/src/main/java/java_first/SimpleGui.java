package java_first;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class ButtonHandler implements ActionListener {
    JButton button;
    JFrame frame;
    int timesClicked = 0;

    ButtonHandler(JButton button, JFrame frame) {
        this.button = button;
        this.frame = frame;
    }

    public void actionPerformed(ActionEvent event) {
        button.setText("I've been clicked! times=" + timesClicked);
        timesClicked++;
        frame.repaint();
    }
}

class MyDrawPanel extends JPanel {
    JFrame frame;

    MyDrawPanel(JFrame frame) {
        this.frame = frame;
    }

    public void paintComponent(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 300, 300);
        frame.repaint();
    }
}
public class SimpleGui {

    SimpleGui() {
        JFrame frame = new JFrame();
        JButton button = new JButton("click me");
        JRadioButton radio = new JRadioButton();
        MyDrawPanel drawPanel = new MyDrawPanel(frame);
        
        button.addActionListener(new ButtonHandler(button, frame));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.SOUTH, button);;
        frame.getContentPane().add(BorderLayout.NORTH, radio);;
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);;
        
        frame.setSize(300,300);
        frame.setVisible(true);

        
        
    }
    public static void main(String[] args) {
        System.out.println("Booting app");
        new SimpleGui();
    }
}
