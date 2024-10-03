package tokyslav;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Hello world!
 *
 */
public class SizeSeeker {

    private static final String myText = "HelloText";

    public static void main(String[] args) {
        System.out.println(myText);
        createMyWindow();
    }

    public static String getMyText() {
        return myText;
    }

    private static void createMyWindow() {
        JFrame frame = new JFrame("JFrame Example");
        JPanel panel = new JPanel();
        //panel.setLayout(new GridLayout());
        JLabel label = new JLabel("JFrame By Example");
        JButton button = new JButton();
        button.setText("Button");
        panel.add(label);
        panel.add(button);
        frame.add(panel);
        frame.setSize(200, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
