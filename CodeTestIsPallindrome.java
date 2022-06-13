package codes;

public class CodeTestIsPallindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome(1221));
		System.out.println(isPalindrome(1226));
		
	}
	public static boolean isPalindrome(int n) {
		int real=n;
		int reverse=0;
		while (real!=0) {
			int lastDig=real%10;
			reverse=(reverse*10)+lastDig;
			real/=10;
		}
		return n==reverse;
		
		
	}

}
