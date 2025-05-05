package tcs_Practice_array;

public class _3_1_Binary_To_Decimal {

	public static void main(String[] args) {
		
		int n=1001;
		int sum=0;
		String s=Integer.toString(n);
		int len=s.length();
		int count=0;
		
		while(n>0) {
		int rem=n%10;	
		sum=sum + (int) (rem* Math.pow(2,count));
		count++;
		n=n/10;
		}
		System.out.println(sum);
	}
	
}
