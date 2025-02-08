import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;
class SearchCustomerForm extends JFrame{
	
	private JLabel lblTitle;
	
	private JLabel lblId;
	private JLabel lblName;
	private JLabel lblNumber;
	private JLabel lblCompany;
	private JLabel lblSalary;
	private JLabel lblBirthDay;
	
	
	private JTextField txtId;
	private JTextField txtName;
	private JTextField txtNumber;
	private JTextField txtCompany;
	private JTextField txtSalary;
	private JTextField txtBirthDay;
	private JTextField txtSearch;
	
	
	
	private JButton btnHomePage;
	private JButton btnSearch;
	private CustomerCollection customerCollection;
	
	SearchCustomerForm(CustomerCollection customerCollection){
			this.customerCollection=customerCollection;
		    setSize(500,500);
			setTitle("Search Contact");
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			setLocationRelativeTo(null);
			
			JPanel titlePanel=new JPanel(new GridLayout(2,1));
			JPanel titleRw1=new JPanel(new FlowLayout(FlowLayout.CENTER));
			titleRw1.setBackground(Color.BLUE);
			lblTitle=new JLabel("Search Contact");
			lblTitle.setFont(new Font("",1,25));
			titleRw1.add(lblTitle);
			titlePanel.add(titleRw1);
			JPanel titleRw2=new JPanel(new FlowLayout(FlowLayout.RIGHT));
			
			txtSearch=new JTextField(20);
			txtSearch.setFont(new Font("",1,20));
			txtSearch.addActionListener(new ActionListener(){
				
				public void actionPerformed(ActionEvent e){
					
					String newId=txtSearch.getText();
					Customer c1=customerCollection.search(newId);
					if(c1!=null){
							
							JOptionPane.showMessageDialog(null,"Contact Found..!");
							txtId.setText(c1.getId());
							txtName.setText(c1.getName());
							txtNumber.setText(c1.getNumber());
							txtCompany.setText(c1.getCompany());
							txtSalary.setText(c1.getSalary()+"");
							txtBirthDay.setText(c1.getBirthDay());
							txtSearch.setText("");
						}else{
							
							JOptionPane.showMessageDialog(null,"Contact not Found..!");
							txtSearch.setText("");
							txtSearch.requestFocus();
							}
					
					}
				
				});
			titleRw2.add(txtSearch);
			titlePanel.add(titleRw2);
			btnSearch=new JButton("Search");
			btnSearch.addActionListener(new ActionListener(){
				
				public void actionPerformed(ActionEvent e){
					
					String newId=txtSearch.getText();
					Customer c1=customerCollection.search(newId);
					if(c1!=null){
							
							JOptionPane.showMessageDialog(null,"Contact Found..!");
							txtId.setText(c1.getId());
							txtName.setText(c1.getName());
							txtNumber.setText(c1.getNumber());
							txtCompany.setText(c1.getCompany());
							txtSalary.setText(c1.getSalary()+"");
							txtBirthDay.setText(c1.getBirthDay());
							txtSearch.setText("");
						}else{
							
							JOptionPane.showMessageDialog(null,"Contact not Found..!");
							txtSearch.setText("");
							txtSearch.requestFocus();
							}
					
					}
				
				});
			titleRw2.add(btnSearch);
			btnSearch.setFont(new Font("",1,20));
			
			add("North",titlePanel);
			
			JPanel lblPanel=new JPanel(new GridLayout(6,1));
			lblPanel.setBorder(new EmptyBorder(40,20,10,0));
			
			lblId=lblSettings("ID ");
			lblPanel.add(lblId);
			
			lblName=lblSettings("Name");
			lblPanel.add(lblName);
			
			
			lblNumber=lblSettings("Number");
			lblPanel.add(lblNumber);
			
			
			lblCompany=lblSettings("Company");
			lblPanel.add(lblCompany);
			
			
			lblSalary=lblSettings("Salary");
			lblPanel.add(lblSalary);
			
			
			lblBirthDay=lblSettings("BirthDay");
			lblPanel.add(lblBirthDay);
			
			add("West",lblPanel);
			
			JPanel txtPanel=new JPanel(new GridLayout(6,1));
			txtPanel.setBorder(new EmptyBorder(40,20,0,0));
			
			JPanel idtxtPanel=new JPanel();
			txtId=sizeSettings(20);
			txtId.setBorder(null);
			txtId.setEditable(false);
			idtxtPanel.add(txtId);
			txtPanel.add(idtxtPanel);
			
			
			JPanel nametxtPanel=new JPanel();
			txtName=sizeSettings(20);
			txtName.setBorder(null);
			txtName.setEditable(false);
			nametxtPanel.add(txtName);
			txtPanel.add(nametxtPanel);
			
			
			JPanel numbertxtPanel=new JPanel();
			txtNumber=sizeSettings(20);
			txtNumber.setBorder(null);
			txtNumber.setEditable(false);
			numbertxtPanel.add(txtNumber);
			txtPanel.add(numbertxtPanel);
			
			
			JPanel companytxtPanel=new JPanel();
			txtCompany=sizeSettings(20);
			txtCompany.setBorder(null);
			txtCompany.setEditable(false);
			companytxtPanel.add(txtCompany);
			txtPanel.add(companytxtPanel);
			
			
			JPanel salarytxtPanel=new JPanel();
			txtSalary=sizeSettings(20);
			txtSalary.setBorder(null);
			txtSalary.setEditable(false);
			salarytxtPanel.add(txtSalary);
			txtPanel.add(salarytxtPanel);
			
			
			JPanel BirthDaytxtPanel=new JPanel();
			txtBirthDay=sizeSettings(20);
			txtBirthDay.setBorder(null);
			txtBirthDay.setEditable(false);
			BirthDaytxtPanel.add(txtBirthDay);
			txtPanel.add(BirthDaytxtPanel);
			
			add("East",txtPanel);
			
			
            JPanel footerPanel = new JPanel();
            footerPanel.setLayout(new GridLayout(2, 1)); 


            

			JPanel footerRow2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
			btnHomePage = new JButton("🏠 Back To Home");
			btnHomePage.addActionListener(new ActionListener(){
				
				public void actionPerformed(ActionEvent e){
					//new MainForm().setVisible(true);
						dispose();
					
					}
				
				});
			btnHomePage.setFont(new Font("", Font.BOLD, 15));
			footerRow2.add(btnHomePage);

			footerPanel.add(footerRow2);


		  add("South",footerPanel);

			
			
		  txtName.requestFocusInWindow();
		}
		
		private static JTextField sizeSettings(int size){
			
			JTextField txt=new JTextField(size);
			txt.setFont(new Font("",1,20));
			return txt;
			
			}
		
		private static JLabel lblSettings(String txt){
			
			JLabel lbl=new JLabel(txt);
			lbl.setFont(new Font("",1,20));
			return lbl;
			
			} 

	
}


