import java.text.DecimalFormat;
import java.util.Scanner;

public class CodeTest027InputCalculator {
    public static final DecimalFormat df =new DecimalFormat("0.0");
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();

    }

//        public static void inputThenPrintSumAndAverage(){
//            Scanner scanner=new Scanner(System.in);
//            int a,sum=0; double average=0, count=0;
//            while (true){
//                boolean isAnInt=scanner.hasNextInt();
//                if(isAnInt){
//                    count++;
//                    int number= scanner.nextInt();
//                    sum+=number;
//                    average=Math.round((double) sum/ (double) count);
//
//                }else{break;}
//            }
//
//
//            System.out.print("SUM = "+sum+" AVG = ");
//            System.out.format("%.0f",average);
//            scanner.close();
//        }

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner=new Scanner(System.in);
        int number,sum=0, average=0, count=0;
        while (true){
            boolean isAnInt=scanner.hasNextInt();
            if(isAnInt){
                count++;
                 number= scanner.nextInt();
                sum+=number;
                average=sum/count;

            }else{break;}
        }


        System.out.print("SUM = "+sum+" AVG = "+average);

        scanner.close();
    }
}
