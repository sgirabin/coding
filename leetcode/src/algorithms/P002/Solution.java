package algorithms.P002;

/**
 * Definition for singly-linked list.
 */
class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

public class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		ListNode result = null;
		ListNode current = null;

		int sum = 0;
		int remain = 0;
		while (l1 != null || l2 != null) {

			int x1 = l1 == null ? 0 : l1.val;
			int x2 = l2 == null ? 0 : l2.val;

			if (current == null) {
				current = new ListNode(0);
				if (result == null) {
					result = current;
				}
			} else {
				current.next = new ListNode(0);
				current = current.next;
			}

			sum = current.val + x1 + x2 + remain;
			if (sum >= 10) {
				sum = sum - 10;
				remain = 1;
			} else {
				remain = 0;
			}

			current.val = sum;

			if (l1 != null) {
				l1 = l1.next;
			}
			if (l2 != null) {
				l2 = l2.next;
			}
		}

		if (remain != 0) {
			current.next = new ListNode(0);
			current = current.next;
			current.val = remain;
		}

		return result;

	}
}
