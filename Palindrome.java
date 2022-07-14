package weekendproj;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a ="madam";
		String rev= "";
		for (int i = a.length()-1; i>=0; i--) {
			rev=rev+a.charAt(i);
		}
		if(a.equals(rev)) {
			System.out.println("it's a palindrome");
		}
		else {
			System.out.println("its not a palindrome");
		}
		}
	}