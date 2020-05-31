package com.datastructure.tree.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class FindNthNodeOfInorderTraversal {
	
	static int nthCount = 0;
	
	TreeNode root;
	public FindNthNodeOfInorderTraversal() {
		root = null;
	}
	
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
				q.add(root.left);
			}
			
			if(node.right == null) {
				node.right = new TreeNode(data);
				break;
			} else {
				q.add(root.right);
			}
		}
		
		return root;
	}
	
	public static void findNthNodeInInorderTraversal(TreeNode root, int n) {
		if(root == null) {
			return;
		}
		findNthNodeInInorderTraversal(root.left, n);
		nthCount++;
		if(nthCount == n) {
			System.out.println("\nresult: "+root.data);
		}
		findNthNodeInInorderTraversal(root.right, n);
		
	}

	public static void main(String[] args) {
		FindNthNodeOfInorderTraversal tree = new FindNthNodeOfInorderTraversal();
		tree.root = insertNode(null, 1);
		insertNode(tree.root, 2);
		insertNode(tree.root, 3);
		insertNode(tree.root, 4);
		insertNode(tree.root, 5);
		insertNode(tree.root, 6);
		insertNode(tree.root, 7);
		TreeTraversal.inOderTravsersal(tree.root);
		findNthNodeInInorderTraversal(tree.root,  5);
		
	}

}
