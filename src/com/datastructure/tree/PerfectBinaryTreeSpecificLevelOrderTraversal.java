package com.datastructure.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Given a Perfect Binary Tree like below:
 *
 *
 * Print the level order of nodes in following specific manner:
 *
 * 1 2 3 4 7 5 6 8 15 9 14 10 13 11 12 16 31 17 30 18 29 19 28 20 27 21 26  22 25 23 24
 *
 * @author mrityunjaykumar
 *
 */
public class PerfectBinaryTreeSpecificLevelOrderTraversal {
	
	static TreeNode root = null;
	
	/**
	 * Insert Node.
	 * 
	 * @param root
	 * @param data
	 * @return
	 */
	private static TreeNode insertNode(TreeNode root, int data) {
		if(root == null)
			return new TreeNode(data);
		
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		
		while(!q.isEmpty()) {
			TreeNode temp = q.peek();
			q.remove();
			
			if(temp.left == null) {
				temp.left = new TreeNode(data);
				break;
			} else {
				q.add(temp.left);
			}
			
			if(temp.right == null) {
				temp.right = new TreeNode(data);
				break;
			} else {
				q.add(temp.right);
			}
		}
		
		return root;
	}
	
	/**
	 * Printing specific level order .
	 */
	private static void printSpecificLevelOrder() {
		if(root == null) {
			return;
		}
		
		System.out.print(root.data + " ");
		
		if(root.left != null) {
			System.out.print(root.left.data + " " + root.right.data + " ");
		}
		
		if(root.left.left == null)
			return;
		
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root.left);
		q.add(root.right);
		
		while(!q.isEmpty()) {
			TreeNode f = q.peek();
			q.remove();
			TreeNode s = q.peek();
			q.remove();
			System.out.print(f.left.data + " " + s.right.data + " ");
			System.out.print(f.right.data + " " + s.left.data + " ");
			
			if(f.left.left != null) {
				q.add(f.left);
				q.add(s.right);
				q.add(f.right);
				q.add(s.left);
			}
		}
	}

	public static void main(String[] args) {
		root = insertNode(root, 1);
		insertNode(root, 2);
		insertNode(root, 3);
		insertNode(root, 4);
		insertNode(root, 5);
		insertNode(root, 6);
		insertNode(root, 7);
		insertNode(root, 8);
		insertNode(root, 9);
		insertNode(root, 10);
		insertNode(root, 11);
		insertNode(root, 12);
		insertNode(root, 13);
		insertNode(root, 14);
		insertNode(root, 15);
		insertNode(root, 16);
		insertNode(root, 17);
		insertNode(root, 18);
		insertNode(root, 19);
		insertNode(root, 20);
		insertNode(root, 21);
		insertNode(root, 22);
		insertNode(root, 23);
		insertNode(root, 24);
		insertNode(root, 25);
		insertNode(root, 26);
		insertNode(root, 27);
		insertNode(root, 28);
		insertNode(root, 29);
		insertNode(root, 30);
		insertNode(root, 31);
		
		printSpecificLevelOrder();
	}

}
