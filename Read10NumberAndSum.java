import java.util.Scanner;

public class Read10NumberAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count=0, sum=0;
//        while (true){
        while (count<10){
            int order = count+1;
            System.out.println("Enter Number #"+order+" : ");

            boolean isAnInt= scanner.hasNextInt();
            if (isAnInt){
                int num=scanner.nextInt();
                sum+=num;
                count++;
//                if (count==10){
//                    break;
//                }
            }else{
                System.out.println("Invalid input");
            }
            scanner.nextLine();// handle end of line (enter key)
        }
        System.out.println("Sum = "+sum);
    scanner.close();
    }
}


