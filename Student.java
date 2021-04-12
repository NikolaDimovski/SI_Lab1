import java.util.ArrayList<E>
class Student {
	String index;
	String firstName;
@@ -63,3 +64,13 @@ public boolean hasSignature() {
			return false;
	}
}
class Course {
	List<Student> studenti = new ArrayList<Student>();
	public boolean dodajstudent(Student student){
		if (student==null || studenti.contains(student)) {
			return false;
		}
		studenti.add(student);
		return true;
	}
}
