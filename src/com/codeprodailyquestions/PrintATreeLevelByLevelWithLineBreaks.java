package com.codeprodailyquestions;

import java.util.LinkedList;
import java.util.Queue;

import com.nodes.TreeNode;

/**
 * You are given a tree, and your job is to print it level-by-level with linebreaks.

	    a
	   / \
	  b   c
	 / \ / \
	d  e f  g
	
	The output should be
	a
	bc
	defg

 * @author mrityunjaykumar
 *
 */
public class PrintATreeLevelByLevelWithLineBreaks {
	
	static TreeNode root;

	public PrintATreeLevelByLevelWithLineBreaks() {
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
		
		while(!q.isEmpty()) {
			TreeNode temp = q.peek();
			q.remove();
			
			if(temp.left == null) {
				temp.left = new TreeNode(data);
				break;
			} else {
				q.add(temp.left);
			}
			
			if(temp.right == null) {
				temp.right = new TreeNode(data);
				break;
			} else {
				q.add(temp.right);
			}
		}
		
		return root;
	}
	
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
	 * Print level by level util.
	 */
	public static void printNodeLevelByLevelUtil(TreeNode root) {
		if(root == null) {
			return;
		}
		int height = getHeight(root);
		
		for(int i = 1; i <= height; i++) {
			printNodeLevelByLevel(root, i);
			System.out.println();
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
			System.out.print(root.data+" ");
		} else if(level > 1) {
			printNodeLevelByLevel(root.left, level - 1);
			printNodeLevelByLevel(root.right, level - 1);
		}
	}
	
	/**
	 * Main.
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
		insertNode(root, 8);
		insertNode(root, 9);
		
		printNodeLevelByLevelUtil(root);
		
	}

}
