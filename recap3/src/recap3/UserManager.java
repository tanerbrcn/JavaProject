package recap3;


public class UserManager {

	public void create(User user) 
	{
		System.out.println("Olu�turma i�lemi ba�ar�l�!");
	}

	public void delete(User user) 
	{
		System.out.println("Silme i�lemi ba�ar�l�!");
	}

	public void login(User user) 
	{
		System.out.println("Giri� i�lemi ba�ar�l�!");
	}
	
	public void logout(User user) 
	{
		System.out.println("��k�� i�lemi ba�ar�l�!");
	}
	
public void add(Logger logger)   {
		
		logger.log();
	}
	
	
}
