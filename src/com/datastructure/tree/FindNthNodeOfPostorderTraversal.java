package com.datastructure.tree;

/**
 * Program to find N-th node of post order traversal.
 * 
 * @author mrityunjaykumar
 *
 */
public class FindNthNodeOfPostorderTraversal {
	
	TreeNode root;
	static int count = 0;

	public FindNthNodeOfPostorderTraversal() {
		root = null;
	}

	public static void findNthNodeOfPostOrderTraversal(TreeNode root, int n) {
		if(root == null) {
			return;
		}
		findNthNodeOfPostOrderTraversal(root.left, n);
		findNthNodeOfPostOrderTraversal(root.right, n);
		count++;
		if(count == n) {
			System.out.println("Data at "+n +" position is "+root.data);
		}
		
	}
	
	public static void main(String[] args) {
		FindNthNodeOfPostorderTraversal tree = new FindNthNodeOfPostorderTraversal();
		tree.root = new TreeNode(4);
		tree.root.left = new TreeNode(5);
		tree.root.right = new TreeNode(2);
		tree.root.right.left = new TreeNode(3);
		tree.root.right.right = new TreeNode(1);
		tree.root.right.left.left = new TreeNode(6);
		tree.root.right.left.right = new TreeNode(7);
		tree.root.right.left.right.left = new TreeNode(17);
		
		TreeTraversal.postOrderTravsersal(tree.root);
		System.out.println();
		findNthNodeOfPostOrderTraversal(tree.root, 3);
	}

}
