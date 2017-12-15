
public class CustomerType extends Person
{
	int acct_number;
	String checkedOut[];
	
	/*public CustomerType() {
		super();
		this.acct_number = 1234;
		this.mWant = "Pirates of the Caribbean";
	}*/
	
	public CustomerType(String name, String address, String email, int actNumber) {
		super(name, address, email);
		acct_number = actNumber;
		
		this.checkedOut = new String[5];
	}
	public int getAcct_number() 
	{
		return acct_number;
	}
	public void setAcct_number(int n) 
	{
		this.acct_number = n;
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
	
	public String Return(String title)
	{
		for(int i = 0; i < checkedOut.length; i++)
		{
			if(checkedOut[i] == title)
			{
				checkedOut[i] = null;
				return title;
			}
		}
		return "Item has not been rented by this account.";
	}
	public String toString()
	{
		return "Name: " + this.name +  ", Address:" + this.address + ", Email:" + this.email +", " + acct_number;
	}
}
