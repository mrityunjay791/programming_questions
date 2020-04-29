package com.datastructure.tree;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
	int data;
	TreeNode left, right;

	TreeNode(int data) {
		this.data = data;
		this.left = this.right = null;
	}
}

public class TreeImplementation {

	TreeNode root;

	TreeImplementation() {
		root = null;
	}

	/**
	 * Used for adding node into the tree.
	 * 
	 * @param node
	 * @param key
	 */
	private static TreeNode insertNode(TreeNode node, int key) {
		if(node == null) {
			return new TreeNode(key);
		}
		
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(node);
		
		while (!q.isEmpty()) {
			node = q.peek();
			q.remove();

			if (node.left == null) {
				node.left = new TreeNode(key);
				break;
			} else {
				q.add(node.left);
			}

			if (node.right == null) {
				node.right = new TreeNode(key);
				break;
			} else {
				q.add(node.right);
			}

		}
		
		return null;
	}
	
	
	/**
	 * Used for printing nodes.
	 * 
	 * @param root
	 */
	private static void treeTraverse(TreeNode root) {

		if (root == null) {
			return;
		}

		System.out.print(root.data + " ");
		treeTraverse(root.left);
		treeTraverse(root.right);

	}

	public static void main(String[] args) {

		TreeImplementation tree = new TreeImplementation();
//		tree.root = insertNode(tree.root, 20);
		tree.root = new TreeNode(1);
		tree.root.left = new TreeNode(2);
		tree.root.right = new TreeNode(3);
		tree.root.left.left = new TreeNode(4);
		tree.root.left.right = new TreeNode(5);
		tree.root.right.left = new TreeNode(6);
		tree.root.right.right = new TreeNode(7);
		treeTraverse(tree.root);
		System.out.println();
		insertNode(tree.root, 40);
		treeTraverse(tree.root);
//		System.out.println("\n" + tree.root.left.left.left.data);
	}

}
