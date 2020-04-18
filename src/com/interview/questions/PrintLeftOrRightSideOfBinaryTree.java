package com.interview.questions;

import com.nodes.TreeNode;

/**
 * Print left/right side nodes of a binary tree.
 * 
 * @author mrityunjaykumar
 *
 */
public class PrintLeftOrRightSideOfBinaryTree {
	public static TreeNode root = null;

	private static void traverse(TreeNode root) {
		if (root == null) {
			return;
		}

		traverse(root.left);
		System.out.print(root.data + " ");
		traverse(root.right);

	}


	public static void main(String[] args) {
		root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);

		traverse(root);
		System.out.println("\nOnly left subtree: ");
		traverse(root.left);
//		System.out.print(root.data);
		
		System.out.println("\nOnly right subtree: ");
		traverse(root.right);
		
	}

}
