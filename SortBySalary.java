import javax.swing.table.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;




class SortBySalary extends JFrame{
	
	private DefaultTableModel dtm;
	private JTable tblCustomer;
	private JScrollPane sPane;
	
	private JLabel lblTitle;
	
	private JButton btnHomePage;
	
	SortBySalary(){
		
		    setSize(600,600);
			setTitle("Sort by Salary");
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			setLocationRelativeTo(null);
			
		JPanel titlePanel = new JPanel();
        titlePanel.setBackground(new Color(30, 144, 255)); 
        titlePanel.setPreferredSize(new Dimension(500, 60));
		lblTitle = new JLabel("List Contact By Salary ", JLabel.CENTER); 
        lblTitle.setFont(new Font("Arial", Font.BOLD, 28));
        lblTitle.setForeground(Color.WHITE); 
        
        titlePanel.add(lblTitle);
        add("North",titlePanel);
		
		String [] columnName={"ID","Name","Number","Company","Salary","BirthDay"};
		dtm=new DefaultTableModel(columnName,0);
		tblCustomer=new JTable(dtm);
		tblCustomer.setRowHeight(25); 
        tblCustomer.getTableHeader().setFont(new Font("Arial", Font.BOLD, 16)); 
        tblCustomer.getTableHeader().setBackground(new Color(220, 220, 220)); 
        tblCustomer.getTableHeader().setForeground(Color.WHITE); 
        tblCustomer.setGridColor(Color.LIGHT_GRAY); 
		sPane=new JScrollPane(tblCustomer);
		
		
		add("Center",sPane);
		
		    JPanel footerPanel = new JPanel(new GridLayout(2, 1));
		    JPanel footerRow2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
			btnHomePage = new JButton("🏠 Back To Home");
			btnHomePage.setFont(new Font("", Font.BOLD, 15));
			footerRow2.add(btnHomePage);
			footerPanel.add(footerRow2);
		
		}
	
	
	}

