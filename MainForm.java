import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.EmptyBorder;

class MainForm extends JFrame{
	
	private JButton btnAdd;
	private JButton btnUpdate;
	private JButton btnSearch;
	private JButton btnView;
	private JButton btnDelete;
	private JButton btnExit;
	
	private CustomerCollection customerCollection;
	
	
	
		MainForm(){
			customerCollection=new CustomerCollection();
			setSize(600,600);
			setTitle("Main Form");
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			setLocationRelativeTo(null);
			getContentPane().setBackground(Color.LIGHT_GRAY);

			
			JLabel lblText=new JLabel("Home Page",JLabel.RIGHT);
			lblText.setFont(new Font("",1,35));
			lblText.setBorder(new EmptyBorder(10,0,20,60));
			add("North",lblText);
			
			
			JPanel inputPanel=new JPanel(new GridLayout(5,1,0,30));
			
		  inputPanel.setBorder(new EmptyBorder(0,0,0,30));			
		  inputPanel.setBackground(Color.LIGHT_GRAY);
			
			btnAdd=editButtons("Add contact");
			btnAdd.addActionListener(new ActionListener(){
				
				public void actionPerformed(ActionEvent evt){
					new AddCustomerForm(customerCollection).setVisible(true);
					}
				
				});
			inputPanel.add(btnAdd);
			
			
			btnUpdate=editButtons("Update contact");
			btnUpdate.addActionListener(new ActionListener(){
				
				public void actionPerformed(ActionEvent evt){
					
					new UpdateCustomerForm().setVisible(true);
					
					}
				
				});
			inputPanel.add(btnUpdate);
			
			
			btnSearch=editButtons("Search contact");
			btnSearch.addActionListener(new ActionListener(){
				
				public void  actionPerformed(ActionEvent evt){
					new SearchCustomerForm().setVisible(true);
					
					}
				
				});
			inputPanel.add(btnSearch);
			
			
			btnDelete=editButtons("Delete contact");
			btnDelete.addActionListener(new ActionListener(){
				
				public void actionPerformed(ActionEvent evt){
					
					new DeleteCustomerForm().setVisible(true);
					
					}
				
				});
			inputPanel.add(btnDelete);
			
			
			btnView=editButtons("View contact");
			btnView.addActionListener(new ActionListener(){
				
				public void actionPerformed(ActionEvent evt){
					
					new CustomerListForm().setVisible(true);
					
					}
				
				});
			inputPanel.add(btnView);
			
			add("East",inputPanel);
			
			btnExit=new JButton("Exit");
			btnExit.setFont(new Font("",1,15));
			btnExit.setBackground(new Color(70, 130, 180)); 
			btnExit.setForeground(Color.WHITE);
			JPanel btnPanel=new JPanel(new FlowLayout(FlowLayout.RIGHT));
			btnPanel.setBackground(Color.LIGHT_GRAY);
			btnPanel.setBorder(new EmptyBorder(25,0,10,25));
			btnPanel.add(btnExit);
			add("South",btnPanel);
			
			
			ImageIcon pic=new ImageIcon("./homePagePicture.jpeg");
			Image newpic=pic.getImage().getScaledInstance(300, 300,Image.SCALE_SMOOTH);
			ImageIcon lastPic=new ImageIcon(newpic);
			JLabel lblpic=new JLabel(lastPic,JLabel.CENTER);
			add("West",lblpic);
			
			}
			
			
			
			
			private static JButton editButtons(String txt){
		
		     
            JButton btn = new JButton(txt);
            btn.setFont(new Font("", 1, 20));
            btn.setBackground(new Color(70, 130, 180)); 
            btn.setForeground(Color.WHITE);
            btn.setFocusPainted(false);
        
        return btn;
    }
	
	
	         
		
	
	
	public static void main(String [] args){
		new MainForm().setVisible(true);
		
		}
	
	}
