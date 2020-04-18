package com.codeprodailyquestions;

import java.util.Scanner;

import com.nodes.TreeNode;

/**
 *  Given a binary tree, return all values given a certain height h.
 * 
 * @author mrityunjaykumar
 *
 */
public class GetAllValueAtCertainHeight {
	TreeNode root = null;
	
	GetAllValueAtCertainHeight() {
		root = null;
	}
	
	
	private static void traverse(TreeNodeEx root) {
		
		if(root == null) {
			return;
		}
		
		traverse(root.left);
		System.out.print(root.data + " ");
		traverse(root.right);
	}
	
	
	private static void findDeepestNode(TreeNodeEx node, int level) {
		
		if(node == null) {
			return;
		} 
		
		if(level == 1) {
			System.out.print(node.data + " ");
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
		tree.root.left.right = new TreeNodeEx('e');
		tree.root.right.left = new TreeNodeEx('f');
		tree.root.right.right = new TreeNodeEx('g');
		
		System.out.println("Enter height: ");
		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		traverse(tree.root);
		System.out.print("\nNode at height "+ height+ " : ");
		findDeepestNode(tree.root, height);
		sc.close();
	}


}
