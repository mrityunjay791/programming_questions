package com.datastructure.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Program to find height.
 * 
 * @author mrityunjaykumar
 *
 */
public class FindTreeHeight {
	TreeNode root;

	FindTreeHeight() {
		root = null;
	}

	/**
	 * Inserting node using LinkedList by using FIFO concept.
	 * 
	 * @param root
	 * @param data
	 * @return
	 */
	public static TreeNode insertNode(TreeNode root, int data) {
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
	 * Finding heights.
	 * 
	 * @param root
	 * @return
	 */
	public static int findHeight(TreeNode root) {
		
		if(root == null) {
			return 0;
		} else {
			int lHeight = findHeight(root.left);
			int rHeight = findHeight(root.right);
			
			if(lHeight > rHeight) {
				return lHeight + 1;
			} else {
				return rHeight + 1;
			}
		}
	}
	

	public static void main(String[] args) {
		FindTreeHeight tree = new FindTreeHeight();
		tree.root = insertNode(null,1);
		insertNode(tree.root, 2);
		insertNode(tree.root, 3);
		insertNode(tree.root, 4);
		insertNode(tree.root, 5);
		insertNode(tree.root, 6);
		insertNode(tree.root, 7);
		
		TreeImplementation.treeTraverse(tree.root);
		int height = findHeight(tree.root);
		System.out.println("\nHeight of the tree is : "+ height);
	}

}
