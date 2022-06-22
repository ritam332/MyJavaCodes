public class hello {

	 public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
				System.out.println("Enter Your year of birth : ");
		boolean hasNextInt=scanner.hasNextInt();
		if (hasNextInt) {
			int yearOfBirth=scanner.nextInt();
			scanner.nextLine();
			System.out.println("eNTER yoUR name ");
			String name=scanner.nextLine();
			int age=2022-yearOfBirth;
			
			if (age>=0 && age<=100) {
				System.out.println("Your Name Is "+name+" and your age is "+age);
				
			}else {
				System.out.println("Invalid Input");
			}
		}else {
			System.out.println("Unable to parse year of birth");
		}
		scanner.close();
	}

}
