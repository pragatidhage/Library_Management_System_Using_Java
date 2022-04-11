package library.management.system;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class aboutUs extends JFrame{

	private JPanel contentPane;

        public static void main(String[] args) {
            new aboutUs().setVisible(true);			
	}
    
        public aboutUs() {
            
            super("About Us ");
            setBackground(new Color(173, 216, 230));
            setBounds(500, 250, 700, 500);
		
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);

            JLabel l1 = new JLabel("New label");
            ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("logo.jpg"));
            Image i2 = i1.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            l1 = new JLabel(i3);
            l1.setBounds(500, 40, 100, 100);
            contentPane.add(l1);


            JLabel l3 = new JLabel("Library");
            l3.setForeground(new Color(0, 250, 154));
            l3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l3.setBounds(160, 40, 150, 55);
            contentPane.add(l3);

            JLabel l4 = new JLabel("Mangement System");
            l4.setForeground(new Color(127, 255, 0));
            l4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l4.setBounds(70, 90, 405, 40);
            contentPane.add(l4);



            JLabel l6 = new JLabel("Submitted By Group of : ");
            l6.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
            l6.setBounds(70, 198, 600, 35);
            contentPane.add(l6);

            JLabel l7 = new JLabel("Harshita Chhangani(19CM012)");
            l7.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l7.setBounds(70, 240, 600, 34);
            contentPane.add(l7);

            JLabel l8 = new JLabel("Harish Chopade (19CM013)");
            l8.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l8.setBounds(70, 265, 600, 34);
            contentPane.add(l8);

            JLabel l9 = new JLabel("Ganesh Damre(19CM014)");
            l9.setFont(new Font("Trebuchet MS", Font.BOLD , 20));
            l9.setBounds(70, 290, 600, 34);
            contentPane.add(l9);
            
            JLabel l11 = new JLabel("Pragati Dhage(19CM016)");
            l11.setFont(new Font("Trebuchet MS", Font.BOLD , 20));
            l11.setBounds(70, 315, 600, 34);
            contentPane.add(l11);
            
             JLabel l12 = new JLabel("Tejas Dhande(19CM017)");
            l12.setFont(new Font("Trebuchet MS", Font.BOLD , 20));
            l12.setBounds(70, 340, 600, 34);
            contentPane.add(l12);


            JLabel l10 = new JLabel("**Government Polytechnic, Amravati**");
            l10.setForeground(new Color(0, 20, 154));
            
            l10.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 24));
            l10.setBounds(150, 400, 600, 34);
            contentPane.add(l10);
                
                
            contentPane.setBackground(Color.WHITE);
	}
        

}

