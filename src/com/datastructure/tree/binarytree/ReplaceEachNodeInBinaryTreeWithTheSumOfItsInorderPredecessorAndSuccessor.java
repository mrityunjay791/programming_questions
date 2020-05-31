package com.datastructure.tree.binarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

/**
 * Replace each node in binary tree with the sum of its inorder predecessor and successor
 * 
 * Input :       1
               /   \
              2     3
            /  \  /  \
           4   5  6   7

	Output :    11
              /    \
             9      13
            / \    /  \
           2   3   4   3
                  
	For 1:
	Inorder predecessor = 5
	Inorder successor  = 6
	Sum = 11
	
	For 4:
	Inorder predecessor = 0
	(as inorder predecessor is not present)
	Inorder successor  = 2
	Sum = 2
	
	For 7:
	Inorder predecessor = 3
	Inorder successor  = 0
	(as inorder successor is not present)
	Sum = 3

 * @author mrityunjaykumar
 *
 */
public class ReplaceEachNodeInBinaryTreeWithTheSumOfItsInorderPredecessorAndSuccessor {

	TreeNode root;
	static int i = 1;
	
	static class INT {
		int i;
	}
	
	public ReplaceEachNodeInBinaryTreeWithTheSumOfItsInorderPredecessorAndSuccessor() {
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
				q.add(node.left);
			}
			
			if(node.right == null) {
				node.right = new TreeNode(data);
				break;
			} else {
				q.add(node.right);
			}
		}
		
		return root;
	}
	
	public static void storeNode(TreeNode root, Vector<Integer> arr) {
		
		if(root == null) {
			return;
		}
		
		storeNode(root.left, arr);
		arr.add(root.data);
		storeNode(root.right, arr);
	}
	
	public static void replaceNodeWithSumOfItsInorderPredecessorAndSuccessor(TreeNode root, Vector<Integer> arr, INT index) {
		if(root == null) {
			return;
		}
		replaceNodeWithSumOfItsInorderPredecessorAndSuccessor(root.left, arr, index);
		root.data = arr.get(index.i - 1) + arr.get(index.i + 1);
		index.i = index.i + 1;
		replaceNodeWithSumOfItsInorderPredecessorAndSuccessor(root.right, arr, index);
		
		
	}
	
	public static void replaceNodeWithSumUtil(TreeNode root) {
		if(root == null) {
			return;
		}
		
		Vector<Integer> arr = new Vector<>();
		arr.add(0);
		
		storeNode(root, arr);
		
		arr.add(0);
		INT index = new INT();
		index.i = 1;
		replaceNodeWithSumOfItsInorderPredecessorAndSuccessor(root, arr, index);
		
		
	}
	
	public static void main(String[] args) {
		ReplaceEachNodeInBinaryTreeWithTheSumOfItsInorderPredecessorAndSuccessor tree = new ReplaceEachNodeInBinaryTreeWithTheSumOfItsInorderPredecessorAndSuccessor();
		tree.root = insertNode(null, 1);
		insertNode(tree.root, 2);
		insertNode(tree.root, 3);
		insertNode(tree.root, 4);
		insertNode(tree.root, 5);
		insertNode(tree.root, 6);
		insertNode(tree.root, 7);

	    
		System.out.println("Before tree modifications: ");
		TreeTraversal.inOderTravsersal(tree.root);
		
		// Tree modifications
		replaceNodeWithSumUtil(tree.root);
		
		System.out.println("\nAfter tree modifications: ");
		TreeTraversal.preOrderTravsersal(tree.root);
		
	}

}
