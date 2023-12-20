package object_class;
import java.util.Scanner;

class Mobile {
private String brand;
private int price;
private String nettype;

public Mobile(String brand,int price, String nettype) {
	
	this.brand = brand;
	this.price = price;
	this.nettype = nettype;
}
public int priceRevert(){
	return this.price;
}
	public String toString() {
return "Brand name is " + this.brand +" with price of " + this.price + " and network type is " + this.nettype;
	}
}

//	+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

public class MobileController {
	public static void main(String[] args) {
		Scanner scn  = new Scanner(System.in);
		System.out.println("Enter the number of Mobile's Data u want to save");
		int size = scn.nextInt();
	 	Mobile[] array= new Mobile[size];

		for(int index = 0 ; index<size ; index++) {
				System.out.println("enter mobile's details");
				System.out.println("Brand name");
				String brand = scn.next();
				
				System.out.println("enter Price");
				int price = scn.nextInt();
				
				System.out.println("enter 4G or 5G");
				String nettype = scn.next();
				
				array[index] = new Mobile(brand,price,nettype);
		}
		Mobile lowest = array[0];
		for (int index = 0 ;index<array.length;index++) {
			if(array[index].priceRevert() < lowest.priceRevert()) {
				lowest = array[index];
			}
			}	
		
		System.out.println("______________________________________________________________________________________________________________");
		System.out.println(lowest);
		}
	}


