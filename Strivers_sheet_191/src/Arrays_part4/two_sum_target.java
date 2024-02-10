package Arrays_part4;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class two_sum_target {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		two_sum_target tSum = new two_sum_target();
		int[] arr = {2,3,4,1};
	    List<List<Integer>> res = tSum.find(arr,5);
	    
	    for(int i=0;i<res.size();i++) {
	    	System.out.println(res.get(i));
	    }

	}

	List<List<Integer>> find(int[] arr, int target) {
		// TODO Auto-generated method stub
		
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		
		Arrays.sort(arr);
		
		int left = 0;
		int right = arr.length-1;
		
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

}
