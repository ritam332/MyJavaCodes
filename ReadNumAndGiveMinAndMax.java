import java.util.Scanner;

public class ReadNumAndGiveMinAndMax {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        System.out.println(min + " " + max);
//        int min=0, max=0;
//        boolean flag=true; //used to avoid error of min value 0
        while (true) {
            System.out.println("Enter an integer : ");
            boolean isAnInt = scanner.hasNextInt();


            if (isAnInt) {
                int num = scanner.nextInt();
//
//                if (flag){
//                    flag=false;
//                    min=num;
//                    max=num;
//                }

                if (num > max) {
                    max = num;
                } else if (num < min) {
                    min = num;
                   }
                }
            else {
                    break;
                }
            }
            System.out.println("min= " + min + " max= " + max);
            scanner.close();
        }
    }

