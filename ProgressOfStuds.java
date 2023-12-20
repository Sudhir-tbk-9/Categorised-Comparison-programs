package object_class;

import java.util.Scanner;

class Studpro{
	
	String name;
	int rollno;
	long phone;
	
	public Studpro(String name,int rollno, long phone) {
		
		this.name = name;
		this.rollno = rollno;
		this.phone = phone;
	}
		public String toString() {
	return "Student name " + this.name +" with roll " + this.rollno + " and phone number  " + this.phone + " has secured highest marks that is ";
		}
	}
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
public class ProgressOfStuds {

	public static void main(String[] args) {
		Scanner scn  = new Scanner(System.in);
		System.out.println("Enter the number of student's Data u want to save");
		int size = scn.nextInt();
		Studpro[] arrayStudDetails= new Studpro[size];
		int[][] marks = new int [size][5];
		
		for(int index = 0 ; index<size ; index++) {
			System.out.println("enter student's details");
			System.out.println("enter name");
			String name = scn.next();
			System.out.println("enter rollno");
			int rollno = scn.nextInt();
			System.out.println("enter phone no");
			long phone = scn.nextLong();
		
arrayStudDetails[index] = new Studpro(name,rollno,phone);
			
				System.out.println("Now, enter student's marks details for all the 5 subjects.");
				System.out.println("enter marks in English ");
				marks[index][0] = scn.nextInt();
				System.out.println("enter marks in Economics ");
				marks[index][1] = scn.nextInt();
				System.out.println("enter marks in Accountancy ");
				marks[index][2] = scn.nextInt();
				System.out.println("enter marks in Business Studies ");
				marks[index][3] = scn.nextInt();
				System.out.println("enter marks in Informatic practices ");
				marks[index][4] = scn.nextInt();
				
		}
//		CODE TO FIND THE THE STUDENT WITH HIGHEST MARKS..
		int highest = marks[0][0]+ marks[0][1]+ marks[0][2]+ marks[0][3]+ marks[0][4]; 
		int highestIndex = 0;
		for (int i = 1 ; i<size;i++) {
			int totalMarks = marks[i][0]+ marks[i][1]+ marks[i][2]+ marks[i][3]+ marks[i][4];
			if(totalMarks> highest) {
				highest = totalMarks;
				highestIndex = i;
			}
			}	
		
		System.out.println("______________________________________________________________________________________________________________");
		System.out.print(arrayStudDetails[highestIndex]);
		System.out.println(highest + " out of 500.");
		}
}

