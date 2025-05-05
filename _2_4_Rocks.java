package tcs_Practice_array;

public class _2_4_Rocks {
	
	public static void main(String[] args) {
		
		int[] samples= {345,604,321,433,704,470,808,718,517,811};
		int[][] range= {{300,380},
				       {400,700}};
		
		int count1=0;
		int count2=0;
		for(int i=0;i<samples.length;i++) {
			
			if(samples[i]>range[0][0] && samples[i]<range[0][1]) {
				count1++;
			}
			if(samples[i]>range[1][0] && samples[i]<range[1][1]) {
				count2++;
			}
			
		}
		System.out.println(count1 + " " + count2
				);
	}

}
