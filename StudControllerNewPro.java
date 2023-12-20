package object_class;
import java.util.Scanner;
public class StudControllerNewPro {

public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the number of students data u want to save");
	int size = scan.nextInt();
	StudentNew[] array  = new StudentNew[size];
	
	for(int index = 0; index < size ;index++) {
		
		System.out.println("enter student's details");
		System.out.println("enter name");
		String name = scan.next();
		System.out.println("enter rollno");
		int rollno = scan.nextInt();
		System.out.println("enter phone no");
		long phone = scan.nextLong();
		
		array[index] = new StudentNew (name,rollno,phone);
		System.out.println("Information enter saved for this student, enter for next !!! ");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}
	
	int count = 1 ;
	int repeatedIndex = 0;
	for(int i = 0 ;i<array.length ; i++) {
		for(int j = i+1 ; j<array.length ; j++) {
		if(array[i].equals(array[j])) {
			count ++ ;
			repeatedIndex=i;

			
			System.out.println("_____________________________________________________________");
			System.out.print(array[repeatedIndex]);
			System.out.println(count + " times.");

		}
		}
	}
		
}
}
