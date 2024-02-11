package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class all_subset_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		all_subset_sum subset_sum = new all_subset_sum();
		int[] arr = {1,2,3};
		
		List<Integer> list = new ArrayList<Integer>();
		subset_sum.find(arr,0,0,list);
		Collections.sort(list);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}

	}

	private void find(int[] arr, int index,int sum,  List<Integer> list) {
		// TODO Auto-generated method stub
		if(index == arr.length) {
			list.add(sum);
			return;
		}
		find(arr, index+1, sum+arr[index], list);
		find(arr, index+1, sum, list);
		
	}

}
