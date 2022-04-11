package library.management.system;
import java.awt.*;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
import java.awt.event.*;

public class Statistics extends JFrame{

   JPanel contentPane;
     JTable table;
    JTable table_1;

    public static void main(String[] args) {
        new Statistics().setVisible(true);
       
    }

    public void issueBook() {
	try {
            conn con =  new conn();
            
            String sql = "select * from issueBook";
            PreparedStatement st = con.c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

   table.setModel(DbUtils.resultSetToTableModel(rs));

	} catch (Exception e) 
	{
		
	}
    }

    public void returnBook() 
    	{
        try 
        	{
            conn con = new conn();
            String sql = "select * from returnBook";
            PreparedStatement st = con.c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
          table_1.setModel(DbUtils.resultSetToTableModel(rs));
	} catch (Exception e) {
		
	}
    }

    public Statistics() {
        setBounds(400, 200, 810, 594);
	contentPane = new JPanel();
        contentPane.setBackground(Color.WHITE);
	setContentPane(contentPane);
	contentPane.setLayout(null);

	JScrollPane scrollPane = new JScrollPane();
	scrollPane.setBounds(40, 63, 708, 217);
	contentPane.add(scrollPane);

        table = new JTable();
	table.setBackground(new Color(224, 255, 255));
	table.setForeground(new Color(128, 128, 0));
	table.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
	scrollPane.setViewportView(table);
	
	 JLabel l1 = new JLabel("Issue Book");
            l1.setForeground(new Color(204, 51, 102));
            l1.setFont(new Font("Segoe UI Semilight", Font.BOLD, 16));
            l1.setBounds(35, 38, 90, 27);
            contentPane.add(l1);


	JButton b1 = new JButton("Back");
	b1.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent arg0) {
		setVisible(false);
		Home home = new Home();
		home.setVisible(true);
            }
	});
    b1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
	b1.setBounds(50, 13, 96, 27);
    b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
	
	contentPane.add(b1);
	

	JScrollPane scrollPane_1 = new JScrollPane();
	scrollPane_1.setBounds(40, 316, 717, 217);
	contentPane.add(scrollPane_1);

	table_1 = new JTable();
	table_1.setBackground(new Color(2, 255, 255));
	table_1.setForeground(new Color(153, 51, 0));
	table_1.setFont(new Font("Sitka Small", Font.BOLD, 12));
	scrollPane_1.setViewportView(table_1);

JLabel l2 = new JLabel("Return Book");
            l2.setForeground(new Color(204, 51, 102));
            l2.setFont(new Font("Segoe UI Semilight", Font.BOLD, 16));
            l2.setBounds(35,290, 100, 27);
            contentPane.add(l2);
	
        

	issueBook();
	returnBook();
    }
}
