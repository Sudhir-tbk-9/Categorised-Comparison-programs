package object_class;
import java.util.Scanner;
public class ControllerOfEmp{
	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter the number of employees data you want to save");
		int size = sc.nextInt();
		
		Employees[] arrayEmp = new Employees[size];
		
		for(int index = 0 ; index<size ;index++) {
			System.out.println("Please fill up the details asked below");
			System.out.println("enter name");
			String name=sc.next();
			
			System.out.println("enter empid");
			int empid=sc.nextInt();
			
			System.out.println("enter contact number");
			long phone=sc.nextLong();
			
			arrayEmp[index]= new Employees(name,empid,phone);
			
		}
for (int i = 0; i < arrayEmp.length; i++) {
for (int j = i + 1; j < arrayEmp.length; j++) {
if (arrayEmp[i].empidRetrieve() == arrayEmp[j].empidRetrieve()) {
 System.out.println("=============================================================");
 System.out.println(arrayEmp[i]);
 System.out.println(arrayEmp[j]);
		                }
		            }
		        }
		    }
		}
	

	
	



//			for(int ind = 0 ; ind<arrayEmp.length ; ind++) {
//			
//			if(arrayEmp[ind].empidRetrieve()== empidlocal.empidRetrieve() );
//			System.out.println("=============================================================");
//			System.out.print(empidlocal);
//		}	