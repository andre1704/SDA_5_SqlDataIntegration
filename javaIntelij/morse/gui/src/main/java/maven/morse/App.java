package maven.morse;

import javax.swing.*;
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
        setSize(300, 300);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setbutton();
        setpoleOut();
        setpoleIn();
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

    public void listener() {
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

    public void setbutton() {
        button = new JButton();
        button.setLocation(150, 0);
        button.setVisible(true);
        button.setSize(30, 30);


    }

    public void setpoleIn() {

        poleIn = new JTextField();
        poleIn.setSize(100, 100);
        poleIn.setVisible(true);
        poleIn.setName("IN");
        poleIn.setLocation(20, 20);
    }

    public void setpoleOut() {

        poleOut = new JTextField();
        poleOut.setSize(100, 100);
        poleOut.setVisible(true);
        poleOut.setName("OUT");
        poleOut.setLocation(150, 150);
    }

    public static void main(String[] args) {
        new App();
    }
}
