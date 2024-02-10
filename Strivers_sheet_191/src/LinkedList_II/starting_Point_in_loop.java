package LinkedList_II;

public class starting_Point_in_loop {
	ListNode head;
	
	int find(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		ListNode nenode = head;
		
		while(fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				
				while(slow != nenode) {
					slow = slow.next;
					nenode = nenode.next;
				}
				return slow.val;
			}
			
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		starting_Point_in_loop linlist = new starting_Point_in_loop();
		linlist.head = new ListNode(1);
		linlist.head.next = new ListNode(2);
		linlist.head.next.next = new ListNode(3);
		linlist.head.next.next.next = linlist.head.next;
		System.out.println(linlist.find(linlist.head));
		

	}
	static class ListNode{
		int val;
		ListNode next;
		ListNode(int val) {
			this.val = val;
			this.next = null;
		}
	}

}
