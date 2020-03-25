package com.codeprodailyquestions;

class NodeSt {
	int data;
	NodeSt next;
	
	NodeSt(int data) {
		this.data = data;
		this.next = null;
	}
}

/**
 * 
 * Implement a class for a stack that supports all the regular functions (push, pop) and an additional function of max() 
 * which returns the maximum element in the stack (return None if the stack is empty). Each method should run in constant time.
 *  
 * @author mrityunjaykumar
 *
 */
public class MaximumInAStack {
	
	private static NodeSt TOP = null;
	
	private static void push(int data) {
		
		NodeSt new_node = new NodeSt(data);
		new_node.next = TOP;
		TOP = new_node;
		
	}
	
	
	private static int pop() {
		int temp = TOP.data;
		TOP = TOP.next;
		return temp;
		
		
	}
	
	private static Object getMaximumData() {
		int max = Integer.MIN_VALUE;
		if(TOP == null) {
			System.out.println("Statck is Empty..!");
			return null;
		} else {
			NodeSt temp = TOP;
			while(temp != null) {
				if(temp.data > max) {
					max = temp.data;
				}
				
				temp = temp.next;
			}
		}
		
		return max;
	}
	
	private static void  showElements() {
		NodeSt temp = TOP;
		
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	public static void main(String[] args) {
		
		push(1);
		push(12);
		push(11);
		push(13);
		push(19);
		push(5);
		showElements();
		
		System.out.println("\nMax value: "+ getMaximumData());
		pop();
		showElements();
	}

}
