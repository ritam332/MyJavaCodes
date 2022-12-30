package Codes;

import java.util.Scanner;

public class jump {

	public static void main(String[] args) {
//		for(int i = 1;i<=10;i++) {
//			if(i==5)  continue;
//			System.out.print(i+" ");
		
		int a,b,c;
		char ch;
		System.out.println("Enter two numbers...");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		System.out.println("Enter your choice");
		ch=s.next().charAt(0);
		switch (ch) {
		case '+' : 
			
			System.out.println(a+b);
			  break;
		
        case '/' : 
			
			System.out.println(a/b);
			  break;
		
       case '-' : 
	
	      System.out.println(a-b);
	        break;

       case '*' : 
	
	      System.out.println(a*b);
	        break;

		default:
			System.out.println("Please try again");
			
			
			
		}
		}
	}


