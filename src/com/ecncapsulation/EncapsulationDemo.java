package com.ecncapsulation;

public class EncapsulationDemo {
	/*Encapsulation: Binding variables & methods together in a class.(i.e)hiding the VARIABLES 
	 *               Variables can't be accessed by other classes.
	 *               Variables are created only through METHODS, not by objects and constructors.
	 *               Variables are read/accessed only by METHODS, not by objects.
	 *               
	 *Real time uses: For Security purpose like banking etc.
	 *
	 *3 rules:
	 *       1)Variables must be created with PRIVATE access modifier
	 *       2)For each Variables 2 methods must be created, Assign & read/access.
	 *       3)Set method(void type) for assining variables & Get method(Return type) for accessing/reading variables.
	 *       
	 *We can create SET & GET methods automatically by clicking options,
	 *        Click 'Source'-> 'Generate getters and setters'-> Select Variables -> Click 'Generate'.
	 */
	 int accno;
	 String name;
	 String bank;
	 
	 private String flowerName;
	 private int numOfFlowers;
	 private String colour;
	
	void normalMethod() {
		System.out.println(accno+" "+name+" "+bank);	
	}
	
	//Encapusulation set & get methods
	public String getFlowerName() {
		return flowerName;
	}

	public void setFlowerName(String flowerName) {
		this.flowerName = flowerName;
		
	}

	public int getNumOfFlowers() {
		return numOfFlowers;
	}

	public void setNumOfFlowers(int numOfFlowers) {
		this.numOfFlowers = numOfFlowers;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
	
}
