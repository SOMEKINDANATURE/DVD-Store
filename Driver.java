import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
public class Driver {
	static LinkedPositionalList<DVD> DVDList = new LinkedPositionalList<DVD>();
	public static void main(String[] args) 
	{

		
		LinkedPositionalList<Integer> temp = new LinkedPositionalList<>( );
		
		
		
	}
	public static void serializeDVD(LinkedPositionalList<DVD> e)
    	{
		Position<DVD> cursor = e.first();
		ArrayList<DVD> dvd = new ArrayList<DVD>();
        
		while (cursor != null)
       {
			dvd.add(cursor.getElement( ));
        	cursor = e.after(cursor);
        
        }
  
        
           try
            {   
                //Saving of object in a file
                FileOutputStream file = new FileOutputStream("DVDList.txt");
                ObjectOutputStream out = new ObjectOutputStream(file);
                 
                // Method for serialization of object
                out.writeObject(dvd);
                 
                out.close();
                file.close();
                 
                System.out.println("Object has been serialized");
    
            }
             
            catch(IOException ex)
            {
                System.out.println("IOException is caught");
            }
    
    }
 	public static void deserializeDVD()
    	{    
    		
    	
        
        	try
		{   
            	// Reading the object from a file
            	FileInputStream file = new FileInputStream("DVDList.txt");
            	ObjectInputStream in = new ObjectInputStream(file);
             
            	// Method for deserialization of object
            	ArrayList<DVD> dvd = (ArrayList<DVD>)in.readObject();
            for(int i = 0; i < dvd.size(); i++)
            {
            	DVDList.addFirst(dvd.get(i));
            }
            in.close();
            file.close();
             
            System.out.println("Object has been deserialized ");

        }
         
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
         
        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }
       
    }
	  public static void serializeCus(LinkedPositionalList<CustomerType> e)
     {
 		Position<CustomerType> cursor = e.first();
 		ArrayList<CustomerType> cus = new ArrayList<CustomerType>();
         
 		while (cursor != null)
        {
 			cus.add(cursor.getElement( ));
         	cursor = e.after(cursor);
         
        }       
            try
             {   
                 //Saving of object in a file
                 FileOutputStream file = new FileOutputStream("customers.txt");
                 ObjectOutputStream out = new ObjectOutputStream(file);
                  
                 // Method for serialization of object
                 out.writeObject(cus);
                  
                 out.close();
                 file.close();
                  
                 System.out.println("Object has been serialized");
     
             }
              
             catch(IOException ex)
             {
                 System.out.println("IOException is caught");
             }
     
     }
     public static void deserializeCus()
     {    
   	
         
         try
         {   
             // Reading the object from a file
             FileInputStream file = new FileInputStream("customers.txt");
             ObjectInputStream in = new ObjectInputStream(file);
              
             // Method for deserialization of object
             ArrayList<CustomerType> cus = (ArrayList<CustomerType>)in.readObject();
             for(int i = 0; i < cus.size(); i++)
             {
             	cuslist.addFirst(cus.get(i));
             }
             in.close();
             file.close();
              
             System.out.println("Object has been deserialized ");

         }
          
         catch(IOException ex)
         {
             System.out.println("IOException is caught");
         }
          
         catch(ClassNotFoundException ex)
         {
             System.out.println("ClassNotFoundException is caught");
         }
	  
 }
		public static void addDvd()
	{
		DVD pulpFiction = new DVD("Pulp Fiction",2,"Harvey Weinstein"," Quentin Tarantino", "Miramax", 5);
		pulpFiction.setStar("Bruce Willis");
		pulpFiction.setStar("Uma Thruman");
	
		DVD starWars = new DVD("Star Wars",2,"Gary Kurtz","George Lucas", "20th Century Fox", 3);
		starWars.setStar("Mark Hammil");
		starWars.setStar("Harrison Ford");	
		DVD clerks = new DVD("Clerks",2,"Scott Mosier","Kevin Smith", "Askew", 2);
		clerks.setStar("Brian O'Halloran");
		clerks.setStar("Jeff Anderson");
		DVD paulBlart = new DVD("Paul Blart",2,"Barry Bernadi","Steve Carr", "Columbia", 4);
		paulBlart.setStar("Kevin James");
		paulBlart.setStar("Keit O'Donnell");

		DVD piratesCarribean = new DVD();
		DVDList.addFirst(pulpFiction);
		DVDList.addLast(starWars);
		DVDList.addLast(clerks);
		DVDList.addLast(paulBlart);
		DVDList.addLast(piratesCarribean);
		
	}
	public static void addCus()
	{
		CustomerType jack = new CustomerType("Jack","8778 wallaby way, Sydney", "Jack.Rowell95@gmail.com", 1998);
		CustomerType Curt = new CustomerType("Curt","2032 Joel dr, Muskego", "Curt.Cherti95@gmail.com", 5085);
		CustomerType Jason = new CustomerType("Jason","1111 Fake st, Hollywood", "Jason.Poole95@gmail.com", 2018);
		CustomerType Nate = new CustomerType("Nate","1989 old st, forgotten", "Nate.Rolbiecki@gmail.com", 1372);
		CustomerType Kyle = new CustomerType("Kyle","2020 vision way, vision", "Kyle.Endl@gmail.com",3675);
		cuslist.addFirst(jack);
		cuslist.addLast(Curt);
		cuslist.addLast(Jason);
		cuslist.addLast(Nate);
		cuslist.addLast(Kyle);
	}


}
