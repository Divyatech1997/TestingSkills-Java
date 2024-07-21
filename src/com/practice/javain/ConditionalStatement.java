package com.practice.javain;

public class ConditionalStatement {
	
	String my_birthDay="7.8.1997";
	String my_son_birthdate="8.4.2022";
	String my_son_birthday="Friday";
	
	String elder="Raju";
	String younger="Divya";
	String child="Radiv";
	
	public void method_if() {
	//if
	if(my_birthDay.equals("4"))
	{
		System.out.println("Thursday");
	}else {
		System.out.println("not Thursday");
	}
	}
	
	//if else if
	public void method_if_e_if() {
		if(my_birthDay.equals("7.8.1997")) {
			System.out.println("It's a Mother's birthday");
		}else{
			System.out.println("It's not a Mother's birthday");
		}if(my_son_birthdate.equals("8.4.2022")) {
			if(my_son_birthday.equals("Tuesday")) {
				System.out.println("It's my son's birthday");
			}else {
				System.out.println("It's not my son's birthday and date is right");
			}
				
			}else {
				System.out.println("It's not my son's birthdate");
			
		}
	}

	//Switch case
	public void switchCase(String anotherChild,String AnotherName ) {
	
	switch(elder){
	case "Raju" :
		if(younger.equalsIgnoreCase(AnotherName)) {
			System.out.println(younger+" is a "+elder+"'s wife");
			if(child.equalsIgnoreCase(anotherChild)) {
				System.out.println(child+" is the couple's son");
			}else {
				System.out.println(anotherChild+" is not the couple's son");
			}
		}else {
			System.out.println(AnotherName+" is not a " +elder+"'s wife");
			
			}
		break;
		
	case "Kumar":
		System.out.println("Kumar is not a family member");
		break;
	default:
		System.out.println("Invalid input");
		
		
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConditionalStatement obj=new ConditionalStatement();
		obj.method_if();
		obj.method_if_e_if();
		obj.switchCase("Radiv", "Divya");
	}

}
