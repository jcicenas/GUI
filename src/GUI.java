import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {

    //class attributes
    private JLabel label1;
    private JLabel label2;
    private int val = 0;
    private int changes = 0;

    //constructor
    public GUI(){
        //Create Frame
        JFrame frame = new JFrame("Simple GUI");
        //Set frame size
        frame.setSize(600, 400);
        //Makes program exit when we close the GUI window/frame
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //Create panel & set defaults
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panel.setLayout(new GridLayout(2, 2, 10, 10));
        frame.add(panel);

        //Labels!
        label1 = new JLabel("Value: " + val);
        label1.setHorizontalAlignment(JLabel.CENTER);
        panel.add(label1);

        label2 = new JLabel("Number of changes: " + changes);
        label2.setHorizontalAlignment(JLabel.CENTER);
        panel.add(label2);

        //Buttons!
        JButton b1 = new JButton("-1");
        JButton b2 = new JButton("+1");
        panel.add(b1);
        panel.add(b2);

        //Adding actions to buttons
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //call we want to run when B1 is pressed goes here
                b1Press();
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //call we want to run when B2 is pressed goes here
                b2Press();
            }
        });

        //Displays frame
        //Put this at the end of constructor
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new GUI();
    }

    //Methods that are called when buttons are clicked
    public void b1Press() {
        val--;
        changes++;
        label1.setText("Value: " + val);
        label2.setText("Number of changes: " + changes);
    }
    public void b2Press() {
        val++;
        changes++;
        label1.setText("Value: " + val);
        label2.setText("Number of changes: " + changes);
    }
}