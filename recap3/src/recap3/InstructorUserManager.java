package recap3;


public class InstructorUserManager extends UserManager{
	@Override
	public void create(User user) 
	{
		System.out.println(user.getFirstName()+ " adlý eðitmen profili oluþturuldu.");
	}

	public void delete(User user) 
	{
		System.out.println(user.getFirstName()+ " adlý eðitmen profili silindi.");
	}

	public void login(User user) 
	{
		System.out.println(user.getFirstName()+ " adlý eðitmen sisteme giriþ yaptý.");
	}
	
	public void logout(User user) 
	{
		System.out.println(user.getFirstName()+ " adlý eðitmen sistemden çýkýþ yaptýi.");
	}
	
	public void addPosition(InstructorUser instructorUser, String position) 
	{
		instructorUser.setPosition(position);
		System.out.println(instructorUser.getFirstName() + " adlý eðitmen pozisyonunu "+position+" olarak ekledi.");
	}


	

}
