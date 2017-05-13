package nnnn;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Hello world!
 */

public class App extends JFrame {
    private JButton button;
    private JTextField poleIn;
    private JTextField poleOut;

    public App() {
        setSize(555, 300);
        setVisible(true);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        button = button();
        poleOut = poleOut();
        poleIn = poleIn();
        button.setPreferredSize(new Dimension(100,22));
        poleIn.setPreferredSize(new Dimension(100,100));
        poleOut.setPreferredSize(new Dimension(100,100));
        add(button);
        add(poleIn);
        add(poleOut);
        poleIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        listener();


    }
    public void listener(){
        button.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                poleOut.setText(Morse.translate(poleIn.getText()));
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }

    public JButton button() {
        JButton button = new JButton();
        button.setVisible(true);
        button.setSize(30, 30);
        return button;
    }

    public JTextField poleIn() {

        JTextField pole = new JTextField();
        pole.setSize(100, 100);
        pole.setVisible(true);
        pole.setName("IN");
        return pole;
    }

    public JTextField poleOut() {

        JTextField pole = new JTextField();
        pole.setSize(100, 100);
        pole.setVisible(true);
        pole.setName("OUT");
        return pole;
    }

    public static void main(String[] args) {
        new App();
    }
}
