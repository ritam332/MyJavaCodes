public class SwitchChar {
    public static void main(String[] args) {
        String Letter="e";
        switch (Letter.toUpperCase()){
            case "A":
                System.out.println("The Character is A");
                break;
            case "B":
                System.out.println("The Character is B");
                break;
            case "C":
                System.out.println("The Character is C");
                break;
            case "D":case "E":
                System.out.println("The Character is D or E");
                System.out.println("Actually it is "+Letter.toUpperCase());
                break;

            default:
                System.out.println("Character not found");

        }
    }
}
