package com.codeprodailyquestions;

/**
 * Given a linked list of integers, remove all consecutive nodes that sum up to
 * 0.
 *
 * Example: Input: 10 -> 5 -> -3 -> -3 -> 1 -> 4 -> -4 Output: 10
 *
 * The consecutive nodes 5 -> -3 -> -3 -> 1 sums up to 0 so that sequence should
 * be removed. 4 -> -4 also sums up to 0 too so that sequence should also be
 * removed.
 * 
 * @author mrityunjaykumar
 *
 */
public class RemoveConsecutiveNodesThatSumToZero {

	private static NodeEx head;

	private static NodeEx addNode(int data) {
		NodeEx new_node = new NodeEx(data);

		if (head == null) {
			head = new_node;
			return head;
		}

		NodeEx temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}

		temp.next = new_node;
		return new_node;

	}

	private static void traverse() {
		NodeEx temp = head;

		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.print("NULL");
	}

	private static void removeConsecutiveWhoseSumToZero() {
		NodeEx temp = head;
		while (temp != null) {
			NodeEx innerTemp = temp.next;
			int sum = 0;
			boolean isSumZero = false;
			while (innerTemp != null) {
				sum += innerTemp.data;
				if (sum == 0) {
					temp.next = innerTemp.next;
					isSumZero = true;
					break;
				}

				innerTemp = innerTemp.next;
			}
			if (!isSumZero)
				temp = temp.next;
		}
	}

	public static void main(String[] args) {

		head = addNode(10);
		addNode(5);
		addNode(-3);
		addNode(-3);
		addNode(1);
		addNode(-4);
		addNode(4);
		addNode(6);
		addNode(-2);
		addNode(-4);

		traverse();

		removeConsecutiveWhoseSumToZero();
		System.out.println();
		traverse();
	}

}
