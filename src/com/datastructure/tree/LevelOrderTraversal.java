package com.datastructure.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Program to traverse level order.
 * 
 * @author mrityunjaykumar
 *
 */
public class LevelOrderTraversal {

	TreeNode root;

	LevelOrderTraversal() {
		root = null;
	}

	/**
	 * Used for inserting node into the tree.
	 * 
	 * @param root
	 * @param data
	 * @return
	 */
	private static TreeNode insertNode(TreeNode root, int data) {
		if (root == null) {
			return new TreeNode(data);
		}
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		TreeNode node = null;
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
	 * Iterating level by level to print nodes.
	 * 
	 * @param root
	 */
	private static void printLevelByLevel(TreeNode root) {
		int height = findHeight(root);

		for (int i = 1; i <= height; i++) {
			printNodeByLevel(root, i);
		}
	}

	/**
	 * Printing nodes by level.
	 * 
	 * @param root
	 * @param level
	 */
	private static void printNodeByLevel(TreeNode root, int level) {

		if (root == null) {
			return;
		}

		if (level == 1) {
			System.out.print(root.data + " ");
		} else if (level > 1) {
			printNodeByLevel(root.left, level - 1);
			printNodeByLevel(root.right, level - 1);
		}
	}

	/**
	 * Finding height.
	 * 
	 * @param root
	 * @return
	 */
	private static int findHeight(TreeNode root) {
		if (root == null) {
			return 0;
		} else {
			int lHeight = findHeight(root.left);
			int rHeight = findHeight(root.right);

			if (lHeight > rHeight) {
				return lHeight + 1;
			} else {
				return rHeight + 1;
			}
		}
	}

	/**
	 * Print nodes by level order using queue.
	 * 
	 * @param root
	 */
	private static void printNodesByUsingQueue(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		TreeNode node;
		while (!q.isEmpty()) {
			node = q.poll();
			if (node != null) {
				System.out.print(node.data + " ");
			}
			if (node.left != null) {
				q.add(node.left);
			}
			if (node.right != null) {
				q.add(node.right);
			}
		}
	}

	public static void main(String[] args) {
		LevelOrderTraversal tree = new LevelOrderTraversal();
		tree.root = insertNode(null, 1);
		insertNode(tree.root, 2);
		insertNode(tree.root, 3);
		insertNode(tree.root, 4);
		insertNode(tree.root, 5);
		insertNode(tree.root, 6);
		insertNode(tree.root, 7);

		int height = findHeight(tree.root);
		System.out.println("Height: " + height);
		TreeImplementation.treeTraverse(tree.root);
		System.out.println();
		printLevelByLevel(tree.root);
		System.out.println();
		printNodesByUsingQueue(tree.root);
		System.out.println();
		printNodeByLevel(tree.root, 3);

	}

}
