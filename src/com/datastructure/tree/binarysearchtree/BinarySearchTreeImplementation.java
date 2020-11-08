package com.datastructure.tree.binarysearchtree;

import com.datastructure.tree.binarytree.TreeTraversal;
import com.nodes.TreeNode;

/**
 * Binary search tree implementation.
 *
 * Let us create following BST 
 *            50 
 *         /     \ 
 *         30      70 
 *       /  \    /  \ 
 *     20   40  60   80
 *
 * @author mrityunjaykumar
 *
 */
public class BinarySearchTreeImplementation {
	static TreeNode root;
	
	 BinarySearchTreeImplementation() {
		root = null;
	}
	
	/**
	 * Insert utility method.
	 * 
	 * @param data
	 */
	public void insert(int data) {
		root = insertRec(root, data);
	}
	
	/**
	 * Inserting record.
	 * 
	 * @param root
	 * @param data
	 * @return
	 */
	public static TreeNode insertRec(TreeNode root, int data) {
		if(root == null) {
			root = new TreeNode(data);
			return root;
		}
		
		if(data < root.data) {
			root.left = insertRec(root.left, data);
		} else {
			root.right = insertRec(root.right, data);
		}
		
		return root;
	}
	
	/**
	 * Method to search node in binary search tree.
	 * 
	 * @param root
	 * @param key
	 * @return
	 */
	public static TreeNode searchNode(TreeNode root, int key) {
		if(root == null || root.data == key) {
			return root;
		}
		
		if(key < root.data) {
			return searchNode(root.left, key);
		}
		
		return searchNode(root.right, key);
		
	}

	/**
	 * Printing data.
	 * 
	 * @param root
	 */
	public void printData(TreeNode root) {
		if(root == null) {
			return;
		}
		
		printData(root.left);
		System.out.print(root.data+" ");
		printData(root.right);
		
	}
	
	/**
	 * Finding dead node.
	 * 
	 * @param root
	 * @param low
	 * @param high
	 * @return
	 */
	public boolean isDeadNode(TreeNode root, int low, int high) { 
	    if (root==null) {
	    	return false; 
	    }
	        
	    if (low == high) {
	    	 return true; 
	    }
	       
	    return isDeadNode(root.left, low, root.data - 1)|| 
	    		isDeadNode(root.right, root.data + 1, high); 
	}
	
	public static void inOderTravsersal(TreeNode root) {
		if(root == null) {
			return;
		}
		inOderTravsersal(root.left);
		System.out.print(root.data + " ");
		inOderTravsersal(root.right);
	}
	
	
	public static void main(String[] args) {
		BinarySearchTreeImplementation tree = new BinarySearchTreeImplementation();
		tree.insert(7); 
        tree.insert(5); 
        tree.insert(1); 
        tree.insert(8); 
        tree.insert(3); 
        tree.insert(6); 
        tree.insert(0);
        tree.insert(9);
        tree.insert(4);
        tree.insert(2);

        
        tree.printData(root);
        System.out.println();
        inOderTravsersal(root);       
        TreeNode node = searchNode(root, 60);
        if(node != null) {
        	System.out.println("\nFound......");
        } else {
        	System.out.println("\nNot found");
        }
        
        if(tree.isDeadNode(root, 1, Integer.MAX_VALUE)) {
        	System.out.println("True");
        } else {
        	System.out.println("False");
        }
	}

}
