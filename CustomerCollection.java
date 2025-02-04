class CustomerCollection{
	
	private Customer [] customerArray;
	
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
	
	
	
	}
	
	

