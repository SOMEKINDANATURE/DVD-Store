
public class CheckedOut 
{
	CustomerType customer;
	DVD[] dvd = new DVD[5];
	int cnt = 0;
	public void CheckedOut(CustomerType cus, DVD d)
	{
		customer = cus;
		if (cnt < 5)
		{
			dvd[cnt] = d;
			cnt++;
		}
		else
		{
			System.out.println("You cant have more than 5 movies checked out at a single time");
			
		}
	}
	public void findMovie(String title)
	{
		for(int i = cnt; i > 0; i-- )
		{
			if(dvd[i].Title.equals(title))
			{
				dvd[i].Return();
				dvd[i] = null;
			}
		}
	}
	public int getCnt()
	{
		return cnt;
	}
	
	public int getId()
	{
		return customer.acct_number;
	}
	public static void printCheckedOut()
	{	Iterator<CheckedOut> itr = COlist.iterator();
		while(itr.hasNext())
		{
			itr.next().printChecked();
			
		}
	}

}
