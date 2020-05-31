package com.datastructure.tree.binarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Print nodes in normal/spiral level-order form.
 * 
 * @author mrityunjaykumar
 *
 */
public class LevelOrderTraversalInSpiralForm {

	TreeNode root;

	public LevelOrderTraversalInSpiralForm() {
		root = null;
	}

	/**
	 * Inserting nodes.
	 * 
	 * @param root
	 * @param data
	 * @return
	 */
	public static TreeNode insertNode(TreeNode root, int data) {
		if (root == null) {
			return new TreeNode(data);
		}

		Queue<TreeNode> q = new LinkedList<>();

		q.add(root);
		TreeNode node;
		while (!q.isEmpty()) {
			node = q.peek();
			q.remove();

			if (node.left == null) {
				node.left = new TreeNode(data);
				break;
			} else {
				q.add(node.left);
			}

			if (node.right == null) {
				node.right = new TreeNode(data);
				break;
			} else {
				q.add(node.right);
			}
		}

		return root;
	}

	/**
	 * Finding tree height.
	 * 
	 * @param root
	 * @return
	 */
	public static int height(TreeNode root) {
		if (root == null) {
			return 0;
		} else {
			int lHeight = height(root.left);
			int rHeight = height(root.right);

			if (lHeight > rHeight) {
				return lHeight + 1;
			} else {
				return rHeight + 1;
			}
		}
	}

	/**
	 * Iterating up to height of the tree and calling method to print nodes in
	 * spiral form.
	 * 
	 * @param root
	 */
	public static void printNodeInSpiralFormUtil(TreeNode root) {

		boolean flipSide = false;
		int height = height(root);
		int i;
		for (i = 1; i <= height; i++) {
			printNodeByLevel(root, i, flipSide);
			flipSide = !flipSide;
		}
	}

	/**
	 * Printing nodes in level order.
	 * 
	 * @param root
	 * @param level
	 * @param flipSide
	 */
	public static void printNodeByLevel(TreeNode root, int level, boolean flipSide) {

		if (root == null) {
			return;
		}

		if (level == 1) {
			System.out.print(root.data + " ");
		} else if (level > 1) {
			if (flipSide) {
				printNodeByLevel(root.left, level - 1, flipSide);
				printNodeByLevel(root.right, level - 1, flipSide);
			} else {
				printNodeByLevel(root.right, level - 1, flipSide);
				printNodeByLevel(root.left, level - 1, flipSide);
			}
		}
	}

	/**
	 * Calling method to print nodes in normal level order traversal.
	 * 
	 * @param root
	 */
	public static void printNodesInLevelOrder(TreeNode root) {
		int height = height(root);
		for (int i = 1; i <= height; i++) {
			printNodeByLevel(root, i, true);
		}
	}
	
	/**
	 * Printing nodes in spriral form using stack and iterative method.
	 * 
	 * @param root
	 */
	public static void printNodeInSpiralFormUsingStack(TreeNode root) {
		
		if(root == null) {
			return;
		}
		
		Stack<TreeNode> st1 = new Stack<>();
		Stack<TreeNode> st2 = new Stack<>();
		
		st1.push(root);
		while(!st1.isEmpty() || !st2.isEmpty()) {
			while(!st1.empty()) {
				TreeNode node = st1.peek();
				st1.pop();
				
				System.out.print(node.data + " ");
				
				if(node.right != null) {
					st2.push(node.right);
				}
				if(node.left != null) {
					st2.push(node.left);
				}
			}
						
			while(!st2.empty()) {
				TreeNode node = st2.peek();
				st2.pop();
				
				System.out.print(node.data + " ");

				
				if(node.left != null) {
					st1.push(node.left);
				}
				if(node.right != null) {
					st1.push(node.right);
				}
			}
			
			
		}
		
	}

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		LevelOrderTraversalInSpiralForm tree = new LevelOrderTraversalInSpiralForm();
		tree.root = insertNode(null, 1);
		insertNode(tree.root, 2);
		insertNode(tree.root, 3);
		insertNode(tree.root, 4);
		insertNode(tree.root, 5);
		insertNode(tree.root, 6);
		insertNode(tree.root, 7);
		insertNode(tree.root, 8);
		insertNode(tree.root, 9);
		insertNode(tree.root, 10);
		insertNode(tree.root, 11);
		System.out.println("Normal Level-order Traversal: ");
		printNodesInLevelOrder(tree.root);
		System.out.println("\nLevel-order Traversal in spiral form: ");
		printNodeInSpiralFormUtil(tree.root);
		
		System.out.println("\n Printing nodes using iterative method:");
		printNodeInSpiralFormUsingStack(tree.root);
	}
}
