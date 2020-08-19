
import java.util.Scanner;

public class Assignment_day3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(	"String1:");
		String in1 = scan.next();
		System.out.println(	"String2:");
		String in2 = scan.next();
		int length1 = in1.length();
		int length2 = in2.length();
		String last2for2 = in2.substring(length2-2, length2);
		String last2for1 = in1.substring(length1-2, length1);
		String first2for2 = in2.substring(0, 2);
		String first2for1 = in1.substring(0, 2);

		String result1 = last2for2 + in1.substring(2, length1-2) 
		+first2for2;
		String result2 = last2for1 + in2.substring(2, length1-2) 
		+first2for1;
		System.out.println("String1:"+result1);
		System.out.println("String2:"+result2);
	}

}
