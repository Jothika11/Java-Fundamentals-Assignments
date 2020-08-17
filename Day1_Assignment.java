
public class Assignment1 {
 public static void main(String[] args) {
	float price1=70;
	float price2=20;
	float price3=10;
	float taxper=18;
	float finaladd=price1+price2+price3;
	float finalamt=(taxper/100)*finaladd;
	System.out.println("Final Amount:"+finalamt);
}
}
