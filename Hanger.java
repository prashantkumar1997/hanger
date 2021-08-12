
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Hanger {
    public static void main(String[] args) {
       while(true)
       {
        JFrame jf=new JFrame("Hanger");
        jf.setAlwaysOnTop(true);
        JLabel jl=new JLabel("Welcome to Hanger");
        //jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(jl);
        jf.setSize(1400,900);
        jf.setBackground(Color.orange);
        jf.setVisible(true);
       }
        
    }
    
}
