package com.codeprodailyquestions;

class NodeEx {
	int data;
	NodeEx next;
	NodeEx(int data) {
		this.data = data;
		this.next = null;
	}
}

/**
 * You are given two singly linked lists. The lists intersect at some node. Find, 
 * and return the node. Note: the lists are non-cyclical.
 *
 *	Example:
 *
 *	A = 1 -> 2 -> 3 -> 4
 *	B = 6 -> 3 -> 4
 *
 *  This should return 3 (you may assume that any nodes with the same value are the same node).
 * 
 * @author mrityunjaykumar
 *
 */
public class IntersectionOfLinkedLists {

	private static NodeEx head = null;
	
	private static NodeEx head2 = null;
	
	private static NodeEx addNode(int data, NodeEx headRef) {
		NodeEx node = new NodeEx(data);
		
		if(headRef == null) {
			node.next = null;
			headRef = node;
			return headRef;
		}
		
		NodeEx temp = headRef;
		while(temp.next != null) {
			temp = temp.next;
		}
		
		temp.next = node;
		return node;
	}
	
	
	private static void printNode(NodeEx headRef) {
		NodeEx temp = headRef;
		while(temp != null) {
			System.out.print(temp.data +" -> ");
			temp = temp.next;
		}
		System.out.println("NULL");
	}
	
	
	private static int checkIntesectionPoint(NodeEx head1, NodeEx head2) {
		
		NodeEx temp1 = head1;
		int intersectionData = 0;
		boolean isFound = false;
		while(temp1 != null) {
			NodeEx temp2 = head2;
			
			while(temp2 != null) {
				if(temp1 == temp2) {
					intersectionData = temp1.data;
					isFound = true;
					break;
				}
				temp2 = temp2.next;
			}
			
			if(isFound) {
				break;
			}
			temp1 = temp1.next;
		}
		
		return intersectionData;
	}
	
	public static void main(String[] args) {
		
		head = addNode(1, head);
		addNode(2, head);
		NodeEx intPoint = addNode(3, head);
		addNode(4, head);
		
		head2 = addNode(6, head2);
		head2.next = intPoint;
		
		
		printNode(head);
		printNode(head2);
		
		System.out.println("\nIntersection point: " + checkIntesectionPoint(head, head2));
		
	}

}
