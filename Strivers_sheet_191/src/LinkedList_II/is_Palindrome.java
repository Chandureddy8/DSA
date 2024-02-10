package LinkedList_II;

public class is_Palindrome {
	Node head;
	
	Node midNode(Node head) {
		Node slptr = head;
		Node fastptr = head;
		while(fastptr.next != null && fastptr.next.next != null) {
			slptr = slptr.next;
			fastptr = fastptr.next.next;
		}
		return slptr;
	}
	
	Node reveseLinkedList(Node head) {
		Node prev = null;
		Node curr = head;
		Node next = null;
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			
			prev = curr;
			curr = next;
		}
		return prev;
	}
	
	boolean checkpalindrome(Node head) {
		Node mid = midNode(head);
		Node nhead = mid.next;
		mid.next = null;
		
		nhead = reveseLinkedList(nhead);
		
		Node c1 = head;
		Node c2 = nhead;
		boolean res = true;
		while(c2 != null) {
			if(c1.val != c2.val) {
				return false;
			}
			c1 = c1.next;
			c2 = c2.next;
		}
		nhead = reveseLinkedList(nhead);
		mid.next = nhead;
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		is_Palindrome pali = new is_Palindrome();
		pali.head = new Node(1);
		pali.head.next = new Node(2);
		pali.head.next.next = new Node(1);
		pali.head.next.next.next = new Node(1);
		System.out.println(pali.checkpalindrome(pali.head));

	}
	static class Node{
		int val;
		Node next;
		Node(int val){
			this.val = val;
			this.next = null;
		}
	}

}
