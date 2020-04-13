package com.codeprodailyquestions;

//class TreeNodeEx {
//	char data;
//	TreeNodeEx left, right;
//	
//	TreeNodeEx(char data) {
//		this.data = data;
//		this.left = this.right = null;
//	}
//}

/**
 *  You are given the root of a binary tree. Return the deepest node (the furthest node from the root).
 *
 *	Example:
 *	
 *	    a
 *	   / \
 *	  b   c
 *	 /
 *	d
 *	
 *	The deepest node in this tree is d at depth 3.
 *
 * @author mrityunjaykumar
 *
 */
public class DeepestNodeInABinaryTree {
	TreeNodeEx root;
	
	DeepestNodeInABinaryTree() {
		root = null;
	}
	
	
	private static int findHeight(TreeNodeEx node) {
		
		if(node == null) {
			return 0;
		} else {
			int leftTreeHeight = findHeight(node.left);
			int rightTreeHeight = findHeight(node.right);
			if(leftTreeHeight > rightTreeHeight) {
				return (leftTreeHeight + 1);
			} else {
				return (rightTreeHeight + 1);
			}
		}
	}
	
	
	private static void findDeepestNode(TreeNodeEx node, int level) {
		
		if(node == null) {
			return;
		} 
		
		if(level == 1) {
			System.out.println(node.data);
		} else if(level > 1) {
			findDeepestNode(node.left, level - 1);
			findDeepestNode(node.right, level - 1);
		}
		
		
	}
	
	public static void main(String[] args) {
		DeepestNodeInABinaryTree tree = new DeepestNodeInABinaryTree();
		
		tree.root = new TreeNodeEx('a');
		tree.root.left = new TreeNodeEx('b');
		tree.root.right = new TreeNodeEx('c');
		tree.root.left.left = new TreeNodeEx('d');
		tree.root.left.left.left = new TreeNodeEx('e');
		
		int height = findHeight(tree.root);
		System.out.println("Height: "+ height);
		
		System.out.println("Deepest Node: ");
		findDeepestNode(tree.root, height);
	}

}
