package object_class;
import java.util.Scanner;

class Student {
private String name;
private int rollno;
private long phone;

public Student(String name,int rollno, long phone) {
	
	this.name = name;
	this.rollno = rollno;
	this.phone = phone;
}
public int rollnoRevert(){
	return this.rollno;
}
	public String toString() {
return "Student's name is " + this.name +" with roll " + this.rollno + " and phone number is " + this.phone;
	}
}
//	+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
public class ControllerStud {

	public static void main(String[] args) {
	Scanner scn  = new Scanner(System.in);
	System.out.println("Enter the number of student's Data u want to save");
	int size = scn.nextInt();
	Student[] array= new Student[size];

	for(int index = 0 ; index<size ; index++) {
			System.out.println("enter student's details");
			System.out.println("enter name");
			String name = scn.next();
			System.out.println("enter rollno");
			int rollno = scn.nextInt();
			System.out.println("enter phone no");
			long phone = scn.nextLong();
			
			array[index] = new Student(name,rollno,phone);
	}
	Student largest = array[0];
	for (int index = 0 ;index<array.length;index++) {
		if(array[index].rollnoRevert() > largest.rollnoRevert()) {
			largest = array[index];
		}
		}	
	
	System.out.println("______________________________________________________________________________________________________________");
	System.out.println(largest);
	}
}

	


