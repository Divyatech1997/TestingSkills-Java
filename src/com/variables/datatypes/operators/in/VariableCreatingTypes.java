package com.variables.datatypes.operators.in;

public class VariableCreatingTypes {
	/*Variables can be assigned by using
	 * 1)Methods
	 * 2)Constructors
	 * 3)Objects
	 */
	
	String name;
	int accno;
	String bank;
	
	void Method() {
		System.out.println(name+"  "+accno+"  "+bank);
	}
	
	void Method(String n,int an,String b) //these are local variables
	{  
		name=n;
		accno=an;
		bank=b;
		System.out.println(n+"  "+accno+"  "+bank);
	}
	
	VariableCreatingTypes(String name,String bank,int accno){
		this.name=name;  //this.name refers to variable of this class(String name;)
		this.bank=bank;
		this.accno=accno;
		
		System.out.println(name+"  "+accno+"  "+bank);
	}
	
	
	
    VariableCreatingTypes() {
		System.out.println("If we use multiple constructors, need to convert default to no-arguments constructor"
				+ " by creating constructor in class");
	}

	public static void main(String[] args) {
		VariableCreatingTypes obj = new VariableCreatingTypes();
		
		//by Objects
		obj.accno=766435432;
		obj.name="Divya";
		obj.bank="SBI";
		obj.Method();
		
		//by Methods
		obj.Method("Rajkumar", 877553323, "HDFC");
		
		//by Constructors
		VariableCreatingTypes obj1 = new VariableCreatingTypes("Radiv","Canara",889876655);
		
	}

}
