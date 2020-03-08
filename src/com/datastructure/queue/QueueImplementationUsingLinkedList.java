package com.datastructure.queue;

class QueueNode {
	int data;
	QueueNode next;

	QueueNode(int data) {
		this.data = data;
		this.next = null;
	}
}

public class QueueImplementationUsingLinkedList {

	private static QueueNode front = null, rear = null;
	private static int noOfElements = 0;

	private static void enQueue(int data) {
		QueueNode node = new QueueNode(data);

		if (isEmpty()) {
			front = node;
		} else {
			rear.next = node;
		}
		rear = node;
		noOfElements++;
	}

	private static QueueNode deQueue() {

		if (isEmpty()) {
			System.out.println("Queue is empty..!");
			return null;

		} else {
			QueueNode temp = front;
			front = front.next;

			temp.next = null;
			noOfElements--;
			return temp;
		}

	}

	private static QueueNode peek() {
		return front;
	}

	private static boolean isEmpty() {
		return rear == null;
	}

	private static void traverse() {
		QueueNode temp = front;
		while (temp != null) {
			System.out.println(" " + temp.data);
			temp = temp.next;
		}
	}

	public static void main(String[] args) {

		enQueue(10);
		enQueue(20);
		enQueue(30);
		enQueue(40);
		enQueue(50);
		enQueue(60);
		enQueue(70);
		enQueue(80);
		enQueue(90);
		traverse();
		System.out.println("No of Elements: " + noOfElements);
		deQueue();
		traverse();
		System.out.println("No of Elements: " + noOfElements);
		System.out.println("Peek element: " + peek().data);
	}

}
