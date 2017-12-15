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


}
