package recap3;


public class StudentUserManager extends UserManager {
	
	@Override
	public void create(User user) 
	{
		System.out.println(user.getFirstName()+ " adl� ��renci profili olu�turuldu.");
	}

	public void delete(User user) 
	{
		System.out.println(user.getFirstName()+ " adl� ��renci profili silindi.");
	}

	public void login(User user) 
	{
		System.out.println(user.getFirstName()+ " adl� ��renci sisteme giri� yapt�.");
	}
	
	public void logout(User user) 
	{
		System.out.println(user.getFirstName()+ " adl� ��renci sistemden ��k�� yapt�i.");
	}
	
	public void registerCourse(StudentUser studentUser,String courseRegister) 
	{
		studentUser.setCourseRegister(courseRegister);
		System.out.println(studentUser.getFirstName() + " adl� ��renci "+courseRegister+" kursuna kay�t oldui.");
	}

}
