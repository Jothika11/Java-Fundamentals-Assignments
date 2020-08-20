//import java.util.Scanner;

public class Assignment_day4 {

public static void main(String[] args) {
//   Scanner scan= new Scanner (System.in);
   int n=2468;
   int evenCount=0,oddCount=0;
   while(n>0){
	   int rem=n%10;
	   if(rem%2==0)
		   evenCount++;
	   else
		   oddCount++;
	   n=n/10;
   }
   System.out.println("Even Digit:"+evenCount);
   System.out.println("Odd Digit:"+oddCount);
   }
   

}