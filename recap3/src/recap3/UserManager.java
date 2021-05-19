package recap3;


public class UserManager {

	public void create(User user) 
	{
		System.out.println("Oluþturma iþlemi baþarýlý!");
	}

	public void delete(User user) 
	{
		System.out.println("Silme iþlemi baþarýlý!");
	}

	public void login(User user) 
	{
		System.out.println("Giriþ iþlemi baþarýlý!");
	}
	
	public void logout(User user) 
	{
		System.out.println("Çýkýþ iþlemi baþarýlý!");
	}
	
public void add(Logger logger)   {
		
		logger.log();
	}
	
	
}
