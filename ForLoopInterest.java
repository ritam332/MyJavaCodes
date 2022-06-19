public class ForLoopInterest {
    public static void main(String[] args) {
        for (int i=2;i<9;i++){
            System.out.println("10,000 at "+i+" % interest " +
                    String.format("%.1f", calculateInterest(100000.0,i)));
        }
        System.out.println(String.format("%.3f",calculateInterest(15000,20)));
    }
    public static double calculateInterest(double amount, double interestRate){
        return (amount*(interestRate/100));

    }
    

}
