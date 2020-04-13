package com.datastructure.tree;

class TreeNode {
	int data;
	TreeNode left, right;
	
	TreeNode(int data) {
		this.data = data;
		this.left = this.right = null;
	}
}
public class TreeImplementation {
	
	TreeNode root;
	
	TreeImplementation() {
		root = null;
	}
	
	private static void treeTraverse(TreeNode root) {
		
		if(root == null) {
			return;
		}
		
		treeTraverse(root.left);
		System.out.print(root.data +" ");
		treeTraverse(root.right);
		
		
	}
	
	public static void main(String[] args) {
		
		TreeImplementation tree = new TreeImplementation();
		tree.root = new TreeNode(1);
		tree.root.left = new TreeNode(2);
		tree.root.right = new TreeNode(3);
		tree.root.left.left = new TreeNode(4);
		tree.root.left.right = new TreeNode(5);
		tree.root.right.left = new TreeNode(6);
		tree.root.right.right = new TreeNode(7);
		
		treeTraverse(tree.root);
	}

	
}
