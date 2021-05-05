import Business.InstructorManager;
import Business.PersonManager;
import Business.StudentManager;
import Business.UserManager;
import Properties.Instructor;
import Properties.Lesson;
import Properties.Person;
import Properties.PhoneNumber;
import Properties.Student;
import Properties.User;

public class Main {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.firstName = "Person";
		person1.lastName = "memat";
		person1.id = 1;
		person1.username = "ahmet.memat";
		person1.password = "1243124";
		person1.email = "asdasasd@agagsas.com";
		
		Instructor instructor1 = new Instructor();
		instructor1.firstName = "Engin";
		instructor1.lastName = "Demiroð";
		instructor1.id = 2;
		instructor1.username = "engin.dem";
		instructor1.password = "123123";
		instructor1.email = "asdsad@gmail.com";
		instructor1.detail = "X asdas asY asd asd a"; 
		
		Student student1 = new Student();
		student1.firstName = "Bünyamin";
		student1.lastName = "Türkkan";
		student1.id = 3;
		student1.username = "sadsdsad";
		student1.password = "asdasd";
		student1.email = "asdasd";
		student1.school = "assdasda";
		
		User user1 = new User();
		user1.firstName = "User";
		user1.lastName = "asdsdasad";
		user1.id = 4;
		user1.username = "asasdsda";
		user1.password = "asdasdsda";
		user1.email = "asdasdsad";
		user1.userBiseyi = "sadsdsad";
		
		Lesson lesson1 = new Lesson();
	    lesson1.lessonName = "C# dersi";
	    lesson1.lessonId = 123213;
	    
	    PhoneNumber phoneNumber1 = new PhoneNumber();
	    phoneNumber1.phoneNumber = "0555 555 55 55";
	    
	    PhoneNumber phoneNumber2 = new PhoneNumber();
	    phoneNumber2.phoneNumber = "0555 123 12 12";
	    
	    PhoneNumber phoneNumber3 = new PhoneNumber();
	    phoneNumber3.phoneNumber = "0599 999 99 99";
	    
		
		
		PersonManager personManager1 = new PersonManager();
		personManager1.addPersonPhoneNumber(person1, phoneNumber1);
		
		InstructorManager instructorManager1 = new InstructorManager();
		instructorManager1.addHomework();
		instructorManager1.openClass(lesson1);
		instructorManager1.addPersonPhoneNumber(instructor1, phoneNumber3);
		
		StudentManager studentManager1 = new StudentManager();
		studentManager1.addPersonPhoneNumber(student1, phoneNumber2);
		studentManager1.registerLesson();
		
		UserManager userManager1 = new UserManager();
		userManager1.beStudent(user1);
		
				
	}

}
