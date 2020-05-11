package com.datastructure.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Given a binary tree, print the level order traversal in such a way that first two levels are printed 
 * from left to right, next two levels are printed from right to left, then next two from left to right 
 * and so on. So, the problem is to reverse the direction of level order traversal of binary tree after 
 * every two levels.
 * 
 * Examples:

	Input: 
	            1     
	          /   \
	        2       3
	      /  \     /  \
	     4    5    6    7
	    / \  / \  / \  / \ 
	   8  9 3   1 4  2 7  2
	   
	Output:
	1
	2 3
	7 6 5 4
	2 7 2 4 1 3 9 8
	16 17 18 19
	In the above example, first two levels
	are printed from left to right, next two
	levels are printed from right to left,
	and then last level is printed from 
	left to right.
 * 
 * @author mrityunjaykumar
 *
 */
public class LevelOrderTraversalWithDirectionChangeAfterEveryTwoLevels {

	TreeNode root;
	
	public LevelOrderTraversalWithDirectionChangeAfterEveryTwoLevels() {
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
	 * Getting tree height.
	 * 
	 * @param root
	 * @return
	 */
	public static int getHeight(TreeNode root) {
		if(root == null) {
			return 0;
		} else {
			int lHeight = getHeight(root.left);
			int rHeight = getHeight(root.right);
			
			if(lHeight > rHeight) {
				return lHeight + 1;
			} else {
				return rHeight + 1;
			}
		}
		
	}
	
	/**
	 * Print nodes level by level with direction change.
	 * 
	 * @param root
	 * @param level
	 * @param flipDirection
	 */
	public static void printNodesLevelByLevel(TreeNode root, int level, boolean flipDirection) {
		if(root == null) {
			return;
		}
		
		if(level == 1) {
			System.out.print(root.data+" ");
		} else if(level > 1) {
			if(!flipDirection) {
				printNodesLevelByLevel(root.left, level - 1, flipDirection);
				printNodesLevelByLevel(root.right, level - 1, flipDirection);
			} else {
				printNodesLevelByLevel(root.right, level - 1, flipDirection);
				printNodesLevelByLevel(root.left, level - 1, flipDirection);
			}
		}
	}
	
	/**
	 * Print tree node utility method.
	 * 
	 * @param root
	 */
	public static void printNodesLevelByLevelWithDirectionChangeUtil(TreeNode root) {
		if(root == null) {
			return;
		}
		int height = getHeight(root);
		boolean flipDirection = false;
		
		for(int i = 1; i <= height; i++) {
			printNodesLevelByLevel(root, i , flipDirection);
			System.out.println();
			if(i%2 == 0) {
				flipDirection = !flipDirection;
			}
		}
	}
	
	/**
	 * Printing node level by level with direction change line by line.
	 * 
	 * @param root
	 */
	public static void printNodesLevelByLevelWithDirectionChangeUsingIterativeMethod(TreeNode root) {
		if(root == null) {
			return;
		}
		
		Queue<TreeNode> q = new LinkedList<>();
		Stack<TreeNode> st = new Stack<>();
		
		st.push(root);
		
		boolean flipDirection = true;
		
		while(!q.isEmpty() || !st.isEmpty()) {
			
			while(!st.isEmpty()) {
				TreeNode node = st.pop();
				System.out.print(node.data+" ");
				
				if(flipDirection) {
					if(node.left != null)
						q.add(node.left);
					
					if(node.right != null)
						q.add(node.right);
				} else {
					if(node.right != null)
						q.add(node.right);
					
					if(node.left != null)
						q.add(node.left);
					
				}
			}
			
			System.out.println();
			
			while(!q.isEmpty()) {
				TreeNode node = q.peek();
				q.remove();
				System.out.print(node.data+" ");
				
				if(flipDirection) {
					if(node.left != null)
						st.push(node.left);
					
					if(node.right != null)
						st.push(node.right);
				} else {
					if(node.right != null)
						st.push(node.right);
					if(node.left != null)
						st.push(node.left);
					
				}
			}
			System.out.println();
			flipDirection = !flipDirection;
		}
	}

	/**
	 * Main.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		LevelOrderTraversalWithDirectionChangeAfterEveryTwoLevels tree = new LevelOrderTraversalWithDirectionChangeAfterEveryTwoLevels();
		tree.root = insertNode(null, 1);
		insertNode(tree.root, 2);
		insertNode(tree.root, 3);
		insertNode(tree.root, 4);
		insertNode(tree.root, 5);
		insertNode(tree.root, 6);
		insertNode(tree.root, 7);
		insertNode(tree.root, 8);
		insertNode(tree.root, 9);
		insertNode(tree.root, 3);
		insertNode(tree.root, 1);
		insertNode(tree.root, 4);
		insertNode(tree.root, 2);
		insertNode(tree.root, 7);
		insertNode(tree.root, 2);
//		insertNode(tree.root, 16);
//		insertNode(tree.root, 17);
//		insertNode(tree.root, 18);
		
		System.out.println("Using Recursive method: ");
		printNodesLevelByLevelWithDirectionChangeUtil(tree.root);
		
		System.out.println("\nUsing Iterative method: ");
		printNodesLevelByLevelWithDirectionChangeUsingIterativeMethod(tree.root);
	}

}
