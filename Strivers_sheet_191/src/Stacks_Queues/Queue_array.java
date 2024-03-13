package Stacks_Queues;

public class Queue_array {
	int size = 10;
	
	int[] arr = new int[size];
	
	int start = -1;
	int end = -1;
	int currsize = 0;
	
	void push(int n) {
		if(end == -1) {
			start  = 1;
			end =1;
		}else {
			end = end+1 % size;
		}
		arr[end] = n;
		currsize++;
		
	}
	
	int pull() {
		if(start == -1) {
			return 0;
			
		}
		int poped = arr[start];
		if(currsize == 1) {
			start = -1;
			end = -1;
		}else {
			start = start+1 % size;
		}
		currsize--;
		return poped;
	}
	
	int size() {
		return currsize;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue_array que = new Queue_array();
		que.push(1);
		que.push(2);
		que.push(3);
		System.out.println(que.pull());
		System.out.println(que.pull());
		System.out.println(que.size());
	}

}
