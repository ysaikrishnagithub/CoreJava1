package Ownpractice;

public class Fruits {
	private double fprice;  
	private String fname;  
	Fruits(double fPrice, String fName)  
	{   
	fprice = fPrice;  
	fname = fName;  
	}  
	//creating a copy constructor  
	Fruits(Fruits fruit)  
	{  
	System.out.println("\nAfter invoking the Copy Constructor:\n");  
	fprice = fruit.fprice;  
	fname = fruit.fname;  
	}  
	//creating a method that returns the price of the fruit  
	double showPrice()  
	{  
	return fprice;  
	}  
	//creating a method that returns the name of the fruit  
	String showName()  
	{  
	return fname;  
	}   
	public static void main(String args[])  
	{  
	Fruits f1 = new Fruits(399, "Ruby Roman Grapes");  
	System.out.println("Name of the first fruit: "+ f1.showName());  
	System.out.println("Price of the first fruit: "+ f1.showPrice());  
	Fruits f2 = new Fruits(f1);  
	System.out.println("Name of the second fruit: "+ f2.showName());  
	System.out.println("Price of the second fruit: "+ f2.showPrice());  
	}  
	}  

