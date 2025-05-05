package tcs_Practice_array;

import java.util.HashSet;

public class _11_Subset_Array {
	
	public static void main(String[] args) {
		
		int[] arr1= {23,2,4,32,2};
		int[] arr2= {2,4};
		
		HashSet hs=new HashSet();
		
		for(int i=0;i<arr2.length;i++) {
			
			for(int j=0;j<arr1.length;j++) {
				
				if(arr2[i]==arr1[j]) {
					if(hs.contains(arr1[j])) {
						break;
					}
					else {
						hs.add(arr1[j]);
					}
				}
			}
		}
		System.out.println(hs);
		
	}

}
