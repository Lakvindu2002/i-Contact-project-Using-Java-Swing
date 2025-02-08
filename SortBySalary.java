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
	
	private CustomerCollection customerCollection;
	SortBySalary(CustomerCollection customerCollection){
			this.customerCollection=customerCollection;
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
        tblCustomer.getTableHeader().setForeground(Color.BLACK); 
        tblCustomer.setGridColor(Color.LIGHT_GRAY); 
		sPane=new JScrollPane(tblCustomer);
		
		customerCollection.sortBySalary();
		dtm.setRowCount(0);
		for(int i=0;i<customerCollection.customerArray.length;i++){
			
			Customer c1=customerCollection.get(i);
			
			Object [] rowData={c1.getId(),c1.getName(),c1.getNumber(),c1.getCompany(),c1.getSalary(),c1.getBirthDay()};
			dtm.addRow(rowData);
			}
		add("Center",sPane);
		
		    JPanel footerPanel = new JPanel(new GridLayout(2, 1));
		    JPanel footerRow2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
			btnHomePage = new JButton("🏠 Back To Home");
			btnHomePage.addActionListener(new ActionListener(){
				
				public void actionPerformed(ActionEvent e){
					new MainForm().setVisible(true);
						//dispose();
					
					}
				
				});
			btnHomePage.setFont(new Font("", Font.BOLD, 15));
			footerRow2.add(btnHomePage);
			footerPanel.add(footerRow2);
			add("South",footerPanel);
		
		}
	
	
	}

