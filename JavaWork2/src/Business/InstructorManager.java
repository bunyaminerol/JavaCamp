package Business;

import Properties.Lesson;

public class InstructorManager extends PersonManager {
		

	public void openClass(Lesson lesson) {
		System.out.println(lesson.lessonName + " sýnýfý açýldý.");
	}
	
	public void addHomework() {
		System.out.println("Ödev eklendi");
	}
	
	
	
}
