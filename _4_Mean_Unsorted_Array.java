package tcs_Practice_array;

public class _4_Mean_Unsorted_Array {
	
	public static void main(String[] args) {
		
		int arr[] = {2,3,32,4,0};
		
		double sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		double mean=sum/arr.length;
		System.out.println(mean);
	}

}
