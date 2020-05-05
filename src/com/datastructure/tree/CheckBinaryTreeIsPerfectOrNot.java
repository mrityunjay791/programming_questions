package com.datastructure.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * This class is used to check given tree is perfect binary tree or not.
 * 
 * @author mrityunjaykumar
 *
 */
public class CheckBinaryTreeIsPerfectOrNot {

	TreeNode root;

	public CheckBinaryTreeIsPerfectOrNot() {
		root = null;
	}

	/**
	 * Used to insert node in the tree.
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
		
		return node;
	}
	
	/**
	 * Checking tree is prefect binany tree or not.
	 * 
	 * @param root
	 * @return
	 */
	public static boolean checkTreeIsPrefectBinanryOrNot(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		int flag = 0;
		TreeNode node = null;
		while(!q.isEmpty()) {
			node = q.peek();
			q.remove();
			
			if(node.left != null && node.right != null) {
				
				if(flag == 1) {
					return false;
				} else {
					q.add(node.left);
					q.add(node.right);
				}
			} else if(node.left == null && node.right == null) {
				flag = 1;
			} else if(node.left == null || node.right == null) {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		CheckBinaryTreeIsPerfectOrNot tree = new CheckBinaryTreeIsPerfectOrNot();
		tree.root = insertNode(null, 1);
		insertNode(tree.root, 2);
		insertNode(tree.root, 3);
		insertNode(tree.root, 4);
		insertNode(tree.root, 5);
		insertNode(tree.root, 6);
		insertNode(tree.root, 7);
		
		TreeTraversal.inOderTravsersal(tree.root);
		if(checkTreeIsPrefectBinanryOrNot(tree.root)) {
			System.out.println("\nTree is Prefect!!");
		} else {
			System.out.println("\nTree is NOT Prefect!!");
		}
	}

}
