/*
    Problem-19: Remove Nth node from the end of the List
 
    Given a linked list, remove the n-th node from the end of list and return its head.

	Example:

	Given linked list: 1->2->3->4->5, and n = 2.

	After removing the second node from the end, the linked list becomes 1->2->3->5.
	Note: Given n will always be valid.
 */

/*
 * Solving this problem in single pass
 */

package LeetCode;

import java.util.Scanner;

public class problem19 {
	static LinkedList llist;
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the position from the end where you want the Element to be removed");
		int n = sc.nextInt();
		startExec(n);
		 
	}
	
	public static void startExec(int n) {
		
		llist.startExec();
			
		System.out.println("Before removing the element");
		llist.traverseLinkedList();
		
		Node ans = removeNthFromEnd(llist.head, n);
		System.out.println("After Removing the element");
		llist.traverseLinkedList();
		
	}
	
	public static Node removeNthFromEnd(Node head, int n) {
		if(n==1 && head.next == null){
            return null;
        }
        
        Node dummy = new Node(0);
        Node slow = dummy;
        Node fast = dummy;
        dummy.next = head;
        
        for (int i=1; i<=n+1; i++){
            fast = fast.next;
        }
        
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}
	
