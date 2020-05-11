package com.datastructure.tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 *  Reverse tree path
	Given a tree and a node data, your task to reverse the path till that particular Node.
	
	Examples:
	
	Input : 
	            7
	         /    \
	        6       5
	       / \     / \
	      4  3     2  1    
	Data = 4 
	Output : Inorder of tree
	7 6 3 4 2 5 1
	
	
	Input :
	            7
	         /    \
	        6       5
	       / \     / \
	      4  3     2  1   
	Data = 2 
	Output : Inorder of tree
	4 6 3 2 7 5 1

 * @author mrityunjaykumar
 *
 */
public class ReverseTreePath {
	
	TreeNode root;
	static int index = 0;
	

	public ReverseTreePath() {
		root = null;
	}

	/**
	 * Inserting node into the tree.
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
	
	/**
	 * Reversing path.
	 * 
	 * @param root
	 * @param level
	 * @param data
	 * @param map
	 * @return
	 */
	public static TreeNode reversePath(TreeNode root, int level, int data, Map<Integer, Integer> map) {
		if(root == null) {
			return null;
		}
		
		if(root.data == data) {
			map.put(level, data);
			root.data = map.get(index);
			index++;
			return root;
		}
		
		map.put(level, root.data);
		
		TreeNode left, right = null;
		
		left = reversePath(root.left, level + 1, data, map);
		if(left == null) {
			right = reversePath(root.right, level + 1, data, map);
		}
		
		if(left != null || right != null) {
			root.data = map.get(index);
			index++;
			return (left!=null ? left : right);
		}
		
		return null;
	}
	
	/**
	 * Reverse path utility method.
	 * 
	 * @param root
	 * @param data
	 */
	public static void reversePathUtil(TreeNode root, int data) {
		if(root == null) {
			return;
		}
		
		Map<Integer, Integer> map = new HashMap<>();
		reversePath(root, 0, data, map);
	}
	
	/**
	 * Main Method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ReverseTreePath tree = new ReverseTreePath();
		tree.root = insertNode(null, 7);
		insertNode(tree.root, 6);
		insertNode(tree.root, 5);
		insertNode(tree.root, 4);
		insertNode(tree.root, 3);
		insertNode(tree.root, 2);
		insertNode(tree.root, 1);
		insertNode(tree.root, 8);
		insertNode(tree.root, 10);
		
		System.out.println("Before path reversal: ");
		TreeTraversal.inOderTravsersal(tree.root);
		
		reversePathUtil(tree.root, 10);
		
		System.out.println("\nAfter path reversal: ");
		TreeTraversal.inOderTravsersal(tree.root);
	}

}
