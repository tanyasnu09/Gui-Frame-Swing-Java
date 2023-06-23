import javax.swing.*;
import java.awt.*;
public class ChattingApplication extends JFrame{
    ChattingApplication(){
        setLayout(null);
        JPanel p1=new JPanel();
        p1.setBounds(0,0,400,80);
        p1.setBackground(Color.gray);

        add(p1);
        setSize(400,750);
        setLocation(200,100);
        getContentPane().setBackground(Color.black);
        setVisible(true);
  ImageIcon i1=  new ImageIcon(ClassLoader.getSystemResource("icons\1.png"));
  JLabel l = new JLabel(i1);
  l.setBounds(0,0,10,10);
  p1.add(l);
    }

    public static void main(String[] args) {
        ChattingApplication chattingApplication = new ChattingApplication();
    }
}
