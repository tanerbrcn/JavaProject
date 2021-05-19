package recap3;


public class InstructorUserManager extends UserManager{
	@Override
	public void create(User user) 
	{
		System.out.println(user.getFirstName()+ " adl� e�itmen profili olu�turuldu.");
	}

	public void delete(User user) 
	{
		System.out.println(user.getFirstName()+ " adl� e�itmen profili silindi.");
	}

	public void login(User user) 
	{
		System.out.println(user.getFirstName()+ " adl� e�itmen sisteme giri� yapt�.");
	}
	
	public void logout(User user) 
	{
		System.out.println(user.getFirstName()+ " adl� e�itmen sistemden ��k�� yapt�i.");
	}
	
	public void addPosition(InstructorUser instructorUser, String position) 
	{
		instructorUser.setPosition(position);
		System.out.println(instructorUser.getFirstName() + " adl� e�itmen pozisyonunu "+position+" olarak ekledi.");
	}


	

}
