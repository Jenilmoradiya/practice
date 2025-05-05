package tcs_Practice_array;

public class _3_2_Decimal_To_binary {
	
	public static void main(String[] args) {
		
		int decimal=9;
		StringBuffer sf=new StringBuffer();
		
		
		while(decimal>0) {
		int rem=decimal%2;
		sf=sf.append(rem);
		decimal=decimal/2;
		}
		sf.reverse();
		int ans=Integer.parseInt(sf.toString());
		System.out.println(ans);
	}

}
