package recap3;

public class Main {

	public static void main(String[] args) {
	
		//öðrenci oluþturma
		StudentUser studentUser=new StudentUser();
		studentUser.setId(1);
		studentUser.setFirstName("Taner");
		studentUser.setLastName("Barçýn");
		studentUser.setEmail("tanerbarcn@gmail.com");
		
		
		//Eðitmen oluþturma
		InstructorUser instructorUser=new InstructorUser();
		instructorUser.setId(1);
		instructorUser.setFirstName("Engin");
		instructorUser.setLastName("Demiroð");
		instructorUser.setEmail("engindemirog@gmail.com");
		instructorUser.setPosition("Öðretmen");
		
		//Öðrenci Ýþlemleri Test
		StudentUserManager studentUserManager=new StudentUserManager();
		studentUserManager.create(studentUser);
		studentUserManager.delete(studentUser);
		studentUserManager.login(studentUser);
		studentUserManager.logout(studentUser);
		studentUserManager.registerCourse(studentUser, "Matematik");
		studentUserManager.add(new FileLog());
		
		System.out.println("-----------------------------------------");
		
		//Eðitmen Ýþlemleri
		InstructorUserManager instructorUserManager=new InstructorUserManager();
		instructorUserManager.create(instructorUser);
		instructorUserManager.delete(instructorUser);
		instructorUserManager.login(instructorUser);
		instructorUserManager.logout(instructorUser);
		instructorUserManager.addPosition(instructorUser, "Fizik");
		instructorUserManager.add(new DatabaseLog());
		
	}

}
