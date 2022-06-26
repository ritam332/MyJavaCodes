import java.util.Scanner;

public class ReadingInputBasic {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter your year of birth");


        boolean hasNextInt=scanner.hasNextInt();  // checks whether the input is int or not
        if (hasNextInt){
            int yearOfBirth=scanner.nextInt();
            scanner.nextLine(); //next line char (enter key)

            System.out.println("Enter your name");
            String name=scanner.nextLine();

            int age = 2022-yearOfBirth;

            if (age>=0 && age<=100){
                System.out.println("Your name is "+name+" and you are "+age+" years old");
            }else {
                System.out.println("Invalid year of birth");
            }

        } else {
            System.out.println("Unable to perse year of birth");
        }


        scanner.close();
    }
}
