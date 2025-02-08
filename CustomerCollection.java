
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
class CustomerCollection{
	
	public Customer [] customerArray;
	
	CustomerCollection(){
		customerArray=new Customer[0];
		
		}
	private void extendArray(){
		
		Customer [] tArray=new Customer[customerArray.length+1];
		for(int i=0;i<customerArray.length;i++){
			
			tArray[i]=customerArray[i];
			
			}
			customerArray=tArray;
		
		}	
	
	
	public boolean add(Customer c1){
		
		extendArray();
		customerArray[customerArray.length-1]=c1;
		
		return true;
		
		}
	
	public int size(){
		
		return(customerArray.length);
		}
	
	public Customer search(String id){	
		for(int i=0;i<customerArray.length;i++){
			
			if(id.equalsIgnoreCase(customerArray[i].getId())){
				
				return customerArray[i];
				
				}
			
			}
			return null;
		
		}

	
	public int search(Customer c1){
		
		for(int i=0;i<customerArray.length;i++){
			
			if(c1.getId().equalsIgnoreCase(customerArray[i].getId())){
				
				return i;
				
				}
			
			}
		
		return -1;
		}
	
	public boolean update(Customer c1){
		
		int index=search(c1);
		if(index!=-1){
			
			customerArray[index]=c1;
			return true;
			
			}
		return false;
		}
	
	
	public boolean removeNumber(Customer c1){
		
		int index=search(c1);
		
		if(index!=-1){
			
			Customer [] tArray=new Customer[customerArray.length-1];
			
			for(int i=index;i<customerArray.length-1;i++){
				
				customerArray[i]=customerArray[i+1];
				
				}
				
				for(int i=0;i<tArray.length;i++){
					tArray[i]=customerArray[i];
					}
				
				customerArray=tArray;
				
				return true;
			
			}
			return false;
		}
	
	public boolean numberValidation(String number){
		
		if(number.length()==10 && number.charAt(0)=='0'){
			return true;
			
			}
			return false;
		
		}
	
	public  boolean birthdayValidation(String birthDay){
	 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        try {
            
            LocalDate birthDate = LocalDate.parse(birthDay, formatter);

            
            LocalDate today = LocalDate.now();

            
            if (!birthDate.isAfter(today) && birthDate.isAfter(today.minusYears(100))) {
                return true;
            }
        } catch (DateTimeParseException e) {
            
        }

        return false; 
	
	}	
	
	public void sortByname(){
		
		for(int i=0;i<customerArray.length-1;i++){
			
			for(int j=0;j<customerArray.length-(i+1);j++){
				
				if(customerArray[j].getName().compareTo(customerArray[j+1].getName())>0){
						Customer temp=customerArray[j];
						customerArray[j]=customerArray[j+1];
						customerArray[j+1]=temp;
					}
				
				}
			
			}
		
		}
	
	
	public Customer get(int index){
		
		if(index>=0 && index<customerArray.length){
			return customerArray[index];
			}
		return null;
		}
	
	public void sortBySalary(){
		for(int i=0;i<customerArray.length-1;i++){
			
			for(int j=0;j<customerArray.length-(i+1);j++){
				
				if(customerArray[j].getSalary()>customerArray[j+1].getSalary()){
						
						Customer temp=customerArray[j];
						customerArray[j]=customerArray[j+1];
						customerArray[j+1]=temp;
					
					}
				
				}
			
			}
		
		}
	
	public  void sortByBirthDay(){
	
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	for(int i=0;i<customerArray.length-1;i++){
		
		for(int j=0;j<customerArray.length-(i+1);j++){
			
			try{
				Date date1=dateFormat.parse(customerArray[j].getBirthDay());
				Date date2=dateFormat.parse(customerArray[j+1].getBirthDay());
				
				if(date1.after(date2)){
				
					Customer temp=customerArray[j];
					customerArray[j]=customerArray[j+1];
					customerArray[j+1]=temp;
				
				}
			
				
				
				}catch (ParseException e) {
                    throw new RuntimeException(e);
                }
			
			
			}
		
		}

	}
}	
	

