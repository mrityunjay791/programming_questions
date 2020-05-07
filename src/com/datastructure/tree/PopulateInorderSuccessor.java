package com.datastructure.tree;

import java.util.LinkedList;
import java.util.Queue;

class TreeNodeWithExtraPointer {
	int data;
	TreeNodeWithExtraPointer next, left, right;

	TreeNodeWithExtraPointer(int data) {
		this.data = data;
		next = left = right = null;
	}
}

/**
 * This class will be used to populate in-order successor.
 * 
 * @author mrityunjaykumar
 *
 */
public class PopulateInorderSuccessor {
	TreeNodeWithExtraPointer root;
	static TreeNodeWithExtraPointer next = null;

	public PopulateInorderSuccessor() {
		root = null;
	}

	/**
	 * Used to insert node in the tree.
	 * 
	 * @param root
	 * @param data
	 * @return
	 */
	public static TreeNodeWithExtraPointer insertNode(TreeNodeWithExtraPointer root, int data) {
		if (root == null) {
			return new TreeNodeWithExtraPointer(data);
		}
		Queue<TreeNodeWithExtraPointer> q = new LinkedList<TreeNodeWithExtraPointer>();
		q.add(root);
		TreeNodeWithExtraPointer node = null;
		while (!q.isEmpty()) {
			node = q.peek();
			q.remove();

			if (node.left == null) {
				node.left = new TreeNodeWithExtraPointer(data);
				break;
			} else {
				q.add(node.left);
			}

			if (node.right == null) {
				node.right = new TreeNodeWithExtraPointer(data);
				break;
			} else {
				q.add(node.right);
			}

		}

		return node;
	}

	/**
	 * 
	 * @param root
	 */
	public static void populateInOrderSuccessor(TreeNodeWithExtraPointer root) {
		if (root != null) {
			populateInOrderSuccessor(root.right);
			root.next = next;
			next = root;
			populateInOrderSuccessor(root.left);
		}

	}

	/**
	 * Traversing nodes.
	 * 
	 * @param root
	 */
	public static void traverseNode(TreeNodeWithExtraPointer root) {
		if (root != null) {

			traverseNode(root.left);
			System.out.print(root.data + " ");
			traverseNode(root.right);
		}
	}

	/**
	 * Printing next of in-order node.
	 * 
	 * @param root
	 */
	public static void printNextOfInOrderNode(TreeNodeWithExtraPointer root) {
		TreeNodeWithExtraPointer temp = root;
		while(temp != null) {
			int nextData =  (temp.next != null) ? temp.next.data : -1;
//			if(nextData == 1)
			System.out.println("Next Of "+ temp.data + " is " + nextData);
			temp = temp.next;
		}
	}
	
	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		PopulateInorderSuccessor tree = new PopulateInorderSuccessor();
		tree.root = insertNode(null, 1);
		insertNode(tree.root, 2);
		insertNode(tree.root, 3);
		insertNode(tree.root, 4);
		insertNode(tree.root, 5);
		insertNode(tree.root, 6);
		insertNode(tree.root, 7);

		populateInOrderSuccessor(tree.root);

		traverseNode(tree.root);
		System.out.println();
		printNextOfInOrderNode(tree.root.left.left);
	}

}
