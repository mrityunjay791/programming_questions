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
	public static TreeNode insertNode(TreeNode root, int key) {
		if(root == null) {
			return new TreeNode(key);
		}
		
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		TreeNode node = null;
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
	public static void treeTraverse(TreeNode root) {

		if (root == null) {
			return;
		}

		System.out.print(root.data + " ");
		treeTraverse(root.left);
		treeTraverse(root.right);

	}
	
	/**
	 * Used to find node to be deleted..
	 * 
	 * @param root
	 * @param data
	 */
	public static void deleteNode(TreeNode root, int data) {
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		if(root == null) {
			return;
		}
		TreeNode temp = null;
		TreeNode node = null;
		while(!q.isEmpty()) {
			node = q.peek();
			q.remove();
			if(node.data == data) {
				temp = node;
			}
				
			if(node.left != null) {
				q.add(node.left);
			}
			
			if(node.right != null) {
				q.add(node.right);
			}
		}
		
		if(temp != null) {
			int d = node.data;
			deleteDeepestNode(root, d);
			temp.data = d;
		}
	}
	
	
	/**
	 * Used for deleting deepest Node.
	 * 
	 * @param node
	 * @param data
	 */
	public static void deleteDeepestNode(TreeNode node, int data) {
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(node);
		if(node == null) {
			return;
		}
		while(!q.isEmpty()) {
			node = q.peek();
			q.remove();
			if(node.data == data) {
				node = null;
				break;
			}
				
			if(node.left != null && node.left.data == data) {
				node.left = null;
				break;
			} else {
				q.add(node.left);

			}
			
			if(node.right != null && node.right.data == data) {
				node.right = null;
				break;
			} else {
				q.add(node.right);

			}
		}
		
	}
	
	/**
	 * Used for printing leaf node.
	 * 
	 * @param root
	 */
	public static void printLeaves(TreeNode root) {

		if (root == null) {
			return;
		}

		if(root.left == null && root.right == null) {
			System.out.print(root.data + " ");
		}
		printLeaves(root.left);
		printLeaves(root.right);

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
		insertNode(tree.root, 45);
		treeTraverse(tree.root);
		System.out.println();
		deleteNode(tree.root, 4);
		treeTraverse(tree.root);
		System.out.println();
		insertNode(tree.root, 50);
		deleteNode(tree.root, 45);
		treeTraverse(tree.root);
		System.out.println("\nLeaf nodes: ");
		printLeaves(tree.root);
		
//		System.out.println("\n" + tree.root.left.left.left.data);
	}

}
