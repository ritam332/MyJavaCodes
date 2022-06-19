public class ForLoopPrimeNo {
    public static void main(String[] args) {
        System.out.println(isPrime(55));
        System.out.println(isPrime(16));
        int count=0;
        System.out.println("The Prime No.s are ");
//        for (int i=1;i<100;i++){
//            if (isPrime(i)){
//              count++;
//                System.out.println(i+" ");
//                if (count==5) {
//                    System.out.println("Exiting Loop");
//                    break;
//                }
//            }
//        }
        for (int i=10;i<=50;i++){
            if (isPrime(i)){
                count++;
                System.out.println(i+" ");
                if (count==5){
                    System.out.println("Exiting Loop");
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }
        for (int i = 2; i <=Math.sqrt(num); i++) {
            if (num % i == 0) return false;}
            return true;
        }
    }




//  Feeling Hungry? Delicious burgers at your doorstep starting from Rs49 only
//sweets in Kolkata : made with love , wedding sweets , Bengali Sweets , Juicy , Festival Sweets
//Baby Care Products : Mother's Love , Caring , mild & safe , Mother's Choice
