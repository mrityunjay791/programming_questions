package com.datastructure.tree;

import java.util.Vector;

/**
 * 
 * @author mrityunjaykumar
 *
 */
public class FindSuccessorAndPredecessor {

	TreeNode root;
	static int i = 1;
	
	public FindSuccessorAndPredecessor() {
		root = null;
	}
	
	public static void findSuccessorOfInorderTraversal(TreeNode root, Vector<Integer> arr, TreeNode mainNode) {
		if(root == null) {
			return;
		}
		
		findSuccessorOfInorderTraversal(root.left, arr, mainNode);
		
		if(root.data == mainNode.data) {
			System.out.println("Successor of "+ root.data + " is :"+ arr.get(i-1));
		}
		
		i++;
		findSuccessorOfInorderTraversal(root.right, arr, mainNode);
		
	}
	
	public static void storeInorderData(TreeNode root, Vector<Integer> arr) {
		if(root == null) {
			return;
		}
		
		storeInorderData(root.left, arr);
		arr.add(root.data);
		storeInorderData(root.right, arr);
		
	}

	public static void findSuccessorOfInorderTraversalUtil(TreeNode root, TreeNode mainNode) {
		if(root == null) {
			return;
		}
		
		Vector<Integer> arr = new Vector<>();
		
		arr.add(0);
		storeInorderData(root, arr);
		arr.add(0);
		
		findSuccessorOfInorderTraversal(root, arr, mainNode);
		
	}
	
	public static void main(String[] args) {
		FindSuccessorAndPredecessor tree = new FindSuccessorAndPredecessor();
		tree.root = new TreeNode(1);
		tree.root.left = new TreeNode(2);
		tree.root.right = new TreeNode(3);
		tree.root.left.left = new TreeNode(4);
		tree.root.left.right = new TreeNode(5);
		tree.root.right.left = new TreeNode(6);
		tree.root.right.right = new TreeNode(7);
		TreeTraversal.preOrderTravsersal(tree.root);
		System.out.println();
		findSuccessorOfInorderTraversalUtil(tree.root, tree.root.right);
		
	}

}
