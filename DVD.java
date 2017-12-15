import java.io.Serializable;

public class DVD implements Serializable
{
	String Title;
	String stars[];
	String prod;
	String dir;
	String company;
	int count;
	
	
	public DVD(String title, int amtStars, String producer, String director, String pCompany, int count) {
		super();
		Title = title;
		this.stars = new String[amtStars];
		this.prod = producer;
		this.dir = director;
		this.company = pCompany;
		this.count = count;
		
	}
	
	public DVD()
	{
		Title = "Pirates of the Caribbean";
		this.count = 5;
		this.stars = new String[3];
		this.setStar("Johnny Depp", "Orlando Bloom");
		this.prod = "Jerry Bruckheimer";
		this.dir = "Gore Verbinski";
		this.company = "The Walt Disney Company";
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getStars() {
	
	
		return stars[0] + ", " + stars[1];
	}

	public void setStar(String starOne, String starTwo) {
		//add throw for no more space
		stars[0] = starOne;
		stars[1] = starTwo;
				
						
	}

	public String getProd() {
		return prod;
	}

	public void setProd(String prod) {
		this.prod = prod;
	}

	public String getDir() {
		return dir;
	}

	public void setDir(String dir) {
		this.dir = dir;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public void rent()
	{
		if(this.count != 0)
		{
			this.count--;
		}
		return;
	}
	
	public void Return()
	{
		this.count++;
		return;
	}
	
	public int checkStock()
	{
		return this.count;
	}
	
	public boolean available()
	{
		if(this.count != 0)
		{
			return true;
		}
		return false;
	}
	
	public String toString()
	{
		String toString;
		toString = " " + this.Title + ": [ " + this.count + ", " + this.getStars() + ", " + this.dir + ", " + this.prod + ", " + 
		this.company + " ]";
		return toString;
	}
}
