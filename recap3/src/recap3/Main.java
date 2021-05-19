package recap3;

public class Main {

	public static void main(String[] args) {
	
		//��renci olu�turma
		StudentUser studentUser=new StudentUser();
		studentUser.setId(1);
		studentUser.setFirstName("Taner");
		studentUser.setLastName("Bar��n");
		studentUser.setEmail("tanerbarcn@gmail.com");
		
		
		//E�itmen olu�turma
		InstructorUser instructorUser=new InstructorUser();
		instructorUser.setId(1);
		instructorUser.setFirstName("Engin");
		instructorUser.setLastName("Demiro�");
		instructorUser.setEmail("engindemirog@gmail.com");
		instructorUser.setPosition("��retmen");
		
		//��renci ��lemleri Test
		StudentUserManager studentUserManager=new StudentUserManager();
		studentUserManager.create(studentUser);
		studentUserManager.delete(studentUser);
		studentUserManager.login(studentUser);
		studentUserManager.logout(studentUser);
		studentUserManager.registerCourse(studentUser, "Matematik");
		studentUserManager.add(new FileLog());
		
		System.out.println("-----------------------------------------");
		
		//E�itmen ��lemleri
		InstructorUserManager instructorUserManager=new InstructorUserManager();
		instructorUserManager.create(instructorUser);
		instructorUserManager.delete(instructorUser);
		instructorUserManager.login(instructorUser);
		instructorUserManager.logout(instructorUser);
		instructorUserManager.addPosition(instructorUser, "Fizik");
		instructorUserManager.add(new DatabaseLog());
		
	}

}
