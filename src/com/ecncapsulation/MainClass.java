package com.ecncapsulation;

public class MainClass {

	public static void main(String[] args) {
		EncapsulationDemo obj=new EncapsulationDemo();
		obj.accno=89654331;
		obj.name="Divya";
		obj.bank="SBI";
		obj.normalMethod();
		
		obj.setFlowerName("Sunflower");
		System.out.println(obj.getFlowerName());
		
		obj.setNumOfFlowers(12);
		System.out.println(obj.getNumOfFlowers());
		
		obj.setColour("Yellow");
		System.out.println(obj.getColour());
		
		
		

			}

}
