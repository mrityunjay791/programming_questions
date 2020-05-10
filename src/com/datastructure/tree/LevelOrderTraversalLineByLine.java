package com.datastructure.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Given a Binary Tree, print the nodes level wise, each level on a new line.

	Example
	
	Output:
	1
	2 3
	4 5
 * 
 * @author mrityunjaykumar
 *
 */
public class LevelOrderTraversalLineByLine {
	
	TreeNode root;

	public LevelOrderTraversalLineByLine() {
		root = null;
	}
	
	/**
	 * Inserting nodes.
	 * 
	 * @param root
	 * @param data
	 * @return
	 */
	public static TreeNode insertNode(TreeNode root, int data) {
		if (root == null) {
			return new TreeNode(data);
		}

		Queue<TreeNode> q = new LinkedList<>();

		q.add(root);
		TreeNode node;
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
	 * Print nodes line by line using recursion.
	 * 
	 * @param root
	 */
	public static void levelOrderTraversalLineByLine(TreeNode root) {
		if(root == null) {
			return;
		}
		int height = height(root);
		
		for(int i = 1; i <= height; i++) {
			printNodeLevelByLevel(root, i);
			System.out.println();
		}
		
	}
	
	/**
	 * Print nodes level by level.
	 * 
	 * @param root
	 * @param level
	 */
	public static void printNodeLevelByLevel(TreeNode root, int level) {
		if(root == null) {
			return;
		}
		if(level == 1) {
			System.out.print(root.data +" ");
		} else if(level > 1) {
			printNodeLevelByLevel(root.left, level - 1);
			printNodeLevelByLevel(root.right, level - 1);
		}
	}
	
	/**
	 * Finding heights.
	 * 
	 * @param root
	 * @return
	 */
	public static int height(TreeNode root) {
		if(root == null) {
			return 0;
		} else {
			int lHeight = height(root.left);
			int rHeight = height(root.right);
			
			if(lHeight > rHeight) {
				return lHeight + 1;
			} else {
				return rHeight + 1;
			}
		}
	}
	
	/**
	 * Level order traversal line by line with recursive call and also in O(n) complexity.
	 * 
	 * 
	 * @param root
	 */
	public static void levelOrderTraversalLineByLineUsingStack(TreeNode root) {
		if(root == null) {
			return;
		}
		
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		q.add(null);
		
		while(!q.isEmpty()) {
			TreeNode node = q.poll();
			
			if(node == null) {
				if(!q.isEmpty()) {
					q.add(null);
					System.out.println();
				}
			} else {
			
				if(node.left != null) {
					q.add(node.left);
				} 
				
				if(node.right != null) {
					q.add(node.right);
				}
				
				System.out.print(node.data+" ");
			}
		}
	}
	
	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		LevelOrderTraversalLineByLine tree = new LevelOrderTraversalLineByLine();
		
		tree.root = insertNode(null, 1);
		insertNode(tree.root, 2);
		insertNode(tree.root, 3);
		insertNode(tree.root, 4);
		insertNode(tree.root, 5);
		insertNode(tree.root, 6);
		insertNode(tree.root, 7);
		insertNode(tree.root, 8);
		
		System.out.println("Using recursion: ");
		levelOrderTraversalLineByLine(tree.root);
		
		System.out.println("\nWithout using recursion:");
		levelOrderTraversalLineByLineUsingStack(tree.root);
	}

}
