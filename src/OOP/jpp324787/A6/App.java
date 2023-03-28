package OOP.jpp324787.A6;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JButton buttonA6;
    private JPanel panelA6;
    private JTextArea textAreaA6;

    public App() {
        buttonA6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"This is for A6");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frameA6 = new JFrame("App");
        frameA6.setContentPane(new App().panelA6);
        frameA6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameA6.pack();
        frameA6.setVisible(true);

    }
}
