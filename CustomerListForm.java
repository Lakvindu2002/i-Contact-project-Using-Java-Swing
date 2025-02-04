import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.EmptyBorder;

class CustomerListForm extends JFrame {
    
    private JLabel lblTitle;
    private JButton btnListByname;
    private JButton btnListBySalary;
    private JButton btnListByBirthDay;
    private JButton btnHomePage;

    CustomerListForm() {
      
        setSize(500, 500);
        setTitle("Contact List");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout()); 
        
        
        JPanel titlePanel = new JPanel();
        titlePanel.setBackground(new Color(30, 144, 255)); 
        titlePanel.setPreferredSize(new Dimension(500, 60)); 
        
        lblTitle = new JLabel("📜 Contact List", JLabel.CENTER); 
        lblTitle.setFont(new Font("Arial", Font.BOLD, 28));
        lblTitle.setForeground(Color.WHITE); 
        
        titlePanel.add(lblTitle);
        add(titlePanel, BorderLayout.NORTH);
        
   
        JPanel btnPanel = new JPanel(new GridLayout(3, 1, 10, 20));
        btnPanel.setBackground(new Color(240, 248, 255)); 
        btnPanel.setBorder(new EmptyBorder(50, 50, 50, 50)); 
        
        btnListByname = btnSettings("📖 List By Name");
        btnListByname.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent evt){
				
				new SortByName().setVisible(true);

		
				}
			
			});
        btnPanel.add(btnListByname);

        btnListBySalary = btnSettings("💰 List By Salary");
        btnListBySalary.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent evt){
				
				new SortBySalary().setVisible(true);

		
				}
			
			});
        btnPanel.add(btnListBySalary);

        btnListByBirthDay = btnSettings("🎂 List By Birthday");
        btnListByBirthDay.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent evt){
				
				new SortByBirthDay().setVisible(true);

		
				}
			
			});
        btnPanel.add(btnListByBirthDay);

        add(btnPanel, BorderLayout.CENTER);
        
        
        JPanel footerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        footerPanel.setBackground(new Color(30, 144, 255)); 

        btnHomePage = new JButton("🏠 Back To Home");
        btnHomePage.setFont(new Font("", Font.BOLD, 18));
        btnHomePage.setBackground(Color.WHITE);
        btnHomePage.setForeground(Color.BLACK);
        btnHomePage.setFocusPainted(false);
        btnHomePage.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

        footerPanel.add(btnHomePage);
        add(footerPanel, BorderLayout.SOUTH);
    }
    

    private static JButton btnSettings(String txt) {
        JButton btn = new JButton(txt);
        btn.setFont(new Font("", Font.BOLD, 22));
        btn.setBackground(new Color(70, 130, 180)); 
        btn.setForeground(Color.WHITE);
        btn.setFocusPainted(false);
        
        return btn;
    }

   
    
}
