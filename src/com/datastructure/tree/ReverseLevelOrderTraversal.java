package com.datastructure.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 
 * @author mrityunjaykumar
 *
 */
public class ReverseLevelOrderTraversal {
	TreeNode root;
	
	public ReverseLevelOrderTraversal() {
		root = null;
	}
	
	/**
	 * Inserting node into the tree.
	 * 
	 * @param root
	 * @param data
	 * @return
	 */
	public static TreeNode insertNode(TreeNode root, int data) {
		if(root == null) {
			return new TreeNode(data);
		}
		
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		TreeNode node = null;
		while(!q.isEmpty()) {
			node = q.peek();
			q.remove();
			
			if(node.left == null) {
				node.left = new TreeNode(data);
				break;
			} else {
				q.add(node.left);
			}
			
			if(node.right == null) {
				node.right = new TreeNode(data);
				break;
			} else {
				q.add(node.right);
			}
		}
		
		return root;
	}
	
	/**
	 * Reversing level order.
	 * 
	 * @param root
	 */
	public static void reverseLevelOrder(TreeNode root) {
		if(root == null) {
			return;
		}
		
		Queue<TreeNode> q = new LinkedList<>();
		Stack<TreeNode> st = new Stack<>();
		
		q.add(root);
		TreeNode node = null;
		while(!q.isEmpty()) {
			node = q.peek();
			q.remove();
			st.push(node);
			
			if(node.right != null) {
				q.add(node.right);
			}
			
			if(node.left != null) {
				q.add(node.left);
			}
		}
		
		
		while(!st.isEmpty()) {
			node = st.peek();
			System.out.print(node.data +" ");
			st.pop();
			
		}
		
	}
	
	/**
	 * Finding height
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
	
	/**
	 * Printing node level by level.
	 * 
	 * @param root
	 * @param level
	 */
	public static void printNodeLevelByLevel(TreeNode root, int level) {
		if(root == null) {
			return;
		}
		
		if(level == 1) {
			System.out.print(root.data + " ");
		} else if(level > 1) {
			printNodeLevelByLevel(root.left , level - 1);
			printNodeLevelByLevel(root.right , level - 1);
		}
	}
	
	/**
	 * Print node level by level utility method.
	 * 
	 * @param root
	 */
	public static void printLevelOrderBottomToTopUtil(TreeNode root) {
		if(root == null) {
			return;
		}
		
		int height = findHeight(root);
		
		for(int i = height; i >= 1; i--) {
			printNodeLevelByLevel(root, i);
		}
	}
	
	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ReverseLevelOrderTraversal tree = new ReverseLevelOrderTraversal();
		tree.root = insertNode(null, 1);
		insertNode(tree.root, 2);
		insertNode(tree.root, 3);
		insertNode(tree.root, 4);
		insertNode(tree.root, 5);
//		insertNode(tree.root, 6);
//		insertNode(tree.root, 7);
//		insertNode(tree.root, 8);
//		insertNode(tree.root, 9);
		System.out.println("Reverse level order bttom to top Using recursive: ");
		reverseLevelOrder(tree.root);
		
		System.out.println("\nReverse level order bttom to top Using Iterative: ");
		printLevelOrderBottomToTopUtil(tree.root);
	}

}
