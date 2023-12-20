package object_class;

public class Employees {
	
String name ;
int empid ; 
long phone ;
		 
		
public Employees(String name, int empid, long phone) {
			
			this.name = name;
			this.empid = empid;
			this.phone = phone;
		
	}
	public int empidRetrieve() {
			return this.empid ;
			
		}
	public String toString() {
			return "Employee name " + this.name +" with empid " + this.empid + " and phone number  " + this.phone + " being saved with same employee identity number.";
				}

			
		}
	
		


