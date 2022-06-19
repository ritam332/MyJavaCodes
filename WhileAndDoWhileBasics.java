public class WhileAndDoWhileBasics {
    public static void main(String[] args) {
        int count=6;

        do {
            System.out.println("Count Value = "+count);
            count++;
            if (count>15){
                break;
            }
        }while (count!=6);
        System.out.println("***************");
        System.out.println(isEvenNumber(7));
        int num=4;
        int lastNum=20;
        int EvenCount=0;
        while (num<=lastNum){
            num++;
            if (!isEvenNumber(num)){
                continue;
            }
            System.out.println("Even Number = "+num);
            EvenCount++;
            if (EvenCount>=5){
                break;
            }
        }
        System.out.println("Number of Even Numbers = "+EvenCount);
    }

    public static boolean isEvenNumber(int n) {
       return n%2==0;
    }
}
