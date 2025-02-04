import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;
class AddCustomerForm extends JFrame{
	
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
	
	
	private JButton btnAdd;
	private JButton btnCancel;
	private JButton btnHomePage;
	public static String idNo="";
	public static int counter=1;
	private CustomerCollection customerCollection;
	
	AddCustomerForm(CustomerCollection customerCollection){
		 this.customerCollection=customerCollection;
		    setSize(500,500);
			setTitle("Add Contact");
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			setLocationRelativeTo(null);
			
			JPanel titlePanel=new JPanel(new BorderLayout());
			titlePanel.setBackground(Color.BLUE);
			lblTitle =new JLabel("Add Contact Form",JLabel.CENTER);
			lblTitle.setFont(new Font("",1,30));
			lblTitle.setForeground(Color.WHITE);
			titlePanel.add(lblTitle, BorderLayout.CENTER);
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
			txtId=sizeSettings(10);
			txtId.setBorder(null);
			txtId.setEditable(false);
			txtId.setText(generateCustomerID());
			idtxtPanel.add(txtId);
			txtPanel.add(idtxtPanel);
			
			
			JPanel nametxtPanel=new JPanel();
			txtName=sizeSettings(20);
			nametxtPanel.add(txtName);
			txtPanel.add(nametxtPanel);
			
			
			JPanel numbertxtPanel=new JPanel();
			txtNumber=sizeSettings(20);
			numbertxtPanel.add(txtNumber);
			txtPanel.add(numbertxtPanel);
			
			
			JPanel companytxtPanel=new JPanel();
			txtCompany=sizeSettings(20);
			companytxtPanel.add(txtCompany);
			txtPanel.add(companytxtPanel);
			
			
			JPanel salarytxtPanel=new JPanel();
			txtSalary=sizeSettings(20);
			salarytxtPanel.add(txtSalary);
			txtPanel.add(salarytxtPanel);
			
			
			JPanel BirthDaytxtPanel=new JPanel();
			txtBirthDay=sizeSettings(20);
			BirthDaytxtPanel.add(txtBirthDay);
			txtPanel.add(BirthDaytxtPanel);
			
			add("East",txtPanel);
			
			
            JPanel footerPanel = new JPanel(new GridLayout(2, 1));
            


            JPanel footerRow1 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
            btnCancel = btnSettings("Cancel");
            btnCancel.setFont(new Font("", Font.BOLD, 20));
			footerRow1.add(btnCancel);

			btnAdd =btnSettings("Add Contact");
			
			btnAdd.addActionListener(new ActionListener(){
				
				public void actionPerformed(ActionEvent e){
					
					String id=txtId.getText();
					String name=txtName.getText();
					String number=txtNumber.getText();
					String company=txtCompany.getText();
					double salary=Double.parseDouble(txtSalary.getText());
					String birthday=txtBirthDay.getText();
					
					Customer c1=new Customer(id,name,number,company,salary,birthday);
					
					if(customerCollection.add(c1)){
						JOptionPane.showMessageDialog(null,"Contact Added");
						txtId.setText(generateCustomerID());
						txtId.setEditable(false);
						txtName.requestFocus();
						txtName.setText("");
						txtNumber.setText("");
						txtCompany.setText("");
						txtSalary.setText("");
						txtBirthDay.setText("");
					
						
						}else{
							JOptionPane.showMessageDialog(null,"Contact Adding fail");
							
							}
					
					}
				
				});
			btnAdd.setFont(new Font("", Font.BOLD, 20));
			footerRow1.add(btnAdd);


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

		 private static JButton btnSettings(String txt) {
        JButton btn = new JButton(txt);
        btn.setFont(new Font("", Font.BOLD, 20));
        btn.setBackground(new Color(70, 130, 180)); 
        btn.setForeground(Color.WHITE);
        btn.setFocusPainted(false);
        
        return btn;
    }

	private  String generateCustomerID() {
        return String.format("B%04d", counter++);
    }	
	private  void decrementCustomerID() {
        if (counter > 1) { 
            counter--;
        }
    }	
}
