package com.codeprodailyquestions;

import com.nodes.TreeNode;

public class ValidateBinarySearchTree {
	public static TreeNode root = null;

	private static void traverse(TreeNode root) {
		if (root == null) {
			return;
		}

		traverse(root.left);
		System.out.print(root.data + " ");
		traverse(root.right);

	}
	

	/**
	 * Wrapper method.
	 * 
	 * @param root
	 * @return
	 */
	private static boolean isBST(TreeNode root) {
		return testBinarySearchTree(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	/**
	 * Validating binary search tree.
	 * 
	 * @param root
	 * @param min
	 * @param max
	 * @return
	 */
	private static boolean testBinarySearchTree(TreeNode root, int min, int max) {
		if (root == null) {
			return true;
		}

		if (root.data < min || root.data > max) {
			return false;
		}

		return testBinarySearchTree(root.left, min, root.data - 1)
				&& testBinarySearchTree(root.right, root.data + 1, max);
	}
	
	/**
	 * Validating binary search tree.
	 * 
	 * @param root
	 * @param left
	 * @param right
	 * @return
	 */
	private static boolean testBinarySearchTreeOtherMethod(TreeNode root, TreeNode left, TreeNode right) {
		if (root == null) {
			return true;
		}

		if (left != null && left.data >= root.data) {
			return false;
		}
		
		if (right != null && right.data <= root.data) {
			return false;
		}

		return testBinarySearchTreeOtherMethod(root.left, left, root)
				&& testBinarySearchTreeOtherMethod(root.right, root, right);
	}
	

	public static void main(String[] args) {
		root = new TreeNode(5);
		root.left = new TreeNode(3);
		root.right = new TreeNode(7);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(4);
		root.right.left = new TreeNode(6);

		traverse(root);
		
		if (isBST(root)) {
			System.out.println("\nValid Binary Search Tree");
		} else {
			System.out.println("\nInvalid Binary Search Tree");
		}
		
		System.out.println(testBinarySearchTreeOtherMethod(root, null, null));
	}

}
