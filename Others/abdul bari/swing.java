import javax.swing.*;

public class swing {
    public static void main(String[] args) {
        JFrame f = new JFrame("MyApplet");
        JButton b = new JButton("click");
        b.setBounds(200, 200, 100, 30);
        f.add(b);
        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
    }
}
