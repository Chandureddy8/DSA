package Arrays_part4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class four_sum_target {
	List<List<Integer>> find1(int[] arr,int i,int j, int target) {
		// TODO Auto-generated method stub
		
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		
		Arrays.sort(arr);
		
		int left = i;
		int right = j;
		
		while(left < right) {
			if(left != 0 && arr[left] == arr[left -1]) {
				left++;
				continue;
			}
			int sum = arr[left]+arr[right];
			if(sum == target) {
				List<Integer> subarr = new ArrayList<Integer>();
				subarr.add(arr[left]);
				subarr.add(arr[right]);
				
				res.add(subarr);
				left++;
				right--;
			}
			else if(sum > target) {
				right--;
			}else {
				left++;
			}
			
		}
		return res;
	}
	
	private List<List<Integer>> find2(int[] arr,int si, int target) {
		// TODO Auto-generated method stub
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if(arr.length < 3){
			return res;
		}
		
		Arrays.sort(arr);

		int n = arr.length;
		for(int i = si;i<arr.length-3;i++) {
			if(i != 0 && arr[i]==arr[i-1]) {
				continue;
			}
			int tar = target-arr[i];
			List<List<Integer>> subres = find1(arr,i+1, n-1, tar);
			
			for(List<Integer> lis:subres) {
				lis.add(arr[i]);
				res.add(lis);
			}
		}
		
		return res;
	}
	
	private List<List<Integer>> find(int[] arr, int target) {
		// TODO Auto-generated method stub
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if(arr.length < 4){
			return res;
		}
		
		Arrays.sort(arr);

		int n = arr.length;
		for(int i = 0;i<arr.length-4;i++) {
			if(i != 0 && arr[i]==arr[i-1]) {
				continue;
			}
			int tar = target-arr[i];
			List<List<Integer>> subres = find2(arr,i+1, tar);
			
			for(List<Integer> lis:subres) {
				lis.add(arr[i]);
				res.add(lis);
			}
		}
		
		return res;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		four_sum_target tSum = new four_sum_target();
		int[] arr = {1, 2, 3, 4, 5, 9, 7, 8};
		List<List<Integer>> res = tSum.find(arr, 16);
	    
	    for(int i=0;i<res.size();i++) {
	    	System.out.println(res.get(i));
	    }

	}

}
