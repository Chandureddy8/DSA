package Stacks_Queues;

public class Stack_Array {
	int size = 16;
	int[] arr = new int[size];
	int top = -1;
	
	void push(int n) {
		top++;
		arr[top] = n;
	}
	int pop() {
		int n =  arr[top];
		top--;
		return n;
		
	}
	int size() {
		return (top)+1;
	}
	int peek() {
		return arr[top];
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack_Array stack = new Stack_Array();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		System.out.println(stack.pop());
		System.out.println(stack.size());
		System.out.println(stack.peek());
	}

}
