package LinkedList_II;

public class Reverse_K_groups {
	ListNode head;
	static ListNode th = null;
	static ListNode tt = null;
	
	//for Node next add previous element 
	//so we can reverse the node here
	void addfirstNode(ListNode node) {
		if(th==null) {
			th = node;
			tt = node;
		}else {
			node.next = th;
			th = node;
		}
	}
	
	//finding the length of the linked here
	int length(ListNode head) {
		int len=0;
		ListNode curr = head;
		while(curr != null) {
			len++;
			curr = curr.next;
		}
		return len;
	}
	
	void find(ListNode head,int k) {
		
		if(head == null || head.next == null ||  k == 0) {
			print(head);
			return;
		}
		ListNode oh = null;
		ListNode ot = null;
		int len = length(head);
		ListNode cur = head;
		while(len >= k) {
			int tempk =k;
			while(tempk-->0) {
				ListNode forw = cur.next;
				cur.next = null;
				addfirstNode(cur);
				cur = forw;
				
			}
			if(oh==null) {
				oh = th;
				ot = tt;
			}else {
				ot.next = th;
				ot = tt;
			}
			th = null;
			tt = null;
			len-=k;
		}
		ot.next = cur;
		print(oh);
		return;
	}
	
	void print(ListNode node) {
		ListNode curr = node;
		while(curr != null) {
			System.out.print(curr.val+"->");
			curr = curr.next;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse_K_groups rK_groups = new Reverse_K_groups();
		rK_groups.head = new ListNode(1);
		rK_groups.head.next = new ListNode(2);
		rK_groups.head.next.next = new ListNode(3);
		rK_groups.head.next.next.next = new ListNode(4);
		rK_groups.head.next.next.next.next = new ListNode(5);
		rK_groups.find(rK_groups.head, 2);
		
	}
	static class ListNode{
		int val;
		ListNode next;
		ListNode(int val){
			this.val = val;
			this.next = null;
		}
	}

}
