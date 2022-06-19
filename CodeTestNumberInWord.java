public class CodeTestNumberInWord {
    public static void main(String[] args) {
            printNumberInWord(6);
    }

    public static void printNumberInWord(int number) {
        if (number==0) System.out.println("Zero");
        else if (number==1) System.out.println("ONE");
        else if (number==2) System.out.println("TWO");
        else if (number==3) System.out.println("THREE");
        else if (number==4) System.out.println("FOUR");
        else if (number==5) System.out.println("FIVE");
        else if (number==6) System.out.println("SIX");
        else if (number==7) System.out.println("SEVEN");
        else if (number==8) System.out.println("EIGHT");
        else if (number==9) System.out.println("NINE");
        else System.out.println("OTHER");
    }

}


//    Write a
//    method called
//    printNumberInWord.The method
//    has one
//    parameter number
//    which is
//    the whole
//    number.The method
//    needs to print"ZERO","ONE","TWO",..."NINE","OTHER"if the int parameter number is
//    0,1,2,.... 9or other for any
//    other number including negative numbers.\
//    You can use if-else statement or switch statement whatever is easier for you.
//
//
//        NOTE:Method printNumberInWord needs to be public static for now,we are
//        only using static methods.
//
//        NOTE:Do not add main method to solution code.

