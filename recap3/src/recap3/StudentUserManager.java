package recap3;


public class StudentUserManager extends UserManager {
	
	@Override
	public void create(User user) 
	{
		System.out.println(user.getFirstName()+ " adlý öðrenci profili oluþturuldu.");
	}

	public void delete(User user) 
	{
		System.out.println(user.getFirstName()+ " adlý öðrenci profili silindi.");
	}

	public void login(User user) 
	{
		System.out.println(user.getFirstName()+ " adlý öðrenci sisteme giriþ yaptý.");
	}
	
	public void logout(User user) 
	{
		System.out.println(user.getFirstName()+ " adlý öðrenci sistemden çýkýþ yaptýi.");
	}
	
	public void registerCourse(StudentUser studentUser,String courseRegister) 
	{
		studentUser.setCourseRegister(courseRegister);
		System.out.println(studentUser.getFirstName() + " adlý öðrenci "+courseRegister+" kursuna kayýt oldui.");
	}

}
