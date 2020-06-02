package com.datastructure.tree.binarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * This class is used to print Preorder traversal of the given binary tree using iterative method.
 * 
 * @author mrityunjaykumar
 *
 */
public class PreOrderTraversalIterativeMethod {
	static TreeNode root;
	
	public PreOrderTraversalIterativeMethod() {
		root = null;
	}

	/**
	 * Inserting node.
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
		
		TreeNode temp = null;
		while(!q.isEmpty()) {
			temp = q.peek();
			q.remove();
			
			if(temp != null && temp.left == null) {
				temp.left = new TreeNode(data);
				break;
			} else {
				q.add(temp.left);
			}
			
			if(temp != null && temp.right == null) {
				temp.right = new TreeNode(data);
				break;
			} else {
				q.add(temp.right);
			}
		}
		
		return root;
	}
	
	/**
	 * Printing node in preorder traversal using iterative method.
	 * 
	 * @param root
	 */
	public static void preorderTraversalIterative(TreeNode root) {
		
		if(root == null) {
			return;
		}
		
		Stack<TreeNode> st = new Stack<>();
		st.push(root);
		
		TreeNode temp = null;
		
		while(!st.isEmpty()) {
			temp = st.pop();
			if(temp != null) {
				System.out.print(temp.data+" ");
			}
			
			if(temp != null && temp.right != null) {
				st.push(temp.right);
			}
			
			if(temp != null && temp.left != null) {
				st.push(temp.left);
			}
		}
	}
	
	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		root = insertNode(root, 1);
		insertNode(root, 2);
		insertNode(root, 3);
		insertNode(root, 4);
		insertNode(root, 5);
		insertNode(root, 6);
		insertNode(root, 7);
		
		System.out.println("Using Recursive Method ");
		TreeTraversal.preOrderTravsersal(root);
		
		System.out.println("\nUsing Iterative Method");
		preorderTraversalIterative(root);
	}

}
