public class FeetAndInchToCenti {
    public static void main(String[] args) {
      calcFeetAndInchesToCentimeters(10,2);
      calcFeetAndInchesToCentimeters(67.33);

    }

    public static double calcFeetAndInchesToCentimeters(double feet,double inches) {
        if (feet<0||inches<0||inches>12){
            System.out.println("Invalid Parameters");
            return -1;
        }double centimeters=(feet*12)*2.54;
        centimeters+=inches*2.54;
        System.out.println(feet+" feet "+inches+" inches = "+centimeters+" centimeters");
        return centimeters;

    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches<0)
            return -1;

        double feet=(int)inches/12;
        double remainingInches=(int)(inches-(feet*12));
        System.out.println(inches+" inches is equal to "+ feet+ " feet and "+remainingInches+" inches");
        return calcFeetAndInchesToCentimeters(feet,remainingInches);
    }
}
