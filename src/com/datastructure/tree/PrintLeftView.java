package com.datastructure.tree;

/**
 * Program to print left view node.
 * 
 * @author mrityunjaykumar
 *
 */
public class PrintLeftView {
	public static int maxL = 0;
	TreeNode root;
	
	public PrintLeftView() {
		root = null;
	}

	public static void printLeftView(TreeNode root, int level) {
		
		if(root == null) {
			return;
		}
		
		if(maxL < level) {
			System.out.print( root.data +" ");
			maxL = level;
		}
		
		printLeftView(root.left, level + 1);
		printLeftView(root.right, level + 1);
		
	}
	
	
	public static void main(String[] args) {
		PrintLeftView tree = new PrintLeftView();
		tree.root = new TreeNode(4);
		tree.root.left = new TreeNode(5);
		tree.root.right = new TreeNode(2);
		tree.root.right.left = new TreeNode(3);
		tree.root.right.right = new TreeNode(1);
		tree.root.right.left.left = new TreeNode(6);
		tree.root.right.left.right = new TreeNode(7);
		tree.root.right.left.right.left = new TreeNode(17);
		printLeftView(tree.root, 1);
	}

}
