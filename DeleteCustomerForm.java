import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;
class DeleteCustomerForm extends JFrame{
	
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
	
	
	private JButton btnDelete;
	private JButton btnCancel;
	private JButton btnHomePage;
	private JButton btnSearch;
	
	DeleteCustomerForm(){
		 
		    setSize(500,500);
			setTitle("Delete Contact");
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			setLocationRelativeTo(null);
			
			JPanel titlePanel=new JPanel(new GridLayout(2,1));
			JPanel titleRw1=new JPanel(new FlowLayout(FlowLayout.CENTER));
			titleRw1.setBackground(Color.BLUE);
			lblTitle=new JLabel("Delete Contact");
			lblTitle.setFont(new Font("",1,25));
			titleRw1.add(lblTitle);
			titlePanel.add(titleRw1);
			JPanel titleRw2=new JPanel(new FlowLayout(FlowLayout.RIGHT));
			
			txtSearch=new JTextField(20);
			txtSearch.setFont(new Font("",1,20));
			titleRw2.add(txtSearch);
			titlePanel.add(titleRw2);
			btnSearch=new JButton("Search");
			titleRw2.add(btnSearch);
			btnSearch.setFont(new Font("",1,20));
			
			add("North",titlePanel);
			
			
			txtSearch=new JTextField(20);
			
			
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
			txtId=sizeSettings(10);
			txtId.setBorder(null);
			txtId.setEditable(false);
			idtxtPanel.add(txtId);
			txtPanel.add(idtxtPanel);
			
			
			JPanel nametxtPanel=new JPanel();
			txtName=sizeSettings(20);
			txtId.setBorder(null);
			nametxtPanel.add(txtName);
			txtPanel.add(nametxtPanel);
			
			
			JPanel numbertxtPanel=new JPanel();
			txtNumber=sizeSettings(20);
			txtNumber.setBorder(null);
			numbertxtPanel.add(txtNumber);
			txtPanel.add(numbertxtPanel);
			
			
			JPanel companytxtPanel=new JPanel();
			txtCompany=sizeSettings(20);
			txtCompany.setBorder(null);
			companytxtPanel.add(txtCompany);
			txtPanel.add(companytxtPanel);
			
			
			JPanel salarytxtPanel=new JPanel();
			txtSalary=sizeSettings(20);
			txtSalary.setBorder(null);
			salarytxtPanel.add(txtSalary);
			txtPanel.add(salarytxtPanel);
			
			
			JPanel BirthDaytxtPanel=new JPanel();
			txtBirthDay=sizeSettings(20);
			txtBirthDay.setBorder(null);
			BirthDaytxtPanel.add(txtBirthDay);
			txtPanel.add(BirthDaytxtPanel);
			
			add("East",txtPanel);
			
			
            JPanel footerPanel = new JPanel();
            footerPanel.setLayout(new GridLayout(2, 1)); 


            JPanel footerRow1 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
            btnCancel = new JButton("Cancel");
            btnCancel.setFont(new Font("", Font.BOLD, 20));
			footerRow1.add(btnCancel);

			btnDelete = new JButton("Delete Contact");
			btnDelete.setFont(new Font("", Font.BOLD, 20));
			footerRow1.add(btnDelete);


			JPanel footerRow2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
			btnHomePage = new JButton("🏠 Back To Home");
			btnHomePage.setFont(new Font("", Font.BOLD, 15));
			footerRow2.add(btnHomePage);


			footerPanel.add(footerRow1);
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


