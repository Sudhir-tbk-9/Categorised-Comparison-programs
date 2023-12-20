package object_class;

public class StudentNew {

	String name;
	int rollno;
	long phone;
	public StudentNew(String name, int rollno, long phone) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.phone = phone;
	
	}		
	@Override
public boolean equals(Object obj  ) {

		StudentNew stud = (StudentNew) obj  ;
		
		return this.rollno==stud.rollno && this.phone == stud.phone && this.name.equals(stud.name);
	}
	
public String toString() {
		return "Student name " + this.name +" with roll " + this.rollno + " and phone number " + this.phone + " being saved ";
					}
	
}
