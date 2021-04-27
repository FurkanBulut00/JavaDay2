package day2JavaCamp;

public class Main {

	public static void main(String[] args) {
		
		
		
		Course course1 = new Course(1,"Yaz�l�mm Geliitirici Yeti�tirme Kamp� (C# + ANGULAR)", "Engin Demirog", "�cretsiz");

		Course course2 = new Course(2,"Yaz�l�mm Geliitirici Yeti�tirme Kamp� (JAVA + REACT)", "Engin Demirog", "�cretsiz");

		Course course3 = new Course(3,"Programlamaya Giri� i�in Temel Kurs", "Engin Demirog", "�cretsiz");

	Course[] courses = {course1,course2,course3};

	for(Course course :courses) {

		System.out.println(course.name);
		System.out.println(course.whoGives);
		System.out.println(course.price);
	}



	Category category1 = new Category();

	category1.id = 1;
	category1.name = "Kategori";

	Category category2 = new Category();

	category2.id = 2;
	category2.name = "E�itmen";


		Category[] categories = {category1,category2,};

		for(Category category: categories) {

			System.out.println(category.name);

		}


		CourseManager courseManager = new CourseManager();

		courseManager.joinCourse(course1);
		courseManager.joinCourse(course2);
		courseManager.joinCourse(course3);


		courseManager.leaveCourse(course1);
		courseManager.leaveCourse(course2);
		courseManager.leaveCourse(course3);

	}

}
