
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Kurslar");
			
		Courses course1 = new Courses("C# geliştirci kampı", 12);
		
		
		Courses course2 = new Courses("Java geliştirici Kampı", 23);
		
		Courses[] courses = {course1, course2};
		
		for (Courses course : courses) {
			System.out.println(course.courseName);
		}
			System.out.println("--------------------------");
		System.out.println("Kategoriler"
				+ "");
			
		Category category1 = new Category();
		category1.Id =1;
		category1.name = "Programlama";
		
		Category category2 = new Category();
		category2.Id =2;
		category2.name = "Yönetim";
		
		Category[] categories = {category1,category2};
		
		for (Category category : categories) {
			System.out.println(category.name);
		}
		System.out.println("-----------------");
		System.out.println("Eğitmenler"
				+ "");
		
		Teacher teacher1 = new Teacher();
		teacher1.id=111;
		teacher1.name="Engin Demiroğ";
		teacher1.detail="X üniversitesinden Y senesinde mezun oldu.";
		
		Teacher teacher2 = new Teacher();
		teacher2.id=121;
		teacher2.name="Enginn Hoca";
		teacher2.detail="A üniversitesinden B senesinde mezun oldu.";
		
		Teacher[] teachers = {teacher1, teacher2};
		
		for (Teacher teacher : teachers) {
			System.out.println(teacher.name+" : "+teacher.detail);
		}
		
		
		
	}

}
