import javax.swing.*;
public class abc
{
    public static void main(String args[])
    {
        JFrame F = new JFrame();
        JButton B = new JButton("CLICK");
        B.setBounds(130,100,100,40);
        F.add(B);
        F.setSize(400,500);
        F.setLayout(null);
        F.setVisible(true);
    }
}
