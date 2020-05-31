package com.datastructure.tree.binarytree;

/**
 * Program to find N-th node of pre order traversal.
 * 
 * @author mrityunjaykumar
 *
 */
public class FindNthNodeOfPreorderTraversal {
	
	TreeNode root;
	static int count = 0;

	public FindNthNodeOfPreorderTraversal() {
		root = null;
	}

	public static void findNthNodeOfPreOrderTraversal(TreeNode root, int n) {
		if(root == null) {
			return;
		}
		count++;
		if(count == n) {
			System.out.println("Data at "+n +" position is "+root.data);
		}
		findNthNodeOfPreOrderTraversal(root.left, n);
		findNthNodeOfPreOrderTraversal(root.right, n);
		
	}
	
	public static void main(String[] args) {
		FindNthNodeOfPreorderTraversal tree = new FindNthNodeOfPreorderTraversal();
		tree.root = new TreeNode(4);
		tree.root.left = new TreeNode(5);
		tree.root.right = new TreeNode(2);
		tree.root.right.left = new TreeNode(3);
		tree.root.right.right = new TreeNode(1);
		tree.root.right.left.left = new TreeNode(6);
		tree.root.right.left.right = new TreeNode(7);
		tree.root.right.left.right.left = new TreeNode(17);
		
		TreeTraversal.preOrderTravsersal(tree.root);
		System.out.println();
		findNthNodeOfPreOrderTraversal(tree.root, 3);
	}

}
