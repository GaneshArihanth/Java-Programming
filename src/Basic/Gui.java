package Basic;

import javax.swing.JOptionPane;

public class Gui {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello " + input);
    }
}
