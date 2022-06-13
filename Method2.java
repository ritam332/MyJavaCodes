public class Method2 {
    public static void main(String[] args) {
        checkNumber(-15);
        checkNumber(0);
        long speed=toMilesPerHour(12.00d);
        System.out.println(speed);
    }
    public static void checkNumber(int number){

        if (number>0){
            System.out.println("positive");
        } else if (number==0) {
            System.out.println("zero");

        }else System.out.println("negative");
    }
    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour<0){
            return -1;
        }

         return Math.round(kilometersPerHour/1.609);
    }
}
