package com.kenshin;

public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int over = 0;
		ListNode head = new ListNode(0);
		ListNode body = head;

		while (l1 != null || l2 != null || over > 0) {
			int n = over;

			n += l1 != null ? l1.val : 0;
			n += l2 != null ? l2.val : 0;

			l1 = l1 != null ? l1.next : l1;
			l2 = l2 != null ? l2.next : l2;

			over = (int) n / 10;
			body.next = new ListNode(n % 10);
			body = body.next;
		}
		return head.next;
	}
}
