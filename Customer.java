class Customer{
	
	private String id;
	private String name;
	private String number;
	private String company;
	private String birthday;
	private double salary;
	
	
	Customer(){}
	Customer(String id,String name,String number,String company,double salary,String birthday){
		
		this.id=id;
		this.name=name;
		this.number=number;
		this.company=company;
		this.salary=salary;
		this.birthday=birthday;
		
		}
		
		public String getId(){
			
			return id;
			}
		public String getName(){
			
			return name;
			}
			
		public String getNumber(){
			
			return number;
			}		
		public String getCompany(){
			
			return company;
			}
		public double getSalary(){
			
			return salary;
			}	
			
		public String getBirthDay(){
			
			return birthday;
			}
			
		public void setId(String id){
			
			this.id=id;
			}		
		public void setName(String name){
			this.name=name;
			
			}		
		public void setNumber(String number){
			
			this.number=number;
			}		
		public void setCompany(String company){
			this.company=company;
			}		
		public void setSalary(double salary){
			this.salary=salary;
			}		
		public void setBirthDay(String birthday){
			this.birthday=birthday;
			}		
	
	
	}
