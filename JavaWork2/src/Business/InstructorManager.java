package Business;

import Properties.Lesson;

public class InstructorManager extends PersonManager {
		

	public void openClass(Lesson lesson) {
		System.out.println(lesson.lessonName + " s�n�f� a��ld�.");
	}
	
	public void addHomework() {
		System.out.println("�dev eklendi");
	}
	
	
	
}
