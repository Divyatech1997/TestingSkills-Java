package com.variables.datatypes.operators.in;

public class OperatorsDemo {

	public static void main(String[] args) {
		//*Arithmetic operators            : + - */ "%"
		//Relational/ comparison operators : > < >= <= == != [result are in Boolen expression]
		//Increment/decrement operators    : ++ -- 
		//Assignment operators                  : += -= *= /= 
		//ternary/conditional operator    : ?:
		//Logical operators     : && || !
		
		//Difference between '=' and '==' operator
		//'=' is for assigning values to variables
		boolean status = true;
		System.out.println(status);
		status=false;
		System.out.println(status);
		
		//'==' is for comparision
		boolean va=true;
		int con=0;
		while(va==true) {
			System.out.println("True");
			con++;
			break;
		}
		
		
		//Arithmetic operators
		int a=89; //[a,b are operands]
		int b=90;
		System.out.println("Addition :"+(a+b) );
		System.out.println("Subraction :"+(a-b));
		System.out.println("Multiplication :"+(a*b));
		System.out.println("Division :"+(b/a)); //returns coherent value
		System.out.println("Modular division :"+(b%a)); //returns remainder value
		
		//Relational/Comparision operators
		System.out.println(a<b);
		System.out.println(a==b);
		System.out.println(a>=b);
		
		//increment/decrement operators
		int i=0;
		i++;
		System.out.println(i);
		//post Increment[first assign then increased by 1]
		int j=0;
		int re=j++;
		System.out.println(re); //assign 'j' value first,then increment.
		System.out.println(j); //'j' is incremented after assignment in re
		//pre-Increment[first increased by 1 then assign value]
		int value = 89;
		int pre_inc = ++value;
		System.out.println(pre_inc);
		System.out.println(value);
		
		//Assignment operators[Without declaring variable we can perform arithmetic operations]
		int n=4;
		n+=45;
		System.out.println(n);
		
		int n1=34;
		n1-=4;
		System.out.println(n1);
		
		int n2=78;
		n2*=2;
		System.out.println(n2);
		
		int n3=85;
		n3/=5;
		System.out.println(n3);
		
		int n4=100;
		n4%=10;
		System.out.println(n4);
		
		
		//Logical operators
		
		//&&[returns true if both values are true orelse return false]
		boolean and= true && true;
		System.out.println(and);
		
		boolean and1=false && false;
		System.out.println(" "+and1);
		
		boolean and2=true && false;
		System.out.println(and2);
		
		boolean and3=false && true;
		System.out.println(and3);
		
		// || [return true if any of the two values are true orelse return false]
		int l1=12,l2=17;
		boolean or1 = (a>b) || (a<b);
		System.out.println(" OR logic : "+or1);
		
		boolean or2=(a<=b) || (a!=b);
		System.out.println("OR logic 2 :"+or2);
		
		boolean or3 = (a>b) || (a==b);
		System.out.println(or3);
		
		// !
		int op1=34,op2=45;
		System.out.println("Opposite :"+(op1>op2));
		
		
		//Ternary/Conditional operator
		int N1=886755,N2=8775554,N3=909886;
		int large = N1>N2?N1:N2;   // [First it compare 2 numbers using '>'.If true it returns before ':' ,if false it returns after ':']
		int L = large>N3?large:N3;
		System.out.println("Largest of 3 numbers :"+L);
		System.out.println(large);
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
