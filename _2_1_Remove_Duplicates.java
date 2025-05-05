package tcs_Practice_array;

import java.util.HashSet;

public class _2_1_Remove_Duplicates {
	
	public static void main(String[] args) {
		
		int[] a= {2,3,3,9,3,2,1,3,9};
		HashSet hs=new HashSet();
		int count=0;
		
		for(int i=0;i<a.length;i++) {
			if(!hs.contains(a[i])) {
				hs.add(a[i]);
				a[count]=a[i];
				count++;
			}
		}
		int[] newarr=new int[count];
		for(int i=0;i<newarr.length;i++) {
			newarr[i]=a[i];
			System.out.println(newarr[i]);
		}
		
		
	}

}
