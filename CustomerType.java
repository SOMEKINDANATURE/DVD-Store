
public class CustomerType extends Person
{
	int acct_number;
	String checkedOut[];
	
	/*public CustomerType() {
		super();
		this.acct_number = 1234;
		this.mWant = "Pirates of the Caribbean";
	}*/
	
	public CustomerType(String name, String address, String email) {
		super(name, address, email);
		this.acct_number = 0;
		
		this.checkedOut = new String[5];
	}


	public int getAcct_number() 
	{
		return acct_number;
	}


	public void setAcct_number() 
	{
		this.acct_number = 1234;
	}

//Needs exception for full array
	public String Rent(String title)
	{
		for(int i = 0; i < checkedOut.length; i++)
		{
			if(checkedOut[i] == null)
			{
				checkedOut[i] = title;
			}
		}
		return title;
	}
	
	
}
