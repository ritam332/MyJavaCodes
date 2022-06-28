import java.util.Scanner;

public class MaxOf3 {

	public static void main(String[] args) {
	 Scanner scanner=new Scanner(System.in);
	 //Method 1..............
	 System.out.println("Enter 4 integers");
	 int a=scanner.nextInt(),b=scanner.nextInt(),c=scanner.nextInt(),d=scanner.nextInt(),max,min;
	 max=a;
	 min=a;
	 if (b>max) max=b;  if (c>max) max=c;  if (d>max) max=d;
	 if(b<min) min=b;  if(c<min) min=c;  if(d<min) min=d;
	 System.out.println("Max = "+max+" and Min = "+min);
	 MaxAndMin();
	 scanner.close();
	}
	//Method 2................
	public static void MaxAndMin() {
		int a ; int max; int min;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter 1st no...");
		a=scanner.nextInt();
		max=a; min=a;
		System.out.println("Enter 2nd no...");
		a=scanner.nextInt();
		if (a>max) max=a;  if(a<min) min=a;
		System.out.println("Enter 3rd no...");
		a=scanner.nextInt();
		if (a>max) max=a;  if(a<min) min=a;
		System.out.println("Enter 4th no...");
		a=scanner.nextInt();
		if (a>max) max=a;  if(a<min) min=a;
		System.out.println("Max = "+max+" and Min = "+min);
		scanner.close();
	}
}
